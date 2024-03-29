/**
* 
* @author Miguel Maria Vazquez Martinez
* Fifth practice of module PMDM.
* 
*/

package View;

import java.awt.Desktop;
import java.net.URI;

public class AboutAppPanel extends javax.swing.JPanel {
    /**
     * This class content all the information about the application and his author.
     */
    public AboutAppPanel() {
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

        headerLabelAboutPanel = new javax.swing.JLabel();
        authoLabelAboutPanel = new javax.swing.JLabel();
        ccIconAboutPanel = new javax.swing.JLabel();
        ccLinkLabelAboutPanel = new javax.swing.JLabel();
        numberPracticeLabelAboutPanel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));

        headerLabelAboutPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerLabelAboutPanel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        headerLabelAboutPanel.setForeground(new java.awt.Color(0, 0, 0));
        headerLabelAboutPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabelAboutPanel.setText("DESARROLLADOR");
        headerLabelAboutPanel.setPreferredSize(new java.awt.Dimension(500, 30));

        authoLabelAboutPanel.setBackground(new java.awt.Color(255, 255, 255));
        authoLabelAboutPanel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        authoLabelAboutPanel.setForeground(new java.awt.Color(0, 0, 0));
        authoLabelAboutPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        authoLabelAboutPanel.setText("Miguel María Vázquez Martínez");
        authoLabelAboutPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        authoLabelAboutPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        authoLabelAboutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authoLabelAboutPanelMouseClicked(evt);
            }
        });

        ccIconAboutPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/ccIcon.png"))); // NOI18N
        ccIconAboutPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ccIconAboutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ccIconAboutPanelMouseClicked(evt);
            }
        });

        ccLinkLabelAboutPanel.setBackground(new java.awt.Color(255, 255, 255));
        ccLinkLabelAboutPanel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ccLinkLabelAboutPanel.setForeground(new java.awt.Color(0, 0, 0));
        ccLinkLabelAboutPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ccLinkLabelAboutPanel.setText("https://creativecommons.org/licenses/by-nc-nd/4.0/");
        ccLinkLabelAboutPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ccLinkLabelAboutPanel.setPreferredSize(new java.awt.Dimension(500, 30));
        ccLinkLabelAboutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ccLinkLabelAboutPanelMouseClicked(evt);
            }
        });

        numberPracticeLabelAboutPanel.setBackground(new java.awt.Color(255, 255, 255));
        numberPracticeLabelAboutPanel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        numberPracticeLabelAboutPanel.setForeground(new java.awt.Color(0, 0, 0));
        numberPracticeLabelAboutPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberPracticeLabelAboutPanel.setText("Práctica 05 - PMDM");
        numberPracticeLabelAboutPanel.setPreferredSize(new java.awt.Dimension(500, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ccLinkLabelAboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(headerLabelAboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(authoLabelAboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numberPracticeLabelAboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(ccIconAboutPanel)
                .addGap(255, 255, 255))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(headerLabelAboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(authoLabelAboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numberPracticeLabelAboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ccIconAboutPanel)
                .addGap(18, 18, 18)
                .addComponent(ccLinkLabelAboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void authoLabelAboutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authoLabelAboutPanelMouseClicked
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(new URI("https://www.linkedin.com/in/miguel-m-v%C3%A1zquez-mart%C3%ADnez-5b7079112/"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_authoLabelAboutPanelMouseClicked

    private void ccIconAboutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ccIconAboutPanelMouseClicked
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(new URI("https://creativecommons.org/licenses/by-nc-nd/4.0/"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ccIconAboutPanelMouseClicked

    private void ccLinkLabelAboutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ccLinkLabelAboutPanelMouseClicked
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(new URI("https://creativecommons.org/licenses/by-nc-nd/4.0/"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ccLinkLabelAboutPanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authoLabelAboutPanel;
    private javax.swing.JLabel ccIconAboutPanel;
    private javax.swing.JLabel ccLinkLabelAboutPanel;
    private javax.swing.JLabel headerLabelAboutPanel;
    private javax.swing.JLabel numberPracticeLabelAboutPanel;
    // End of variables declaration//GEN-END:variables
}
