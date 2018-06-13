package day6_13;

import java.util.Scanner;

public class J235 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int year=br.nextInt();
		br.close();
		int[]day =new int[12];
		int[]left= {1,3,5,7,8,10,12};
		int[]right= {4,6,9,11};
		for(int i:left) {
			day[i-1]=31;
		}
		for(int i:right) {
			day[i-1]=30;
		}
		if(year%4==0&&year%100!=0||year%400==0) {
			day[1]=29;
		}else {
			day[1]=28;
		}
		for(int i=0;i<=11;i++) {
			System.out.println(year+" 年"+(i+1)+"月："+day[i]+"天");
		}
	}
}
