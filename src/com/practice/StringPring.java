package com.practice;

import java.util.Scanner;

public class StringPring {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.println(s1);
           if(x >100)
            System.out.println(x);
            
           System.out.println(0+""+x);
        }
        System.out.println("================================");

}

}
