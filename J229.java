package day6_13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class J229 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		String s=br.nextLine();
		String []a=s.split("");
		int x=0;
		for(int i=0;i<a.length;i++) {//[u4e00-u9fa5]汉字的正则表达式
			if(Pattern.matches("[\\u4e00-\\u9fa5]",a[i])) {
				x++;
			}
		}
		System.out.println(x);
	}
}
