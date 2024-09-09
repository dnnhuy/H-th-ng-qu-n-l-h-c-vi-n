
package DAO;
import Connection.Connect;
import Model.LopHP;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Acer
 */
public class LOPHOCPHANDAO {
    //Thêm
    public boolean insert(LopHP LHP) throws Exception {
        String Sql;
        Sql = "insert into LopHP(MaLHP,NgayBd,NgayKt,MaKH, MaGV, MaPH) values(?,?,?,?,?,?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, LHP.getMaLHP());
        pm.setString(2, LHP.getNgayBd());
        pm.setString(3, LHP.getNgayKt());
        pm.setString(4,  LHP.getMaKH());
        pm.setString(5,  LHP.getMaGV());
        pm.setString(6, LHP.getMaPH());
        return pm.executeUpdate() > 0;
    }
    //Xóa
    public boolean Delete(String MaLHP) throws Exception {
        String sql = "Delete from LopHP where BINARY_CHECKSUM(MaLHP) = BINARY_CHECKSUM (?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(sql);
        pm.setString(1, MaLHP);
        return pm.executeUpdate() > 0;
    }
    //Sửa
    public boolean Update(LopHP LHP) throws Exception {
        String Sql;
        Sql = "Update LopHP SET MaLHP=?,NgayBd=?,NgayKt=?,MaKH=?,MaGV=?, MaPH=? WHERE MaLHP = ?";
       Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, LHP.getMaLHP());
        pm.setString(2, LHP.getNgayBd());
        pm.setString(3, LHP.getNgayKt());
        pm.setString(4,  LHP.getMaKH());
        pm.setString(5,  LHP.getMaGV());
        pm.setString(6, LHP.getMaPH());
        pm.setString(7, LHP.getMaLHP());
        return pm.executeUpdate() > 0;
    }

}
