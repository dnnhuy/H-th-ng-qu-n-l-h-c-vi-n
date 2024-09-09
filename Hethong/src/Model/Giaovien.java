package Model;

public class Giaovien {
    private String MaGV ;
    private String HoTenGV;
    private String NgaySinhGV;
    private String GioiTinhGV ;
    private String SDT;
    private String CCCD;
    // khởi tạo mặc định
public Giaovien(){
    
}
    
    public Giaovien(String MaGV, String HoTenGV, String NgaySinhGV, String GioiTinhGV, String SDT, String CCCD) {
        this.MaGV = MaGV;
        this.HoTenGV = HoTenGV;
        this.NgaySinhGV = NgaySinhGV;
        this.GioiTinhGV = GioiTinhGV;
        this.SDT = SDT;
        this.CCCD = CCCD;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public String getHoTenGV() {
        return HoTenGV;
    }

    public void setHoTenGV(String HoTenGV) {
        this.HoTenGV = HoTenGV;
    }

    public String getNgaySinhGV() {
        return NgaySinhGV;
    }

    public void setNgaySinhGV(String NgaySinhGV) {
        this.NgaySinhGV = NgaySinhGV;
    }

    public String getGioiTinhGV() {
        return GioiTinhGV;
    }

    public void setGioiTinhGV(String GioiTinhGV) {
        this.GioiTinhGV = GioiTinhGV;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT ){
        this.SDT = SDT;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }   
}