package day6_13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class J251 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		String s=br.nextLine();
		if(Pattern.matches(".*?abc.*?", s)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
