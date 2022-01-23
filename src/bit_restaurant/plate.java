
package bit_restaurant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class plate extends javax.swing.JInternalFrame {
    int priceOfPlate;
    public plate() {
        initComponents();
        priceOfPlate=0;
        this.radio_price.setEnabled(false);
     
    }
        dailyRegistration dr=new dailyRegistration();
        get_connected c=new get_connected();
        Connection link= c.getConnection();
        Statement st;
        ResultSet rs;
        public void beforeSaving(){
     if(cbox_type.getSelectedItem().toString()=="completed" ||
             cbox_type.getSelectedItem().toString()=="not completed"){
         this.radio_price.setEnabled(true);
      }
      else {
         this.radio_price.setEnabled(false);
     }
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        cbox_type = new javax.swing.JComboBox<>();
        radio_price = new javax.swing.JRadioButton();
        lab_name = new javax.swing.JLabel();
        lab_username = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        modify = new javax.swing.JButton();
        id_plate = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Plate");
        setPreferredSize(new java.awt.Dimension(290, 196));

        jLabel1.setText("Plate");

        jLabel2.setText("Price");

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        cbox_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "none", "completed", "not completed", " " }));
        cbox_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_typeActionPerformed(evt);
            }
        });

        radio_price.setText("1500 fbu");
        radio_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_priceActionPerformed(evt);
            }
        });

        lab_name.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N

        lab_username.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N

        modify.setText("Modify");
        modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(modify))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radio_price, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(id_plate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbox_type, 0, 152, Short.MAX_VALUE)
                            .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lab_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lab_name, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lab_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lab_username, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbox_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(radio_price)
                    .addComponent(id_plate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(modify))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
      
        if (cbox_type.getSelectedItem().toString()==" "){
        JOptionPane.showMessageDialog(rootPane,"Choose the right plate !","Information",JOptionPane.WARNING_MESSAGE);
            }
        else if(cbox_type.getSelectedItem().toString()=="completed" && !this.radio_price.isSelected()
             ||cbox_type.getSelectedItem().toString()=="not completed"&& !this.radio_price.isSelected()){
            
             JOptionPane.showMessageDialog(rootPane,"Select the price","Information",JOptionPane.WARNING_MESSAGE); 
                }
        
        else if(cbox_type.getSelectedItem().toString()=="none"){
           
                 try{
                     st=link.createStatement();
                     rs=st.executeQuery(" select count(*) as nb from details_payment "
                             + "where personID='"+id.getText()+"' and date_plate='"+dr.showDate()+"'");
                     rs.next();
                     int checkNumber=rs.getInt("nb");
                    if(checkNumber>0){
                       JOptionPane.showMessageDialog(rootPane,"Already registered !","Info",JOptionPane.ERROR_MESSAGE);
                       this.dispose();
                       
                       
                          }
                    else if(checkNumber==0){
                          st.executeUpdate("insert into details_payment(personID,plateID,date_plate,bit_payment,person_payment,total_price) "
                          + "values('"+id.getText()+"','"+id_plate.getText()+"',current_timestamp,0,0,0)");
        
                          JOptionPane.showMessageDialog(rootPane," Saved","Information",JOptionPane.INFORMATION_MESSAGE);
                             
                         this.dispose();
                          
                        
            }
              
            } catch(Exception e){
              JOptionPane.showMessageDialog(rootPane,e,"Error",JOptionPane.ERROR_MESSAGE);  
            }
        }
       
         else if(cbox_type.getSelectedItem().toString()=="completed" && this.radio_price.isSelected() ||
                cbox_type.getSelectedItem().toString()=="not completed" && this.radio_price.isSelected())   {
                 
            
            try{
                
                st=link.createStatement();
                rs=st.executeQuery(" select count(*) as nbb from details_payment "
                        + "where personID='"+id.getText()+"' and date_plate='"+dr.showDate()+"'");
                rs.next();
              int checkNumber1=rs.getInt("nbb");
              if(checkNumber1>0){
                  JOptionPane.showMessageDialog(rootPane,"Already registered !","Info",JOptionPane.ERROR_MESSAGE);
                  this.dispose();
                    }
              else if (checkNumber1==0){
                // i display the plateID so as to make the statistic with  completed and not completed after
                st.executeUpdate("insert into details_payment(personID,plateID,date_plate,bit_payment,person_payment,total_price) "
                      + "values('"+id.getText()+"','"+id_plate.getText()+"',current_timestamp,1000,500,1500)");
               
               JOptionPane.showMessageDialog(rootPane," Saved","Information",JOptionPane.INFORMATION_MESSAGE);
               // dr.displayPerson();
                this.dispose();
              }   
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane,e,"Error",JOptionPane.ERROR_MESSAGE );
            
                    }
              
        //this.dispose();
        }
             
    }//GEN-LAST:event_saveActionPerformed

    private void radio_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_priceActionPerformed
        if(radio_price.isSelected())
        this.priceOfPlate=1500;
    }//GEN-LAST:event_radio_priceActionPerformed

    private void cbox_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_typeActionPerformed
   beforeSaving();   
    }//GEN-LAST:event_cbox_typeActionPerformed

    private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed
        if (cbox_type.getSelectedItem().toString()==" "){
            JOptionPane.showMessageDialog(rootPane,"Choose the right plate !","Information",JOptionPane.WARNING_MESSAGE);
            }
        else if(cbox_type.getSelectedItem().toString()=="completed" && !this.radio_price.isSelected()
             ||cbox_type.getSelectedItem().toString()=="not completed"&& !this.radio_price.isSelected()){
            
             JOptionPane.showMessageDialog(rootPane,"Select the price","Information",JOptionPane.WARNING_MESSAGE); 
                }
        else if(cbox_type.getSelectedItem().toString()=="none"){
            try{
                st=link.createStatement();
                st.executeUpdate("update details_payment SET bit_payment=0, person_payment=0,total_price=0\n" +
                    "	where personID='"+id.getText()+"' and date_plate='"+dr.showDate()+"'");
                JOptionPane.showMessageDialog(rootPane, "Modified !");
                this.dispose();
            } catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e,"Error",JOptionPane.ERROR_MESSAGE);
            }
            
                  }
        else if(cbox_type.getSelectedItem().toString()=="completed" && this.radio_price.isSelected() ||
                cbox_type.getSelectedItem().toString()=="not completed" && this.radio_price.isSelected()){
            
                try{
                    st=link.createStatement();
                
                    st.executeUpdate("update details_payment SET bit_payment=1000, person_payment=500,total_price=1500\n" +
                         " where personID='"+id.getText()+"' and date_plate='"+dr.showDate()+"'");
                    JOptionPane.showMessageDialog(rootPane, "Modified !");
                    this.dispose();
                    
                    
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_modifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbox_type;
    public javax.swing.JTextField id;
    public javax.swing.JTextField id_plate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lab_name;
    protected javax.swing.JLabel lab_username;
    private javax.swing.JButton modify;
    private javax.swing.JRadioButton radio_price;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
