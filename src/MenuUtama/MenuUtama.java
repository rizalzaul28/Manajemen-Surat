/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MenuUtama;

import MenuView.MenuDashboard;
import MenuView.SubSuratKeluar;
import MenuView.SubSuratMasuk;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class MenuUtama extends javax.swing.JFrame {

    public MenuUtama() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        execute();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_navbar = new javax.swing.JPanel();
        jPG3Hor1 = new jpg3hor.JPG3Hor();
        pn_sidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pn_Menu = new javax.swing.JPanel();
        pn_content = new javax.swing.JPanel();
        pn_Utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_navbar.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPG3Hor1Layout = new javax.swing.GroupLayout(jPG3Hor1);
        jPG3Hor1.setLayout(jPG3Hor1Layout);
        jPG3Hor1Layout.setHorizontalGroup(
            jPG3Hor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        jPG3Hor1Layout.setVerticalGroup(
            jPG3Hor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_navbarLayout = new javax.swing.GroupLayout(pn_navbar);
        pn_navbar.setLayout(pn_navbarLayout);
        pn_navbarLayout.setHorizontalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPG3Hor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_navbarLayout.setVerticalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPG3Hor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pn_navbar, java.awt.BorderLayout.PAGE_START);

        pn_sidebar.setBackground(new java.awt.Color(0, 0, 255));
        pn_sidebar.setPreferredSize(new java.awt.Dimension(300, 698));

        jScrollPane1.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setBorder(null);

        pn_Menu.setBackground(new java.awt.Color(0, 0, 255));
        pn_Menu.setLayout(new javax.swing.BoxLayout(pn_Menu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pn_Menu);

        javax.swing.GroupLayout pn_sidebarLayout = new javax.swing.GroupLayout(pn_sidebar);
        pn_sidebar.setLayout(pn_sidebarLayout);
        pn_sidebarLayout.setHorizontalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        pn_sidebarLayout.setVerticalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );

        getContentPane().add(pn_sidebar, java.awt.BorderLayout.LINE_START);

        pn_content.setBackground(new java.awt.Color(255, 255, 255));
        pn_content.setLayout(new java.awt.BorderLayout());

        pn_Utama.setLayout(new java.awt.BorderLayout());
        pn_content.add(pn_Utama, java.awt.BorderLayout.CENTER);

        getContentPane().add(pn_content, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1382, 776));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pn_Utama.add(new MenuDashboard());
        pn_Utama.repaint();
        pn_Utama.revalidate();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jpg3hor.JPG3Hor jPG3Hor1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_Menu;
    private javax.swing.JPanel pn_Utama;
    private javax.swing.JPanel pn_content;
    private javax.swing.JPanel pn_navbar;
    private javax.swing.JPanel pn_sidebar;
    // End of variables declaration//GEN-END:variables
    private void execute() {

        //Icon Menu Utama
        ImageIcon iconDashboard             = new ImageIcon(getClass().getResource("/Gambar/iconDashboard.png"));
        ImageIcon iconSurat                 = new ImageIcon(getClass().getResource("/Gambar/iconSurat.png"));
        ImageIcon iconLogout                = new ImageIcon(getClass().getResource("/Gambar/iconLogout.png"));

        //Icon Sub Menu
        ImageIcon iconsubSuratMasuk         = new ImageIcon(getClass().getResource("/Gambar/iconSuratMasuk.png"));
        ImageIcon iconsubSuratKeluar        = new ImageIcon(getClass().getResource("/Gambar/iconSuratKeluar.png"));

        //Mengeksekusi Sub Menu
        MenuItem menuSubSuratMasuk          = new MenuItem(null, true, iconsubSuratMasuk, "Surat Masuk", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_Utama.removeAll();
                pn_Utama.add(new SubSuratMasuk());
                pn_Utama.repaint();
                pn_Utama.revalidate();
            }
        });

        MenuItem menuSubSuratKeluar         = new MenuItem(null, true, iconsubSuratKeluar, "Surat Keluar", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_Utama.removeAll();
                pn_Utama.add(new SubSuratKeluar());
                pn_Utama.repaint();
                pn_Utama.revalidate();
            }
        });

        //Mengeksekusi Menu Utama
        MenuItem menuDashboard              = new MenuItem(iconDashboard, false, null, "Dashboard", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_Utama.removeAll();
                pn_Utama.add(new MenuDashboard());
                pn_Utama.repaint();
                pn_Utama.revalidate();
            }
        });

        MenuItem menuSurat                  = new MenuItem(iconSurat, false, null, "Persuratan", null, menuSubSuratMasuk, menuSubSuratKeluar);

        MenuItem menuLogout                 = new MenuItem(iconLogout, false, null, "Logout", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        
        addMenu(menuDashboard, menuSurat, menuLogout);

    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            pn_Menu.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        pn_Menu.revalidate();
    }
}
