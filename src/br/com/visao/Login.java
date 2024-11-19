package br.com.visao;

import br.com.controle.Cliente;
import br.com.controle.Funcionario;
import br.com.entidade.ClienteDAO;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

//@author User
public class Login extends javax.swing.JFrame {

    //Creates new form tela
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bGtipo = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBlogin = new javax.swing.JButton();
        jTusuario = new javax.swing.JTextField();
        jLerro = new javax.swing.JLabel();
        jRfuncionario = new javax.swing.JRadioButton();
        jRcliente = new javax.swing.JRadioButton();
        jPsenha = new javax.swing.JPasswordField();
        jBcadastrar = new javax.swing.JButton();
        jMenu = new javax.swing.JMenuBar();
        jMenu_func = new javax.swing.JMenu();
        jMenu_cliente = new javax.swing.JMenu();
        jMenu_sair = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(600, 300));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Banco Malvader");

        jLabel1.setText("Usuário");

        jLabel2.setText("Senha");

        jBlogin.setText("Login");
        jBlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBloginActionPerformed(evt);
            }
        });

        jTusuario.setColumns(4);

        bGtipo.add(jRfuncionario);
        jRfuncionario.setText("Funcionário");

        bGtipo.add(jRcliente);
        jRcliente.setText("Cliente");

        jBcadastrar.setText("Cadastrar");
        jBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBlogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTusuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLerro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRfuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRcliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPsenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBcadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLerro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(100, 100, 100)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTusuario)
                                    .addComponent(jPsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel4))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jRfuncionario)
                                .addGap(85, 85, 85)
                                .addComponent(jRcliente))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jBcadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jTusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jPsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRfuncionario)
                    .addComponent(jRcliente))
                .addGap(41, 41, 41)
                .addComponent(jBlogin)
                .addGap(18, 18, 18)
                .addComponent(jBcadastrar)
                .addGap(60, 60, 60)
                .addComponent(jLerro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void jBloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBloginActionPerformed
        if (jRfuncionario.isSelected()) {
            Funcionario f = new Funcionario();
            f.setUser_usuario(jTusuario.getText());
            f.setTipo_usuario("FUNCIONARIO");
            
            boolean login = f.login(String.valueOf(jPsenha.getPassword()));

            if (login) {
                FuncionarioMenu ftela = new FuncionarioMenu();
                ftela.setVisible(true);                
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "O login falhou! Verifique a senha e usuário inserido.");
            }

        } else if (jRcliente.isSelected()) {
            Cliente c = new Cliente();
            c.setUser_usuario(jTusuario.getText());
            c.setTipo_usuario("CLIENTE");
            boolean login = c.login(String.valueOf(jPsenha.getPassword()));
            
            if (login) {                
                try {
                    Cliente clientelogado = ClienteDAO.findByUser(c.getUser_usuario());
                    ClienteMenu ftela = new ClienteMenu(clientelogado);                    
                    ftela.setVisible(true);
                    this.dispose();
                    
                } catch (Exception ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "O login falhou! Verifique a senha e usuário inserido.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar o tipo de usuário!");
        }

        bGtipo.clearSelection();
        jTusuario.setText("");
        jPsenha.setText("");
        jTusuario.requestFocus();
    }//GEN-LAST:event_jBloginActionPerformed

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

    private void jMenu_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_funcActionPerformed

    }//GEN-LAST:event_jMenu_funcActionPerformed

    private void jMenu_funcMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu_funcMenuSelected
        // TODO add your handling code here:
        FuncionarioMenu f = new FuncionarioMenu();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu_funcMenuSelected

    private void jBcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastrarActionPerformed
        CadCliente cad = new CadCliente();
        cad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBcadastrarActionPerformed

    //@param args the command line arguments
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });  
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGtipo;
    private javax.swing.JButton jBcadastrar;
    private javax.swing.JButton jBlogin;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLerro;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenu_cliente;
    private javax.swing.JMenu jMenu_func;
    private javax.swing.JMenu jMenu_sair;
    private javax.swing.JPasswordField jPsenha;
    private javax.swing.JRadioButton jRcliente;
    private javax.swing.JRadioButton jRfuncionario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTusuario;
    // End of variables declaration//GEN-END:variables
}
