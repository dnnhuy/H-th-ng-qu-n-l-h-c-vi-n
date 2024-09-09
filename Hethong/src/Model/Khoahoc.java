
package Model;

public class Khoahoc {
    private String MaKH ;
    private String TenKH;
    private String Tuoi;
    private String Thoiluong;
    private String Gia;
    private String Slmax;
    private String MaMH;
    private String MaLoai;
    private String MaKN;
    // khởi tạo mặc định
    public Khoahoc()
    {}

    public Khoahoc(String MaKH, String TenKH, String Tuoi, String Thoiluong, String Gia, String Slmax, String MaMH, String MaLoai, String MaKN) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.Tuoi = Tuoi;
        this.Thoiluong = Thoiluong;
        this.Gia = Gia;
        this.Slmax = Slmax;
        this.MaMH = MaMH;
        this.MaLoai = MaLoai;
        this.MaKN = MaKN;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getTuoi() {
        return Tuoi;
    }

    public void setTuoi(String Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getThoiluong() {
        return Thoiluong;
    }

    public void setThoiluong(String Thoiluong) {
        this.Thoiluong = Thoiluong;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }

    public String getSlmax() {
        return Slmax;
    }

    public void setSlmax(String Slmax) {
        this.Slmax = Slmax;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getMaKN() {
        return MaKN;
    }

    public void setMaKN(String MaKN) {
        this.MaKN = MaKN;
    }

   
    
}
