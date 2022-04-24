package com.bridgelabz;

public class DefaultValue {
    int n1;
    float fn2;
    boolean bn3;

    public void getDefaultValue()
    {
        System.out.println("Default Value of Integer is " + n1  );
        System.out.println("Default Value of Float is " + fn2  );
        System.out.println("Default Value of Boolean is " + bn3  );
    }
    public static void main(String[] args) {
        DefaultValue dv= new DefaultValue();
        dv.getDefaultValue();

    }
}
