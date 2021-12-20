/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinglab;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.*;

/**
 *
 * @author wku-cslab1
 */
public class Swinglab extends JFrame {

    /**
     * @param args the command line arguments
     */
    Swinglab() {
        setSize(400, 400);
        setLayout(new FlowLayout());
        JButton btn = new JButton("my button");
        JButton btn1 = new JButton("Exit");
        setTitle("first lab");

        //setDefaultCloseOperation(true);
        setResizable(false);
        /* Panel pobj=new Panel();
        pobj.setSize(100,100);
        pobj.setBackground(Color.red);
        pobj.add(btn);
        add(pobj);*/
        setBackground(Color.BLACK);

        //btn.setBounds(130,100,100,30);
        setLocationRelativeTo(null);
        btn.setBackground(Color.cyan);

        // JTextField txt=new JTextField(20);
        //add(txt);
        JLabel userLabel = new JLabel("USERNAME");
        userLabel.setSize(100, 400);
        userLabel.setBounds(50, 150, 100, 30);
        //setResizable(false);

        JLabel passwordLabel = new JLabel("PASSWORD");
        passwordLabel.setSize(100, 400);
        passwordLabel.setBounds(50, 150, 100, 30);
        Panel pobj2 = new Panel();
        pobj2.setSize(10, 10);
        pobj2.add(userLabel);
        pobj2.setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        JTextField userTextField = new JTextField(25);
        JPasswordField passwordField = new JPasswordField(25);
        JButton loginButton = new JButton("LOGIN");
        JButton resetButton = new JButton("RESET");
        JRadioButton rbn = new JRadioButton("male");
        rbn.setToolTipText("please click me");
        JRadioButton rbn2 = new JRadioButton("female");
        rbn2.setToolTipText("please click me");
        ButtonGroup bgtn = new ButtonGroup();
        bgtn.add(rbn);
        bgtn.add(rbn2);

        JFrame fobj = new JFrame();
        fobj.setSize(400, 400);
        FlowLayout flo = new FlowLayout();
        fobj.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
        fobj.setIconImage(new ImageIcon(getClass().getResource("my.jpg")).getImage());

        add(userLabel);
        add(userTextField);
        add(passwordLabel);

        add(passwordField);
        add(loginButton);
        add(btn);
        add(resetButton);
        add(btn1);
        add(rbn);
        add(rbn2);
        System.out.println();

        setVisible(true);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "who are you");

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == loginButton) {
                    String userText;
                    String pwdText;
                    userText = userTextField.getText();
                    pwdText = passwordField.getText();
                    if (userText.equalsIgnoreCase("etsub") && pwdText.equalsIgnoreCase("12345")) {
                        JOptionPane.showMessageDialog(null, "successful");
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                    }

                    // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userTextField.setText("");
                passwordField.setText("");

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        btn1.addActionListener(new Etsub());

    }

    class Etsub implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "done succefully");
         System.exit(0);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public static void main(String[] args) {
        new Swinglab();
        // TODO code application logic here
    }

}
