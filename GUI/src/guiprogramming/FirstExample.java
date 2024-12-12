
package guiprogramming;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class FirstExample {
    
    public FirstExample(){
        JFrame f=new JFrame("Hello");
        JButton b1=new JButton("One");
        JButton b2=new JButton("Two");
        JButton b3=new JButton("Three");
        JButton b4=new JButton("Four");
        
        f.setLayout(new FlowLayout());
        f.setLayout(new GridLayout(2,2));
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        
        f.setSize(300, 300);
        f.setDefaultCloseOperation(3);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        FirstExample f1=new FirstExample();
    }
}
