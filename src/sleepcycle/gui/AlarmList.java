package sleepcycle.gui;

import java.text.DecimalFormat;
import javax.swing.JFrame;
import sleepcycle.model.*;

public class AlarmList extends javax.swing.JPanel {
    private DecimalFormat dc = new DecimalFormat("00");
    private AlarmSQL al = new AlarmSQL();
    private Alarm a ;

    public AlarmList(Alarm a) {
        initComponents();
        this.a = a ;
        lblAlTime.setText(dc.format(a.getHour())+" : "+dc.format(a.getMin()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAlTime = new javax.swing.JLabel();
        alDelBtn = new javax.swing.JButton();
        alChBtn = new javax.swing.JButton();
        alEditBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(227, 116, 96));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));

        lblAlTime.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        lblAlTime.setText("เวลาที่ตั้งมา");

        alDelBtn.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        alDelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepcycle/icon/stopwatchdel.png"))); // NOI18N
        alDelBtn.setText("ลบ");
        alDelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alDelBtnActionPerformed(evt);
            }
        });

        alChBtn.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        alChBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepcycle/icon/stopwatchfav.png"))); // NOI18N
        alChBtn.setText("เลือก");
        alChBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alChBtnActionPerformed(evt);
            }
        });

        alEditBtn.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        alEditBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepcycle/icon/stopwatch edit.png"))); // NOI18N
        alEditBtn.setText("แก้ไข");
        alEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alEditBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAlTime)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(alEditBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alDelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(alChBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(alChBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alEditBtn)
                    .addComponent(alDelBtn))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblAlTime)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void alDelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alDelBtnActionPerformed
        
        Delete form = new Delete(a.getId());
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//กดปิดแล้วจบการทำงาน
        form.setLocationRelativeTo(null);//ไม่กำหนดจะอยู่ตรงกลาง
        // ซ่อนformปัจจุบัน
        setVisible(false);
    }//GEN-LAST:event_alDelBtnActionPerformed

    private void alEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alEditBtnActionPerformed
        Edit form = new Edit(a.getId());
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//กดปิดแล้วจบการทำงาน
        form.setLocationRelativeTo(null);//ไม่กำหนดจะอยู่ตรงกลาง
        // ซ่อนformปัจจุบัน
        setVisible(false);
    }//GEN-LAST:event_alEditBtnActionPerformed

    private void alChBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alChBtnActionPerformed
        al.alarmQuery();
        al.chooseAlarm(a.getId(), 1);
    }//GEN-LAST:event_alChBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alChBtn;
    private javax.swing.JButton alDelBtn;
    private javax.swing.JButton alEditBtn;
    private javax.swing.JLabel lblAlTime;
    // End of variables declaration//GEN-END:variables
}
