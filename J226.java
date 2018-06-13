package day6_13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class J226 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		String s=br.nextLine();
		if(Pattern.matches("http://.*", s)) {
			System.out.println("您输入的是网页地址");
		}else if(Pattern.matches("ftp://.*", s)){
			System.out.println("您输入的是FTP地址");
		}
	}
}
