package day6_13;

import java.util.Scanner;

public class J227 {  
    public static void matches(String text) {  
        if (text != null && !text.isEmpty()) {
            // 定义正则表达式  
            String regex = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\." 
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."  
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."  
                    + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
            if (text.matches(regex)) { 
                System.out.println("true");;  
            } else {  
            	System.out.println("false");;  
            }  
        }  
    }  
    public static void main(String[] args) {
    	Scanner br=new Scanner(System.in);
        String ip = br.nextLine();  
        J227.matches(ip);
    }  
} 