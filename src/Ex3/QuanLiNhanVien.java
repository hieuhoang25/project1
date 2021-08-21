package Ex3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiNhanVien {
	private ArrayList<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
	Scanner sc= new Scanner(System.in);
	
	public void themNV(int x) {
		
		if(x==1) {
			NhanVien nv= new NhanVien();
			nv.nhap();
			dsNhanVien.add(nv);
		}
		else {
			GiamDoc gd = new GiamDoc();
			gd.nhap();
			dsNhanVien.add(gd);
			
		}
		
	}
	public void hienThiNV() {
		for (NhanVien nhanVien : dsNhanVien) {
			System.out.println(nhanVien.toString());
		}
	}
	public void hienThiGD() {
		for (NhanVien nhanVien : dsNhanVien) {
			if(nhanVien.getMaNV().indexOf("GD")!=-1) {
				System.out.println(nhanVien.toString());
			}
		}
	}
	public void timKiemNV() {
		System.out.println("Nhập tên nhân viên cần tìm kiếm:");
		sc.nextLine();
		String ten = sc.nextLine();
		for (NhanVien nhanVien : dsNhanVien) {
			if(nhanVien.getHoTen().equals(ten)) {
				System.out.println(nhanVien.toString());
			}
		}
	}
	public void timkiemGD(int x) {
		int dem=0;
		LocalDate date = LocalDate.now();
		for (NhanVien nhanVien : dsNhanVien) {
			if(nhanVien instanceof GiamDoc) {
			    GiamDoc gd = (GiamDoc) nhanVien;
			    if(date.getYear()-gd.getNgayBatDau().getYear()==x) {
			    	System.out.println(gd.toString());
			    	dem++;
			    }
			}
		}
		if(dem==0) {
			System.out.println("Tìm kiêm thật bại");
		}
		else {
			System.out.println("Tìm kiếm thanh công");
		}
	}
	public void xoaNV(String ma) {
		int dem=0;
		for (NhanVien nhanVien : dsNhanVien) {
			if(nhanVien.getMaNV().equals(ma)) {
				dem++;
				dsNhanVien.remove(nhanVien);
			}
		}
		if(dem==0) {
			System.out.println("Xóa thất bại");
		}
		else {
			System.out.println("Xóa thành công");
		}
	}
	
	public void menu() {
		int cn = 0 ;
		
		do {
			System.out.println("========Công ty trách nhiểm hữu hạn 1 thành viên========");
			System.out.println("1.Thêm Nhân Viên");
			System.out.println("2.Thêm Giam Đốc");
			System.out.println("3.Hiển thị nhân viên");
			System.out.println("4.Hiển thị giám đốc");
			System.out.println("5.Tìm kiếm nhân viên theo tên");
			System.out.println("6.Tìm kiếm giám đoc làm đc mấy năm");
			System.out.println("7.xóa nhân viên");
			System.out.println("8.Lưu danh sách nhân viên xuống file");
			System.out.println("Vui lòng chọn chức năng:");
			cn= sc.nextInt();
			switch (cn) {
			case 1: {
				themNV(1);
				break;
			}
			case 2:{
				themNV(2);
				break;
			}
			case 3:{
				hienThiNV();
				break;
			}
			case 4:{
				hienThiGD();
				break;
			}
			case 5:{
				
				timKiemNV();
				break;
			}
			case 6:{
				System.out.println("Nhập số năm mà giám đốc đã đc làm:");
				int x = sc.nextInt();
				timkiemGD(x);
				break;
			}
			case 7:{
				System.out.println("Nhập mã nhân viên cần xóa khỏi danh sách:");
				sc.nextLine();
				String ma= sc.nextLine();
				xoaNV(ma);
				break;
			}
			case 8:{
				boolean kt= FileFactory.luuFile(dsNhanVien, "D:\\Eclise Java\\OnTapThuaKe\\src\\Ex3\\dsnhanvien.txt");
				if(kt==true) {
					System.out.println("Lưu thành công");
				}
				else {
					System.out.println("Lưu thất bại");
				}
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + cn);
			}
			
			
		} while (cn!=0);
	}
}
