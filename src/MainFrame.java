/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.AudioClip;
import java.awt.Dimension;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author jonaspm
 */
public class MainFrame extends javax.swing.JFrame {

    // Array of sounds & button text
    protected AudioClip sounds[];
    protected StringBuilder buttonText = new StringBuilder("sound ");
    /**
     * Creates new form frame
     */
    public MainFrame() {
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

        btnStop = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblSounds = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelContainer1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelContainer2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SE Player");

        btnStop.setText("STOP");
        btnStop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        lblSounds.setText("Choose number of sounds to play:");

        jScrollPane1.setPreferredSize(new java.awt.Dimension(100, 200));

        panelContainer1.setPreferredSize(new java.awt.Dimension(90, 0));

        javax.swing.GroupLayout panelContainer1Layout = new javax.swing.GroupLayout(panelContainer1);
        panelContainer1.setLayout(panelContainer1Layout);
        panelContainer1Layout.setHorizontalGroup(
            panelContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        panelContainer1Layout.setVerticalGroup(
            panelContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelContainer1);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(90, 0));

        panelContainer2.setPreferredSize(new java.awt.Dimension(90, 0));

        javax.swing.GroupLayout panelContainer2Layout = new javax.swing.GroupLayout(panelContainer2);
        panelContainer2.setLayout(panelContainer2Layout);
        panelContainer2Layout.setHorizontalGroup(
            panelContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );
        panelContainer2Layout.setVerticalGroup(
            panelContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(panelContainer2);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSounds)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(btnStop))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSounds)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed

        try {
            for (AudioClip sound : sounds) {
                sound.stop();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnStopActionPerformed
    
    private void playSound(java.awt.event.ActionEvent evt) {
        try {
            sounds[((indexedButton) evt.getSource()).getIndex()].play();
        } catch (Exception e) {
        }
    }
    
    private void ChooseFile(java.awt.event.ActionEvent evt) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "WAV files", "wav");
        chooser.setFileFilter(filter);
        if(chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                sounds[((indexedButton) evt.getSource()).getIndex()] = java.applet.Applet.newAudioClip(chooser.getSelectedFile().toURI().toURL());
                indexedButton btn = ((indexedButton) evt.getSource());
                btn.setText(chooser.getSelectedFile().getName().split("\\.(?=[^\\.]+$)")[0]);
            } catch (MalformedURLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        panelContainer1.removeAll();
        panelContainer2.removeAll();
        int selection = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        sounds = new AudioClip[selection];
        int ypos;
        
        for(int i = 0; i < selection; i++) {
            indexedButton btnPlay = new indexedButton("Play", i);
            indexedButton selectFile = new indexedButton(buttonText.toString() + (i+1), i);
            
            btnPlay.setSize(90, 30);
            selectFile.setSize(90, 30);
            ypos = i%2 == 0 ? i : i-1;
                btnPlay.setLocation(90, ypos*30);
                selectFile.setLocation(0, ypos*30);
            if(i%2 == 0) {
                panelContainer1.add(btnPlay);
                panelContainer1.add(selectFile);
            }
            else {
                panelContainer2.add(btnPlay);
                panelContainer2.add(selectFile);
            }
            btnPlay.addActionListener((java.awt.event.ActionEvent evt1) -> {
                playSound(evt1);
            });
            selectFile.addActionListener((java.awt.event.ActionEvent evt1) -> {
                ChooseFile(evt1);
            });
            
        }
        // Repaint & validate both jscrollpanels        
        Dimension d = new Dimension();
        d.setSize(90, selection*30);
        panelContainer1.setPreferredSize(d);
        panelContainer2.setPreferredSize(d);
        
        jScrollPane1.repaint();
        jScrollPane2.repaint();
        jScrollPane1.validate();
        jScrollPane2.validate();
        // Repaint & validate both panels
        panelContainer1.validate();
        panelContainer1.repaint();
        panelContainer2.validate();
        panelContainer2.repaint();
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//        AboutFrame about = new AboutFrame();
//        about.setVisible(true);
//        about.setLocationRelativeTo(null);
//        about.setAlwaysOnTop(true);
//        about.setAutoRequestFocus(true);
        JOptionPane.showMessageDialog(this, "Developed by:\nJonás Perusquía Morales", "About", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame main = new MainFrame();
                main.setVisible(true);
                main.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStop;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSounds;
    private javax.swing.JPanel panelContainer1;
    private javax.swing.JPanel panelContainer2;
    // End of variables declaration//GEN-END:variables
}
