import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

        
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author galaxy computers
 */
public class a extends javax.swing.JFrame {

    /**
     * Creates new form a
     */
    public a() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        c2 = new javax.swing.JCheckBox();
        c1 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        l1 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        c4 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTable();
        t3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        buttonGroup1.add(c2);
        c2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        c2.setText(" Categories");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(c1);
        c1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        c1.setText(" Categories");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(c3);
        c3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        c3.setText(" Categories");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        l1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        l1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Ropes", "Sutli", "Sutli Gola", "Bumboo Sutli", "Envelope", "Packing Roll" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        l1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                l1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(l1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(34, 34));
        jLabel2.setPreferredSize(new java.awt.Dimension(34, 34));

        jLabel5.setText("       ॥ श्री गणेशाय नमः ॥");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("  Bhavya Enterprise");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButton1.setText("Login ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 204));
        jLabel3.setText("Jitendra Chawda ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 204));
        jLabel4.setText("Mobile No. 9827224211");

        t2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Date ");

        t1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Customer Name :-- ");

        buttonGroup1.add(c4);
        c4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        c4.setText(" Categories");
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });

        ta1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Rate", "QTY ", "Total"
            }
        ));
        jScrollPane2.setViewportView(ta1);

        t3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton3.setText("Applied");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton4.setText("delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton5.setText("Total Amount");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setText("Enter the QTY of Item");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setText("Total Amount");

        t4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(c1)
                                    .addComponent(c2)
                                    .addComponent(c4)
                                    .addComponent(c3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton2)
                                        .addComponent(jLabel6)))
                                .addGap(32, 32, 32)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(248, 248, 248)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(345, 345, 345)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(258, 258, 258)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(238, 238, 238)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(82, 82, 82)
                                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(148, 148, 148))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(191, 191, 191)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jButton4))
                                        .addComponent(jButton3)))))))
                .addGap(0, 51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 41, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c3)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jButton2)))))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login jfrm2= new login();
        jfrm2.setSize(723,429);
        jfrm2.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
    }//GEN-LAST:event_formPropertyChange

    private void l1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_l1ValueChanged
       int x=l1.getSelectedIndex();
       if(x==0){
            c1.setVisible(true);
           c2.setVisible(true);
            c3.setVisible(true);
          c4.setVisible(true);
           c1.setSelected(false);
           c2.setSelected(false);
           c3.setSelected(false);
           c4.setSelected(false);
           c1.setText("3mm");
           c2.setText("4mm");
           c3.setText("6mm");
           c4.setText("8mm");
       }
       else if(x==1){
           c1.setSelected(false);
           c2.setSelected(false);
           c1.setText("1st ");
           c2.setText("2nd"); 
           c3.setSelected(false);
           c4.setSelected(false);
           c3.setVisible(false);
          c4.setVisible(false);
       }
       else if(x==2){
            c1.setSelected(false);
           c2.setSelected(false);
           c1.setText("1st ");
           c2.setText("2nd");
           c3.setSelected(false);
           c4.setSelected(false);
           c3.setVisible(false);
          c4.setVisible(false);
       }
        else if(x==3){
          c1.setSelected(false);
           c2.setSelected(false);
            c1.setText("4 inch ");
           c2.setText("8 inch");
           c3.setSelected(false);
           c4.setSelected(false);
           c3.setVisible(false);
          c4.setVisible(false);
       }
       else if(x==4){
           c1.setSelected(false);
           c2.setSelected(false);
           c1.setText("1st ");
           c2.setText("2nd");
           c3.setSelected(false);
           c4.setSelected(false);
           c3.setVisible(false);
          c4.setVisible(false);
       }
           else if(x==5){
           c1.setSelected(false);
           c2.setSelected(false);
           c3.setSelected(false);
           c1.setText("2 Kg ");
           c2.setText("3 Kg");
            c3.setVisible(true);
           c3.setText("5 Kg");
           c4.setSelected(false);
          c4.setVisible(false);
       }       
           
       
    }//GEN-LAST:event_l1ValueChanged

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c4ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
   DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
   Date daobj= new Date();
   t2.setText(df.format(daobj));
    }//GEN-LAST:event_formWindowActivated

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int x=l1.getSelectedIndex();
         double rate=0;
         Double qty=Double.parseDouble(t3.getText());
        DefaultTableModel model=(DefaultTableModel)ta1.getModel();
         if(x==0){
           if(c1.isSelected()){
            rate=120;
            double total=rate*qty;
         Object[] row = {" Ropes 3mm",rate,qty,total};
           model.addRow(row);}
           else if(c2.isSelected()){
            rate=118;
            double total=rate*qty;
            Object[] row = {" Ropes 4mm",rate,qty,total};
           model.addRow(row);}
        else if(c3.isSelected()){
            rate=118;
            double total=rate*qty;
             Object[] row = {" Ropes 6mm",rate,qty,total};
        model.addRow(row);}
        else if(c4.isSelected()){
            rate=118;
            double total=rate*qty;
            Object[] row = {" Ropes 8mm",rate,qty,total};
        model.addRow(row);}
        }
    else if(x==1){
        if(c1.isSelected()){
            rate=125;
            double total=rate*qty;
             Object[] row = {" 1st Sutli ",rate,qty,total};
        model.addRow(row);}
        else if(c2.isSelected()){
            rate=60;
            double total=rate*qty;
             Object[] row = {" 2nd Sutli",rate,qty,total};
        model.addRow(row);}
        }
    else if(x==2){
        if(c1.isSelected()){
            rate=136;
            double total=rate*qty;
            Object[] row = {" 1st Sutli Gola ",rate,qty,total};
        model.addRow(row);}
        else if(c2.isSelected()){
            rate=78;
            double total=rate*qty;
            Object[] row = {" 2nd Sutli Gola ",rate,qty,total};
        model.addRow(row);}
        }
    else if(x==3){
        if(c1.isSelected()){
            rate=80;
            double total=rate*qty;
            Object[] row = {" 4inch Bumboo Sutli ",rate,qty,total};
        model.addRow(row);}
        else if(c2.isSelected()){
            rate=80; 
            double total=rate*qty;
            Object[] row = {" 8inch Bumboo Sutli ",rate,qty,total};
       model.addRow(row); }
        }
    else if(x==4){
        if(c1.isSelected()){
            rate=85;
            double total=rate*qty;
            Object[] row = {" 1st Envelope",rate,qty,total};
        model.addRow(row);}
        else if(c2.isSelected()){
            rate=40;
            double total=rate*qty;
            Object[] row = {" 2nd Envelope",rate,qty,total};
        model.addRow(row);}
        }
    else if(x==5){
        if(c1.isSelected()){
            rate=100;
            double total=rate*qty;
            Object[] row = {"2kg Packing Roll",rate,qty,total};
        model.addRow(row);}
        else if(c2.isSelected()){
            rate=150;
            double total=rate*qty;
            Object[] row = {"3kg Packing Roll",rate,qty,total};
        model.addRow(row);}
        else if(c3.isSelected()){
                rate=250;
                double total=rate*qty;
                Object[] row = {"5kg Packing Roll",rate,qty,total};
        model.addRow(row);}
    }
     
 
   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   DefaultTableModel model=(DefaultTableModel)ta1.getModel();
   model.removeRow(ta1.getSelectedRow());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     double total=0;
     for(int i=0;i<ta1.getRowCount();i++){
         total=total+Double.parseDouble(ta1.getValueAt(i, 3).toString());
         t4.setText(" "+total);
     }
     ImageIcon icon= new ImageIcon("C:\\Users\\galaxy computers\\Desktop\\come.png");
     l2.setIcon(icon);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int rows=ta1.getRowCount();
        //for(int row=0;row<rows;row++){
        try{
       Class.forName("com.mysql.jdbc.Driver");
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost/bhavya_entp","root","");
       Statement stmt=con.createStatement();
       String qr="Create table "+t1.getText()+"(Date date , Item varchar(25),Rate double,QTY double, Total_Amount double );";
      stmt.executeUpdate(qr);
       for(int row=0;row<rows;row++)
      {
          String item=(String)ta1.getValueAt(row,0);
            double rate=(Double)ta1.getValueAt(row, 1);
            double qty=(Double)ta1.getValueAt(row,2);
            double total=(Double)ta1.getValueAt(row, 3);
        String qr1="insert into "+t1.getText()+" values('"+t2.getText()+"','"+item+"','"+rate+"','"+qty+"','"+total+"');";
        stmt.executeUpdate(qr1);
      }
       
     // JOptionPane.showMessageDialog(null,"Data Save Successfully");
    }        
   catch(Exception e)
   {
        JOptionPane.showMessageDialog(null, e);
           try{
            //for(int row=0;row<rows;row++){
        Class.forName("com.mysql.jdbc.Driver");
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost/bhavya_entp","root","");
       Statement stmt=con.createStatement();
       for(int row=0;row<rows;row++)
       {
           String item=(String)ta1.getValueAt(row,0);
            double rate=(Double)ta1.getValueAt(row, 1);
            double qty=(Double)ta1.getValueAt(row,2);
            double total=(Double)ta1.getValueAt(row, 3);
           String qr1="insert into "+t1.getText()+" values('"+t2.getText()+"','"+item+"','"+rate+"','"+qty+"','"+total+"');";
       stmt.executeUpdate(qr1);
           }
    //    JOptionPane.showMessageDialog(null,"Data Save Successfully");
            //}
         }
    catch(Exception e1){
        JOptionPane.showMessageDialog(null, e1);
      }
   }
        //}
        JOptionPane.showMessageDialog(rootPane, rows);
    }//GEN-LAST:event_jButton2ActionPerformed
      
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
            java.util.logging.Logger.getLogger(a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList l1;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTable ta1;
    // End of variables declaration//GEN-END:variables
}
