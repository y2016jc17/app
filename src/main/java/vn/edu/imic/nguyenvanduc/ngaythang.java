package vn.edu.imic.nguyenvanduc;

import java.util.Scanner;

public class ngaythang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời nhập vào năm:");
		int Nam = sc.nextInt();
		System.out.println("Mời nhập vào tháng:");
		int Thang = sc.nextInt();
		if (Thang==4||Thang==6||Thang==9||Thang==11)
		{
			System.out.println("Tháng "+Thang+" Năm "+Nam+" có 30 ngày");
		}
		else if (Thang==2)
		{
			System.out.println("Tháng "+Thang+" Năm "+Nam+" có 29 ngày");
		}
		else
		{
			System.out.println("Tháng "+Thang+" Năm "+Nam+" có 31 ngày");
		}

	}
}
