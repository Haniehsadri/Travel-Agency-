/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package travel.agency.GUI;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import travel.agency.Data.MessageData;
import travel.agency.Message;

/**
 *
 * @author sony
 */
public class ShowReplyMessages extends java.awt.Dialog {

    /**
     * Creates new form ShowReplyMessages
     */
    public ShowReplyMessages(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane(){  private Image image;
            {
                try {
                    image = ImageIO.read(new File("C:\\Users\\sony\\Desktop\\i.jpg"));
                } catch (IOException
                    e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }};
            jLabel1 = new javax.swing.JLabel();
            Messages = new javax.swing.JComboBox();
            message = new javax.swing.JTextField();
            reply = new javax.swing.JTextField();
            l1 = new javax.swing.JLabel();
            l2 = new javax.swing.JLabel();
            show = new javax.swing.JButton();
            jButton1 = new javax.swing.JButton();

            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent evt) {
                    closeDialog(evt);
                }
                public void windowOpened(java.awt.event.WindowEvent evt) {
                    formWindowOpened(evt);
                }
            });

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/agency/GUI/arman.png"))); // NOI18N
            jLabel1.setText("jLabel1");
            jDesktopPane1.add(jLabel1);
            jLabel1.setBounds(530, 10, 410, 60);

            jDesktopPane1.add(Messages);
            Messages.setBounds(770, 410, 280, 40);

            message.setEditable(false);
            jDesktopPane1.add(message);
            message.setBounds(140, 40, 350, 270);

            reply.setEditable(false);
            jDesktopPane1.add(reply);
            reply.setBounds(130, 410, 360, 260);

            l1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            l1.setForeground(new java.awt.Color(255, 255, 255));
            l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l1.setText("message:");
            jDesktopPane1.add(l1);
            l1.setBounds(10, 140, 110, 60);

            l2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
            l2.setForeground(new java.awt.Color(255, 255, 255));
            l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            l2.setText("reply:");
            jDesktopPane1.add(l2);
            l2.setBounds(14, 500, 100, 50);

            show.setBackground(new java.awt.Color(51, 255, 51));
            show.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            show.setText("نمایش");
            show.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    showActionPerformed(evt);
                }
            });
            jDesktopPane1.add(show);
            show.setBounds(850, 490, 110, 50);

            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/agency/GUI/exit-icon.gif"))); // NOI18N
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });
            jDesktopPane1.add(jButton1);
            jButton1.setBounds(1170, 540, 90, 100);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1351, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
        System.exit(1);
    }//GEN-LAST:event_closeDialog

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      refreshCombobox();
      this.l1.setVisible(false);
      this.l2.setVisible(false);
      this.message.setVisible(false);
      this.reply.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
         this.l1.setVisible(true);
        this.l2.setVisible(true);
        this.message.setVisible(true);
        this.reply.setVisible(true);
        for(Message message:MessageData.getInstance().getMessegeList()){
            if(message.shenas2.equals(this.Messages.getSelectedItem())){
                this.message.setText(message.getText());
                this.reply.setText(message.getReply());
            }
        }
    }//GEN-LAST:event_showActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new ConnectionWithUs(null, true).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ShowReplyMessages dialog = new ShowReplyMessages(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    public void refreshCombobox(){
        this.Messages.removeAll();
        for(Message message:MessageData.getInstance().getMessegeList()){
            if(message.getWriter().equals(CustomerLogIn.found))
                this.Messages.addItem(message.getSubject()+"     "+message.code);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Messages;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField message;
    private javax.swing.JTextField reply;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables
}