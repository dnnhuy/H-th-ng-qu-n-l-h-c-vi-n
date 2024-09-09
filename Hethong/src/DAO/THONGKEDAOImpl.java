/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import BEAN.LopHPbean;
import BEAN.Thoigianbean;
import Connection.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class THONGKEDAOImpl implements THONGKEDAO {

    @Override
    public List<LopHPbean> getListByDangKy() {
        Connection conn = null;
        try {
            conn = Connect.openConnect();
        } catch (Exception ex) {
            Logger.getLogger(THONGKEDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT NgayDk, COUNT(*) as so_luong FROM DangKy GROUP BY NgayDk";     
        
        List<LopHPbean> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LopHPbean lopHocBean = new LopHPbean();
                lopHocBean.setNgay_dang_ky(rs.getString("NgayDk"));
                lopHocBean.setSo_luong_hoc_vien(rs.getInt("so_luong"));
                list.add(lopHocBean);
            }
            ps.close();
            conn.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Thoigianbean> getListByLopHP() {
        Connection conn = null;
        try {
            conn = Connect.openConnect();
        } catch (Exception ex) {
            Logger.getLogger(THONGKEDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "SELECT MaLHP, NgayBd, NgayKt FROM LopHP ORDER BY NgayBd ASC";
        List<Thoigianbean> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Thoigianbean khoaHocBean = new Thoigianbean();
                khoaHocBean.setlhp(rs.getString("MaLHP"));
                khoaHocBean.setNgay_bat_dau(rs.getDate("NgayBd"));
                khoaHocBean.setNgay_ket_thuc(rs.getDate("NgayKt"));
                list.add(khoaHocBean);
            }
            ps.close();
            conn.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
   
    
}
