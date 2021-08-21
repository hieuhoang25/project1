package Ex2;

import java.time.LocalTime;

public class BikeElectronic extends Transport {
	private String mauSac;
	private String dienAp;
	private String soKM;
	private LocalTime tgsac;
	private String dienApSac;
	public BikeElectronic(String hangSX, int namSX, String noiSX, double giaThanh, String kichThuoc, double trongLuong,
			String bienSo, String mauSac, String dienAp, String soKM, LocalTime tgsac, String dienApSac) {
		super(hangSX, namSX, noiSX, giaThanh, kichThuoc, trongLuong, bienSo);
		this.mauSac = mauSac;
		this.dienAp = dienAp;
		this.soKM = soKM;
		this.tgsac = tgsac;
		this.dienApSac = dienApSac;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public String getDienAp() {
		return dienAp;
	}
	public void setDienAp(String dienAp) {
		this.dienAp = dienAp;
	}
	public String getSoKM() {
		return soKM;
	}
	public void setSoKM(String soKM) {
		this.soKM = soKM;
	}
	public LocalTime getTgsac() {
		return tgsac;
	}
	public void setTgsac(LocalTime tgsac) {
		this.tgsac = tgsac;
	}
	public String getDienApSac() {
		return dienApSac;
	}
	public void setDienApSac(String dienApSac) {
		this.dienApSac = dienApSac;
	}
	

}
