package Ex3;

import java.time.LocalDate;

public class NhanVien extends Person {
	private String maNV;
	private String viTri;
	private double mucLuong;
	private int soKN;

	public NhanVien(String cMND, String hoTen, String diaChi, LocalDate ngaySinh, String email, String soDT,
			String maNV, String viTri, double mucLuong, int soKN) {
		super(cMND, hoTen, diaChi, ngaySinh, email, soDT);
		this.maNV = maNV;
		this.viTri = viTri;
		this.mucLuong = mucLuong;
		this.soKN = soKN;
	}
	
	
	public NhanVien() {
		super();
	}


	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getViTri() {
		return viTri;
	}
	public void setViTri(String viTri) {
		this.viTri = viTri;
	}
	public double getMucLuong() {
		return mucLuong;
	}
	public void setMucLuong(double mucLuong) {
		this.mucLuong = mucLuong;
	}
	public int getSoKN() {
		return soKN;
	}
	public void setSoKN(int soKN) {
		this.soKN = soKN;
	}

	
	public void lamViec() {
		System.out.println("Làm việc từ 8h - 17h");
	}
	public void nghiNgoi() {
		System.out.println("Nghỉ tết 2 tuần");
	}
	public void nhanLuong() {
		System.out.println("Nhận lượng vào ngày 25 của tháng");
	}
	public void diDuLich() {
		System.out.println("Hay đi du lịch nước mĩ vào tháng 5");
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhập Mã Nhân Viên( GD||NV):");
		this.maNV = sc.nextLine();
		System.out.println("Nhập Vị trí:");
		this.viTri = sc.nextLine();
		System.out.println("Nhập Lương Nhân Viên:");
		this.mucLuong = sc.nextDouble();
		System.out.println("Nhập Số KM Nhân Viên:");
		this.soKN = sc.nextInt();
	}

	
	@Override
	public String toString() {
		return "NhanVien: CMND : " + getCMND() + " Họ tên : " + getHoTen() + " Dịa Chỉ : " + getDiaChi()
				+ " Ngày Sinh : " + getNgaySinh().format(formatter) + " Email : " + getEmail() + "SoDT : " + getSoDT() + "Ma NV: "+ maNV
				+"viTri : " + viTri + ", mucLuong : " + mucLuong + ", soKN : " + soKN;
	}



}
