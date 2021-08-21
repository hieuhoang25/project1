package Ex3;

import java.time.LocalDate;

public class GiamDoc extends NhanVien {

	private double mucThuong;
	private LocalDate ngayBatDau;
	private LocalDate ngayKetThuc;
	
	public GiamDoc(String cMND, String hoTen, String diaChi, LocalDate ngaySinh, String email, String soDT, String maNV,
			String viTri, double mucLuong, int soKN, double mucThuong, LocalDate ngayBatDau, LocalDate ngayKetThuc) {
		super(cMND, hoTen, diaChi, ngaySinh, email, soDT, maNV, viTri, mucLuong, soKN);
		this.mucThuong = mucThuong;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
	}
	public GiamDoc() {
		super();
	}

	public double getMucThuong() {
		return mucThuong;
	}

	public void setMucThuong(double mucThuong) {
		this.mucThuong = mucThuong;
	}

	public LocalDate getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(LocalDate ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public LocalDate getNgayKetThuc() {
		return ngayKetThuc;
	}

	public void setNgayKetThuc(LocalDate ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	public void hopHD() {
		System.out.println("Họp hội đồng vào cái buổi đầu tháng");
	}
	public void kiVB() {
		System.out.println("Kí các văn bản");
	}
	public void gapDoiTac() {
		System.out.println("GapDoiTac");
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhập mức thưởng:");
		this.mucThuong = sc.nextDouble();
		System.out.println("Nhập ngày bắt đầu nhận chức:");
		sc.nextLine();
		String ngaybd = sc.nextLine();
		this.ngayBatDau = LocalDate.parse(ngaybd, formatter);

		
		System.out.println("Nhập ngày kết thúc nhận chức:");
		String ngaykt= sc.nextLine();
		this.ngayKetThuc = LocalDate.parse(ngaykt, formatter);
	}
	@Override
	public String toString() {
		return super.toString()+" mucThuong : " + mucThuong + " ngayBatDau : " + ngayBatDau.format(formatter) + " ngayKetThuc :  " + ngayKetThuc.format(formatter) ;
	}
	
	
}
