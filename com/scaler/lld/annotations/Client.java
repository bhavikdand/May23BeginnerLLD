package com.scaler.lld.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ImportantClass annotation = Dummy.class.getAnnotation(ImportantClass.class);
        if(annotation != null){
            System.out.println("This class is an important clas");
        } else {
            System.out.println("This class is not that important");
        }

        Method[] declaredMethods = Dummy.class.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            UrgentMethod urgentMethod = declaredMethod.getAnnotation(UrgentMethod.class);

            if(urgentMethod != null){
                int times = urgentMethod.times();
                declaredMethod.setAccessible(true);
                for(int i=0; i < times; i++) {
                    declaredMethod.invoke(null);
                }
            }
        }
    }
}
