package day6_13;

public class J224 {
	public static void main(String[] args) {
		int[]a=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=(int) (Math.random()*29+1);
			System.out.print(a[i]+" ");
		}
	}
}
