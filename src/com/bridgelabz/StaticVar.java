package com.bridgelabz;

public class StaticVar {

        static int a = 3;
        static int b;
        static void meth(int x) {
      // System.out.println("x = "+x);
            System.out.println("a = "+a);
            System.out.println("b = "+b);


        }
    public static void main(String[] args){
        meth(42);
    }
}

