package Ex3;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class FileFactory {

	
	public static boolean luuFile(ArrayList<NhanVien> nhanViens, String path) {
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw= new OutputStreamWriter(fos, "utf-8");
			BufferedWriter bw=new BufferedWriter(osw);
			for (NhanVien nhanVien : nhanViens) {
				String line = nhanVien.toString();
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return false;
	}
}	
