package com.sachin.LearningApp2;


import java.awt.Color;

import Database.UserDataDao;


public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
    }

         private UserDataDao udd;
         private Learning_app la;
         private SignUp su;
        public SignUp getSu() {
			return su;
		}

		public void setSu(SignUp su) {
			this.su = su;
		}

		public UserDataDao getUdd() {
			return udd;
		}

		public void setUdd(UserDataDao udd) {
			this.udd = udd;
		}

		public Learning_app getLa() {
			return la;
		}

		public void setLa(Learning_app la) {
			this.la = la;
		}

		
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginUsername = new javax.swing.JTextField();
        loginPassword = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        SignUpButton = new javax.swing.JButton();
        loginExitButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        message= new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(450, 180, 0, 0));
        setMinimumSize(new java.awt.Dimension(601, 380));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(143, 110, 96, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jLabel2.setMaximumSize(new java.awt.Dimension(69, 17));
        jLabel2.setMinimumSize(new java.awt.Dimension(69, 17));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(147, 180, 96, 40);

        loginUsername.setBackground(new java.awt.Color(237, 237, 237));
        loginUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        loginUsername.setForeground(new java.awt.Color(153, 153, 153));
        loginUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginUsername.setText("Enter Username");
        loginUsername.setBorder(null);
        loginUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginUsernameMouseClicked(evt);
            }
        });
        loginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(loginUsername);
        loginUsername.setBounds(270, 118, 190, 30);

        loginPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginPassword.setBorder(null);
        loginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(loginPassword);
        loginPassword.setBounds(270, 190, 190, 30);

        LoginButton.setBackground(new java.awt.Color(255, 255, 255));
        LoginButton.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LoginButton.setBorderPainted(false);
        LoginButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LoginButtonMouseMoved(evt);
            }
        });
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LoginButtonMouseReleased(evt);
            }
        });
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton);
        LoginButton.setBounds(40, 280, 530, 30);

        SignUpButton.setBackground(new java.awt.Color(255, 255, 255));
        SignUpButton.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        SignUpButton.setText("SignUp");
        SignUpButton.setBorderPainted(false);
        SignUpButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SignUpButtonMouseMoved(evt);
            }
        });
        SignUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignUpButtonMouseExited(evt);
            }
        });
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignUpButton);
        SignUpButton.setBounds(260, 330, 110, 30);

        loginExitButton.setBackground(new java.awt.Color(255, 132, 132));
        loginExitButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginExitButton.setForeground(new java.awt.Color(255, 255, 255));
        loginExitButton.setText("X");
        loginExitButton.setBorder(null);
        loginExitButton.setBorderPainted(false);
        loginExitButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                loginExitButtonMouseMoved(evt);
            }
        });
        loginExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginExitButtonMouseExited(evt);
            }
        });
        loginExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginExitButton);
        loginExitButton.setBounds(562, 0, 40, 20);

        message.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        message.setForeground(new java.awt.Color(255, 0, 51));
        message.setText("");
        getContentPane().add(message);
        message.setBounds(50, 70, 513, 36);
        
        jLabel6.setFont(new java.awt.Font("Algerian", 1, 24)); 
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Login");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 0, 100, 30);
        
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Screenshot_2.png"))); 
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, -10, 630, 410);
         
       
        pack();
    }// </editor-fold>                        

    private void loginUsernameMouseClicked(java.awt.event.MouseEvent evt) {                                           
        loginUsername.setBackground(Color.WHITE);        
        loginUsername.setForeground(Color.BLACK);       
        loginUsername.setText("");        
    }                                          

    private void loginUsernameActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void loginPasswordActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void LoginButtonMouseMoved(java.awt.event.MouseEvent evt) {                                       
        LoginButton.setBackground(Color.cyan);// TODO add your handling code here:
    }                                      

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         

    }                                        

    private void LoginButtonMouseExited(java.awt.event.MouseEvent evt) {                                        
        LoginButton.setBackground(Color.white);        // TODO add your handling code here:
    }                                       

    private void LoginButtonMouseReleased(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        message.setText("");
        String Username=loginUsername.getText();
		String Password=loginPassword.getText();
        if(1==udd.check(Username, Password))
        {
           this.setVisible(false);
           la.setVisible(true);	
        }
        else
        {
        	message.setText("Incorrect username or password");
        }
    }                                           

    private void SignUpButtonMouseMoved(java.awt.event.MouseEvent evt) {                                        
        SignUpButton.setBackground(Color.cyan);
    }                                       

    private void SignUpButtonMouseExited(java.awt.event.MouseEvent evt) {                                         
        SignUpButton.setBackground(Color.white);
    }                                        

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
       su.setVisible(true);
       this.setVisible(false);
    }                                            

    private void loginExitButtonMouseMoved(java.awt.event.MouseEvent evt) {                                           
        loginExitButton.setBackground(new java.awt.Color(255, 0, 0));
    }                                          

    private void loginExitButtonMouseExited(java.awt.event.MouseEvent evt) {                                            
        loginExitButton.setBackground(new java.awt.Color(255, 132, 132));
    }                                           

    private void loginExitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        System.exit(0);
    }                                               
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton loginExitButton;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JTextField loginUsername;
    private javax.swing.JLabel message;
    //
}
