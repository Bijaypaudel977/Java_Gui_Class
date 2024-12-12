
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Test extends JFrame implements ItemListener {

    JCheckBox jc1, jc2, jc3;

    public Test() {
        jc1 = new JCheckBox("C");
        jc2 = new JCheckBox("Java");
        jc3 = new JCheckBox("Python");

        jc1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (jc1.isSelected()) {

                    System.out.println(jc1.getActionCommand());
                }
            }
        });
        jc2.addItemListener(this);
        jc3.addItemListener(this);
        setLayout(new FlowLayout());
        add(jc1);
        add(jc2);
        add(jc3);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (jc2.isSelected()) {

            System.out.println(jc2.getActionCommand());
        }
        if (e.getSource() == jc3) {
            if (jc3.isSelected()) {
                System.out.println(jc3.getActionCommand());
            }
        }
    }

    public static void main(String[] args) {
        new Test();
    }
}
