package day6_13;

import java.util.Scanner;

public class J244 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		String s=br.nextLine();
		String[]a=s.split("");
		for(int i=6;i<=13;i++) {
			System.out.print(a[i]);
		}
	}
}
