package vn.edu.imic.honghieu;

import java.util.Scanner;

public class baitap2 {
	public static void main (String[] agrs)
	{
		float a,b;
		Scanner rel = new Scanner (System.in);
		System.out.println("Nhap a = " );
		a = rel.nextFloat();
		System.out.println("nhap b = ");
		b = rel.nextFloat();
		float cong=a+b,tru=a-b,nhan=a*b,chia=a/b;
		System.out.println("a+b= " +cong);
		System.out.println("a-b= " +tru);
		System.out.println("a*b= " +nhan);
			if(b==0)
			{
				System.out.println("khong chia dc");
			}else{
				System.out.println("a/b= " +chia);
			}
	}
}
