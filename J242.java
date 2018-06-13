package day6_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J242 {
	public static void main(String[] args) {
		Map<String, String> book = new HashMap<String, String>();  
        book.put("图书名", "汤姆索亚历险记");  
        book.put("作者", "李文武");  
        book.put("出版社", "人民出版社"); 
		
		Scanner br=new Scanner(System.in);
		String s=br.nextLine();
		br.close();
		String []a=s.split(" ");
		String dest=a[1];
		if(a.length==4) {
			System.out.println(book.get(dest));
		}else if(book.get(dest)=="*") {
			System.out.println("图书名:汤姆索亚历险记");
			System.out.println("作者:李文武");
			System.out.println("出版社:人民出版社");
		}
		if(a.length>4) {
			String select=a[a.length-1];
			if(Boolean.getBoolean(select)) {
				
			}
		}
	}
}
