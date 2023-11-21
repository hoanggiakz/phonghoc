
public class LapTrinhVien extends NhanVien {
private String cacLapTrinhVien;

	public LapTrinhVien(int maSo, String tenNhanVien, double luongCoBan) {
		super(maSo, tenNhanVien, luongCoBan);
		// TODO Auto-generated constructor stub
	}
	
	 public double tinhPhuCap() {
	        Object ngonNguLapTrinh = "Java";
			if ("Java".equals(ngonNguLapTrinh)) {
	            // Nếu ngôn ngữ là Java, phụ cấp là 20% của lương cơ bản
	            return 0.2 * luongCoBan;
	        } else {
	            // Nếu ngôn ngữ không phải Java, không có phụ cấp
	            return 0;
	           
	
}


			
			
	 }

	@Override
	public String toString() {
		return "LapTrinhVien [cacLapTrinhVien=" + cacLapTrinhVien + ", luongCoBan=" + luongCoBan + "]";
	}

	

	 
	}
