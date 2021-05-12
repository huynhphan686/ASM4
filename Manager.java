
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
public class Manager extends Staff{
    private String chucDanh;

    public Manager(String tenNv, String maNv, int tuoiNv, double heSoLuong, String ngayVaoLam, String boPhanLv, int soNgayPhep, String chucDanh) throws ParseException {
        super(tenNv, maNv, tuoiNv, heSoLuong, ngayVaoLam, boPhanLv, soNgayPhep);
        
        this.chucDanh = chucDanh;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double tinhTienLuong(double heSoLuong, double gioLamThem) {
        for(Staff nhanvien : dsNV){
            if(nhanVien.getChucDanh().equalsIgnoreCase("Business Leader")){
                return getHeSoLuong()*5000000 + 8000000;
            }else if(nhanVien.getChucDanh().equalsIgnoreCase("Project Leader")){
                return getHeSoLuong()*5000000 + 5000000;
            }else if(nhanVien.getChucDanh().equalsIgnoreCase("Technical Leader")){
                return getHeSoLuong()*5000000 + 3000000;
            }
        }
    }
    /**
     * @return the chucDanh
     */
    public String getChucDanh() {
        return chucDanh;
    }

    /**
     * @param chucDanh the chucDanh to set
     */
    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }
}
