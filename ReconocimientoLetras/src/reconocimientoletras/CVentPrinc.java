/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reconocimientoletras;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author johnny
 */
public class CVentPrinc extends javax.swing.JFrame {

    /**
     * Creates new form CVentPrinc
     */
    Dibujo objDibujo;
    public CVentPrinc() {
        initComponents();
         objDibujo= new Dibujo(this.pnlEntradaDibujo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlEntradaDibujo = new javax.swing.JPanel();
        cmdLimpiar = new javax.swing.JButton();
        cmdReconocer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dtgModelo = new javax.swing.JTable();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlEntradaDibujo.setBackground(java.awt.Color.white);
        pnlEntradaDibujo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlEntradaDibujo.setPreferredSize(new java.awt.Dimension(140, 140));
        pnlEntradaDibujo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlEntradaDibujoMousePressed(evt);
            }
        });
        pnlEntradaDibujo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlEntradaDibujoMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout pnlEntradaDibujoLayout = new javax.swing.GroupLayout(pnlEntradaDibujo);
        pnlEntradaDibujo.setLayout(pnlEntradaDibujoLayout);
        pnlEntradaDibujoLayout.setHorizontalGroup(
            pnlEntradaDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );
        pnlEntradaDibujoLayout.setVerticalGroup(
            pnlEntradaDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        cmdReconocer.setText("Reconocer");
        cmdReconocer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdReconocerActionPerformed(evt);
            }
        });

        jLabel1.setText("Dibuje Aqui la letra");

        dtgModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(dtgModelo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cmdLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdReconocer)
                                .addGap(522, 522, 522))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlEntradaDibujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(378, 378, 378))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlEntradaDibujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdLimpiar)
                    .addComponent(cmdReconocer))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-402)/2, (screenSize.height-334)/2, 402, 334);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:
        pnlEntradaDibujo.repaint();
        objDibujo.limpiar();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void pnlEntradaDibujoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEntradaDibujoMousePressed
        // TODO add your handling code here:
        objDibujo.obtenerCordenadas(evt);
    }//GEN-LAST:event_pnlEntradaDibujoMousePressed

    private void pnlEntradaDibujoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEntradaDibujoMouseDragged
        // TODO add your handling code here:
        objDibujo.pintar(evt);
    }//GEN-LAST:event_pnlEntradaDibujoMouseDragged

    private void cmdReconocerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdReconocerActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.setColumnCount(7);
        modelo.setRowCount(7);
        int matriz[][]=objDibujo.analizaGrafico();
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<7;j++)
            {
                System.out.print(matriz[i][j]+" ");
                if(matriz[i][j]==1)
                {      
                    modelo.setValueAt("X", i, j);
                }
            }
            System.out.println();
        }
        dtgModelo.setModel(modelo);
    }//GEN-LAST:event_cmdReconocerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CVentPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CVentPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CVentPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CVentPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CVentPrinc().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdReconocer;
    private javax.swing.JTable dtgModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlEntradaDibujo;
    // End of variables declaration//GEN-END:variables
}
