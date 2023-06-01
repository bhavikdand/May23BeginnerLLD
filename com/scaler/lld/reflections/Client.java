package com.scaler.lld.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Dummy dummy = new Dummy(20, "ABC");

        Field[] declaredFields = dummy.getClass().getDeclaredFields();

        for (Field declaredField : declaredFields) {
            System.out.println("field name: " + declaredField.getName());

        }

        for (Field declaredField : declaredFields) {
            if(declaredField.getName().equals("age")){
                declaredField.setAccessible(true);
                System.out.println(declaredField.get(dummy));
            }
        }
        System.out.println("-----------------Printing methods-----------------------");
        Method[] declaredMethods = dummy.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println( "Method name: " +  declaredMethod.getName());
        }

        for (Method declaredMethod : declaredMethods) {
//            if(declaredMethod.getName().equals("privatePrint")){
//                declaredMethod.setAccessible(true);
//                declaredMethod.invoke(dummy);
//            }
            if(declaredMethod.getName().equals("iAmAPrivateStaticMethod")){
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null);
            }
        }
    }
}
