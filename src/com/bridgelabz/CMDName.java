package com.bridgelabz;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

public class CMDName {
    public static void main( String[] args)  throws IOException  {
        String s1;
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        System.out.println("Enter Name ");
        s1 = sc.nextLine();
        System.out.println("Your first argument is:"+ s1);
    }
}
