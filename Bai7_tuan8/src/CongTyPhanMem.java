
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

	public class CongTyPhanMem {
		private String tenCongTy;
		private List<NhanVien> DSNV = new ArrayList<NhanVien>();
		

public CongTyPhanMem(String tenCongTy) {
	super();
	this.tenCongTy = tenCongTy;
}
//them nhan vien



public String getTenCongTy() {
	return tenCongTy;
}
public void setTenCongTy(String tenCongTy) {
	this.tenCongTy = tenCongTy;
}

public void themNhanVien(NhanVien nhanVien) {
    DSNV.add(nhanVien);

}
public List<NhanVien> getDSNV(){
	return DSNV;
	
}

public  double tinhTongLuong () {

	double tong =0;
	//List<NhanVien> dsNv = new ArrayList<NhanVien> () ;
	for(NhanVien nhanvien :DSNV ) {
		tong += nhanvien.getLuongCoBan();
	}
	return tong;	
}
// In danh Sach Nhan Vien 
public void inDanhSachNhanVien () {
	for(NhanVien NV : DSNV);
	System.out.println(DSNV);
}
public boolean xoaNhanVien(NhanVien nv) {
	
	return this.xoaNhanVien(nv);
}{
	
}
@Override
public String toString() {
	return " [=" + tenCongTy + ", DSNV=" + DSNV + "]";
	
} 	
}
