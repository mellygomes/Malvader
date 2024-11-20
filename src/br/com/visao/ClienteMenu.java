package br.com.visao;

//@author User
import br.com.controle.Cliente;
import br.com.controle.Funcionario;
import br.com.controle.Usuario;
import br.com.util.SessaoUsuarioLogado;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ClienteMenu extends javax.swing.JFrame {
    private final Cliente userlogado;

//    public void setUserlogado(Cliente user) {
//        this.userlogado = user;
//    }
   
    public ClienteMenu(Cliente user) {
        this.userlogado = user;
        initComponents();
        
//        jLsaudacao.setText("Olá, " + this.userlogado.getNome_usuario());;
        
//        try {
//            SessaoUsuarioLogado sessao = new SessaoUsuarioLogado();
//            userlogado = sessao.buscarSessao();
//            if (userlogado instanceof Cliente) {
//                userlogado = (Cliente) userlogado;
//            } else {
//                System.out.println("usuário não é um cliente!");
//            }
//            
//        } catch (IOException ex) {
//            Logger.getLogger(ClienteMenu.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_cliente = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jBsaque = new javax.swing.JButton();
        jBdeposito = new javax.swing.JButton();
        jBconsultar = new javax.swing.JButton();
        jBlimite = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        jLsaldo = new javax.swing.JLabel();
        jTBmostrarsaldo = new javax.swing.JToggleButton();
        jMenu = new javax.swing.JMenuBar();
        jMenu_func = new javax.swing.JMenu();
        jMenu_cliente = new javax.swing.JMenu();
        jMenu_sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBsaque.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBsaque.setText("Saque");
        jBsaque.setMaximumSize(new java.awt.Dimension(80, 23));
        jBsaque.setMinimumSize(new java.awt.Dimension(80, 23));
        jBsaque.setName(""); // NOI18N
        jBsaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsaqueActionPerformed(evt);
            }
        });

        jBdeposito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBdeposito.setText("Depósito");
        jBdeposito.setName(""); // NOI18N

        jBconsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBconsultar.setText("Consultar");
        jBconsultar.setName(""); // NOI18N

        jBlimite.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBlimite.setText("Limite");
        jBlimite.setMaximumSize(new java.awt.Dimension(80, 23));
        jBlimite.setMinimumSize(new java.awt.Dimension(80, 23));
        jBlimite.setName(""); // NOI18N
        jBlimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimiteActionPerformed(evt);
            }
        });

        jBsair.setBackground(new java.awt.Color(255, 51, 51));
        jBsair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBsair.setForeground(new java.awt.Color(255, 255, 255));
        jBsair.setText("Sair");
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });

        jLsaldo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLsaldo.setForeground(new java.awt.Color(51, 0, 51));
        jLsaldo.setText("XXX");

        jTBmostrarsaldo.setText("Mostrar saldo");
        jTBmostrarsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBmostrarsaldoActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jBsaque, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBdeposito, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBconsultar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBlimite, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBsair, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLsaldo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTBmostrarsaldo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBdeposito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBlimite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBsaque, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTBmostrarsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLsaldo))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jBsair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLsaldo)
                .addGap(18, 18, 18)
                .addComponent(jTBmostrarsaldo)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBdeposito)
                    .addComponent(jBsaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBlimite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBconsultar))
                .addGap(18, 18, 18)
                .addComponent(jBsair)
                .addContainerGap(45, Short.MAX_VALUE))
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
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        // TODO add your handling code here:
        //ClienteMenu c = new ClienteMenu();
        //c.setVisible(true);
        //this.dispose();
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

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBsairActionPerformed

    private void jBsaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBsaqueActionPerformed

    private void jTBmostrarsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBmostrarsaldoActionPerformed
        AbstractButton abstractButton = (AbstractButton)evt.getSource();
        boolean selected = abstractButton.getModel().isSelected();
        if (selected) {
            String senha = JOptionPane.showInputDialog(jDesktopPane1, "Digite a senha de"
                + "usuário para vizializar o saldo.", "Confirmar usuário.", JOptionPane.INFORMATION_MESSAGE);
                
            if (this.userlogado.login(senha)) {                
                jLsaldo.setText(" "+ this.userlogado.consultarSaldo());
                jTBmostrarsaldo.setText("Ocultar saldo");
            } else {
                JOptionPane.showMessageDialog(jDesktopPane1, "Senha incorreta!", "Tente novamente.", JOptionPane.ERROR);
            }
        } else {
            jTBmostrarsaldo.setText("Mostrar saldo");
            jLsaldo.setText("XXX");
        }
        
    }//GEN-LAST:event_jTBmostrarsaldoActionPerformed

    private void jBlimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBlimiteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ClienteMenu(Cliente c).setVisible(true);
            }
        });        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG_cliente;
    private javax.swing.JButton jBconsultar;
    private javax.swing.JButton jBdeposito;
    private javax.swing.JButton jBlimite;
    private javax.swing.JButton jBsair;
    private javax.swing.JButton jBsaque;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLsaldo;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenu_cliente;
    private javax.swing.JMenu jMenu_func;
    private javax.swing.JMenu jMenu_sair;
    private javax.swing.JToggleButton jTBmostrarsaldo;
    // End of variables declaration//GEN-END:variables
}
