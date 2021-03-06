import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public abstract class Staff {
     private String maNV;
     private String tenNv;
     private int tuoiNv;
     private double heSoLuong;
     private Date ngayVaoLam;
     private String maBP;
     private int soNgayPhep;
     
     public Staff(String tenNv, String maNv, int tuoiNv, double heSoLuong, String ngayVaoLam, String maBP, int soNgayPhep) throws ParseException{
         this.tenNv = tenNv;
         this.tuoiNv = tuoiNv;
         this.maNV = maNv;
         this.heSoLuong = heSoLuong;
         this.maBP = maBP;
         this.soNgayPhep = soNgayPhep;
         
         SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
         this.ngayVaoLam = f.parse(ngayVaoLam);
     }
     
     public abstract double tinhTienLuong();
     public abstract String toString();
     
    /**
     * @return the maNV
     */
    public String getMaNV() {
        return maNV;
    }

    /**
     * @param maNV the maNV to set
     */
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    /**
     * @return the tenNv
     */
    public String getTenNv() {
        return tenNv;
    }

    /**
     * @param tenNv the tenNv to set
     */
    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    /**
     * @return the tuoiNv
     */
    public int getTuoiNv() {
        return tuoiNv;
    }

    /**
     * @param tuoiNv the tuoiNv to set
     */
    public void setTuoiNv(int tuoiNv) {
        this.tuoiNv = tuoiNv;
    }

    /**
     * @return the heSoLuong
     */
    public double getHeSoLuong() {
        return heSoLuong;
    }

    /**
     * @param heSoLuong the heSoLuong to set
     */
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    /**
     * @return the ngayVaoLam
     */
    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    /**
     * @param ngayVaoLam the ngayVaoLam to set
     */
    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    /**
     * @return the boPhanLv
     */

    /**
     * @return the soNgayPhep
     */
    public int getSoNgayPhep() {
        return soNgayPhep;
    }

    /**
     * @param soNgayPhep the soNgayPhep to set
     */
    public void setSoNgayPhep(int soNgayPhep) {
        this.soNgayPhep = soNgayPhep;
    }

    /**
     * @return the maBP
     */
    public String getMaBP() {
        return maBP;
    }

    /**
     * @param maBP the maBP to set
     */
    public void setMaBP(String maBP) {
        this.maBP = maBP;
    }
}
