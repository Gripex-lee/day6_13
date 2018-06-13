package day6_13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class J245 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		String s=br.nextLine();
		if(Pattern.matches("1\\d{10}", s)) {
			System.out.println("手机号码合法");
		}else {
			System.out.println("手机号码不合法");
		}
	}
}
