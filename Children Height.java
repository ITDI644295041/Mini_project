import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JIB 6
 */
public class Children_Height extends javax.swing.JFrame {

    /**
     * Creates new form Children_Height
     */
    public Children_Height() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jRadioButton2 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rdlMan = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarResult = new javax.swing.JTextArea();
        txtAge = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        txtHeight = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        rdlWoman = new javax.swing.JRadioButton();
        btnClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jRadioButton2.setText("jRadioButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Children Height");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        rdlMan.setBackground(new java.awt.Color(102, 102, 255));
        buttonGroup1.add(rdlMan);
        rdlMan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdlMan.setText("?????????");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("????????????");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("?????????????????????");

        tarResult.setColumns(20);
        tarResult.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        tarResult.setRows(5);
        jScrollPane1.setViewportView(tarResult);

        btnExit.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("???????????????????????????????????????????????????");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("?????????");

        btnCalculate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCalculate.setText("???????????????");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        rdlWoman.setBackground(new java.awt.Color(102, 102, 255));
        buttonGroup1.add(rdlWoman);
        rdlWoman.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdlWoman.setText("????????????");
        rdlWoman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdlWomanActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("?????????????????????????????????????????????");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("??????");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("???????????????????????????");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(rdlWoman)
                                        .addGap(53, 53, 53)
                                        .addComponent(rdlMan))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel5))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(22, 22, 22)
                                .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(btnCalculate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear)
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rdlWoman)
                    .addComponent(rdlMan))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4))
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnClear))
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {                                             
         String Age = txtAge.getText();
         String Height = txtHeight.getText();
         
        int ages = Integer.valueOf(Age);
        int height = Integer.valueOf(Height);
        if (rdlMan.isSelected()) {
            switch (ages) {
                case 5:
                     if (height <= 105) {
                        tarResult.setText("???????????????");
                    } else if(height >= 115 && height <= 120){
                        tarResult.setText("?????????");
                    } else if(height >=106 && height <=114){
                        tarResult.setText("??????????????????");
                    }
                    break;

                 case 6:
                    if (height <= 112) {
                        tarResult.setText("???????????????");
                    } else if (height >= 118 && height  <= 125) {
                         tarResult.setText("?????????");
                     } else if (height >=113 && height <=117) {
                         tarResult.setText("??????????????????");
                     } 
               break ; 
               case 7:
                    if (height <= 117) {
                        tarResult.setText("???????????????");
                    } else if (height >= 125 && height  <= 132) {
                         tarResult.setText("?????????");
                     } else if (height >=118 && height <=124) {
                         tarResult.setText("??????????????????");
                     } 
               break ;
               case 8:
                    if (height <= 122) {
                        tarResult.setText("???????????????");
                    } else if (height >= 136 && height  <= 145) {
                         tarResult.setText("?????????");
                     } else if (height >=123 && height <=135) {
                         tarResult.setText("??????????????????");
                     } 
               break ;
               case 9:
                    if (height <= 126) {
                        tarResult.setText("???????????????");
                    } else if (height >= 142 && height  <= 152) {
                         tarResult.setText("?????????");
                     } else if (height >=127 && height <=141) {
                         tarResult.setText("??????????????????");
                     } 
               break ;
               case 10:
                    if (height <= 132) {
                        tarResult.setText("???????????????");
                    } else if (height >= 146 && height  <= 158) {
                         tarResult.setText("?????????");
                     } else if (height >=134 && height <=1456) {
                         tarResult.setText("??????????????????");
                     } 
               break ;
               case 11:
                    if (height <= 136) {
                        tarResult.setText("???????????????");
                    } else if (height >= 158 && height  <= 163) {
                         tarResult.setText("?????????");
                     } else if (height >=137 && height <=157) {
                         tarResult.setText("??????????????????");
                     } 
               break ;
               case 12:
                    if (height <= 142) {
                        tarResult.setText("???????????????");
                    } else if (height >= 162 && height  <= 168) {
                         tarResult.setText("?????????");
                     } else if (height >=143 && height <=161) {
                         tarResult.setText("??????????????????");
                     } 
               break ;
               case 13:
                    if (height <= 146) {
                        tarResult.setText("???????????????");
                    } else if (height >= 165 && height  <= 170) {
                         tarResult.setText("?????????");
                     } else if (height >=147 && height <=164) {
                         tarResult.setText("??????????????????");
                     } 
               break ;
               case 14:
                    if (height <= 150) {
                        tarResult.setText("???????????????");
                    } else if (height >= 175 && height  <= 175) {
                         tarResult.setText("?????????");
                     } else if (height >=151 && height <=171) {
                         tarResult.setText("??????????????????");
                     } 
               break ;
               case 15:
                    if (height <= 157) {
                        tarResult.setText("???????????????");
                    } else if (height >= 177 && height  <= 185) {
                         tarResult.setText("?????????");
                     } else if (height >=158 && height <=176) {
                         tarResult.setText("??????????????????");
                     } 
               break ;
               case 16:
                    if (height <= 160) {
                        tarResult.setText("???????????????");
                    } else if (height >= 181 && height  <= 187) {
                         tarResult.setText("?????????");
                     } else if (height >=161 && height <=180) {
                         tarResult.setText("??????????????????");
                     } 
               break ;
               case 17:
                    if (height <= 163) {
                        tarResult.setText("???????????????");
                    } else if (height >= 183 && height  <= 189) {
                         tarResult.setText("?????????");
                     } else if (height >=164 && height <=182) {
                         tarResult.setText("??????????????????");
                     } 
               break ;
               case 18:
                    if (height <= 165) {
                        tarResult.setText("???????????????");
                    } else if (height >= 185 && height  <= 188) {
                         tarResult.setText("?????????");
                     } else if (height >=166 && height <=184) {
                         tarResult.setText("??????????????????");
                     } 
               break ;
               case 19:
                    if (height <= 165) {
                        tarResult.setText("???????????????");
                    } else if (height >= 187 && height  <= 190) {
                         tarResult.setText("?????????");
                     } else if (height >=166 && height <=186) {
                         tarResult.setText("??????????????????");
                     } 
                break;
                case 20:  if ( height <= 165) {
                        tarResult.setText("???????????????");
                    } else if(height >= 188 &&height <= 192){
                        tarResult.setText("?????????");
                    } else if(height >=166 && height <=187){
                        tarResult.setText("??????????????????"); 
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(rootPane, "????????????????????????????????????");
                    break;
            }
        } else if (rdlWoman.isSelected()) { 
            switch (ages) {
                case 5:
                    if (height <= 105) {
                        tarResult.setText("???????????????");
                    } else if(height >= 115 && height <= 120){
                        tarResult.setText("?????????");
                    } else if(height >=106 && height <=114){
                        tarResult.setText("??????????????????");
                    }
                    break;
                     case 6:
                    if (height <= 110) {
                        tarResult.setText("???????????????");
                    } else if(height >= 118 && height <= 123){
                        tarResult.setText("?????????");
                    } else if(height >=111 && height <=117){
                        tarResult.setText("??????????????????");
                    }
                    break;
                     case 7:
                    if (height <= 117) {
                        tarResult.setText("???????????????");
                    } else if(height >= 123 && height <= 132){
                        tarResult.setText("?????????");
                    } else if(height >=118 && height <=122){
                        tarResult.setText("??????????????????");
                    }
                    break;
                case 8:
                    if ( height <= 123) {
                        tarResult.setText("???????????????");
                    } else if(height >= 137 && height <= 145){
                        tarResult.setText("?????????");
                    } else if(height >=124 && height <=136){
                        tarResult.setText("??????????????????");
                    }
                    break;
                    case 9:
                    if (height <= 128) {
                        tarResult.setText("???????????????");
                    } else if(height >= 145 && height <= 150){
                        tarResult.setText("?????????");
                    } else if(height  >=129 && height  <=144){
                        tarResult.setText("??????????????????");
                    }
                    break;
                    case 10:
                    if (height  <= 132) {
                        tarResult.setText("???????????????");
                    } else if(height  >= 147 && height  <= 152){
                        tarResult.setText("?????????");
                    } else if(height  >=133 && height  <=146){
                        tarResult.setText("??????????????????");
                    }
                    break;
                case 11:
                    if (height  <= 137) {
                        tarResult.setText("???????????????");
                    } else if(height  >= 153 && height  <= 162){
                        tarResult.setText("?????????");
                    } else if(height >=138 && height  <=152){
                       tarResult.setText("??????????????????");
                    }
                    break;
                case 12:
                    if (height <= 145) {
                        tarResult.setText("???????????????");
                    } else if(height  >= 157 && height  <= 165){
                        tarResult.setText("?????????");
                    } else if(height >=146 && height  <=156){
                        tarResult.setText("??????????????????");
                    }
                    break;
                       case 13:
                    if (height  <= 149) {
                        tarResult.setText("???????????????");
                    } else if(height  >= 163 && height  <= 168){
                        tarResult.setText("?????????");
                    } else if(height  >=150 && height  <=162){
                        tarResult.setText("??????????????????");
                    }
                    break;
                case 14:
                    if (height  <= 152) {
                        tarResult.setText("???????????????");
                    } else if(height  >= 165 && height  <= 170){
                        tarResult.setText("?????????");
                    } else if(height  >=153 && height <=164){
                        tarResult.setText("??????????????????");
                    }
                    break;
                    case 15:
                    if (height <= 155) {
                        tarResult.setText("???????????????");
                    } else if(height>= 167 && height <= 175){
                        tarResult.setText("?????????");
                    } else if(height >=156 && height <=166){
                        tarResult.setText("??????????????????");
                    }
                    break;
                case 16:
                    if (height <= 157) {
                        tarResult.setText("???????????????");
                    } else if(height >= 170 && height <= 173){
                        tarResult.setText("?????????");
                    } else if(height >=158 && height <=169){
                        tarResult.setText("??????????????????");
                    }
                    break;
                    case 17:
                    if (height <= 157) {
                        tarResult.setText("???????????????");
                    } else if(height >= 171 &&height <= 173){
                        tarResult.setText("?????????");
                    } else if(height >=158 && height <=170){
                        tarResult.setText("??????????????????");
                    }
                    break;
                case 18:
                    if (height <= 158) {
                        tarResult.setText("???????????????");
                    } else if(height >= 172 && height <= 175){
                        tarResult.setText("?????????");
                    } else if(height >=159 && height <=171){
                        tarResult.setText("??????????????????");
                    }
                    break;
                     case 19:
                    if (height <= 159) {
                        tarResult.setText("???????????????");
                    } else if(height >= 172 && height <= 177){
                        tarResult.setText("?????????");
                    } else if(height >=160 && height <=171){
                        tarResult.setText("??????????????????");
                    }
                    break;
                case 20:
                    if (height <= 160) {
                        tarResult.setText("???????????????");
                    } else if(height >= 172 && height >= 179){
                        tarResult.setText("?????????");
                    } else if(height >=161 &&height <=171){
                        tarResult.setText("??????????????????");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(rootPane, "????????????????????????????????????");
                    break;
            }
         }
    }                                            

    private void rdlWomanActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
    int option = JOptionPane.showConfirmDialog(rootPane,"Do you want to Exit?");
        if (option == JOptionPane.YES_OPTION)
        System.exit(0);
    }                                       

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtAge.setText("");
        txtHeight.setText("");
        tarResult.setText("");      
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Children_Height.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Children_Height.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Children_Height.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Children_Height.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Children_Height().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdlMan;
    private javax.swing.JRadioButton rdlWoman;
    private javax.swing.JTextArea tarResult;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHeight;
    // End of variables declaration                   

    private void Switch(String Age) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
