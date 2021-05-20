import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class HumanResources {
    List<Department> listDepartment = new ArrayList<>();
    private List<Staff> listStaff = new ArrayList<>();
    
    public static void main(String[] args){
        
    }
    
    public void initDeparment(){           
        //Tạo list department
        Department bp1 = new Department("001","Phòng A", 3);
        Department bp2 = new Department("002","Phòng B", 2);
        Department bp3 = new Department("003","Phòng C", 5);
        Department bp4 = new Department("004","Phòng D", 1);
        listDepartment.add(bp1);
        listDepartment.add(bp2);
        listDepartment.add(bp3);
        listDepartment.add(bp4);
    }
       
    
    
    public void themNhanVien() throws ParseException{
        System.out.println("== THÊM NHÂN VIÊN == ");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("1 = NHÂN VIÊN THƯỜNG , 0 = QUẢN LÝ: ");
        int choice = sc.nextInt();
        
        if(choice == 1){
            System.out.print("TÊN: ");
            String tenNv = sc.nextLine();

            System.out.print("MÃ NHÂN VIÊN: ");
            String maNv = sc.nextLine();

            System.out.print("TUỔI: ");
            int tuoiNv = sc.nextInt();

            System.out.print("HỆ SỐ LƯƠNG: ");
            double heSoLuong = sc.nextDouble();

            System.out.print("NGÀY BẮT ĐẦU: ");
            String ngayVaoLam = sc.next();

            System.out.print("BỘ PHẬN : ");
            String maBP = sc.next();

            System.out.print("SỐ NGÀY PHÉP: ");
            int soNgayPhep = sc.nextInt();

            System.out.print("SỐ GIỜ LÀM THÊM: ");
            double gioLamThem = sc.nextDouble();
            
            themNhanVienVaoDs(tenNv, maNv, tuoiNv, heSoLuong, ngayVaoLam, maBP, soNgayPhep, gioLamThem);
            System.out.println("== THÊM NHÂN VIÊN THÀNH CÔNG ==");
        }else{
            System.out.print("TÊN: ");
            String tenNv = sc.nextLine();

            System.out.print("MÃ NHÂN VIÊN: ");
            String maNv = sc.nextLine();
            
            System.out.print("CHỨC DANH: ");
            String chucDanh = sc.nextLine();
            
            System.out.print("TUỔI: ");
            int tuoiNv = sc.nextInt();

            System.out.print("HỆ SỐ LƯƠNG: ");
            double heSoLuong = sc.nextDouble();

            System.out.print("NGÀY BẮT ĐẦU: ");
            String ngayVaoLam = sc.next();

            System.out.print("BỘ PHẬN : ");
            String maBP = sc.next();

            System.out.print("SỐ NGÀY PHÉP: ");
            int soNgayPhep = sc.nextInt();

            themQuanLyVaoDs(tenNv, maNv, chucDanh , tuoiNv, heSoLuong, ngayVaoLam, maBP, soNgayPhep);
            System.out.println("== THÊM NHÂN VIÊN THÀNH CÔNG ==");
        }
        
        
    }
    public void themNhanVienVaoDs(String tenNv, String maNv, int tuoiNv, double heSoLuong, String ngayVaoLam, String maBP, int soNgayPhep, double gioLamThem) throws ParseException{
        Staff nv = new Employee(tenNv, maNv, tuoiNv, heSoLuong, ngayVaoLam, maBP, soNgayPhep, gioLamThem);
        listStaff.add(nv);
        
    }
    public void themQuanLyVaoDs(String tenNv, String maNv, String chucDanh, int tuoiNv, double heSoLuong, String ngayVaoLam, String maBP, int soNgayPhep) throws ParseException{
        Staff nv = new Manager(tenNv, maNv, chucDanh , tuoiNv, heSoLuong, ngayVaoLam, maBP, soNgayPhep);
        listStaff.add(nv);
        
    }
}
