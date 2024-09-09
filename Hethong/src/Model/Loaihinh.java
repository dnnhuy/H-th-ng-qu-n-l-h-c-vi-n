/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Acer
 */
public class Loaihinh {
    private String MSSV ;
    private String MaLHP;
    private String DiemQt;
    private String DiemThi;
    private String DiemTb;
    private String KetQua;

    public Loaihinh(){
        
    }

    public Loaihinh(String MSSV, String MaLHP, String DiemQt, String DiemThi, String DiemTb, String KetQua) {
        this.MSSV = MSSV;
        this.MaLHP = MaLHP;
        this.DiemQt = DiemQt;
        this.DiemThi = DiemThi;
        this.DiemTb = DiemTb;
        this.KetQua = KetQua;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getMaLHP() {
        return MaLHP;
    }

    public void setMaLHP(String MaLHP) {
        this.MaLHP = MaLHP;
    }

    public String getDiemQt() {
        return DiemQt;
    }

    public void setDiemQt(String DiemQt) {
        this.DiemQt = DiemQt;
    }

    public String getDiemThi() {
        return DiemThi;
    }

    public void setDiemThi(String DiemThi) {
        this.DiemThi = DiemThi;
    }

    public String getDiemTb() {
        return DiemTb;
    }

    public void setDiemTb(String DiemTb) {
        this.DiemTb = DiemTb;
    }

    public String getKetQua() {
        return KetQua;
    }

    public void setKetQua(String KetQua) {
        this.KetQua = KetQua;
    }
    
}
