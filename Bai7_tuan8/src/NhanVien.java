import java. util.ArrayList;

public class NhanVien {
private int maSo;
private String tenNhanVien;
protected  double luongCoBan;
public NhanVien(int maSo, String tenNhanVien, double luongCoBan) {
	this.maSo = maSo;
	this.tenNhanVien = tenNhanVien;
	this.luongCoBan = luongCoBan;
}
public int getMaSo() {
	return maSo;
}
public void setMaSo(int maSo) {
	this.maSo = maSo;
}
public String getTenNhanVien() {
	return tenNhanVien;
}
public void setTenNhanVien(String tenNhanVien) {
	this.tenNhanVien = tenNhanVien;
}
public double getLuongCoBan() {
	return luongCoBan;
}
public void setLuongCoBan(double luongCoBan) {
	this.luongCoBan = luongCoBan;
}




@Override
public String toString() {
	return " maSo=" + maSo + ", tenNhanVien=" + tenNhanVien + ", luongCoBan=" + luongCoBan + "";
}




}










