/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdvertiserEnterprise.MarketingOrganization;

import System.Advertisments.Advertisment;
import System.Enterprise.Advertiser;
import java.awt.CardLayout;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SURAJ
 */
public class CreateAdvertismentJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Advertiser advertiser;
    private String imagePath;
    /**
     * Creates new form CreateAdvertismentJPanel
     */
    public CreateAdvertismentJPanel(JPanel userProcessContainer, Advertiser advertiser) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.advertiser= advertiser;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        prductTypejTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        uploadJButton1 = new javax.swing.JButton();
        backJButton1 = new javax.swing.JButton();
        createJButton2 = new javax.swing.JButton();
        imageJLabel2 = new javax.swing.JLabel();

        jFileChooser1.setCurrentDirectory(new java.io.File("/Users/SURAJ/NetBeansProjects/FinalProject"));

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/create icon.png"))); // NOI18N
        jLabel1.setText("Create Advertisments");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 420, 60));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Apple Braille", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(2, 2, 0, 4));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Product Type :");
        jPanel1.add(jLabel6);

        prductTypejTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                prductTypejTextField2FocusLost(evt);
            }
        });
        jPanel1.add(prductTypejTextField2);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Upload Image :");
        jPanel1.add(jLabel7);

        jPanel2.setOpaque(false);

        uploadJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update_icon.png"))); // NOI18N
        uploadJButton1.setText("Upload ");
        uploadJButton1.setPreferredSize(new java.awt.Dimension(110, 33));
        uploadJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadJButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(uploadJButton1);

        jPanel1.add(jPanel2);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 520, 120));

        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        backJButton1.setText("Back");
        backJButton1.setToolTipText("Back");
        backJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 90, 30));

        createJButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save_icon.gif"))); // NOI18N
        createJButton2.setText("Create");
        createJButton2.setToolTipText("Create Advertisment");
        createJButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createJButton2.setEnabled(false);
        createJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButton2ActionPerformed(evt);
            }
        });
        add(createJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 100, 30));

        imageJLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        imageJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Advertiser BackGround.jpg"))); // NOI18N
        add(imageJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void uploadJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadJButton1ActionPerformed

        int selected = jFileChooser1.showOpenDialog(jPanel1);
        if(selected== JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, "Please select an Image","Image Upload Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        File file= jFileChooser1.getSelectedFile();
        String fileName=file.getName();
        if(fileName.endsWith(".jpg") || fileName.endsWith(".png")|| fileName.endsWith(".gif"))
        {
            imagePath = "AdImages/"+ fileName;
            createJButton2.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Image Uploaded","Upload Successful", JOptionPane.INFORMATION_MESSAGE);
        } else JOptionPane.showMessageDialog(null, "Please select a .jpg or \n.png or .gif format Image","Image Upload Error", JOptionPane.ERROR_MESSAGE);
        // TODO add your handling code here:
    }//GEN-LAST:event_uploadJButton1ActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void createJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButton2ActionPerformed

        if(prductTypejTextField2.getText().isEmpty())
        { 
          JOptionPane.showMessageDialog(null, "Please enter a product type","Invalid Entry", JOptionPane.INFORMATION_MESSAGE);
          return;
        }
         Advertisment advertisment= advertiser.getAdDirectory().createAndAddAdvertisment();
         advertisment.setProductType(prductTypejTextField2.getText());
         advertisment.setAdImagePath(imagePath);
         JOptionPane.showMessageDialog(null, "Advertisment Created Successfully","", JOptionPane.INFORMATION_MESSAGE);
         userProcessContainer.remove(this);
         ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
       
        // TODO add your handling code here:
    }//GEN-LAST:event_createJButton2ActionPerformed

    private void prductTypejTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prductTypejTextField2FocusLost
         String value = prductTypejTextField2.getText();
        if (value.equals("")) {
        } else {
        Pattern pt6 = Pattern.compile("^[a-zA-Z\\ ]*$");
        Matcher mh6 = pt6.matcher(value);
        boolean matchFound6 = mh6.matches();
        if (!(matchFound6)) {
            JOptionPane.showMessageDialog(null, "Enter the Characters only");
            prductTypejTextField2.setText("");
            prductTypejTextField2.requestFocus();
        }
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_prductTypejTextField2FocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton createJButton2;
    private javax.swing.JLabel imageJLabel2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField prductTypejTextField2;
    private javax.swing.JButton uploadJButton1;
    // End of variables declaration//GEN-END:variables
}