package sleepcycle.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.RefineryUtilities;
import sleepcycle.model.*;

public class Home extends javax.swing.JFrame {
    
    private static AlarmSQL al = new AlarmSQL();
    private AlarmList[] showList;
    private final Timer timer;
    private final SimpleDateFormat dtf = new SimpleDateFormat("HH:mm:ss");

    public Home() {
        initComponents();
        validate();
        alarmPn.setVisible(true);
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblCurTime.setText(dtf.format(new Date(System.currentTimeMillis())));
            }
        });
        timer.setRepeats(true);
        timer.start();

        Date d = new Date();
        lblCurDate.setText(d.getDate()+"-"+(d.getMonth()+1)+"-"+(d.getYear()+1900));
        alarmPn.setVisible(true);
        goToBedPn.setVisible(false);
        reviewPn.setVisible(false);
        statisticPn.setVisible(false);
        al.alarmQuery();

        ArrayList<Alarm> allAlarm = al.showAlarm();

        showList = new AlarmList[allAlarm.size()];
        JPanel show = new JPanel();
        show.setSize(375,allAlarm.size()*126);
        for(int i=0;i<allAlarm.size();i++){
            AlarmList each = new AlarmList(allAlarm.get(i));
            show.add(each);
            showList[i]=each;
        }
        show.setLayout(new BoxLayout(show,BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(show);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(10);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headPn = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        creBtn = new javax.swing.JButton();
        lblCurTime = new javax.swing.JLabel();
        lblCurDate = new javax.swing.JLabel();
        buttontPN = new javax.swing.JPanel();
        alarmBtn = new javax.swing.JButton();
        reviewBtn = new javax.swing.JButton();
        goToBedBtn = new javax.swing.JButton();
        staticBtn = new javax.swing.JButton();
        forBtnPn = new javax.swing.JPanel();
        statisticPn = new javax.swing.JPanel();
        lblviewStatus = new javax.swing.JLabel();
        listCbb = new javax.swing.JComboBox<>();
        viewBtnStat = new javax.swing.JButton();
        goToBedPn = new javax.swing.JPanel();
        lblChSd1 = new javax.swing.JLabel();
        sdListBtn1 = new javax.swing.JComboBox<>();
        slBtn1 = new javax.swing.JButton();
        wkBtn1 = new javax.swing.JButton();
        lblTime2 = new javax.swing.JLabel();
        rb5Min = new javax.swing.JRadioButton();
        rb10Min = new javax.swing.JRadioButton();
        rb15Min = new javax.swing.JRadioButton();
        rb20Min = new javax.swing.JRadioButton();
        rb25Min = new javax.swing.JRadioButton();
        rb30Min = new javax.swing.JRadioButton();
        playSoundCb = new javax.swing.JCheckBox();
        reviewPn = new javax.swing.JPanel();
        lblReview1 = new javax.swing.JLabel();
        lblFliter1 = new javax.swing.JLabel();
        reviewCbb = new javax.swing.JComboBox<>();
        viewBtn = new javax.swing.JButton();
        alarmPn = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 51, 0));
        setPreferredSize(new java.awt.Dimension(550, 365));
        setResizable(false);

        headPn.setBackground(new java.awt.Color(153, 0, 43));

        lblTime.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepcycle/icon/clock-Rd.png"))); // NOI18N
        lblTime.setText("เวลา");

        lblDate.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        lblDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepcycle/icon/calendar.png"))); // NOI18N
        lblDate.setText("วันที่");

        creBtn.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        creBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepcycle/icon/stopwatch.png"))); // NOI18N
        creBtn.setText("สร้าง");
        creBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creBtnActionPerformed(evt);
            }
        });

        lblCurTime.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        lblCurTime.setForeground(new java.awt.Color(255, 153, 153));
        lblCurTime.setText("เวลาปัจจุบัน");

        lblCurDate.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        lblCurDate.setForeground(new java.awt.Color(255, 153, 153));
        lblCurDate.setText("วันปัจจุบัน");

        javax.swing.GroupLayout headPnLayout = new javax.swing.GroupLayout(headPn);
        headPn.setLayout(headPnLayout);
        headPnLayout.setHorizontalGroup(
            headPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headPnLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblDate)
                .addGap(18, 18, 18)
                .addComponent(lblCurDate)
                .addGap(47, 47, 47)
                .addComponent(lblTime)
                .addGap(18, 18, 18)
                .addComponent(lblCurTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(creBtn)
                .addGap(18, 18, 18))
        );
        headPnLayout.setVerticalGroup(
            headPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTime)
                    .addComponent(lblDate)
                    .addComponent(lblCurTime)
                    .addComponent(lblCurDate))
                .addGap(36, 36, 36))
        );

        buttontPN.setBackground(new java.awt.Color(198, 57, 57));

        alarmBtn.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        alarmBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepcycle/icon/alarm-clock.png"))); // NOI18N
        alarmBtn.setText("นาฬิกาปลุก");
        alarmBtn.setBorder(null);
        alarmBtn.setBorderPainted(false);
        alarmBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alarmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarmBtnActionPerformed(evt);
            }
        });

        reviewBtn.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        reviewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepcycle/icon/notepad.png"))); // NOI18N
        reviewBtn.setText("Review");
        reviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewBtnActionPerformed(evt);
            }
        });

        goToBedBtn.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        goToBedBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepcycle/icon/sleep.png"))); // NOI18N
        goToBedBtn.setText("เข้านอน");
        goToBedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToBedBtnActionPerformed(evt);
            }
        });

        staticBtn.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        staticBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepcycle/icon/graph.png"))); // NOI18N
        staticBtn.setText("สถิติการนอน");
        staticBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttontPNLayout = new javax.swing.GroupLayout(buttontPN);
        buttontPN.setLayout(buttontPNLayout);
        buttontPNLayout.setHorizontalGroup(
            buttontPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttontPNLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttontPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alarmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goToBedBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staticBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reviewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        buttontPNLayout.setVerticalGroup(
            buttontPNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttontPNLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(alarmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goToBedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reviewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(staticBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        forBtnPn.setBackground(new java.awt.Color(255, 153, 102));

        statisticPn.setBackground(new java.awt.Color(227, 116, 96));
        statisticPn.setPreferredSize(new java.awt.Dimension(351, 304));

        lblviewStatus.setFont(new java.awt.Font("TH SarabunPSK", 0, 52)); // NOI18N
        lblviewStatus.setText("View Statistic");

        listCbb.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        listCbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "รายวัน", "รายเดือน", "รายปี" }));

        viewBtnStat.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        viewBtnStat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepcycle/icon/graph-analysis (1).png"))); // NOI18N
        viewBtnStat.setText("View");
        viewBtnStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnStatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statisticPnLayout = new javax.swing.GroupLayout(statisticPn);
        statisticPn.setLayout(statisticPnLayout);
        statisticPnLayout.setHorizontalGroup(
            statisticPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statisticPnLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(listCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(statisticPnLayout.createSequentialGroup()
                .addGroup(statisticPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statisticPnLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblviewStatus))
                    .addGroup(statisticPnLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(viewBtnStat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        statisticPnLayout.setVerticalGroup(
            statisticPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPnLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblviewStatus)
                .addGap(18, 18, 18)
                .addComponent(listCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(viewBtnStat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        goToBedPn.setBackground(new java.awt.Color(227, 116, 96));

        lblChSd1.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        lblChSd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepcycle/icon/music-player.png"))); // NOI18N
        lblChSd1.setText("เลือกเพลงกล่อม");

        sdListBtn1.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        sdListBtn1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "At Gwanghwamun", "Beautiful", "Save ME", "Sing For You", "Stay With Me" }));

        slBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepcycle/icon/sleeping-bed-silhouette.png"))); // NOI18N
        slBtn1.setToolTipText("");
        slBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slBtn1ActionPerformed(evt);
            }
        });

        wkBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepcycle/icon/man-waking-up-on-morning-sitting-on-bed-stretching-his-arms-M.png"))); // NOI18N
        wkBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wkBtn1ActionPerformed(evt);
            }
        });

        lblTime2.setFont(new java.awt.Font("TH SarabunPSK", 0, 36)); // NOI18N
        lblTime2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepcycle/icon/hourglass.png"))); // NOI18N
        lblTime2.setText("ระยะเวลาเล่นเพลง");

        rb5Min.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        rb5Min.setText("5 นาที");
        rb5Min.setContentAreaFilled(false);

        rb10Min.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        rb10Min.setText("10 นาที");
        rb10Min.setContentAreaFilled(false);

        rb15Min.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        rb15Min.setText("15 นาที");
        rb15Min.setContentAreaFilled(false);

        rb20Min.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        rb20Min.setText("20 นาที");
        rb20Min.setContentAreaFilled(false);

        rb25Min.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        rb25Min.setText("25 นาที");
        rb25Min.setContentAreaFilled(false);

        rb30Min.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        rb30Min.setText("30 นาที");
        rb30Min.setContentAreaFilled(false);

        playSoundCb.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        playSoundCb.setText("เล่นเพลง");
        playSoundCb.setContentAreaFilled(false);

        javax.swing.GroupLayout goToBedPnLayout = new javax.swing.GroupLayout(goToBedPn);
        goToBedPn.setLayout(goToBedPnLayout);
        goToBedPnLayout.setHorizontalGroup(
            goToBedPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(goToBedPnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wkBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(goToBedPnLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(goToBedPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(goToBedPnLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(sdListBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblChSd1)
                    .addGroup(goToBedPnLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(goToBedPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb5Min)
                            .addComponent(rb20Min))
                        .addGap(20, 20, 20)
                        .addGroup(goToBedPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(goToBedPnLayout.createSequentialGroup()
                                .addComponent(rb10Min)
                                .addGap(18, 18, 18)
                                .addComponent(rb15Min))
                            .addGroup(goToBedPnLayout.createSequentialGroup()
                                .addComponent(rb25Min)
                                .addGap(18, 18, 18)
                                .addComponent(rb30Min))))
                    .addGroup(goToBedPnLayout.createSequentialGroup()
                        .addComponent(lblTime2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(playSoundCb)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        goToBedPnLayout.setVerticalGroup(
            goToBedPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(goToBedPnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChSd1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sdListBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(goToBedPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime2)
                    .addComponent(playSoundCb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(goToBedPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb5Min)
                    .addComponent(rb10Min)
                    .addComponent(rb15Min))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(goToBedPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb20Min)
                    .addComponent(rb25Min)
                    .addComponent(rb30Min))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(goToBedPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slBtn1)
                    .addComponent(wkBtn1))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        reviewPn.setBackground(new java.awt.Color(227, 116, 96));
        reviewPn.setPreferredSize(new java.awt.Dimension(351, 304));

        lblReview1.setFont(new java.awt.Font("TH SarabunPSK", 0, 52)); // NOI18N
        lblReview1.setText("Sleep Review");

        lblFliter1.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        lblFliter1.setText("Fliter");

        reviewCbb.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        reviewCbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "รายสัปดาห์", "รายเดือน", "รายปี" }));

        viewBtn.setFont(new java.awt.Font("TH SarabunPSK", 0, 48)); // NOI18N
        viewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sleepcycle/icon/graph-analysis (1).png"))); // NOI18N
        viewBtn.setText("view");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reviewPnLayout = new javax.swing.GroupLayout(reviewPn);
        reviewPn.setLayout(reviewPnLayout);
        reviewPnLayout.setHorizontalGroup(
            reviewPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reviewPnLayout.createSequentialGroup()
                .addGroup(reviewPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reviewPnLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(reviewPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblReview1)
                            .addGroup(reviewPnLayout.createSequentialGroup()
                                .addComponent(viewBtn)
                                .addGap(47, 47, 47))))
                    .addGroup(reviewPnLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblFliter1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reviewCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reviewPnLayout.setVerticalGroup(
            reviewPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reviewPnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReview1)
                .addGap(18, 18, 18)
                .addGroup(reviewPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFliter1)
                    .addComponent(reviewCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        alarmPn.setBackground(new java.awt.Color(227, 116, 96));
        alarmPn.setPreferredSize(new java.awt.Dimension(351, 304));
        alarmPn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        alarmPn.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 280));

        javax.swing.GroupLayout forBtnPnLayout = new javax.swing.GroupLayout(forBtnPn);
        forBtnPn.setLayout(forBtnPnLayout);
        forBtnPnLayout.setHorizontalGroup(
            forBtnPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reviewPn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addGroup(forBtnPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(goToBedPn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(forBtnPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(statisticPn, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
            .addGroup(forBtnPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(alarmPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        forBtnPnLayout.setVerticalGroup(
            forBtnPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reviewPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(forBtnPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(goToBedPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(forBtnPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(statisticPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(forBtnPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(alarmPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttontPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forBtnPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(headPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headPn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttontPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(forBtnPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void creBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creBtnActionPerformed
        Create form = new Create();
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//กดปิดแล้วจบการทำงาน
        form.setLocationRelativeTo(null);//ไม่กำหนดจะอยู่ตรงกลาง
//        form.setSize(520, 360);
        // ซ่อนformปัจจุบัน
        dispose();
    }//GEN-LAST:event_creBtnActionPerformed

    private void goToBedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToBedBtnActionPerformed
        alarmPn.setVisible(false);
        goToBedPn.setVisible(true);
        reviewPn.setVisible(false);
        statisticPn.setVisible(false);
    }//GEN-LAST:event_goToBedBtnActionPerformed

    private void reviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewBtnActionPerformed
        alarmPn.setVisible(false);
        goToBedPn.setVisible(false);
        reviewPn.setVisible(true);
        statisticPn.setVisible(false);
    }//GEN-LAST:event_reviewBtnActionPerformed

    private void staticBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staticBtnActionPerformed
        alarmPn.setVisible(false);
        goToBedPn.setVisible(false);
        reviewPn.setVisible(false);
        statisticPn.setVisible(true);
    }//GEN-LAST:event_staticBtnActionPerformed

    private void alarmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmBtnActionPerformed
        alarmPn.setVisible(true);
        goToBedPn.setVisible(false);
        reviewPn.setVisible(false);
        statisticPn.setVisible(false);
    }//GEN-LAST:event_alarmBtnActionPerformed

    private void slBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slBtn1ActionPerformed
        SleepTimeSQL st = new SleepTimeSQL();
        st.startSleep();
        int time=1;
        if( playSoundCb.isSelected()){
            int ssId = sdListBtn1.getSelectedIndex()+1;
            SoundManage sm = new SoundManage();
            if(rb5Min.isSelected()){
                time = 5;
            }
            else if(rb10Min.isSelected()){
                time = 10;
            }
            else if(rb15Min.isSelected()){
                time = 15;
            }
            else if(rb20Min.isSelected()){
                time = 20;
            }
            else if(rb25Min.isSelected()){
                time = 25;
            }
            else if(rb30Min.isSelected()){
                time = 30;
            }
            System.out.println(time);
            sm.SoundSleepQuery();
            sm.playSoundSleep(ssId, time);
        }
        alarmPn.setVisible(true);
        goToBedPn.setVisible(false);
        reviewPn.setVisible(false);
        statisticPn.setVisible(false);
    }//GEN-LAST:event_slBtn1ActionPerformed

    private void wkBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wkBtn1ActionPerformed
        SleepTimeSQL st = new SleepTimeSQL();
        st.setTimeEnd();
        ReviewAfterSleep  form = new ReviewAfterSleep();
        form.setTitle("Review");
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        st.computeTime(st.getSleepTimeId());
    }//GEN-LAST:event_wkBtn1ActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        Review rv = new Review();
        rv.descriptQuery();
        int select = reviewCbb.getSelectedIndex();
        int[] sleep = rv.countState(select);
        int well = sleep[0];
        int deep = sleep[1];
        int insom = sleep[2];
        int drowsy = sleep[3];
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("หลับสบาย", new Integer(well));
        dataset.setValue("หลับลึก", new Integer(deep));
        dataset.setValue("นอนไม่หลับ", new Integer(insom));
        dataset.setValue("กึ่งหลับกึ่งตื่น", new Integer(drowsy));
        JFreeChart chart = ChartFactory.createPieChart("",dataset);
        ChartFrame frame = new ChartFrame("Sleep chart", chart);
        RefineryUtilities.centerFrameOnScreen(frame);
        frame.setVisible(true);
        frame.setSize(300,300);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void viewBtnStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnStatActionPerformed
        int select = listCbb.getSelectedIndex();
        SleepTimeSQL st = new SleepTimeSQL();
        st.sleepTimeQuery();
        ArrayList[] arr = st.countSleepState(select);
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(int i = 0 ; i < arr[0].size() ; i++){
            int time = (int)arr[0].get(i);
            String day = (String) arr[1].get(i);
            dataset.setValue(time, "hours",day);
        }    
        JFreeChart chart = ChartFactory.createBarChart("Static","Days",
                "hours", dataset, PlotOrientation.VERTICAL, false, true, false);
        ChartFrame frame = new ChartFrame("Sleep Time Chart", chart);
        RefineryUtilities.centerFrameOnScreen(frame);
        frame.setVisible(true);
        frame.setSize(300,300);
    }//GEN-LAST:event_viewBtnStatActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home frame = new Home();
                frame.setTitle("Sleep Cycle");
                frame.setLocationRelativeTo(null);//ไม่กำหนดจะอยู่ตรงกลาง
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocation(400, 200);
            }
        });
        
        al.wakeUp();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alarmBtn;
    private javax.swing.JPanel alarmPn;
    private javax.swing.JPanel buttontPN;
    private javax.swing.JButton creBtn;
    private javax.swing.JPanel forBtnPn;
    private javax.swing.JButton goToBedBtn;
    private javax.swing.JPanel goToBedPn;
    private javax.swing.JPanel headPn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChSd1;
    private javax.swing.JLabel lblCurDate;
    private javax.swing.JLabel lblCurTime;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFliter1;
    private javax.swing.JLabel lblReview1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTime2;
    private javax.swing.JLabel lblviewStatus;
    private javax.swing.JComboBox<String> listCbb;
    private javax.swing.JCheckBox playSoundCb;
    private javax.swing.JRadioButton rb10Min;
    private javax.swing.JRadioButton rb15Min;
    private javax.swing.JRadioButton rb20Min;
    private javax.swing.JRadioButton rb25Min;
    private javax.swing.JRadioButton rb30Min;
    private javax.swing.JRadioButton rb5Min;
    private javax.swing.JButton reviewBtn;
    private javax.swing.JComboBox<String> reviewCbb;
    private javax.swing.JPanel reviewPn;
    private javax.swing.JComboBox<String> sdListBtn1;
    private javax.swing.JButton slBtn1;
    private javax.swing.JButton staticBtn;
    private javax.swing.JPanel statisticPn;
    private javax.swing.JButton viewBtn;
    private javax.swing.JButton viewBtnStat;
    private javax.swing.JButton wkBtn1;
    // End of variables declaration//GEN-END:variables
}
