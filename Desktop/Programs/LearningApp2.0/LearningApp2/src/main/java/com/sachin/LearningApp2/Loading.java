
package com.sachin.LearningApp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Loading extends javax.swing.JFrame {

    
    public Loading() {
        initComponents();
    }

   
  
                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(601, 380));
        jPanel1.setLayout(null);

        jProgressBar1.setBackground(new java.awt.Color(51, 255, 51));
        jProgressBar1.setForeground(new java.awt.Color(0, 0, 255));
        jProgressBar1.setBorderPainted(false);
        jProgressBar1.setStringPainted(true);
        jProgressBar1.setBounds(-4, 363, 608, 20);
        jPanel1.add(jProgressBar1);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Loading...");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setBounds(10, 340, 280, 20);
        jPanel1.add(jLabel2);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images.jpeg")));
        jLabel4.setBounds(0, 0, 609, 380);
        jPanel1.add(jLabel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

   
    public static void main(String args[]) {
    	
    	
    	
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        
        Loading load=new Loading();
        load.setVisible(true);
        try{
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(100);
                
                if(i==10)
                {
                    load.jLabel2.setText("Starting Application....");
                }
                if(i==50)
                {
                    load.jLabel2.setText("Loading Database....");
                }
                if(i==90)
                {
                    load.jLabel2.setText("Almost Done....");
                }
                if(i==100)
                {
                	 ApplicationContext ac= new ClassPathXmlApplicationContext("Configuration.xml");
                	load.setVisible(false);
                	Login login=ac.getBean("login",Login.class);
                	login.setVisible(true);
                }
              
                load.jProgressBar1.setValue(i);
                
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration                   
}
