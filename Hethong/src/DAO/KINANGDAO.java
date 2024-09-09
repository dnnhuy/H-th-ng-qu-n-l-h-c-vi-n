/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Connection.Connect;
import Model.Kinang;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Acer
 */
public class KINANGDAO {
    //Thêm
    public boolean insert(Kinang l) throws Exception {
        String Sql;
        Sql = "insert into Lop(MaLop,TenLop,MaCN) values(?,?,?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, l.getMaLop());
        pm.setString(2, l.getTenLop());
        pm.setString(3, l.getMaCN());
        return pm.executeUpdate() > 0;
    }
    //Xóa
    public boolean Delete(String MaLop) throws Exception {
        String sql = "Delete from Lop where BINARY_CHECKSUM(MaLop) = BINARY_CHECKSUM (?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(sql);
        pm.setString(1, MaLop);
        return pm.executeUpdate() > 0;
    }
    //Sửa
    public boolean Update(Kinang l) throws Exception {
        String Sql;
        Sql = "Update Lop SET MaLop=?,TenLop=?,MaCN=?  WHERE MaLop = ?";
       Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, l.getMaLop());
        pm.setString(2, l.getTenLop());
        pm.setString(3, l.getMaCN());
        pm.setString(4, l.getMaLop());
        return pm.executeUpdate() > 0;
    }

}
