/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.visao;

import br.com.controle.Cliente;
import br.com.entidade.ClienteDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Lista extends javax.swing.JFrame {

    /**
     * Creates new form Lista
     */
    public Lista() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTlista = new javax.swing.JTable();
        jTlistar = new javax.swing.JToggleButton();
        jMenu = new javax.swing.JMenuBar();
        jMenu_func = new javax.swing.JMenu();
        jMenu_cliente = new javax.swing.JMenu();
        jMenu_sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTlista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "CPF", "Numero"
            }
        ));
        jScrollPane1.setViewportView(jTlista);

        jTlistar.setText("Listar");
        jTlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTlistarActionPerformed(evt);
            }
        });

        jMenu_func.setText("Funcionário");
        jMenu_func.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu_funcMenuSelected(evt);
            }
        });
        jMenu_func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_funcActionPerformed(evt);
            }
        });
        jMenu.add(jMenu_func);

        jMenu_cliente.setText("Cliente");
        jMenu_cliente.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu_clienteMenuSelected(evt);
            }
        });
        jMenu_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_clienteActionPerformed(evt);
            }
        });
        jMenu.add(jMenu_cliente);

        jMenu_sair.setText("Sair");
        jMenu_sair.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu_sairMenuSelected(evt);
            }
        });
        jMenu_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_sairActionPerformed(evt);
            }
        });
        jMenu.add(jMenu_sair);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTlistar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_funcMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu_funcMenuSelected
        // TODO add your handling code here:
        FuncionarioMenu f = new FuncionarioMenu();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu_funcMenuSelected

    private void jMenu_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_funcActionPerformed

    }//GEN-LAST:event_jMenu_funcActionPerformed

    private void jMenu_clienteMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu_clienteMenuSelected
        // TODO add your handling code here:
        ClienteMenu c = new ClienteMenu();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu_clienteMenuSelected

    private void jMenu_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu_clienteActionPerformed

    private void jMenu_sairMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu_sairMenuSelected
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu_sairMenuSelected

    private void jMenu_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_sairActionPerformed

    }//GEN-LAST:event_jMenu_sairActionPerformed

    private void jTlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTlistarActionPerformed
        // TODO add your handling code here:
         try {
        ClienteDAO cd = new ClienteDAO();
        Cliente c = new Cliente();        
        DefaultTableModel usuariopesque = (DefaultTableModel) jTlista.getModel();  
        {
        ArrayList<Cliente> clientes = cd.findByall("user"); // Substitua "username" pelo valor real. 
        for (int i = 0; i < clientes.size(); i++) {                
            c = clientes.get(i);
            usuariopesque.addRow(new Object[]{c.getId_usuario(),c.getNome_usuario(),
                c.getCpf_usuario(),c.getNascimento_usuario()});
                }
            }
        }
       catch (Exception e){
            System.out.println("Erro " + e.getMessage());
       }   
    }//GEN-LAST:event_jTlistarActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenu_cliente;
    private javax.swing.JMenu jMenu_func;
    private javax.swing.JMenu jMenu_sair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTlista;
    private javax.swing.JToggleButton jTlistar;
    // End of variables declaration//GEN-END:variables
}
