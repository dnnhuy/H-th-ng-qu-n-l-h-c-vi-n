/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Acer
 */
public class LopHP {
    private String MaLHP ;
    private String NgayBd;
    private String NgayKt;
    private String MaKH ;
    private String MaGV ;
    private String MaPH;
    
    // khởi tạo mặc định
    public LopHP()
    {}

    public LopHP(String MaLHP, String NgayBd, String NgayKt, String MaKH, String MaGV, String MaPH) {
        this.MaLHP = MaLHP;
        this.NgayBd = NgayBd;
        this.NgayKt = NgayKt;
        this.MaKH = MaKH;
        this.MaGV = MaGV;
        this.MaPH = MaPH;
    }

    public String getMaLHP() {
        return MaLHP;
    }

    public void setMaLHP(String MaLHP) {
        this.MaLHP = MaLHP;
    }

    public String getNgayBd() {
        return NgayBd;
    }

    public void setNgayBd(String NgayBd) {
        this.NgayBd = NgayBd;
    }

    public String getNgayKt() {
        return NgayKt;
    }

    public void setNgayKt(String NgayKt) {
        this.NgayKt = NgayKt;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public String getMaPH() {
        return MaPH;
    }

    public void setMaPH(String MaPH) {
        this.MaPH = MaPH;
    }

    
    
    
}
