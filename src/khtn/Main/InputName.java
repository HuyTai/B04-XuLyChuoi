package khtn.Main;

import java.util.Scanner;

import khtn.StringMethods.ChangeName;

public class InputName {
	public static void main(String[] args) {
		String nhapTen;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten ban: ");
		nhapTen = sc.nextLine();
		ChangeName NhapTen = new ChangeName(nhapTen);
		sc.close();
		System.out.println("Ten nhap vao: "+nhapTen);
		System.out.println("So luong chu thuong: "+NhapTen.countLowerCase());
		System.out.println("So luong chu in hoa: "+NhapTen.countUpperCase());
		System.out.println("So luong khoang trang: "+NhapTen.countWhiteSpace());
		System.out.println();

		String ds = NhapTen.deleteUselessWhiteSpace();
		System.out.println("Xoa khoang trang: "+ds);
		NhapTen = new ChangeName(ds);
		System.out.println("So luong chu thuong: "+NhapTen.countLowerCase());
		System.out.println("So luong chu in hoa: "+NhapTen.countUpperCase());
		System.out.println("So luong khoang trang: "+NhapTen.countWhiteSpace());
		System.out.println();
		
		String uc = NhapTen.changeToUpperCase();
		System.out.println("Ten chu in hoa: "+uc);
		NhapTen = new ChangeName(uc);
		System.out.println("So luong chu thuong: "+NhapTen.countLowerCase());
		System.out.println("So luong chu in hoa: "+NhapTen.countUpperCase());
		System.out.println("So luong khoang trang: "+NhapTen.countWhiteSpace());
		System.out.println();
		
		String lc = NhapTen.changeToLowerCase();
		System.out.println("Ten chu thuong: "+lc);
		NhapTen = new ChangeName(lc);
		System.out.println("So luong chu thuong: "+NhapTen.countLowerCase());
		System.out.println("So luong chu in hoa: "+NhapTen.countUpperCase());
		System.out.println("So luong khoang trang: "+NhapTen.countWhiteSpace());
		System.out.println();
		
		String fc = NhapTen.firstCharUpperCase();
		System.out.println("Ten hoan chinh: "+fc);
		NhapTen = new ChangeName(fc);
		System.out.println("So luong chu thuong: "+NhapTen.countLowerCase());
		System.out.println("So luong chu in hoa: "+NhapTen.countUpperCase());
		System.out.println("So luong khoang trang: "+NhapTen.countWhiteSpace());
	}
}
//   TraN   huY  tAI   