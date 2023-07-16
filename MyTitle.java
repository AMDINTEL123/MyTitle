/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;


/**
 *
 * @author khens
 */
public class MyTitle extends JFrame{
    
    public MyTitle(){
    setTitle("Khensani Ebenezer Lebese");
     setSize(200,250);
    setDefaultLookAndFeelDecorated(true);
    setResizable(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setForeground(Color.LIGHT_GRAY);
    setVisible(true);
    }
}
