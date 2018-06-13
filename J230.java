package day6_13;

import java.util.Scanner;

public class J230 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		String s=br.nextLine();
		String old=br.nextLine();
		String replace=br.nextLine();
		System.out.println(s.replaceAll(old,replace));
	}
}
