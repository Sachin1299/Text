package com.sachin.LearningApp2;



import java.awt.Color;

import javax.swing.JOptionPane;

import Database.UserData;
import Database.UserDataDao;



public class SignUp extends javax.swing.JFrame {

    
    public SignUp() {
        initComponents();
    }

    private UserDataDao udd;
    private UserData ud;
    private Login f;
    public UserDataDao getUdd() {
		return udd;
	}

	public void setUdd(UserDataDao udd) {
		this.udd = udd;
	}

	public UserData getUd() {
		return ud;
	}

	public void setUd(UserData ud) {
		this.ud = ud;
	}

	public Login getF() {
		return f;
	}

	public void setF(Login f) {
		this.f = f;
	}

	private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        FirstName = new javax.swing.JLabel();
        ContactNo = new javax.swing.JLabel();
        Username1 = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        ContactNoField = new javax.swing.JTextField();
        Username1Field = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        DOB = new javax.swing.JLabel();
        Password1 = new javax.swing.JLabel();
        LastNameField = new javax.swing.JTextField();
        Password1Field = new javax.swing.JTextField();
        SignupButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LoginPageButton = new javax.swing.JButton();
        loginExitButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        DOB1= new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(450, 180, 0, 0));
        setMinimumSize(new java.awt.Dimension(601, 380));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Signup");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(283, 0, 128, 44);

        FirstName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FirstName.setForeground(new java.awt.Color(255, 255, 255));
        FirstName.setText("First Name");
        getContentPane().add(FirstName);
        FirstName.setBounds(28, 88, 80, 30);

        ContactNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ContactNo.setForeground(new java.awt.Color(255, 255, 255));
        ContactNo.setText("Contact No.");
        getContentPane().add(ContactNo);
        ContactNo.setBounds(28, 175, 86, 30);

        Username1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Username1.setForeground(new java.awt.Color(255, 255, 255));
        Username1.setText("Username");
        getContentPane().add(Username1);
        Username1.setBounds(28, 264, 76, 30);

        FirstNameField.setBackground(new java.awt.Color(229, 229, 229));
        FirstNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FirstNameFieldMouseClicked(evt);
            }
        });
        getContentPane().add(FirstNameField);
        FirstNameField.setBounds(110, 90, 145, 28);
        
        DOB1.setBackground(new java.awt.Color(229, 229, 229));
        DOB1.setForeground(Color.gray);
        DOB1.setText("example: 23/07/2001");
        DOB1.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
                DOB1MouseClicked(evt);
            }
        });
        getContentPane().add(DOB1);
        DOB1.setBounds(410, 170, 170, 30);
        
        
        ContactNoField.setBackground(new java.awt.Color(229, 229, 229));
        ContactNoField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactNoFieldMouseClicked(evt);
            }
        });
        getContentPane().add(ContactNoField);
        ContactNoField.setBounds(110, 180, 147, 30);

        Username1Field.setBackground(new java.awt.Color(229, 229, 229));
        Username1Field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Username1FieldMouseClicked(evt);
            }
        });
        getContentPane().add(Username1Field);
        Username1Field.setBounds(110, 270, 147, 30);

        LastName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LastName.setForeground(new java.awt.Color(255, 255, 255));
        LastName.setText("Last Name");
        getContentPane().add(LastName);
        LastName.setBounds(330, 100, 94, 15);

        DOB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DOB.setForeground(new java.awt.Color(255, 255, 255));
        DOB.setText("D.O.B");
        getContentPane().add(DOB);
        DOB.setBounds(340, 175, 94, 15);

        Password1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Password1.setForeground(new java.awt.Color(255, 255, 255));
        Password1.setText("Password");
        getContentPane().add(Password1);
        Password1.setBounds(320, 260, 94, 30);

        LastNameField.setBackground(new java.awt.Color(229, 229, 229));
        LastNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LastNameFieldMouseClicked(evt);
            }
        });
        getContentPane().add(LastNameField);
        LastNameField.setBounds(410, 90, 170, 30);

        Password1Field.setBackground(new java.awt.Color(229, 229, 229));
        Password1Field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Password1FieldMouseClicked(evt);
            }
        });
        getContentPane().add(Password1Field);
        Password1Field.setBounds(410, 260, 170, 30);

        SignupButton.setBackground(new java.awt.Color(255, 255, 255));
        SignupButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SignupButton.setText("SignUp");
        SignupButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SignupButtonMouseMoved(evt);
            }
        });
        SignupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignupButtonMouseExited(evt);
            }
        });
        SignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignupButton);
        SignupButton.setBounds(280, 320, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("or back to ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 360, 60, 20);

        LoginPageButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LoginPageButton.setForeground(new java.awt.Color(0, 204, 204));
        LoginPageButton.setText("Login Page");
        LoginPageButton.setBorder(null);
        LoginPageButton.setContentAreaFilled(false);
        LoginPageButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LoginPageButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        LoginPageButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LoginPageButtonMouseMoved(evt);
            }
        });
        LoginPageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginPageButtonMouseExited(evt);
            }
        });
        LoginPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginPageButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginPageButton);
        LoginPageButton.setBounds(310, 360, 150, 20);

        loginExitButton1.setBackground(new java.awt.Color(255, 132, 132));
        loginExitButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginExitButton1.setForeground(new java.awt.Color(255, 255, 255));
        loginExitButton1.setText("X");
        loginExitButton1.setBorder(null);
        loginExitButton1.setBorderPainted(false);
        loginExitButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                loginExitButton1MouseMoved(evt);
            }
        });
        loginExitButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginExitButton1MouseExited(evt);
            }
        });
        loginExitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginExitButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(loginExitButton1);
        loginExitButton1.setBounds(562, 0, 40, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Screenshot_2.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-6, 0, 610, 380);

        pack();
    }// </editor-fold>                        

    private void FirstNameFieldMouseClicked(java.awt.event.MouseEvent evt) {                                            
        FirstNameField.setBackground(new java.awt.Color(255, 255, 255)); 
    }                                           
    
    
    private void ContactNoFieldMouseClicked(java.awt.event.MouseEvent evt) {                                            
        ContactNoField.setBackground(new java.awt.Color(255, 255, 255));        // TODO add your handling code here:
    }                                           

    private void Username1FieldMouseClicked(java.awt.event.MouseEvent evt) {                                            
        Username1Field.setBackground(new java.awt.Color(255, 255, 255));      // TODO add your handling code here:
    }                                           

    private void LastNameFieldMouseClicked(java.awt.event.MouseEvent evt) {                                           
        LastNameField.setBackground(new java.awt.Color(255, 255, 255));        // TODO add your handling code here:
    }                                          

    private void DOB1MouseClicked(java.awt.event.MouseEvent evt) {                                      
        DOB1.setBackground(Color.white);
        DOB1.setForeground(Color.black);
        DOB1.setText("");
    }                                     

    private void Password1FieldMouseClicked(java.awt.event.MouseEvent evt) {                                            
        Password1Field.setBackground(new java.awt.Color(255, 255, 255));
    }                                           

    private void SignupButtonMouseMoved(java.awt.event.MouseEvent evt) {                                        
        SignupButton.setBackground(Color.cyan);        // TODO add your handling code here:
    }                                       

    private void SignupButtonMouseExited(java.awt.event.MouseEvent evt) {                                         
        SignupButton.setBackground(Color.WHITE);        // TODO add your handling code here:
    }                                        

    private void SignupButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        ud.setFirstName(FirstNameField.getText());
        ud.setLastName(LastNameField.getText());
        ud.setDOB(DOB1.getText());
        ud.setMobileNo(ContactNoField.getText());
        ud.setUsername(Username1Field.getText());
        ud.setPassword(Password1Field.getText());
       
        if(1==udd.Insert(ud))
        {
        	 JOptionPane.showMessageDialog(this,"!!Name Already Taken!!");
        }
        else {
        	JOptionPane.showMessageDialog(this,"Sign in Successfully");
        }
    }                                            

    private void LoginPageButtonMouseMoved(java.awt.event.MouseEvent evt) {                                           
        LoginPageButton.setForeground(Color.BLUE);        // TODO add your handling code here:
    }                                          

    private void LoginPageButtonMouseExited(java.awt.event.MouseEvent evt) {                                            
        LoginPageButton.setForeground(Color.WHITE);        // TODO add your handling code here:
    }                                           

    private void LoginPageButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
       
       this.setVisible(false);
       f.setVisible(true);
    }                                               

    private void loginExitButton1MouseMoved(java.awt.event.MouseEvent evt) {                                            
        loginExitButton1.setBackground(new java.awt.Color(255, 0, 0));  // TODO add your handling code here:
    }                                           

    private void loginExitButton1MouseExited(java.awt.event.MouseEvent evt) {                                             
        loginExitButton1.setBackground(new java.awt.Color(255, 132, 132));  // TODO add your handling code here:
        // TODO add your handling code here:
    }                                            

    private void loginExitButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel ContactNo;
    private javax.swing.JTextField ContactNoField;
    private javax.swing.JLabel DOB;
    private javax.swing.JLabel FirstName;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JLabel LastName;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JButton LoginPageButton;
    private javax.swing.JLabel Password1;
    private javax.swing.JTextField Password1Field;
    private javax.swing.JButton SignupButton;
    private javax.swing.JLabel Username1;
    private javax.swing.JTextField Username1Field;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginExitButton1;
    private javax.swing.JTextField DOB1;
    // End of variables declaration                   
}

