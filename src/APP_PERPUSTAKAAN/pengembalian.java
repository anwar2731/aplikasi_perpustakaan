/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APP_PERPUSTAKAAN;

/**
 *
 * @author ASUS TUF GAMING
 */
public class pengembalian extends javax.swing.JFrame {

    /**
     * Creates new form pengembalian
     */
    public pengembalian() {
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

        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id_s = new javax.swing.JTextField();
        id_b = new javax.swing.JTextField();
        tgl = new javax.swing.JTextField();
        id_s2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 900));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 20, 710, 120);

        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        jButton3.setText("DASBORD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 190, 170, 60);

        jButton10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        jButton10.setText("DATA ANGGOTA");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(20, 270, 170, 60);

        jButton11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        jButton11.setText("DATA BUKU");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(20, 350, 170, 60);

        jButton12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        jButton12.setText("PEMINJAMAN");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(20, 430, 170, 60);

        jButton13.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        jButton13.setText("PENGEMBALIAN");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(20, 510, 170, 60);

        jToggleButton2.setText("LOGOUT");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(10, 800, 140, 30);

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 13)); // NOI18N
        jButton1.setText("PROFIL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(940, 110, 120, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(270, 160, 750, 160);

        jLabel3.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 18)); // NOI18N
        jLabel3.setText("ID_Siswa");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 440, 100, 40);

        jLabel6.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 18)); // NOI18N
        jLabel6.setText("ID_Buku");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 490, 130, 50);

        jLabel5.setFont(new java.awt.Font("Swis721 WGL4 BT", 1, 18)); // NOI18N
        jLabel5.setText("TGL_Pengembalian");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 540, 120, 50);

        id_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_sActionPerformed(evt);
            }
        });
        getContentPane().add(id_s);
        id_s.setBounds(460, 440, 240, 40);

        id_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_bActionPerformed(evt);
            }
        });
        getContentPane().add(id_b);
        id_b.setBounds(460, 490, 240, 40);

        tgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglActionPerformed(evt);
            }
        });
        getContentPane().add(tgl);
        tgl.setBounds(460, 540, 240, 40);

        id_s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_s2ActionPerformed(evt);
            }
        });
        getContentPane().add(id_s2);
        id_s2.setBounds(760, 290, 240, 40);

        jButton2.setText("TAMBAH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(680, 660, 100, 50);

        jButton6.setText("SIMPAN");
        getContentPane().add(jButton6);
        jButton6.setBounds(780, 660, 100, 50);

        jButton5.setText("EDIT");
        getContentPane().add(jButton5);
        jButton5.setBounds(880, 660, 70, 50);

        jButton4.setText("HAPUS");
        getContentPane().add(jButton4);
        jButton4.setBounds(950, 660, 90, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/halaman.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1070, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
         pengembalian m = new pengembalian();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          profil m = new profil();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       dasbord m = new dasbord();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         siswa m = new siswa();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         buku m = new buku();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       peminjaman m = new peminjaman();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void id_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_sActionPerformed

    private void id_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_bActionPerformed

    private void tglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglActionPerformed

    private void id_s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_s2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_s2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_b;
    private javax.swing.JTextField id_s;
    private javax.swing.JTextField id_s2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField tgl;
    // End of variables declaration//GEN-END:variables
}
