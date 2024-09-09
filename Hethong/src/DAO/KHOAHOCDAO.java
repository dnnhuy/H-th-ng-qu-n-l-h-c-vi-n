/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Connection.Connect;
import Model.Khoahoc;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Acer
 */
public class KHOAHOCDAO {
    //Thêm
    public boolean insert(Khoahoc KH) throws Exception {
        String Sql;
        Sql = "insert into KhoaHoc(MaKH,TenKH,Tuoi,Thoiluong,Gia,Slmax, MaMH, MaLoai,MaKN) values(?,?,?,?,?,?,?,?,?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, KH.getMaKH());
        pm.setString(2, KH.getTenKH());
        pm.setString(3, KH.getTuoi());
        pm.setString(4, KH.getThoiluong());
        pm.setString(5, KH.getGia());
        pm.setString(6, KH.getSlmax());
        pm.setString(7, KH.getMaMH());
        pm.setString(8, KH.getMaLoai());
        pm.setString(9, KH.getMaKN());
        return pm.executeUpdate() > 0;
    }
    //Xóa
    public boolean Delete(String MaKH) throws Exception {
        String sql = "Delete from KhoaHoc where BINARY_CHECKSUM(MaKH) = BINARY_CHECKSUM (?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(sql);
        pm.setString(1, MaKH);
        return pm.executeUpdate() > 0;
    }
    //Sửa
    public boolean Update(Khoahoc KH) throws Exception {
        String Sql;
        Sql = "Update KhoaHoc SET MaKH= ?,TenKH= ?,Tuoi= ?,Thoiluong= ?,Gia= ?,Slmax= ?, MaMH= ?, MaLoai= ?,MaKN= ? WHERE MaKH = ?";
       Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, KH.getMaKH());
        pm.setString(2, KH.getTenKH());
        pm.setString(3, KH.getTuoi());
        pm.setString(4, KH.getThoiluong());
        pm.setString(5, KH.getGia());
        pm.setString(6, KH.getSlmax());
        pm.setString(7, KH.getMaMH());
        pm.setString(8, KH.getMaLoai());
        pm.setString(9, KH.getMaKN());
        pm.setString(10, KH.getMaKH());
        return pm.executeUpdate() > 0;
    }

}
