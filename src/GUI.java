
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1818007
 */
public class GUI extends JFrame {
    Container cp;
    JLabel lb1 = new JLabel("1");
    JLabel lb2 = new JLabel("2");
    JLabel lb3 = new JLabel("3");
    JLabel lb4 = new JLabel("4");
    JLabel lb5 = new JLabel("5");
    JLabel lb6 = new JLabel("6");
    
    public GUI() {
        
        setTitle("Se der deu");
        setSize(500,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        cp= getContentPane();
        cp.setLayout(new GridLayout(2,3));
        
        cp.add(lb1);
        cp.add(lb2);
        cp.add(lb3);
        cp.add(lb4);
        cp.add(lb5);
        cp.add(lb6);
        
        lb1.setOpaque(true); 
        lb2.setOpaque(true);
        lb3.setOpaque(true);
        lb4.setOpaque(true);
        lb5.setOpaque(true);
        lb6.setOpaque(true);
        
        lb1.setBackground(Color.GREEN);
        lb2.setBackground(Color.CYAN);
        lb3.setBackground(Color.PINK);
        lb4.setBackground(Color.darkGray);
        lb5.setBackground(Color.ORANGE);
        lb6.setBackground(Color.LIGHT_GRAY);
        
        lb1.setForeground(Color.red);
        lb2.setForeground(Color.red);
        lb3.setForeground(Color.red);
        lb4.setForeground(Color.red);
        lb5.setForeground(Color.red);
        lb6.setForeground(Color.red);
        
        lb1.setHorizontalAlignment(SwingConstants.CENTER);
        lb2.setHorizontalAlignment(SwingConstants.CENTER);
        lb3.setHorizontalAlignment(SwingConstants.CENTER);
        lb4.setHorizontalAlignment(SwingConstants.CENTER);
        lb5.setHorizontalAlignment(SwingConstants.CENTER);
        lb6.setHorizontalAlignment(SwingConstants.CENTER);
        
        lb1.setFont(new Font("Dialog", Font.ROMAN_BASELINE, 36));
        lb2.setFont(new Font("Dialog", Font.PLAIN, 36));
        lb3.setFont(new Font("Dialog", Font.PLAIN, 36));
        lb4.setFont(new Font("Dialog", Font.PLAIN, 36));
        lb5.setFont(new Font("Dialog", Font.PLAIN, 36));
        lb6.setFont(new Font("Dialog", Font.PLAIN, 36));
        
        
        
        setVisible(true);
        setLocationRelativeTo(null);
        
        
                
    }
    
}
