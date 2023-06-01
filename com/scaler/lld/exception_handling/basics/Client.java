package com.scaler.lld.exception_handling.basics;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Client {

    public static void main(String[] args) {
//        try {
//            readFile3();
//        } catch (FileNotFoundException fnfe){
//            System.out.println("Unable to locate this file");
//        } finally {
//            System.out.println("This is the end");
//        }

        String s = null;
        printLength(s);

    }

//    public static void readFile() throws FileNotFoundException {
//        FileReader reader = new FileReader("scaler.txt");
//    }

    public static void readFile2(){
        try {
            FileReader reader = new FileReader("scaler.txt");
        } catch (FileNotFoundException fnfe){
            System.out.println("File you are looking for doesn't exists");
        }
    }

    public static void readFile3() throws FileNotFoundException{
        FileReader reader = new FileReader("scaler.txt");
    }

    public static void printLength(String s){
        try {
            System.out.println(s.length());
        } catch (NullPointerException npe){
            System.out.println("NPE occured");
        }
    }
}
