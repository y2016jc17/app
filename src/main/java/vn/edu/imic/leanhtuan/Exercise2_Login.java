package vn.edu.imic.leanhtuan;

import java.util.Scanner;



public class Exercise2_Login {


	public static void main(String[] args) {
		
//		System.out.println("UserName : ");
//		Scanner scan = new Scanner(System.in);
//		String username = scan.nextLine();
//
//		System.out.println("PassWord : ");
//		Scanner scan1 = new Scanner(System.in);
//		String password = scan1.nextLine();
//
//		String string1 = "doannv";
//		String string2 = "imic.edu.vn";
//
//		if (username.length() == 0 || username == null) {
//			System.out.println("Bạn chưa nhập tên đăng nhập");
//		} else if (password.length() == 0 || password == null) {
//			System.out.println("Bạn chưa nhập mật khẩu");
//		}
//
//		if ((username.length() == 0 || username == null) && (password.length() == 0 || password == null)) {
//			System.out.println("Bạn chưa nhập mật khẩu");
//
//		} else if (string1.equals(username) && string2.equals(password)) {
//			System.out.println("Bạn Đã Đăng Nhập Thành Công!");
//		} else {
//			System.out.println("Đăng nhập không thành công. Vui lòng kiểm tra lại thông tin đăng nhập");
//		}
//		scan.close();
//		scan1.close();
		Scanner scan = new Scanner(System.in);
		String username = readInput(scan, "Moi Nhap Vao Ho Ten :");
		String password = readInput(scan, "Moi Nhap Vao Mat Khau :");
		
		if(checkLogin(username, password)){
			System.out.println("Dang Nhap Thanh Cong");
		}
		else{
			System.out.println("Dang Nhap Khong Thanh Cong. Vui Long Thu Lai!");
		}
		scan.close();
	}
	
	public static boolean checkLogin(String username, String password){
		return "doannv".equals(username) && "imic.edu.vn".equals(password);
		
	}
	
	public static String readInput(Scanner scan, String message){
		System.out.println(message);
		String input = scan.nextLine();
		return input;
		
	}
}
