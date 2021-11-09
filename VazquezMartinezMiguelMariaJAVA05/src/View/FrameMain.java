/**
* 
* @author Miguel Maria Vazquez Martinez
* Fifth practice of module PMDM.
* 
*/

package View;

import javax.swing.JPanel;
import javax.swing.UIManager;

public class FrameMain extends javax.swing.JFrame {

    public FrameMain() {
        /**
         * The constructor init all the components and show the information panel
         * by default.
         */
        initComponents();
        changeJPanel(infoPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        listMenuButton = new javax.swing.JMenu();
        navMenuButton = new javax.swing.JMenu();
        aboutMenuButton = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(600, 530));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 530));

        menuBar.setBackground(new java.awt.Color(255, 255, 255));
        menuBar.setBorder(null);
        menuBar.setForeground(new java.awt.Color(0, 0, 0));
        menuBar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        menuBar.setMinimumSize(new java.awt.Dimension(185, 40));
        menuBar.setPreferredSize(new java.awt.Dimension(185, 40));

        listMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/listIcon.png"))); // NOI18N
        listMenuButton.setText("Listar");
        listMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMenuButtonMouseClicked(evt);
            }
        });
        menuBar.add(listMenuButton);

        navMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/navIcon.png"))); // NOI18N
        navMenuButton.setText("Navegar");
        navMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navMenuButtonMouseClicked(evt);
            }
        });
        menuBar.add(navMenuButton);

        aboutMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/infoIcon.png"))); // NOI18N
        aboutMenuButton.setText("Información");
        aboutMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMenuButtonMouseClicked(evt);
            }
        });
        menuBar.add(aboutMenuButton);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMenuButtonMouseClicked
        /**
         * When the list button of the menu bar has been clicked this method
         * change to ListPanel.
         */
        changeJPanel(new ListPanel());
    }//GEN-LAST:event_listMenuButtonMouseClicked

    private void navMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navMenuButtonMouseClicked
        /**
         * When the navigation button of the menu bar has been clicked this method
         * change to NavigationPanel.
         */
        changeJPanel(new NavigationPanel());
    }//GEN-LAST:event_navMenuButtonMouseClicked

    private void aboutMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuButtonMouseClicked
        /**
         * When the list button of the menu bar has been clicked this method
         * change to AboutAppPanel.
         */
        changeJPanel(infoPanel);
    }//GEN-LAST:event_aboutMenuButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception E){
        
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }
    
    private void changeJPanel(JPanel auxPanel){
        /**
         * This method change the current panel with the new panel which recieve
         * as a parameter.
         * 
         * @param auxPanel
         */
        this.setContentPane(auxPanel);
        pack();
    }

    private AboutAppPanel infoPanel = new AboutAppPanel();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenuButton;
    private javax.swing.JMenu listMenuButton;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu navMenuButton;
    // End of variables declaration//GEN-END:variables
}
