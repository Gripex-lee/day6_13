package day6_13;

import java.util.Scanner;

public class J228 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int x=br.nextInt();
		System.out.println(Integer.toBinaryString(x));//2进制
		System.out.println(Integer.toOctalString(x));//8进制
		System.out.println(Integer.toHexString(x));//16进制
	}
}
