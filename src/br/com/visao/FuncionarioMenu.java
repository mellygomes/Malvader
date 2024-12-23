/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.visao;

import javax.swing.JFrame;

//public class UserSingleton {
//    
//    static UserSingleton sharedInstance = UserSingleton();
//    
//    private UserSingleton() {
//        
//    }
//    
//    User loggedUser;
//}

/**
 *
 * @author User
 */
public class FuncionarioMenu extends javax.swing.JFrame {

    /**
     * Creates new form funcionario
     */
    public FuncionarioMenu() {
        initComponents();
        
        //UserSingleton.sharedInstance.loggedUser = new User();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GB_funcionario = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLerro = new javax.swing.JLabel();
        jRB_abertura = new javax.swing.JRadioButton();
        jRB_encerramento = new javax.swing.JRadioButton();
        jRB_consulta = new javax.swing.JRadioButton();
        jRB_cadastro = new javax.swing.JRadioButton();
        jRB_gerar_relatorio = new javax.swing.JRadioButton();
        jRBsair = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jMenu = new javax.swing.JMenuBar();
        jMenu_func = new javax.swing.JMenu();
        jMenu_cliente = new javax.swing.JMenu();
        jMenu_sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Funcionário");

        jLerro.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLerro.setForeground(new java.awt.Color(255, 255, 255));

        GB_funcionario.add(jRB_abertura);
        jRB_abertura.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jRB_abertura.setForeground(new java.awt.Color(255, 255, 255));
        jRB_abertura.setText("Abertura de Conta");
        jRB_abertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_aberturaActionPerformed(evt);
            }
        });

        GB_funcionario.add(jRB_encerramento);
        jRB_encerramento.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jRB_encerramento.setForeground(new java.awt.Color(255, 255, 255));
        jRB_encerramento.setText("Encerramento de Conta");
        jRB_encerramento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_encerramentoActionPerformed(evt);
            }
        });

        GB_funcionario.add(jRB_consulta);
        jRB_consulta.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jRB_consulta.setForeground(new java.awt.Color(255, 255, 255));
        jRB_consulta.setText("Consulta de Dados");
        jRB_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_consultaActionPerformed(evt);
            }
        });

        GB_funcionario.add(jRB_cadastro);
        jRB_cadastro.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jRB_cadastro.setForeground(new java.awt.Color(255, 255, 255));
        jRB_cadastro.setText("Cadastro de Funcionário");
        jRB_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_cadastroActionPerformed(evt);
            }
        });

        GB_funcionario.add(jRB_gerar_relatorio);
        jRB_gerar_relatorio.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jRB_gerar_relatorio.setForeground(new java.awt.Color(255, 255, 255));
        jRB_gerar_relatorio.setText("Geração de Relatórios ");

        GB_funcionario.add(jRBsair);
        jRBsair.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jRBsair.setForeground(new java.awt.Color(255, 51, 0));
        jRBsair.setText("Sair");
        jRBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBsairActionPerformed(evt);
            }
        });

        GB_funcionario.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Alterar Dados");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLerro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRB_abertura, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRB_encerramento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRB_consulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRB_cadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRB_gerar_relatorio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRBsair, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLerro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRBsair)
                    .addComponent(jRB_cadastro)
                    .addComponent(jRB_encerramento)
                    .addComponent(jRB_consulta)
                    .addComponent(jRB_gerar_relatorio)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jRB_abertura)))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jRB_abertura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRB_encerramento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRB_consulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRB_cadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRB_gerar_relatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRBsair)
                .addGap(23, 23, 23)
                .addComponent(jLerro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_funcMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu_funcMenuSelected
        FuncionarioMenu f = new FuncionarioMenu();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu_funcMenuSelected

    private void jMenu_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_funcActionPerformed

    }//GEN-LAST:event_jMenu_funcActionPerformed

    private void jMenu_clienteMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu_clienteMenuSelected
//        ClienteMenu c = new ClienteMenu();
//        c.setVisible(true);
//        this.dispose();
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

    private void jRBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBsairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jRBsairActionPerformed

    private void jRB_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_cadastroActionPerformed
        // TODO add your handling code here:
        CadFuncionario c = new CadFuncionario();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jRB_cadastroActionPerformed

    private void jRB_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_consultaActionPerformed
        // TODO add your handling code here:
        //        cliente c = new cliente();
        //        c.setVisible(true);
        //        this.dispose();
    }//GEN-LAST:event_jRB_consultaActionPerformed

    private void jRB_encerramentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_encerramentoActionPerformed
        EncerramentoConta frame = new EncerramentoConta();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jRB_encerramentoActionPerformed

    private void jRB_aberturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_aberturaActionPerformed
        // TODO add your handling code here:
        AberturaConta a = new AberturaConta();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jRB_aberturaActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        AlterarDados a = new AlterarDados();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionarioMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GB_funcionario;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLerro;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenu_cliente;
    private javax.swing.JMenu jMenu_func;
    private javax.swing.JMenu jMenu_sair;
    private javax.swing.JRadioButton jRB_abertura;
    private javax.swing.JRadioButton jRB_cadastro;
    private javax.swing.JRadioButton jRB_consulta;
    private javax.swing.JRadioButton jRB_encerramento;
    private javax.swing.JRadioButton jRB_gerar_relatorio;
    private javax.swing.JRadioButton jRBsair;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
