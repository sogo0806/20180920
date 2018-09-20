import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame  extends JFrame{
    public Container cp;
    public JButton jbt = new JButton("EXIT");
    public JButton jbt1 = new JButton("=");
    public JLabel jlb = new JLabel("攝氏");
    public JTextField tf = new JTextField("0");
    public JLabel jlb2 = new JLabel("華氏");
    public MainFrame (){
        init();
    }
    private void init(){
        this.setBounds(100,100,500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        cp = this.getContentPane();
        jbt.setBounds(200,200,100,50);
        jlb.setBounds(50,100,50,30);
        tf.setBounds(100,100,50,30);
        jbt1.setBounds(150,100,50,30);
        jlb2.setBounds(200,100,50,30);
        add(jbt);
        add(jbt1);
        add(jlb);
        add(jlb2);
        add(tf);
        jbt.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jbt1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Float x = Float.parseFloat(tf.getText());
                x = x*9/5+32;
                jlb2.setText(Float.toString(x)+"華氏");
            }
        });
    }
}
