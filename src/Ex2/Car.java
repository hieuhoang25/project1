package Ex2;

public class Car extends Transport {
	private int soBanh;
	private String loaiDC;
	private String name;
	private String mauXe;
	private String chuSoHuu;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String hangSX, int namSX, String noiSX, double giaThanh, String kichThuoc, double trongLuong,
			String bienSo) {
		super(hangSX, namSX, noiSX, giaThanh, kichThuoc, trongLuong, bienSo);
		// TODO Auto-generated constructor stub
	}
	public Car(String hangSX, int namSX, String noiSX, double giaThanh, String kichThuoc, double trongLuong,
			String bienSo, int soBanh, String loaiDC, String name, String mauXe, String chuSoHuu) {
		super(hangSX, namSX, noiSX, giaThanh, kichThuoc, trongLuong, bienSo);
		this.soBanh = soBanh;
		this.loaiDC = loaiDC;
		this.name = name;
		this.mauXe = mauXe;
		this.chuSoHuu = chuSoHuu;
	}
	public int getSoBanh() {
		return soBanh;
	}
	public void setSoBanh(int soBanh) {
		this.soBanh = soBanh;
	}
	public String getLoaiDC() {
		return loaiDC;
	}
	public void setLoaiDC(String loaiDC) {
		this.loaiDC = loaiDC;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMauXe() {
		return mauXe;
	}
	public void setMauXe(String mauXe) {
		this.mauXe = mauXe;
	}
	public String getChuSoHuu() {
		return chuSoHuu;
	}
	public void setChuSoHuu(String chuSoHuu) {
		this.chuSoHuu = chuSoHuu;
	}
	
	
	
	
}
