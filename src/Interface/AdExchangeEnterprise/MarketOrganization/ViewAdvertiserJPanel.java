/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdExchangeEnterprise.MarketOrganization;

import System.Enterprise.AdExchange;
import System.Enterprise.Advertiser;
import System.Market.Market;
import System.Network.Network;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SURAJ
 */
public class ViewAdvertiserJPanel extends javax.swing.JPanel {

     private JPanel userProcessContainer;
     private AdExchange exchange;
    /**
     * Creates new form ManageAdvertiserJPanel
     */
    public ViewAdvertiserJPanel(JPanel userProcessContainer,Network network, AdExchange exchange) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.exchange= exchange;
        populateMarketTypeComboBox();
      }

     private void populateMarketTypeComboBox()
    {
        marketTypeJComboBox1.removeAllItems();
        for(Market market: exchange.getMarketDirectory().getMarketList())
           marketTypeJComboBox1.addItem(market);
    }
     
    private void populateEnterpriseTable(Market market)
    {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable1.getModel();
        model.setRowCount(0);
        
          for(Advertiser advertiser: market.getAdvertiserList()){
            Object[] row = new Object[2];
            row[0]= advertiser;
            row[1]= advertiser.getLocation();
            model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        removeAdvertiserJButton2 = new javax.swing.JButton();
        marketTypeJComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        imageJLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/View_icon.png"))); // NOI18N
        jLabel1.setText("View Advertisers");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 420, 60));

        enterpriseJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterpriseJTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 650, 260));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setText("Select a Market Type :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 170, 30));

        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        backJButton1.setText("Back");
        backJButton1.setToolTipText("Back");
        backJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 90, -1));

        removeAdvertiserJButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_icon.png"))); // NOI18N
        removeAdvertiserJButton2.setText("Remove Advertiser");
        removeAdvertiserJButton2.setToolTipText("Remove Advertiser");
        removeAdvertiserJButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeAdvertiserJButton2.setEnabled(false);
        removeAdvertiserJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAdvertiserJButton2ActionPerformed(evt);
            }
        });
        add(removeAdvertiserJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 170, -1));

        marketTypeJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marketTypeJComboBox1ActionPerformed(evt);
            }
        });
        add(marketTypeJComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 170, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setText("List of Advertisers :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 140, 30));

        imageJLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        imageJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdExchange Background.jpg"))); // NOI18N
        add(imageJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void enterpriseJTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterpriseJTable1MouseClicked
        int selectedRow= enterpriseJTable1.getSelectedRow();
        if (selectedRow < 0) return;
        Advertiser advertiser = (Advertiser) enterpriseJTable1.getValueAt(selectedRow, 0);
         if(advertiser!=null) removeAdvertiserJButton2.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseJTable1MouseClicked

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void removeAdvertiserJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAdvertiserJButton2ActionPerformed

        Market market= (Market) marketTypeJComboBox1.getSelectedItem();
        int selectedRow= enterpriseJTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row","Invalid Action", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Advertiser advertiser = (Advertiser) enterpriseJTable1.getValueAt(selectedRow, 0);

        int dialogButton = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog(null, "Are you sure to delete "+ advertiser.getName() +" ?", "Delete Confirmation", dialogButton, JOptionPane.WARNING_MESSAGE);
        if(dialogButton == JOptionPane.YES_OPTION)
        {
            Advertiser advertiser2 = null;
           for(Advertiser advertiser1: market.getAdvertiserList())
            if(advertiser.getLocation().equals(advertiser1.getLocation()))
                 advertiser2=advertiser1;
            market.getAdvertiserList().remove(advertiser2);
            populateEnterpriseTable(market);
        }
        removeAdvertiserJButton2.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_removeAdvertiserJButton2ActionPerformed

    private void marketTypeJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marketTypeJComboBox1ActionPerformed

        Market market= (Market) marketTypeJComboBox1.getSelectedItem();
        if(market!=null)populateEnterpriseTable(market);
        // TODO add your handling code here:
    }//GEN-LAST:event_marketTypeJComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JTable enterpriseJTable1;
    private javax.swing.JLabel imageJLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox marketTypeJComboBox1;
    private javax.swing.JButton removeAdvertiserJButton2;
    // End of variables declaration//GEN-END:variables
}