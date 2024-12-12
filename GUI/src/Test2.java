
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Test2 extends JFrame {

    public Test2() {
        String []a={"Nepal","India","China"};
        JRadioButton jr1=new JRadioButton("male");
        JRadioButton jr2=new JRadioButton("female");
        JRadioButton jr3=new JRadioButton("others");
        
        JComboBox jcb=new JComboBox(a);
        
       jcb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jcb.getSelectedItem());
            }
       });
        
        setLayout(new FlowLayout());
        add(jr1);
        add(jr2);
        add(jr3);
        add(jcb);
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(jr1);
        bg.add(jr2);
        bg.add(jr3);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test2();
    }
}
