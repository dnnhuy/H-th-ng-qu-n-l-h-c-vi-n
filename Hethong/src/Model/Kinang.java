/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Kinang {
    private String MaLop ;
    private String TenLop;
    private String MaCN;
    
    // khởi tạo mặc định
    public Kinang()
    {}

    public Kinang(String MaLop, String TenLop, String MaCN) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
        this.MaCN = MaCN;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    public String getMaCN() {
        return MaCN;
    }

    public void setMaCN(String MaCN) {
        this.MaCN = MaCN;
    }

}
