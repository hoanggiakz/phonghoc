
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
public static void main(String[] args) {
	LapTrinhVien ltv = new LapTrinhVien(111, "NguyenHoangGia", 10);
	NguoiQuanLy nql = new NguoiQuanLy(222, "VuKieuOanh", 15);
	TruongDuAn tda = new TruongDuAn(333, "NguyenVanA", 20);
	CongTyPhanMem ct = new CongTyPhanMem("Cong Ty TNHH Hoang Gia");
	NhanVien nv1 = new NhanVien(111, "Nguyen Hoang Gia" , 10);
	NhanVien nv2 = new NhanVien(112, "Nguyen Van B", 8);
	NhanVien nv3 = new NhanVien(123, "Nguyen Hoang Ha", 15);
	ct.themNhanVien(nv2);
	ct.themNhanVien(nv1);
	ct.themNhanVien(nv3);
	ct.themNhanVien(tda);
	ct.themNhanVien(nql);
	ct.themNhanVien(ltv);
	
	
	//System.out.println("dsnv"+ ct.getDSNV());
	


//System.out.println("Nhan Vien :"+nv1);
double phuCap1 = ltv.tinhPhuCap();
 //System.out.println("Phu Cap nhan vien : " + phuCap1);
 double phuCap2 = nql.tinhPhuCap();
 //System.out.println("Phu Cap Nguoi Quan Ly:"+ phuCap2);
 double phuCap3 = tda.tinhPhuCap();
 
 //System.out.println("Phu Cap Truong Du An:"+phuCap3);
 //System.out.println("cong ty phan mem: .\n"+ct);

 Scanner sc = new Scanner(System.in);
 
 int luaChon = 0;
 do {
	System.out.println("-------MENU---------.\n");
	System.out.println("Chon chuc nang:\n");
	System.out.println("1Them Nhan Vien Vao COng TY.\n"
			
			+ "2.Tinh tong tien phai tra cho cac nhan vien.\n  "
			+ "3.Xoa Nhan Vien.\n "
			+ "4.Cac lap trinh vien.\n "
			+"5.In Danh Sach Nhan Vien.\n"
			);
	luaChon = sc.nextInt();
	sc.nextLine();
	if(luaChon==1) {
		System.out.println("Nhap Ma Nv:"); int maSo = sc.nextInt();
		System.out.println("Nhap Ten Nv:"); String tenNhanVien = sc.nextLine();
		System.out.println("Nhap Luong CB :"); double luongCoBan = sc.nextDouble();
		NhanVien nv = new NhanVien(maSo, tenNhanVien,luongCoBan);
		ct.themNhanVien(nv);
		
	}else if(luaChon==2) {
		System.out.println("Tong Tien Phai Tra Cho Cac Nhan Vien:.\n"+ct.tinhTongLuong());
	}else if(luaChon==3) {
		System.out.println(" Xoa Nhan Vien"); int maSo = sc.nextInt();
		NhanVien nv = new NhanVien(maSo, null, maSo);
		System.out.println("Xoa Nhan Vie "+ ct.xoaNhanVien(nv));
	}else if (luaChon==4){
	System.out.println(" Cac Lap Trinh Vien :"+ltv);
	
	}else if (luaChon==5){
	System.out.println("In danh sach nhan vien"+ct);
	}
	}
while(luaChon!=0);
}
}