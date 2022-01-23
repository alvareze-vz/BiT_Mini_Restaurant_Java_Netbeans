package bit_restaurant;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat; 
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class dailyRegistration extends javax.swing.JFrame {

    public dailyRegistration() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.displayPerson();
        showDate(); 
        showTIme();
        this.bt_staff.setEnabled(false);
        }
    
    public String showDate() {
       DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
       Date d=new Date();
       lab_date.setText(df.format(d));
        return df.format(d);
        } 
    
    public void showTIme(){
        new Timer(0,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        Date dd= new Date();
        SimpleDateFormat ss =new SimpleDateFormat("hh:mm:ss a");
        lab_time.setText(ss.format(dd.getTime()));
            }
        }).start();
    }
        get_connected c=new get_connected();
        Connection con=c.getConnection();
        Statement st;
        ResultSet rs;
        
    public void displayPerson(){
        try{
           st=con.createStatement();
           rs=st.executeQuery("select p.personID,name,surname,cni,adress,pl.plateID, dp.total_price=null as pp "
                   + "from person p,details_payment dp,plate pl "
                   + "where p.personID=dp.personID and pl.plateID=dp.plateID group by personID ");
           DefaultTableModel m=(DefaultTableModel)tab_person.getModel();
           m.getDataVector().clear();
           while(rs.next()){
               Object o[]={
                   rs.getInt("personID"),
                   rs.getString("name"),
                   rs.getString("surname"),
                   rs.getString("adress"),
                   rs.getString("cni"),
                   rs.getInt("plateID"),
                   rs.getString("pp")  
               };
                   m.insertRow(tab_person.getRowCount(), o);
           }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_person = new javax.swing.JTable();
        bt_staff = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lab_date = new javax.swing.JLabel();
        lab_time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("URW Palladio L", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(50, 164, 216));
        jLabel1.setText("Daily Registration");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        tab_person.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Surname", "Adress", "CNI", "Plate", "Amount"
            }
        ));
        tab_person.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_personMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab_person);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_staff.setText("Staff");

        jButton3.setText("Statut");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );

        lab_date.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N

        lab_time.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lab_date, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lab_time, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(bt_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lab_time, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(lab_date, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(bt_staff)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab_personMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_personMouseClicked
       plate p=new plate();
       this.jPanel3.add(p);
       p.show();
       TableModel m=this.tab_person.getModel();
       int i=this.tab_person.getSelectedRow();  
       p.id.setText(m.getValueAt(i, 0).toString());
       p.id_plate.setText(m.getValueAt(1, 5).toString());
       p.lab_username.setText(m.getValueAt(i,2).toString());
       p.lab_name.setText(m.getValueAt(i,1).toString());
       
   
    }//GEN-LAST:event_tab_personMouseClicked

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        try{
        st=con.createStatement();
        rs=st.executeQuery("select personID,name,surname,adress,cni from person where name like '%"+txtSearch.getText()+"%' or surname like'%"+txtSearch.getText()+"%'");
        DefaultTableModel m=(DefaultTableModel)this.tab_person.getModel();
        m.getDataVector().clear(); //to clean the model data
        while(rs.next()){
            Object o[]={
                rs.getInt("personID"),
                rs.getString("name"),
                rs.getString("surname"),
                rs.getString("adress"),
                rs.getString("cni")
            };
            m.insertRow(tab_person.getRowCount(), o);
        }
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(rootPane,e," Erreur",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        st=con.createStatement();
        rs=st.executeQuery("select personID,name,surname,adress,cni from person where name like '%\"+txtSearch.getText()+\"%' or surname like'%\"+txtSearch.getText()+\"%'");
        DefaultTableModel m=(DefaultTableModel)this.tab_person.getModel();
        
        m.getDataVector().clear(); //to clean the model data to avoid duplicate
        while(rs.next()){
            Object o[]={
                rs.getArray("personID"),
                rs.getString("name"),
                rs.getString("surname"),
                rs.getString("adress"),
                rs.getString("cni")
            };
            m.insertRow(tab_person.getRowCount(), o);
        }
        }
     catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e,"Error",JOptionPane.ERROR);
            JOptionPane.showMessageDialog(rootPane,e," Erreur",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // 
        statut s=new statut();
        s.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_staff;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lab_date;
    private javax.swing.JLabel lab_time;
    private javax.swing.JTable tab_person;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
