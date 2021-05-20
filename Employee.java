import java.text.ParseException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Employee extends Staff{
    private double gioLamThem;

    public Employee(String tenNv, String maNv, int tuoiNv, double heSoLuong,
            String ngayVaoLam, String boPhanLv, int soNgayPhep, double gioLamthem)
            throws ParseException {
        super(maNv, tenNv, tuoiNv, heSoLuong, ngayVaoLam, boPhanLv, soNgayPhep);
        
        this.gioLamThem = gioLamThem;
    }
    
    @Override
    public double tinhTienLuong() {
        return getHeSoLuong()*3000000 + gioLamThem*200000;
    }
    @Override
    public String toString() {
        return String.format("%-10s%-20s%-10s%-10s%-10s%-20s%-10s%-10s","TÊN: ",
                "MÃ NHÂN VIÊN", "TUỔI", "HỆ SỐ LƯƠNG", "NGÀY VÀO LÀM",
                "BỘ PHẬN", "SỐ NGÀY PHÉP", "SỐ GIỜ LÀM THÊM");
    }
    /**
     * @return the gioLamThem
     */
    public double getGioLamThem() {
        return gioLamThem;
    }

    /**
     * @param gioLamThem the gioLamThem to set
     */
    public void setGioLamThem(double gioLamThem) {
        this.gioLamThem = gioLamThem;
    }
}
