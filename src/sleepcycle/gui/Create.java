package sleepcycle.gui;

import javax.swing.JFrame;
import sleepcycle.model.*;

public class Create extends javax.swing.JFrame {
    
    public Create() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblCre = new javax.swing.JLabel();
        hrCbb = new javax.swing.JComboBox<>();
        minCbb = new javax.swing.JComboBox<>();
        lblHr = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lblColon = new javax.swing.JLabel();
        lblColon2 = new javax.swing.JLabel();
        lblCre2 = new javax.swing.JLabel();
        lblChAlSd = new javax.swing.JLabel();
        sdCbb = new javax.swing.JComboBox<>();
        backBtn = new javax.swing.JButton();
        okBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(227, 116, 96));

        lblCre.setFont(new java.awt.Font("TH SarabunPSK", 0, 60)); // NOI18N
        lblCre.setText("Create Alarm ");

        hrCbb.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        hrCbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        hrCbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrCbbActionPerformed(evt);
            }
        });

        minCbb.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        minCbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        lblHr.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        lblHr.setText("Hour");

        lblMin.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        lblMin.setText("Minute");

        lblColon.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        lblColon.setText(":");

        lblColon2.setFont(new java.awt.Font("Quark", 0, 36)); // NOI18N
        lblColon2.setText(":");

        lblCre2.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        lblCre2.setText("ตั้งนาฬิกาปลุก");

        lblChAlSd.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        lblChAlSd.setText("เลือกเสียงตั้งปลุก");

        sdCbb.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        sdCbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "alarm_beep", "arrow_x", "bicycle_bell", "cheering", "disconnect_x" }));

        backBtn.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        backBtn.setText("กลับ");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        okBtn.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        okBtn.setText("บันทึก");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(lblCre)
                .addGap(126, 126, 126))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sdCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblChAlSd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCre2)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblHr)
                                                .addGap(15, 15, 15)))
                                        .addComponent(lblColon, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(hrCbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblColon2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(minCbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMin)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblCre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHr)
                    .addComponent(lblColon)
                    .addComponent(lblMin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColon2)
                    .addComponent(minCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hrCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblChAlSd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sdCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        Home form = new Home();
        form.setTitle("Home");
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        setVisible(false);
        int hour = hrCbb.getSelectedIndex(); // get from Input
        int min = minCbb.getSelectedIndex(); // get from Input
        System.out.println("TimeSet: Hour= " + hour + " minute=" + min);
        int sd = sdCbb.getSelectedIndex()+1;
        AlarmSQL al = new AlarmSQL();
        al.createAlarm(hour, min, sd);
    }//GEN-LAST:event_okBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        Home form = new Home();
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void hrCbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrCbbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hrCbbActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create().setVisible(true);
                new Create().setLocationRelativeTo(null);//ไม่กำหนดจะอยู่ตรงกลาง
                new Create().setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> hrCbb;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblChAlSd;
    private javax.swing.JLabel lblColon;
    private javax.swing.JLabel lblColon2;
    private javax.swing.JLabel lblCre;
    private javax.swing.JLabel lblCre2;
    private javax.swing.JLabel lblHr;
    private javax.swing.JLabel lblMin;
    private javax.swing.JComboBox<String> minCbb;
    private javax.swing.JButton okBtn;
    private javax.swing.JComboBox<String> sdCbb;
    // End of variables declaration//GEN-END:variables
}
