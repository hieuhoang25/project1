package Ex2;

public class Coach extends Car{
	private int soGhe;
	private int taiTrong;
	private String tamHD;
	private int soKhach;
	private String hinhThuc;
	private String loaiNL;
	public int getSoGhe() {
		return soGhe;
	}
	public void setSoGhe(int soGhe) {
		this.soGhe = soGhe;
	}
	public int getTaiTrong() {
		return taiTrong;
	}
	public void setTaiTrong(int taiTrong) {
		this.taiTrong = taiTrong;
	}
	public String getTamHD() {
		return tamHD;
	}
	public void setTamHD(String tamHD) {
		this.tamHD = tamHD;
	}
	public int getSoKhach() {
		return soKhach;
	}
	public void setSoKhach(int soKhach) {
		this.soKhach = soKhach;
	}
	public String getHinhThuc() {
		return hinhThuc;
	}
	public void setHinhThuc(String hinhThuc) {
		this.hinhThuc = hinhThuc;
	}
	public String getLoaiNL() {
		return loaiNL;
	}
	public void setLoaiNL(String loaiNL) {
		this.loaiNL = loaiNL;
	}
	public Coach(String hangSX, int namSX, String noiSX, double giaThanh, String kichThuoc, double trongLuong,
			String bienSo, int soBanh, String loaiDC, String name, String mauXe, String chuSoHuu, int soGhe,
			int taiTrong, String tamHD, int soKhach, String hinhThuc, String loaiNL) {
		super(hangSX, namSX, noiSX, giaThanh, kichThuoc, trongLuong, bienSo, soBanh, loaiDC, name, mauXe, chuSoHuu);
		this.soGhe = soGhe;
		this.taiTrong = taiTrong;
		this.tamHD = tamHD;
		this.soKhach = soKhach;
		this.hinhThuc = hinhThuc;
		this.loaiNL = loaiNL;
	}
	
}
