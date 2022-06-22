import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
    JButton button;
    JTextField textField;
    JPasswordField password;
    JLabel label;
    Container con;
    JPanel pan1;
    JPanel pan2;
    public Login(){
        super("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
        init();
    }
    private void init(){
        con = getContentPane();
        pan1 = new JPanel();
        pan2 = new JPanel();
        label = new JLabel("Display your username");
        textField =  new JTextField(10);
        password = new JPasswordField(10);
        button = new JButton("Login");
        //pan1
        con.add(pan1,BorderLayout.NORTH);
        pan1.setPreferredSize(new Dimension(300,50));
        pan1.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        pan1.add(label);
        //pan2
        con.add(pan2,BorderLayout.CENTER);
        pan2.setBorder(BorderFactory.createRaisedBevelBorder());
        pan2.add(textField);
        pan2.add(password);
        pan2.add(button);
        //add event
        button.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        String s = textField.getText();
        char[]p = password.getPassword();
        if(p.length==5){
            label.setText("Welcome" + " " +s);
        }
        else{
            JOptionPane.showMessageDialog(null,"Wrong Password");
        }
        

    }
    public static void main(String[] args) {
        Login l = new Login();
        l.setVisible(true);
    }
}
