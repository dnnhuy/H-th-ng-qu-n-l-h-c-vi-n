/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Acer
 */
public class Phonghoc {
     private String MaTinh;
     private String TenTinh;
     
     public Phonghoc(){
        }

    public Phonghoc(String MaTinh, String TenTinh) {
        this.MaTinh = MaTinh;
        this.TenTinh = TenTinh;
    }

    public String getMaTinh() {
        return MaTinh;
    }

    public void setMaTinh(String MaTinh) {
        this.MaTinh = MaTinh;
    }

    public String getTenTinh() {
        return TenTinh;
    }

    public void setTenTinh(String TenTinh) {
        this.TenTinh = TenTinh;
    }

    
     
     
     
}
