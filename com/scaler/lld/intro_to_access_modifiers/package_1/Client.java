package com.scaler.lld.intro_to_access_modifiers.package_1;

public class Client {

    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Bhavik";
        // st.age = 26;   <--- ERROR: Cannot access private outside the class
        st.email = "b@d.com";
        st.psp = 34.0f;
    }
}
