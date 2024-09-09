
package Model;

public class Hocvien {
    private String MaHV ;
    private String HoTenHV;
    private String NgaySinhHV;
    private String GioiTinhHV;
    
    // khởi tạo mặc định
    public Hocvien()
    {
    }

    public Hocvien(String MaHV, String HoTenHV, String NgaySinhHV, String GioiTinhHV) {
        this.MaHV = MaHV;
        this.HoTenHV = HoTenHV;
        this.NgaySinhHV = NgaySinhHV;
        this.GioiTinhHV = GioiTinhHV; 
    }

    public String getMaHV() {
        return MaHV;
    }

    public void setMaHV(String MaHV) {
        this.MaHV = MaHV;
    }

    public String getHoTenHV() {
        return HoTenHV;
    }

    public void setHoTenHV(String HoTenHV) {
        this.HoTenHV = HoTenHV;
    }

    public String getNgaySinhHV() {
        return NgaySinhHV;
    }

    public void setNgaySinhHV(String NgaySinhHV) {
        this.NgaySinhHV = NgaySinhHV;
    }

    public String getGioiTinhHV() {
        return GioiTinhHV;
    }

    public void setGioiTinhHV(String GioiTinhHV) {
        this.GioiTinhHV = GioiTinhHV;
    }
    
}
