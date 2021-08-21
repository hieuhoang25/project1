package Ex2;

public class Container extends Car {
	private int trongTai;
	private String mucDich;
	private int soHangVC;
	public Container(String hangSX, int namSX, String noiSX, double giaThanh, String kichThuoc, double trongLuong,
			String bienSo, int soBanh, String loaiDC, String name, String mauXe, String chuSoHuu, int trongTai,
			String mucDich, int soHangVC) {
		super(hangSX, namSX, noiSX, giaThanh, kichThuoc, trongLuong, bienSo, soBanh, loaiDC, name, mauXe, chuSoHuu);
		this.trongTai = trongTai;
		this.mucDich = mucDich;
		this.soHangVC = soHangVC;
	}
	public int getTrongTai() {
		return trongTai;
	}
	public void setTrongTai(int trongTai) {
		this.trongTai = trongTai;
	}
	public String getMucDich() {
		return mucDich;
	}
	public void setMucDich(String mucDich) {
		this.mucDich = mucDich;
	}
	public int getSoHangVC() {
		return soHangVC;
	}
	public void setSoHangVC(int soHangVC) {
		this.soHangVC = soHangVC;
	}
	
}
