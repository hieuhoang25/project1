package Ex3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Person {
	private String CMND;
	private String hoTen;
	private String diaChi;
	private LocalDate ngaySinh;
	private String Email;
	private String soDT;
	Scanner sc = new Scanner(System.in);
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		CMND = cMND;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	public Person(String cMND, String hoTen, String diaChi, LocalDate ngaySinh, String email, String soDT) {
		super();
		CMND = cMND;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		Email = email;
		this.soDT = soDT;
	}
	public Person() {
		super();
	}
	public void nhap() {
		System.out.println("Nhập CMND:");
		this.CMND = sc.nextLine();
		System.out.println("Nhập Họ Tên:");
		this.hoTen = sc.nextLine();
		System.out.println("Nhập diaChi:");
		this.diaChi = sc.nextLine();
		System.out.println("Nhập Ngày sinh(dd/MM/yyyy):");
		String ngsinh = sc.nextLine();
		this.ngaySinh = LocalDate.parse(ngsinh, formatter);
		
		System.out.println("Nhập Email:");
		this.Email = sc.nextLine();
		System.out.println("Nhập Số điên thoại:");
		this.soDT = sc.nextLine();
	
	}
}
