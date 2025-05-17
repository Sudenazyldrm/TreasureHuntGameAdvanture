/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package YILDIRIMSUDENAZtreasurehuntgame;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class YILDIRIMSUDENAZLevel3 extends javax.swing.JFrame {

    String username;
    int score = 0;
    private YILDIRIMSUDENAZDLinkedList list = new YILDIRIMSUDENAZDLinkedList();
    private JButton[] buttons;

    public YILDIRIMSUDENAZLevel3(String username) {
        this.username = username;
        initComponents();
        setupBoard();
        setResizable(false);
    }

    public YILDIRIMSUDENAZLevel3() {
        initComponents();
        setupBoard();
    }

    private void setupBoard() {
        String[] types = {
            "Treasure", "Trap", "Empty",
            "Forward", "Backward", "Teleport", "Reset"
        };

        boolean teleportAdded = false;
        boolean resetAdded = false;
        Random random = new Random();

        buttons = new JButton[]{
            btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,
            btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16,
            btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24,
            btn25, btn26, btn27, btn28, btn29, btn30
        };

        for (int i = 0; i < buttons.length; i++) {
            String randomType;

            while (true) {
                randomType = types[random.nextInt(types.length)];

                if (randomType.equals("Teleport") && teleportAdded) {
                    continue;
                }
                if (randomType.equals("Reset") && resetAdded) {
                    continue;
                }

                if (randomType.equals("Teleport")) {
                    teleportAdded = true;
                }
                if (randomType.equals("Reset")) {
                    resetAdded = true;
                }

                break;
            }

            list.add(randomType);
            renkUygula(randomType, i);

        }
    }

    private void writeScoreToFile(String username, int score) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\ASUS\\OneDrive\\Masaüstü\\score.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);

            out.println(username + ",level3," + score);
            out.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "The Scores did not write: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        dice_btn = new javax.swing.JButton();
        score_lbl = new javax.swing.JLabel();
        currentspot_lbl = new javax.swing.JLabel();
        diceshow_lbl = new javax.swing.JLabel();
        lvl1_back_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1066, 600));

        jPanel1.setMaximumSize(new java.awt.Dimension(1066, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(1066, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(1066, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setText("1 ");
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 30));

        btn2.setText("2 ");
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        btn3.setText("3 ");
        jPanel1.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        btn4.setText("4 ");
        jPanel1.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        btn5.setText("5 ");
        jPanel1.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        btn6.setText("6 ");
        jPanel1.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        btn7.setText("7 ");
        jPanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        btn8.setText("8 ");
        jPanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        btn9.setText("9 ");
        jPanel1.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        btn10.setText("10");
        jPanel1.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        btn11.setText("11");
        jPanel1.add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        btn12.setText("12");
        jPanel1.add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        btn13.setText("13");
        jPanel1.add(btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, -1, -1));

        btn14.setText("14");
        jPanel1.add(btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, -1, -1));

        btn15.setText("15");
        jPanel1.add(btn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, -1, -1));

        btn16.setText("16");
        jPanel1.add(btn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, -1));

        btn17.setText("17");
        jPanel1.add(btn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, -1, -1));

        btn18.setText("18");
        jPanel1.add(btn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        btn19.setText("19");
        jPanel1.add(btn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        btn20.setText("20");
        jPanel1.add(btn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, -1));

        btn21.setText("21");
        jPanel1.add(btn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, -1));

        btn22.setText("22");
        jPanel1.add(btn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, -1, -1));

        btn23.setText("23");
        jPanel1.add(btn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, -1, -1));

        btn24.setText("24");
        jPanel1.add(btn24, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, -1, -1));

        btn25.setText("25");
        jPanel1.add(btn25, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, -1, -1));

        btn26.setText("26");
        jPanel1.add(btn26, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, -1, -1));

        btn27.setText("27");
        jPanel1.add(btn27, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, -1, -1));

        btn28.setText("28");
        jPanel1.add(btn28, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, -1, -1));

        btn29.setText("29");
        jPanel1.add(btn29, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, -1, -1));

        btn30.setText("30");
        jPanel1.add(btn30, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, -1, -1));

        dice_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/YILDIRIMSUDENAZtreasurehuntgame/images/dice.png"))); // NOI18N
        dice_btn.setBorderPainted(false);
        dice_btn.setContentAreaFilled(false);
        dice_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dice_btn.setFocusPainted(false);
        dice_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dice_btnMouseClicked(evt);
            }
        });
        dice_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dice_btnActionPerformed(evt);
            }
        });
        jPanel1.add(dice_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        score_lbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(score_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 110, 20));

        currentspot_lbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(currentspot_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 180, 30));

        diceshow_lbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(diceshow_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 110, 30));

        lvl1_back_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/YILDIRIMSUDENAZtreasurehuntgame/images/lvl3yeni.png"))); // NOI18N
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

    private void dice_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dice_btnMouseClicked
    }//GEN-LAST:event_dice_btnMouseClicked

    private void dice_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dice_btnActionPerformed
        int dice = new Random().nextInt(6) + 1;
        diceshow_lbl.setText("" + dice);

        list.lastPlayerNode = list.player;

        boolean isValid = list.movePlayer(dice);

        if (list.lastPlayerNode != null) {
            renkUygula(list.lastPlayerNode.type, list.getPlayerIndexFromNode(list.lastPlayerNode));
        }

        updateScore(list.player, isValid);

        currentspot_lbl.setText(" " + list.player.type);
        score_lbl.setText(" " + score);

        if (list.getPlayerIndex() == buttons.length - 1) {
            writeScoreToFile(username, score);
            int secim = JOptionPane.showConfirmDialog(this,
                    "ALL LEVELS ARE DONE!\nDo you want to go to menu?",
                    "Level done",
                    JOptionPane.YES_NO_OPTION);

            if (secim == JOptionPane.YES_OPTION) {
                new YILDIRIMSUDENAZMenu().setVisible(true);
            } else {
                System.exit(0);
            }

            dispose();
        }
    }

    private void renkUygula(String type, int index) {
        switch (type) {
            case "Treasure":
                buttons[index].setBackground(new Color(212, 181, 78));
                buttons[index].setForeground(new Color(0, 0, 0));
                break;
            case "Trap":
                buttons[index].setBackground(new Color(115, 89, 40));
                buttons[index].setForeground(new Color(230, 217, 197));
                break;
            case "Forward":
                buttons[index].setBackground(new Color(72, 109, 128));
                buttons[index].setForeground(new Color(230, 217, 197));
                break;
            case "Backward":
                buttons[index].setBackground(new Color(173, 167, 167));
                buttons[index].setForeground(new Color(0, 0, 0));

                break;
            case "Teleport":
                buttons[index].setBackground(new Color(141, 141, 179));
                buttons[index].setForeground(new Color(0, 0, 0));

                break;
            case "Reset":
                buttons[index].setBackground(new Color(186, 96, 96));
                buttons[index].setForeground(new Color(0, 0, 0));

                break;

            default:
                buttons[index].setBackground(new Color(238, 235, 205));
                buttons[index].setForeground(new Color(0, 0, 0));

                break;
        }
    }

    private void updateScore(YILDIRIMSUDENAZDNode currentNode, boolean isValid) {
        if (!isValid) {
            return;
        }

        while (currentNode.type.equals("Forward") || currentNode.type.equals("Backward")) {
            currentNode.visitCount++;

            if (currentNode.visitCount >= 2) {
                currentNode.type = "Empty";
                break;
            }

            renkUygula(currentNode.type, list.getPlayerIndex());

            if (currentNode.type.equals("Forward")) {
                list.moveForward(3);
            } else {
                list.moveBackward(2);
            }

            currentNode = list.player;
        }

        switch (currentNode.type) {
            case "Treasure":
                score += 10;
                break;
            case "Trap":
                score -= 5;
                break;
            case "Teleport":
                renkUygula(currentNode.type, list.getPlayerIndex());
                int randomIndex = new Random().nextInt(buttons.length);
                list.player = list.getNodeAt(randomIndex);
                currentNode = list.player;
                break;

            case "Reset":
                score = 0;
                break;
        }

        highlightButton();
        currentspot_lbl.setText(" " + currentNode.type);
        score_lbl.setText(" " + score);

        YILDIRIMSUDENAZDNode tmp = list.head;
        while (tmp != null) {
            if ((tmp.originalType.equals("Forward") || tmp.originalType.equals("Backward"))
                    && tmp.visitCount >= 2 && tmp.type.equals("Empty")) {
                tmp.type = tmp.originalType;
                tmp.visitCount = 0;
            }
            tmp = tmp.next;
        }
    }

    private void highlightButton() {
        int index = list.getPlayerIndex();
        buttons[index].setBackground(new Color(97, 125, 81));
        buttons[index].setForeground(new Color(230, 217, 197));

    }//GEN-LAST:event_dice_btnActionPerformed

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
            java.util.logging.Logger.getLogger(YILDIRIMSUDENAZLevel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YILDIRIMSUDENAZLevel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YILDIRIMSUDENAZLevel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YILDIRIMSUDENAZLevel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YILDIRIMSUDENAZLevel3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel currentspot_lbl;
    private javax.swing.JButton dice_btn;
    private javax.swing.JLabel diceshow_lbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lvl1_back_lbl;
    private javax.swing.JLabel score_lbl;
    // End of variables declaration//GEN-END:variables
}
