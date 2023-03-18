/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blickyxender;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import static sun.applet.AppletResourceLoader.getImage;


/**
 *
 * @author DELL
 */
public class BlickyXender extends javax.swing.JFrame implements Runnable{
     Thread t;
     int a=220,b=220;
  
         Image img=Toolkit.getDefaultToolkit().getImage("background2.jpg");
         Image picture=Toolkit.getDefaultToolkit().getImage("rocket4.png");
         public BlickyXender() throws IOException{
               t=new Thread(this);
                t.start(); 
             this.setContentPane(new JPanel(){
                @Override
       public void paintComponent(Graphics g) {  
         super.paintComponent(g);
        
         
          g.drawImage(img, 0, 0, this);
        g.drawImage(picture, a,b, this);
             
        }  
             });
             pack();
                setSize(600,600);
              
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             setVisible(true);
         }
   
       public static void main(String [] args) throws IOException{
          new BlickyXender();
       
          /* JFrame frame=new JFrame("Xender");
           frame.setSize(600,600);
           frame.setVisible(true);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel=new JPanel(); 
          frame.add(panel);*/
          
       }

    @Override
    public void run() {
      while(true){
       try {
           t.sleep(500);
       } 
       catch (InterruptedException ex) {
           Logger.getLogger(BlickyXender.class.getName()).log(Level.SEVERE, null, ex);
       }
       if(b==220){
          b+=450;
       }
       else{
           b-=450;
       }
     
repaint();
       
    }
    

    }      
 }
  
          

    

