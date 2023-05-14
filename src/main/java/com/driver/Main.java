package com.driver;



public class Main {
    public static class A{
         String meth(){
             return "Invoking method from class A";
         }
    }
    public static class B extends A{
        @Override
        String meth(){
            return "Method is overridden in Extendend class B";
        }

    }

    public static void main(String[] args) {
        A obj2 = new A();
        System.out.println(obj2.meth());
        B obj = new B();
        System.out.println(obj.meth());


    }
}