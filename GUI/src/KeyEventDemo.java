
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author bijay
 */
public class KeyEventDemo {

    public KeyEventDemo() {
        JFrame f = new JFrame("Hello");
        JTextArea jt=new JTextArea(15, 15);
        f.setLayout(new FlowLayout());
        f.add(jt);
        
        
        jt.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
             System.out.println("hello");
            }
    
            public void keyPressed(KeyEvent e) {
               
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        f.setSize(300, 300);
        f.setDefaultCloseOperation(3);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new KeyEventDemo();
    }
}
