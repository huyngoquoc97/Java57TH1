package awt1;
import java.awt.Panel;
import  java.awt.GridLayout;
import java.awt.Frame;
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;


/**
 *
 * @author NgoQuocHuy
 */
public class AWT1 extends Frame{
     public AWT1()
    {
        setTitle("AWT ");
        setSize(300, 300);
        GridLayout L = new GridLayout(4,2);
        setLayout(L);
                   
        lblA = new Label("A=");
        add(lblA);    // Gáº¯n vĂ o Frame
        
        txtA= new TextField(10);
        add(txtA);
        
        lblB = new Label("B=");
        add(lblB);    // Gáº¯n vĂ o Frame
        
        txtB= new TextField(20);
        add(txtB);
        
        btnTinhTong = new Button("Tính +");
        btnTinhTru = new Button("Tính -");
        btnNhan = new Button("Tính *");
        btnTinhChia = new Button("Tính /");
        btnTinhTong.addActionListener(new LangNgheCong());
        btnTinhTru.addActionListener(new LangNgheCong1());
        btnNhan.addActionListener(new LangNgheCong2());
        btnTinhChia.addActionListener(new LangNgheCong3());
        
//        add(btnTinhTong);
//        add(btnTinhTru);
//        add(btnNhan);
//        add(btnTinhChia);
        // chá»«a á»Ÿ Ä‘Ă¢y 2 dĂ²ng nhĂ³e
        
        
        Panel p = new Panel();
        p.setLayout(new FlowLayout());
        p.add(btnTinhTong);
        p.add(btnTinhTru);
        p.add(btnNhan);
        p.add(btnTinhChia);
        add(p);
        
        lblKetQua = new Label("Ket qua:");
        add(lblKetQua);
        txtKetQua= new TextField(20);
        add(txtKetQua);
       
        setVisible(true);
        this.addWindowListener(new LangNgheCuaSo());
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new AWT1();
            }
    //--- Bá»™ láº¯ng nghe
    class LangNgheCong  implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           // Láº¥y A
           int a = Integer.parseInt(txtA.getText());
           // Láº¥y B
           int b = Integer.parseInt(txtB.getText());
           //TĂ­nh tá»•ng
           int Tong = a+b;
           // Xuáº¥t
           txtKetQua.setText(String.valueOf(Tong));
       }
    }
      class LangNgheCong1 implements ActionListener{
           public void actionPerformed(ActionEvent e)
           {
               // Láº¥y A
           int a = Integer.parseInt(txtA.getText());
           // Láº¥y B
           int b = Integer.parseInt(txtB.getText());
          
           //TĂ­nh hiá»‡u
           int Hieu = a-b;
           // Xuáº¥t
           txtKetQua.setText(String.valueOf(Hieu));
           }
       }
      class LangNgheCong2 implements ActionListener{
           public void actionPerformed(ActionEvent e)
           {
               // Láº¥y A
           int a = Integer.parseInt(txtA.getText());
           // Láº¥y B
           int b = Integer.parseInt(txtB.getText());
          
           //TĂ­nh hiá»‡u
           int Tich = a*b;
           // Xuáº¥t
           txtKetQua.setText(String.valueOf(Tich));
           }
       }
      class LangNgheCong3 implements ActionListener{
           public void actionPerformed(ActionEvent e)
           {
               // Láº¥y A
           int a = Integer.parseInt(txtA.getText());
           // Láº¥y B
           int b = Integer.parseInt(txtB.getText());
          
           //TĂ­nh hiá»‡u
           int Thuong = a/b;
           // Xuáº¥t
           txtKetQua.setText(String.valueOf(Thuong));
           }
       }
      class LangNgheCuaSo implements WindowListener{

        @Override
        public void windowOpened(WindowEvent we) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosing(WindowEvent we) {
           System.exit(0);
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosed(WindowEvent we) {
          
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowIconified(WindowEvent we) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeiconified(WindowEvent we) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowActivated(WindowEvent we) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeactivated(WindowEvent we) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

       
      }
Label lblA, lblB,lblKetQua;
    TextField txtA, txtB, txtKetQua;
    Button btnTinhTong;
    Button btnTinhTru;
    Button btnNhan;
    Button btnTinhChia;
    }

