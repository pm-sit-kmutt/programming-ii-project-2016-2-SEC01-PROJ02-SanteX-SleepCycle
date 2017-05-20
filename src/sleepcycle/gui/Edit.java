package sleepcycle.gui;

import sleepcycle.model.AlarmSQL;

public class Edit extends javax.swing.JFrame {

    private int id; 
    
    public Edit(int id) {
        initComponents();
        this.id = id;
        AlarmSQL al = new AlarmSQL();
        al.alarmQuery();
        lblOld.setText(al.getAlarmTime(id));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        เวลาเดิม = new javax.swing.JPanel();
        lblEdi = new javax.swing.JLabel();
        lblEdi2 = new javax.swing.JLabel();
        lblHr = new javax.swing.JLabel();
        lblColon = new javax.swing.JLabel();
        minCbb = new javax.swing.JComboBox<>();
        lblColon2 = new javax.swing.JLabel();
        hrCbb = new javax.swing.JComboBox<>();
        lblMin = new javax.swing.JLabel();
        lblNew = new javax.swing.JLabel();
        lblOld = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        okBtn = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        เวลาเดิม.setBackground(new java.awt.Color(227, 116, 96));

        lblEdi.setFont(new java.awt.Font("TH SarabunPSK", 0, 60)); // NOI18N
        lblEdi.setText("Edit Alarm ");

        lblEdi2.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        lblEdi2.setText("แก้ไขนาฬิกาปลุก");

        lblHr.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        lblHr.setText("Hour");

        lblColon.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        lblColon.setText(":");

        minCbb.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        minCbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        lblColon2.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        lblColon2.setText(":");

        hrCbb.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        hrCbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        lblMin.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        lblMin.setText("Minute");

        lblNew.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        lblNew.setText("เวลาใหม่");

        lblOld.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        lblOld.setText("เวลาเดิม");

        backBtn.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        backBtn.setText("กลับ");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        okBtn.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        okBtn.setText("แก้ไข");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout เวลาเดิมLayout = new javax.swing.GroupLayout(เวลาเดิม);
        เวลาเดิม.setLayout(เวลาเดิมLayout);
        เวลาเดิมLayout.setHorizontalGroup(
            เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(เวลาเดิมLayout.createSequentialGroup()
                .addGroup(เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(เวลาเดิมLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(lblEdi))
                    .addGroup(เวลาเดิมLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblMin)
                                .addGroup(เวลาเดิมLayout.createSequentialGroup()
                                    .addGroup(เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, เวลาเดิมLayout.createSequentialGroup()
                                                .addComponent(lblNew)
                                                .addGap(46, 46, 46)
                                                .addComponent(lblHr))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, เวลาเดิมLayout.createSequentialGroup()
                                                .addGap(123, 123, 123)
                                                .addComponent(hrCbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(18, 18, 18)
                                    .addGroup(เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(เวลาเดิมLayout.createSequentialGroup()
                                            .addGroup(เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblColon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblColon2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(25, 25, 25)
                                            .addComponent(minCbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(เวลาเดิมLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(13, 13, 13)))
                            .addComponent(lblEdi2))))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, เวลาเดิมLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblOld)
                .addGap(217, 217, 217))
        );
        เวลาเดิมLayout.setVerticalGroup(
            เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(เวลาเดิมLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEdi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEdi2)
                .addGap(9, 9, 9)
                .addComponent(lblOld)
                .addGap(18, 18, 18)
                .addGroup(เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNew)
                    .addComponent(lblHr)
                    .addComponent(lblColon)
                    .addComponent(lblMin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hrCbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon2)
                    .addComponent(minCbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(เวลาเดิมLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
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
        AlarmSQL al = new AlarmSQL();
        al.alarmQuery();
        al.editAlarm(id, hrCbb.getSelectedIndex(), minCbb.getSelectedIndex());
        setVisible(false);
    }//GEN-LAST:event_okBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> hrCbb;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblColon;
    private javax.swing.JLabel lblColon2;
    private javax.swing.JLabel lblEdi;
    private javax.swing.JLabel lblEdi2;
    private javax.swing.JLabel lblHr;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblNew;
    private javax.swing.JLabel lblOld;
    private javax.swing.JComboBox<String> minCbb;
    private javax.swing.JButton okBtn;
    private javax.swing.JPanel เวลาเดิม;
    // End of variables declaration//GEN-END:variables
}
