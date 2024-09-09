/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import BEAN.LopHPbean;
import BEAN.Thoigianbean;
import java.util.List;

/**
 *
 * @author Acer
 */
public interface THONGKEDAO {
    
      public List<LopHPbean> getListByDangKy();
      public List<Thoigianbean> getListByLopHP();
}
