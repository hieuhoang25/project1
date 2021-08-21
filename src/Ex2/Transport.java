package Ex2;

public class Transport {
	private String hangSX;
	private int namSX;
	private String noiSX;
	private double giaThanh;
	private String kichThuoc;
	private double trongLuong;
	private String bienSo;
	public Transport(String hangSX, int namSX, String noiSX, double giaThanh, String kichThuoc, double trongLuong,
			String bienSo) {
		super();
		this.hangSX = hangSX;
		this.namSX = namSX;
		this.noiSX = noiSX;
		this.giaThanh = giaThanh;
		this.kichThuoc = kichThuoc;
		this.trongLuong = trongLuong;
		this.bienSo = bienSo;
	}
	public Transport() {
		super();
	}
	public String getHangSX() {
		return hangSX;
	}
	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}
	public int getNamSX() {
		return namSX;
	}
	public void setNamSX(int namSX) {
		this.namSX = namSX;
	}
	public String getNoiSX() {
		return noiSX;
	}
	public void setNoiSX(String noiSX) {
		this.noiSX = noiSX;
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}
	public String getKichThuoc() {
		return kichThuoc;
	}
	public void setKichThuoc(String kichThuoc) {
		this.kichThuoc = kichThuoc;
	}
	public double getTrongLuong() {
		return trongLuong;
	}
	public void setTrongLuong(double trongLuong) {
		this.trongLuong = trongLuong;
	}
	public String getBienSo() {
		return bienSo;
	}
	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}
	
}
