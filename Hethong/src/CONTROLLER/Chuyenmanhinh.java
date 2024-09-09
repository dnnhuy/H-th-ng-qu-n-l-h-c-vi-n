
package CONTROLLER;

/**
 *
 * @author Acer
 */
import BEAN.Danhmuc;
import VIEW.DangkyJP;
import VIEW.GiaovienJP;
import VIEW.HocvienJP;
import VIEW.KhoahocJP;
import VIEW.LopHPJP;
import VIEW.ThongkeJP;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import VIEW.TrangchuJP;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class Chuyenmanhinh {
    
    private JPanel root;
    private String kindSelected ="";
    private List<Danhmuc> listItem=null;

    public Chuyenmanhinh(JPanel jpRoot) {
        this.root = jpRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem) { 
        kindSelected = "TrangChu";
        jpnItem.setBackground (new Color (96, 100, 191));
        jlbItem.setBackground (new Color(96, 100, 191));
        
        root.removeAll();
        root.setLayout (new BorderLayout());
        root.add(new TrangchuJP());
        root.validate();
        root.repaint();
    }
    
    public void setEvent (List<Danhmuc> listItem){
        this.listItem=listItem;
        for(Danhmuc item : listItem){
           item.getJlb().addMouseListener(new LabelEvent (item.getKind(), item.getJpn(), item.getJlb()));
        }
       }
    class LabelEvent  implements MouseListener {
        private JPanel node;
        
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        

        @Override
        public void mouseClicked(MouseEvent e) {
               switch (kind) {
                case "Trangchu":
                    node = new TrangchuJP();
                    break;
                case "Hocvien":
                    node = new HocvienJP();
                    break;
                case "Giaovien":
                    node = new GiaovienJP();
                    break;
                case "Khoahoc":
                    node = new KhoahocJP();
                    break;
                case "LopHP":
                    node = new LopHPJP();
                    break;
                case "Dangky":
                    node = new DangkyJP();
                    break;
                case "Thongke":
                    node = new ThongkeJP();
                    break;
                default:
                    node = new TrangchuJP();
                    break;
                }
                root.removeAll();
                root.setLayout(new BorderLayout());
                root.add(node);
                root.validate();
                root.repaint();
                setChangeBackgroud(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground (new Color (96, 100, 191));
            jlbItem.setBackground (new Color (96, 100, 191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground (new Color (96, 100, 191));
            jlbItem.setBackground (new Color (96, 100, 191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase (kind)) 
            jpnItem.setBackground (new Color(37,150,190)); 
            jlbItem.setBackground (new Color (37,150,190));
        }  
    }
        private void setChangeBackgroud (String kind) {
            for (Danhmuc item : listItem) {
            if (item.getKind().equalsIgnoreCase (kind)) {
                item.getJpn().setBackground (new Color (96, 100, 191)); 
                item.getJlb().setBackground (new Color(96, 100, 191));
            } else {
                item.getJpn().setBackground (new Color (37,150,190)); 
                item.getJlb().setBackground (new Color (37,150,190));
            }
           }
        }
}
