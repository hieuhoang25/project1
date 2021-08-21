package Ex2;

public class Motobike extends Transport {
	private int soBanh;
	private String loaiLop;
	private int dungTinh;
	private String ten;
	private String mauSac;
	private double soKM;
	private String loaiNL;
	public Motobike(String hangSX, int namSX, String noiSX, double giaThanh, String kichThuoc, double trongLuong,
			String bienSo, int soBanh, String loaiLop, int dungTinh, String ten, String mauSac, double soKM,
			String loaiNL) {
		super(hangSX, namSX, noiSX, giaThanh, kichThuoc, trongLuong, bienSo);
		this.soBanh = soBanh;
		this.loaiLop = loaiLop;
		this.dungTinh = dungTinh;
		this.ten = ten;
		this.mauSac = mauSac;
		this.soKM = soKM;
		this.loaiNL = loaiNL;
	}
	public int getSoBanh() {
		return soBanh;
	}
	public void setSoBanh(int soBanh) {
		this.soBanh = soBanh;
	}
	public String getLoaiLop() {
		return loaiLop;
	}
	public void setLoaiLop(String loaiLop) {
		this.loaiLop = loaiLop;
	}
	public int getDungTinh() {
		return dungTinh;
	}
	public void setDungTinh(int dungTinh) {
		this.dungTinh = dungTinh;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public double getSoKM() {
		return soKM;
	}
	public void setSoKM(double soKM) {
		this.soKM = soKM;
	}
	public String getLoaiNL() {
		return loaiNL;
	}
	public void setLoaiNL(String loaiNL) {
		this.loaiNL = loaiNL;
	}
	



}
