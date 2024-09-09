
package Model;

public class DangKy {
    private String MaHV ;
    private String MaLHP;
    private String NgayDk;
    private String Khuyenmai;
    private String Xeploai;
    private String Chungchi ;

    
    
    // khởi tạo mặc định
    public DangKy ()
    {}

    public DangKy(String MaHV, String MaLHP, String NgayDk, String Khuyenmai, String Xeploai, String Chungchi) {
        this.MaHV = MaHV;
        this.MaLHP = MaLHP;
        this.NgayDk = NgayDk;
        this.Khuyenmai = Khuyenmai;
        this.Xeploai = Xeploai;
        this.Chungchi = Chungchi;
    }

    public String getMaHV() {
        return MaHV;
    }

    public void setMaHV(String MaHV) {
        this.MaHV = MaHV;
    }

    public String getMaLHP() {
        return MaLHP;
    }

    public void setMaLHP(String MaLHP) {
        this.MaLHP = MaLHP;
    }

    public String getNgayDk() {
        return NgayDk;
    }

    public void setNgayDk(String NgayDk) {
        this.NgayDk = NgayDk;
    }

    public String getKhuyenmai() {
        return Khuyenmai;
    }

    public void setKhuyenmai(String Khuyenmai) {
        this.Khuyenmai = Khuyenmai;
    }

    public String getXeploai() {
        return Xeploai;
    }

    public void setXeploai(String Xeploai) {
        this.Xeploai = Xeploai;
    }

    public String getChungchi() {
        return Chungchi;
    }

    public void setChungchi(String Chungchi) {
        this.Chungchi = Chungchi;
    }



   

}
