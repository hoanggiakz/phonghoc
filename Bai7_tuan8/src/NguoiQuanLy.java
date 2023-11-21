
public class NguoiQuanLy extends NhanVien {

	public NguoiQuanLy(int maSo, String tenNhanVien, double luongCoBan) {
		super(maSo, tenNhanVien, luongCoBan);
		// TODO Auto-generated constructor stub
	}
	
  public double tinhPhuCap () {
	  
  return luongCoBan*0.4;
}

@Override
public String toString() {
	return " [luongCoBan=" + luongCoBan + "]";
}




}