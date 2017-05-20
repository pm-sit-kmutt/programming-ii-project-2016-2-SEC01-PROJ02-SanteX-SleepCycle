package sleepcycle.gui;

import sleepcycle.model.AlarmSQL;

public class Delete extends javax.swing.JFrame {
    
    private int id;
        
    public Delete(int id) {
        initComponents();
        this.id = id;
        
        AlarmSQL al = new AlarmSQL();
        al.alarmQuery();
        lblDelTime1.setText(al.getAlarmTime(id));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        เวลาเดิม = new javax.swing.JPanel();
        lblDel = new javax.swing.JLabel();
        lblDel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        okBtn = new javax.swing.JButton();
        lblDelTime1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        เวลาเดิม.setBackground(new java.awt.Color(227, 116, 96));

        lblDel.setFont(new java.awt.Font("TH SarabunPSK", 0, 60)); // NOI18N
        lblDel.setText("Delete Alarm ");

        lblDel2.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        lblDel2.setText("ลบนาฬิกาปลุก");

        backBtn.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        backBtn.setText("กลับ");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        okBtn.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        okBtn.setText("ลบ");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        lblDelTime1.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        lblDelTime1.setText("เวลาที่จะลบ");

        javax.swing.GroupLayout เวลาเดิมLayout = new javax.swing.GroupLayout(เวลาเดิม);
        เวลาเดิม.setLayout(เวลาเดิมLayout);
        เวลาเดิมLayout.setHorizontalGroup(
            เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(เวลาเดิมLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDel)
                    .addGroup(เวลาเดิมLayout.createSequentialGroup()
                        .addGroup(เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(เวลาเดิมLayout.createSequentialGroup()
                                .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblDel2))
                        .addGap(41, 41, 41)))
                .addGap(92, 92, 92))
            .addGroup(เวลาเดิมLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(lblDelTime1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        เวลาเดิมLayout.setVerticalGroup(
            เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(เวลาเดิมLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDel2)
                .addGap(18, 18, 18)
                .addComponent(lblDelTime1)
                .addGap(54, 54, 54)
                .addGroup(เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(เวลาเดิม, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(เวลาเดิม, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        setVisible(false);
        AlarmSQL al = new AlarmSQL();
        al.deleteAlarm(id);
    }//GEN-LAST:event_okBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel lblDel;
    private javax.swing.JLabel lblDel2;
    private javax.swing.JLabel lblDelTime1;
    private javax.swing.JButton okBtn;
    private javax.swing.JPanel เวลาเดิม;
    // End of variables declaration//GEN-END:variables
}
