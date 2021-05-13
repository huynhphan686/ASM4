/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Department {
    private String maBp;
    private String tenBp;
    private int soLuongNv;
    
    public Department(String maBp, String tenBp, int soLuongNv){
        this.maBp = maBp;
        this.tenBp = tenBp;
        this.soLuongNv = soLuongNv;
    }
    /**
     * @return the maBp
     */
    public String getMaBp() {
        return maBp;
    }

    /**
     * @param maBp the maBp to set
     */
    public void setMaBp(String maBp) {
        this.maBp = maBp;
    }

    /**
     * @return the tenBp
     */
    public String getTenBp() {
        return tenBp;
    }

    /**
     * @param tenBp the tenBp to set
     */
    public void setTenBp(String tenBp) {
        this.tenBp = tenBp;
    }

    /**
     * @return the soLuongNv
     */
    public int getSoLuongNv() {
        return soLuongNv;
    }

    /**
     * @param soLuongNv the soLuongNv to set
     */
    public void setSoLuongNv(int soLuongNv) {
        this.soLuongNv = soLuongNv;
    }
    
    
}
