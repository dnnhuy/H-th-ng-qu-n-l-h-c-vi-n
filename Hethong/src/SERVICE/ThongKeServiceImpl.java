/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICE;

import BEAN.LopHPbean;
import BEAN.Thoigianbean;
import DAO.THONGKEDAO;
import DAO.THONGKEDAOImpl;
import java.util.List;

/**
 *
 * @author Acer
 */
public class ThongKeServiceImpl implements ThongKeService {

    private THONGKEDAO thongKeDAO = null;

    public ThongKeServiceImpl() {
        this.thongKeDAO = new THONGKEDAOImpl();
    }




    @Override
    public List<LopHPbean> getListByDangKy() {
                return thongKeDAO.getListByDangKy();

    }

    @Override
    public List<Thoigianbean> getListByLopHP() {
                return thongKeDAO.getListByLopHP();

    }

}
