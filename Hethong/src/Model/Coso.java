/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Acer
 */
public class Coso {
     private String MaCS;
     private String TenCS;
     private String Diachi;
     
     public Coso(){
        }

    public Coso(String MaCS, String TenCS) {
        this.MaCS = MaCS;
        this.TenCS = TenCS;
        this.Diachi=Diachi;
    }

    public String getMaCS() {
        return MaCS;
    }

    public void setMaCS(String MaCS) {
        this.MaCS = MaCS;
    }

    public String getTenCS() {
        return TenCS;
    }

    public void setTenCS(String TenCS) {
        this.TenCS = TenCS;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }
     
     
     
}
