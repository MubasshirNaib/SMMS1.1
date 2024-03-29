
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author SHIKHON
 */
public class SDashboard extends javax.swing.JFrame {

    /**
     * Creates new form SDashboard
     */
    public SDashboard() {
        initComponents();
        table_show();
    }
Connection con1,con2;
        PreparedStatement insert,pst,push,insert1,insert2;
        private void table_show() {
           int c;
           try {
                Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","");
           insert = con1.prepareStatement("SELECT * FROM record");
           ResultSet Rs = insert.executeQuery();
            ResultSetMetaData Rss = Rs.getMetaData();
            c = Rss.getColumnCount();
            DefaultTableModel Df = (DefaultTableModel) Table1.getModel();
            Df.setRowCount(0);
            while (Rs.next()) {
                Vector v2 = new Vector();
          
                for (int ii = 2; ii <= c; ii++) {
                  //  v2.add(Rs.getString("username"));
                    v2.add(Rs.getString("id"));
                    v2.add(Rs.getString("details"));
                    v2.add(Rs.getString("location"));
                    v2.add(Rs.getString("fees"));
                    v2.add(Rs.getString("facilities"));
                    v2.add(Rs.getBytes("photo"));
                    //v2.add(Rs.getString("location"));
                      
                }
              
                Df.addRow(v2);
            }

            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        txtphoto1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(939, 491));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel2.setText("Search Mess Based on Location:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 360, 30));

        txtsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsearchMouseClicked(evt);
            }
        });
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 270, 30));

        jDesktopPane1.setMaximumSize(new java.awt.Dimension(320, 230));

        txtphoto1.setVerifyInputWhenFocusTarget(false);

        jDesktopPane1.setLayer(txtphoto1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtphoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtphoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 330, 230));

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mess Id", "Details", "Location", "Fees", "Facilities", "Photo"
            }
        ));
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 640, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHIKHON\\Desktop\\p89..3.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 494));

        setSize(new java.awt.Dimension(951, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel) Table1.getModel();
        int selectedIndex = Table1.getSelectedRow();

        // txtphoto1.setIcon(Df.getValueAt(selectedIndex, 6).toString());
        // txtphoto1.setIcon(format);

        // FetchPhoto();

        //  int row=Table1.getSelectedRow();
        int vv=Table1.getSelectedColumn();
        String tc=Table1.getModel().getValueAt(selectedIndex, 0).toString();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Register the mysql driver
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/demo","root","");
            String query="select * from record where id="+tc+"";
            insert=con1.prepareStatement(query);
            ResultSet rs=insert.executeQuery();
            if(rs.next()){

                String username=rs.getString("username");
                String id=rs.getString("id");
                String details=rs.getString("details");
                String location=rs.getString("location");
                String fees=rs.getString("fees");
                String facilities=rs.getString("facilities");
                //String photo1=rs.getString("photo");
                byte[] image=rs.getBytes("photo");
                format =new ImageIcon(image);
                txtphoto1.setIcon(format);
                /*txtoid.setText(""+id);
                txtousername1.setText(username);
                txtodetails.setText(details);
                txtolocation.setText(location);
                txtofees.setText(fees);
                txtofacilities.setText(facilities);
                //txtphoto2.setText(photo1);*/
                insert.close();
                rs.close();

            }
        }catch (Exception ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Table1MouseClicked

    private void txtsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMouseClicked
        // TODO add your handling code here:
        txtsearch.setText("");
    }//GEN-LAST:event_txtsearchMouseClicked
ResultSet rs;
    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:
       // String tc=Table1.getModel().getValueAt(selectedIndex, 2).toString();
        String tf=txtsearch.getText();
        try{
            String query="SELECT * FROM record WHERE location LIKE '%"+tf+"%'";
            pst=con1.prepareStatement(query);
            rs=pst.executeQuery();
            Table1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                if(pst !=null){
                    rs.close();
                    pst.close();
                }
            }catch(Exception e){
                
            }
        }
       
    }//GEN-LAST:event_txtsearchKeyReleased

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

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
            java.util.logging.Logger.getLogger(SDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SDashboard().setVisible(true);
            }
        });
    }
    byte[] photo = null;
String filename=null;
private ImageIcon format;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtphoto1;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
