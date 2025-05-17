/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package YILDIRIMSUDENAZtreasurehuntgame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class YILDIRIMSUDENAZScoreBoard extends javax.swing.JFrame {

    public YILDIRIMSUDENAZScoreBoard() {
        initComponents();

    }

    private void loadScoresForUser(String username) {
        DefaultTableModel model = (DefaultTableModel) scoreTable.getModel();
        model.setRowCount(0);
        YILDIRIMSUDENAZBSTree bst = new YILDIRIMSUDENAZBSTree();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ASUS\\OneDrive\\Masaüstü\\score.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3 && parts[0].equalsIgnoreCase(username)) {
                    String level = parts[1].trim();
                    int score = Integer.parseInt(parts[2].trim());
                    bst.insert(username, level, score);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Failed to read the file: " + e.getMessage());
            return;
        }
        if (bst.getRoot() == null) {
            best_lbl.setText("");
            worst_lbl.setText("");
            JOptionPane.showMessageDialog(this,
                    "No scores found for this user.",
            "User Not Found",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        bst.fillTableInOrder(bst.getRoot(), model);

        YILDIRIMSUDENAZBSTNode min = bst.findMin();
        YILDIRIMSUDENAZBSTNode max = bst.findMax();

        if (min != null) {
            worst_lbl.setText(min.score + " ");
        }
        if (max != null) {
            best_lbl.setText(max.score + " ");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        scoreTable = new javax.swing.JTable();
        best_lbl = new javax.swing.JLabel();
        worst_lbl = new javax.swing.JLabel();
        scorename_txt = new javax.swing.JTextField();
        getscr_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lvl1_back_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1066, 600));

        jPanel1.setMaximumSize(new java.awt.Dimension(1066, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1066, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1066, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scoreTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Level", "Score"
            }
        ));
        jScrollPane1.setViewportView(scoreTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 310, 240));

        best_lbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(best_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 50, 40));

        worst_lbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(worst_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 50, 40));

        scorename_txt.setForeground(new java.awt.Color(153, 153, 153));
        scorename_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                scorename_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                scorename_txtFocusLost(evt);
            }
        });
        scorename_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scorename_txtMouseClicked(evt);
            }
        });
        scorename_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scorename_txtActionPerformed(evt);
            }
        });
        scorename_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                scorename_txtKeyPressed(evt);
            }
        });
        jPanel1.add(scorename_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 190, -1));

        getscr_btn.setBackground(new java.awt.Color(157, 185, 191));
        getscr_btn.setText("ENTER");
        getscr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getscr_btnActionPerformed(evt);
            }
        });
        jPanel1.add(getscr_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jButton1.setBackground(new java.awt.Color(157, 185, 191));
        jButton1.setText("<-BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 490, -1, -1));

        lvl1_back_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/YILDIRIMSUDENAZtreasurehuntgame/images/score1.png"))); // NOI18N
        jPanel1.add(lvl1_back_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getscr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getscr_btnActionPerformed
        String username = scorename_txt.getText().trim().toLowerCase();

        if (!username.matches("^[a-zA-Z0-9]{3,15}$")) {
            JOptionPane.showMessageDialog(this,
                    "Invalid username!\nOnly letters and numbers allowed.\nMust be 3-15 characters long.",
            "Invalid Entry",
                    JOptionPane.ERROR_MESSAGE);
            scorename_txt.setText("");
            scorename_txt.requestFocus();
            return;
        }

        if (!username.isEmpty()) {
            loadScoresForUser(username);
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a username.");
        }


    }//GEN-LAST:event_getscr_btnActionPerformed

    private void scorename_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scorename_txtActionPerformed
    }//GEN-LAST:event_scorename_txtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
        new YILDIRIMSUDENAZMenu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void scorename_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scorename_txtMouseClicked

    }//GEN-LAST:event_scorename_txtMouseClicked

    private void scorename_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scorename_txtKeyPressed

    }//GEN-LAST:event_scorename_txtKeyPressed

    private void scorename_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_scorename_txtFocusGained

    }//GEN-LAST:event_scorename_txtFocusGained

    private void scorename_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_scorename_txtFocusLost


    }//GEN-LAST:event_scorename_txtFocusLost

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
            java.util.logging.Logger.getLogger(YILDIRIMSUDENAZScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YILDIRIMSUDENAZScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YILDIRIMSUDENAZScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YILDIRIMSUDENAZScoreBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YILDIRIMSUDENAZScoreBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel best_lbl;
    private javax.swing.JButton getscr_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lvl1_back_lbl;
    private javax.swing.JTable scoreTable;
    private javax.swing.JTextField scorename_txt;
    private javax.swing.JLabel worst_lbl;
    // End of variables declaration//GEN-END:variables
}
