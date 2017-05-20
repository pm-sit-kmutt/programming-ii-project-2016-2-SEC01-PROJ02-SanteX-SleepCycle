package sleepcycle.gui;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class ReviewAfterSleep extends javax.swing.JFrame {

    public ReviewAfterSleep() {
        initComponents();
        //ทำให้เลือกได้อันเดียว
        ButtonGroup group = new ButtonGroup();
        group.add(wellRb);
        group.add(insomniaRb);
        group.add(deepRb);
        group.add(drowsyRb);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblReview = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        wellRb = new javax.swing.JRadioButton();
        deepRb = new javax.swing.JRadioButton();
        insomniaRb = new javax.swing.JRadioButton();
        drowsyRb = new javax.swing.JRadioButton();
        okBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(227, 116, 96));

        lblReview.setFont(new java.awt.Font("Quark", 0, 48)); // NOI18N
        lblReview.setText("Sleep Review");

        jPanel2.setBackground(new java.awt.Color(227, 116, 96));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wellRb.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        wellRb.setText("หลับสบาย");
        wellRb.setContentAreaFilled(false);
        wellRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wellRbActionPerformed(evt);
            }
        });
        jPanel2.add(wellRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        deepRb.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        deepRb.setText("หลับลึก");
        deepRb.setContentAreaFilled(false);
        deepRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deepRbActionPerformed(evt);
            }
        });
        jPanel2.add(deepRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        insomniaRb.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        insomniaRb.setText("นอนไม่หลับ");
        insomniaRb.setContentAreaFilled(false);
        insomniaRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insomniaRbActionPerformed(evt);
            }
        });
        jPanel2.add(insomniaRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        drowsyRb.setFont(new java.awt.Font("Quark", 0, 24)); // NOI18N
        drowsyRb.setText("กึ่งหลับกึ่งตื่น");
        drowsyRb.setContentAreaFilled(false);
        drowsyRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drowsyRbActionPerformed(evt);
            }
        });
        jPanel2.add(drowsyRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        okBtn.setFont(new java.awt.Font("Quark", 0, 18)); // NOI18N
        okBtn.setText("บันทึก");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(okBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblReview)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblReview)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(okBtn)
                .addContainerGap(22, Short.MAX_VALUE))
        );

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

    private void deepRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deepRbActionPerformed
        deepRb.getActionCommand();
    }//GEN-LAST:event_deepRbActionPerformed

    private void insomniaRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insomniaRbActionPerformed
        insomniaRb.getActionCommand();
    }//GEN-LAST:event_insomniaRbActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        int wp = JOptionPane.showConfirmDialog(null, "Save Review?", "save",
                 JOptionPane.YES_NO_OPTION,
                 JOptionPane.QUESTION_MESSAGE
        );
        if (wp == 0) {
//            setVisible(false);
            dispose();
        }

    }//GEN-LAST:event_okBtnActionPerformed

    private void wellRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wellRbActionPerformed
        wellRb.getActionCommand();
    }//GEN-LAST:event_wellRbActionPerformed

    private void drowsyRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drowsyRbActionPerformed
        drowsyRb.getActionCommand();
    }//GEN-LAST:event_drowsyRbActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReviewAfterSleep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton deepRb;
    private javax.swing.JRadioButton drowsyRb;
    private javax.swing.JRadioButton insomniaRb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblReview;
    private javax.swing.JButton okBtn;
    private javax.swing.JRadioButton wellRb;
    // End of variables declaration//GEN-END:variables
}
