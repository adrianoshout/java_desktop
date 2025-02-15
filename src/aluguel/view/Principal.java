/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguel.view;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Adriano Melo
 */
public class Principal extends javax.swing.JFrame {
SimpleDateFormat formatador = new SimpleDateFormat ("dd/MM/yyyy");
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat ("dd/MM/yyyy");
        
        lblData.setText(formatador.format(data));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        desktop = new javax.swing.JDesktopPane();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuCadCliente = new javax.swing.JMenuItem();
        menuCadProduto = new javax.swing.JMenuItem();
        menuCadAluguel = new javax.swing.JMenuItem();
        menuCadUsuario = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuRelClientes = new javax.swing.JMenuItem();
        menuRelProdutos = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setText("Usuário");

        lblData.setText("Data");

        menuCadastro.setText("Cadastro");

        menuCadCliente.setText("Clientes");
        menuCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadCliente);

        menuCadProduto.setText("Produtos");
        menuCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadProdutoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadProduto);

        menuCadAluguel.setText("Aluguel");
        menuCadastro.add(menuCadAluguel);

        menuCadUsuario.setText("Usuários");
        menuCadUsuario.setEnabled(false);
        menuCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadUsuario);

        jMenuItem2.setText("OS");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuCadastro.add(jMenuItem2);

        jMenuBar1.add(menuCadastro);

        menuRelatorio.setText("Relatórios");
        menuRelatorio.setEnabled(false);

        menuRelClientes.setText("Clientes");
        menuRelatorio.add(menuRelClientes);

        menuRelProdutos.setText("Produtos");
        menuRelatorio.add(menuRelProdutos);

        jMenuBar1.add(menuRelatorio);

        menuAjuda.setText("Ajuda");

        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuAjuda.add(jMenuItem1);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuAjuda.add(menuSair);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblData)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblData)
                        .addGap(0, 298, Short.MAX_VALUE))
                    .addComponent(desktop))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // TODO add your handling code here:
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?","Atenção",JOptionPane.YES_NO_OPTION);
            if(sair == JOptionPane.YES_OPTION){
                System.exit(0);
            }
    }//GEN-LAST:event_menuSairActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        SobreApp sobre = new SobreApp();
        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadUsuarioActionPerformed
        // TODO add your handling code here:
        Usuario usuario = new Usuario();
        usuario.setVisible(true);
        desktop.add(usuario);
    }//GEN-LAST:event_menuCadUsuarioActionPerformed

    private void menuCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadClienteActionPerformed
        // TODO add your handling code here:
         Cliente cliente = new Cliente();
        cliente.setVisible(true);
        desktop.add(cliente);
    }//GEN-LAST:event_menuCadClienteActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        TelaOS os = new TelaOS();
        os.setVisible(true);
        desktop.add(os);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadProdutoActionPerformed
        // TODO add your handling code here:
        TelaProdutos p = new TelaProdutos();
        p.setVisible(true);
        desktop.add(p);
    }//GEN-LAST:event_menuCadProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuCadAluguel;
    public static javax.swing.JMenuItem menuCadCliente;
    private javax.swing.JMenuItem menuCadProduto;
    public static javax.swing.JMenuItem menuCadUsuario;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuRelClientes;
    private javax.swing.JMenuItem menuRelProdutos;
    public static javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenuItem menuSair;
    // End of variables declaration//GEN-END:variables
}
