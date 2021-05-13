
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
    
    public static void main(String[] args){
        
    }
    
    public void initDeparment(){
            
            //Tạo list department
            List<Department> listDepartment = new ArrayList<>();
    }
    
    
    
    private List<Staff> dsNV = new ArrayList<>();
    
    public void themNhanVien() throws ParseException{
        System.out.println("== THÊM NHÂN VIÊN == ");
        Scanner sc = new Scanner(System.in);
        
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
        
        themVaoDs(tenNv, maNv, tuoiNv, heSoLuong, ngayVaoLam, maBP, soNgayPhep, gioLamThem);
        System.out.println("== THÊM NHÂN VIÊN THÀNH CÔNG ==");
    }
    public void themVaoDs(String tenNv, String maNv, int tuoiNv, double heSoLuong, String ngayVaoLam, String maBP, int soNgayPhep, double gioLamThem) throws ParseException{
        Staff nv = new Employee(tenNv, maNv, tuoiNv, heSoLuong, ngayVaoLam, maBP, soNgayPhep, gioLamThem);
        dsNV.add(nv);
        
    }
    
    /**
     * @return the dsNV
     */
    public List<Staff> getDsNV() {
        return dsNV;
    }

    /**
     * @param dsNV the dsNV to set
     */
    public void setDsNV(List<Staff> dsNV) {
        this.dsNV = dsNV;
    }

}
