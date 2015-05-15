/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdExchangeEnterprise;

import System.Enterprise.AdExchange;
import System.Network.Network;
import System.WorkQueue.AdServingWorkRequest;
import System.WorkQueue.AddAdvertiserWorkRequest;
import System.WorkQueue.AddPublisherWorkRequest;
import System.WorkQueue.BidRequest;
import System.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SURAJ
 */
public class ViewWorkRequestsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private AdExchange exchange;
    /**
     * Creates new form AddRequestJPanel
     */
    public ViewWorkRequestsJPanel(JPanel userProcessContainer,AdExchange exchange,Network network) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.exchange= exchange;
        populateTable();   
    }
   
    private void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) workQueueJTable1.getModel();
        model.setRowCount(0);
        
        for(WorkRequest request: exchange.getWorkQueue().getRequestList()){
            Object[] row = new Object[6];
            row[0]= request;
            row[1]= request.getMessage();
            row[2]= request.getCreated();
            row[3]= request.getSenderEnterprise();
            String name= (request.getSenderEnterprise()).getClass().getName();
            String[] parts= name.split("\\.");
            row[4]= parts[2];
            row[5]= request.getStatus();
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
        workQueueJTable1 = new javax.swing.JTable();
        viewRequestJButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        refreshButton5 = new javax.swing.JButton();
        imageJLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/View_icon.png"))); // NOI18N
        jLabel1.setText("View Work Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 420, 60));

        workQueueJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Message", "Date/Time", "Sender Name", "Sender Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workQueueJTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workQueueJTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(workQueueJTable1);
        workQueueJTable1.getColumnModel().getColumn(0).setPreferredWidth(7);
        workQueueJTable1.getColumnModel().getColumn(1).setPreferredWidth(90);
        workQueueJTable1.getColumnModel().getColumn(3).setPreferredWidth(17);
        workQueueJTable1.getColumnModel().getColumn(4).setPreferredWidth(20);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 930, 460));

        viewRequestJButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/View_icon.png"))); // NOI18N
        viewRequestJButton2.setText("View Details");
        viewRequestJButton2.setToolTipText("View Request Details");
        viewRequestJButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewRequestJButton2.setEnabled(false);
        viewRequestJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestJButton2ActionPerformed(evt);
            }
        });
        add(viewRequestJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 620, 140, 40));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setText("Work Queue :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 140, 30));

        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        backJButton1.setText("Back");
        backJButton1.setToolTipText("Back");
        backJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 80, -1));

        refreshButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset-icon.png"))); // NOI18N
        refreshButton5.setText("Refresh");
        refreshButton5.setToolTipText("Refresh Table");
        refreshButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButton5ActionPerformed(evt);
            }
        });
        add(refreshButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 110, 30));

        imageJLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        imageJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdExchange Background.jpg"))); // NOI18N
        add(imageJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewRequestJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestJButton2ActionPerformed

      int selectedRow= workQueueJTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row","Invalid Action", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest request = (WorkRequest) workQueueJTable1.getValueAt(selectedRow, 0);
        if(!request.getStatus().equals("Request Approved") || request.getStatus().equals("Cancelled") || request.getStatus().equals("Duplicate Request")){
         if(request instanceof AddPublisherWorkRequest)
         {
           AddPublisherJPanel addPublisherJPanel = new AddPublisherJPanel(userProcessContainer, (AddPublisherWorkRequest) request, exchange);
           userProcessContainer.add("AddPublisherJPanel", addPublisherJPanel);
         }
         else if(request instanceof AddAdvertiserWorkRequest)
         {
           AddAdvertiserJPanel addAdvertiserJPanel= new AddAdvertiserJPanel(userProcessContainer, (AddAdvertiserWorkRequest) request, exchange);
           userProcessContainer.add("AddAdvertiserJPanel", addAdvertiserJPanel);
         }
         else if(request instanceof AdServingWorkRequest)
         {
           ViewAdServingWorkRequestJPanel viewAdSpaceWorkRequestJPanel= new ViewAdServingWorkRequestJPanel(userProcessContainer, (AdServingWorkRequest) request);;
           userProcessContainer.add("ViewAdSpaceWorkRequestJPanel", viewAdSpaceWorkRequestJPanel);
         }
         else if(request instanceof BidRequest)
         {
           ViewBidRequestJPanel1 viewBidRequestJPanel1= new ViewBidRequestJPanel1(userProcessContainer, (BidRequest) request);
           userProcessContainer.add("ViewBidRequestJPanel1", viewBidRequestJPanel1);
         } 
         ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
        }else JOptionPane.showMessageDialog(null, "This request is either Approved or Cancelled","Invalid Action", JOptionPane.ERROR_MESSAGE);
            // TODO add your handling code here:
    }//GEN-LAST:event_viewRequestJButton2ActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void workQueueJTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workQueueJTable1MouseClicked
        int selectedRow= workQueueJTable1.getSelectedRow();
        if (selectedRow < 0) return;
        WorkRequest ua = (WorkRequest) workQueueJTable1.getValueAt(selectedRow, 0);
        if(ua!=null) viewRequestJButton2.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_workQueueJTable1MouseClicked

    private void refreshButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton5ActionPerformed
        populateTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel imageJLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton5;
    private javax.swing.JButton viewRequestJButton2;
    private javax.swing.JTable workQueueJTable1;
    // End of variables declaration//GEN-END:variables
}