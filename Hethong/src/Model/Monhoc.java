/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Acer
 */
public class Monhoc {
    private String MaCN;
    private String TenCN;
    private String MaKhoa;
     
     public Monhoc(){
        }

    public Monhoc(String MaCN, String TenCN, String MaKhoa) {
        this.MaCN = MaCN;
        this.TenCN = TenCN;
        this.MaKhoa = MaKhoa;
    }

    public String getMaCN() {
        return MaCN;
    }

    public void setMaCN(String MaCN) {
        this.MaCN = MaCN;
    }

    public String getTenCN() {
        return TenCN;
    }

    public void setTenCN(String TenCN) {
        this.TenCN = TenCN;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }
     
}
