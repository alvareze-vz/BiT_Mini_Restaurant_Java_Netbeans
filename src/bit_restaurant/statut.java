
package bit_restaurant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class statut extends javax.swing.JFrame {

    public statut() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.displayStatut();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_statut = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bt_register = new javax.swing.JButton();
        jDateChooser_Begin = new com.toedter.calendar.JDateChooser();
        jDateChooser_End = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        lab_total = new javax.swing.JLabel();
        lab_amount = new javax.swing.JLabel();
        lab_bitAmount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tab_statut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Surname", "CNI", "Amount", "BiT Amount", "Total"
            }
        ));
        jScrollPane1.setViewportView(tab_statut);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(66, 157, 201));
        jLabel1.setText("Statut");

        bt_register.setText("D. Register");
        bt_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registerActionPerformed(evt);
            }
        });

        jDateChooser_Begin.setDateFormatString("yyyy-MM-dd");

        jDateChooser_End.setDateFormatString("yyyy-MM-dd");

        jLabel2.setText("Date begin");

        jLabel3.setText("Date end");

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser_Begin, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser_End, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lab_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(lab_bitAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(lab_total, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser_Begin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser_End, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_register)
                        .addComponent(search)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab_total, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab_bitAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    get_connected con=new get_connected();
    Connection link=con.getConnection();
    Statement st;
    ResultSet rs;
    
    
    public void displayTotal(){
        try{
          String dateBegin_Total=((JTextField)jDateChooser_Begin.getDateEditor().getUiComponent()).getText();
          String dateEnd_Total=((JTextField)jDateChooser_End.getDateEditor().getUiComponent()).getText();
          st=link.createStatement();
          rs=st.executeQuery("select sum(person_payment+bit_payment) as total\n" +
                             "from details_payment \n" +
                             "where date_plate between '"+dateBegin_Total+"' and '"+dateEnd_Total+"'");
          rs.next();
          lab_total.setText(rs.getString("total"));
          
          
        } catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    public void displayAmount(){
        try{
            String dateBegin_Total=((JTextField)jDateChooser_Begin.getDateEditor().getUiComponent()).getText();
          String dateEnd_Total=((JTextField)jDateChooser_End.getDateEditor().getUiComponent()).getText();
            st=link.createStatement();
            rs=st.executeQuery("select sum(person_payment ) as totalAmount "
                    + "from details_payment "
                    + "where date_plate between '"+dateBegin_Total+"' and '"+dateEnd_Total+"'");
            rs.next();
            lab_amount.setText(rs.getString("totalAmount"));
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    public void displayBitAmount(){
        try{
            String dateBegin_Total=((JTextField)jDateChooser_Begin.getDateEditor().getUiComponent()).getText();
          String dateEnd_Total=((JTextField)jDateChooser_End.getDateEditor().getUiComponent()).getText();
        st=link.createStatement();
        rs=st.executeQuery("select sum(bit_payment) as bitPayment"
                + " from details_payment "
                + "where date_plate between '"+dateBegin_Total+"' and '"+dateEnd_Total+"'");
        rs.next();
        lab_bitAmount.setText(rs.getString("bitPayment"));
        
                } catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    public void displayStatut(){
        try{
      st=link.createStatement();
      rs=st.executeQuery(" select p.name, p.surname,p.cni,sum(dp.person_payment) as person_Amount,sum(dp.bit_payment) \n" +
                            " as bit_Amount, sum(dp.person_payment)+sum(dp.bit_payment) as total from person p, details_payment dp \n" +
                            " where p.personID=dp.personID and date_plate=current_date group by p.personID;");
      DefaultTableModel m=(DefaultTableModel)tab_statut.getModel();
      m.getDataVector().clear();
      while(rs.next()){
          Object o[]={
              rs.getString("name"),
              rs.getString("surname"),
              rs.getString("cni"),
              rs.getInt("person_Amount"),
              rs.getInt("bit_Amount"),
              rs.getInt("total")
          };
          m.insertRow(tab_statut.getRowCount(), o);
      }
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(rootPane, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void bt_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registerActionPerformed
        dailyRegistration d=new dailyRegistration();
        d.show();
        this.dispose();

    }//GEN-LAST:event_bt_registerActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
            if (jDateChooser_Begin.getDate()==null || jDateChooser_End.getDate()==null){
                JOptionPane.showMessageDialog(rootPane,"Date not chosen ","Info",JOptionPane.WARNING_MESSAGE);
            }
            
            else if(jDateChooser_Begin.getDate()!=null || jDateChooser_End.getDate()!=null) {
                
                String dateBegin=((JTextField)jDateChooser_Begin.getDateEditor().getUiComponent()).getText();
    
                String dateEnd=((JTextField)jDateChooser_End.getDateEditor().getUiComponent()).getText();
                
            try{
                st=link.createStatement();
                rs=st.executeQuery(" select p.name, p.surname,p.cni,sum(dp.person_payment) as person_Amount,sum(dp.bit_payment) as bit_Amount, sum(dp.person_payment)+sum(dp.bit_payment) as total \n" +
                                    "from person p, details_payment dp\n" +
                                    "where p.personID=dp.personID \n" +
                                    "and dp.date_plate between '"+dateBegin+"' and '"+dateEnd+"' group by p.personID ");
                
                DefaultTableModel m=(DefaultTableModel)tab_statut.getModel();
                m.getDataVector().clear();
                while(rs.next()){
                    Object[]o={
                      rs.getString("name"),
                      rs.getString("surname"),
                      rs.getString("cni"),
                      rs.getInt("person_Amount"),
                      rs.getInt("bit_Amount"),
                      rs.getInt("total")  
                    };
                    m.insertRow(tab_statut.getRowCount(), o);
                }
                this.displayTotal();
                this.displayAmount();
                this.displayBitAmount();
                
            } catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e,"error",JOptionPane.ERROR_MESSAGE);
            }
            
    }//GEN-LAST:event_searchActionPerformed
            else {
                JOptionPane.showMessageDialog(rootPane, "No result found !");
            }
    }



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
            java.util.logging.Logger.getLogger(statut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(statut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(statut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(statut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new statut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_register;
    private com.toedter.calendar.JDateChooser jDateChooser_Begin;
    private com.toedter.calendar.JDateChooser jDateChooser_End;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab_amount;
    private javax.swing.JLabel lab_bitAmount;
    private javax.swing.JLabel lab_total;
    private javax.swing.JButton search;
    private javax.swing.JTable tab_statut;
    // End of variables declaration//GEN-END:variables
}
