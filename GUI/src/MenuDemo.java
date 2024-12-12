
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bijay
 */
public class MenuDemo {
    public MenuDemo(){
        JFrame f = new JFrame("Hello");
        
        JMenuBar mb=new JMenuBar();
        f.setJMenuBar(mb);
        
        JMenu m1=new JMenu("File");
        mb.add(m1);
        
        JMenuItem a1=new JMenuItem("New");
        JMenuItem a2=new JMenuItem("Open");
        JMenuItem a3=new JMenuItem("Exit");
        m1.add(a1);
        m1.add(a2);
        m1.add(a3);
        
         a1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "Hello");
            }
        });
        
        a3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        f.setSize(300, 300);
        f.setDefaultCloseOperation(3);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new MenuDemo();
    }
}
