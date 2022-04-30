package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaMenu extends javax.swing.JFrame {

    //construtor da classe
    public TelaMenu() {
        initComponents();
    }

    public TelaMenu(String usuario, String cargo) {
        initComponents();
        pnlProdutos.setVisible(false);
        lblSaudacao.setText("Bem-vindo(a), " + usuario + "(" + cargo + ")");
        if (cargo.equalsIgnoreCase("estagiário") | cargo.equalsIgnoreCase("estagiario")) {
            itmConsultarProdutos.setEnabled(true);
            itmCadastrarProdutos.setEnabled(false);
            itmConsultarFuncionarios.setEnabled(true);
            itmCadastrarFuncionarios.setEnabled(false);
            desativar();
        } else if (cargo.equalsIgnoreCase("vendedor")) {
            itmConsultarProdutos.setEnabled(true);
            itmCadastrarProdutos.setEnabled(true);
            itmConsultarFuncionarios.setEnabled(true);
            itmCadastrarFuncionarios.setEnabled(true);
            desativar();
        } else if (cargo.equalsIgnoreCase("gerente")) {
            itmConsultarProdutos.setEnabled(true);
            itmCadastrarProdutos.setEnabled(true);
            itmAlterarProdutos.setEnabled(true);
            itmExcluirProdutos.setEnabled(true);
            itmConsultarFuncionarios.setEnabled(true);
            itmCadastrarFuncionarios.setEnabled(true);
            itmAlterarFuncionarios.setEnabled(true);
            itmExcluirFuncionarios.setEnabled(true);
        } else {
            mnuFuncionarios.setEnabled(false);
        }
    }

    //Desativadas para estagiário e vendedor
    private void desativar() {
        itmAlterarProdutos.setEnabled(false);
        itmExcluirProdutos.setEnabled(false);
        itmAlterarFuncionarios.setEnabled(false);
        itmExcluirFuncionarios.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaudacao = new javax.swing.JLabel();
        pnlProdutos = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        barMenu = new javax.swing.JMenuBar();
        mnuProdutos = new javax.swing.JMenu();
        itmCadastrarProdutos = new javax.swing.JMenuItem();
        itmAlterarProdutos = new javax.swing.JMenuItem();
        itmConsultarProdutos = new javax.swing.JMenuItem();
        itmExcluirProdutos = new javax.swing.JMenuItem();
        mnuFuncionarios = new javax.swing.JMenu();
        itmCadastrarFuncionarios = new javax.swing.JMenuItem();
        itmAlterarFuncionarios = new javax.swing.JMenuItem();
        itmConsultarFuncionarios = new javax.swing.JMenuItem();
        itmExcluirFuncionarios = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        itmManual = new javax.swing.JMenuItem();

        setTitle("Menu do sistema");
        getContentPane().setLayout(null);
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(440, 0, 250, 40);

        pnlProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle de produtos"));
        pnlProdutos.setLayout(null);

        lblCodigo.setText("Código:");
        pnlProdutos.add(lblCodigo);
        lblCodigo.setBounds(50, 40, 90, 30);
        pnlProdutos.add(txtCodigo);
        txtCodigo.setBounds(150, 40, 160, 30);

        lblNome.setText("Nome:");
        pnlProdutos.add(lblNome);
        lblNome.setBounds(50, 90, 90, 30);
        pnlProdutos.add(txtNome);
        txtNome.setBounds(150, 90, 420, 30);

        lblMarca.setText("Marca:");
        pnlProdutos.add(lblMarca);
        lblMarca.setBounds(50, 140, 90, 30);
        pnlProdutos.add(txtMarca);
        txtMarca.setBounds(150, 140, 280, 30);

        lblPreco.setText("Preço:");
        pnlProdutos.add(lblPreco);
        lblPreco.setBounds(50, 190, 90, 30);
        pnlProdutos.add(txtPreco);
        txtPreco.setBounds(150, 190, 110, 30);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlProdutos.add(btnSalvar);
        btnSalvar.setBounds(50, 240, 120, 30);

        getContentPane().add(pnlProdutos);
        pnlProdutos.setBounds(30, 20, 670, 300);

        mnuProdutos.setMnemonic('P');
        mnuProdutos.setText("Produtos");

        itmCadastrarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarProdutos.setText("Cadastrar");
        itmCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmCadastrarProdutos);

        itmAlterarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarProdutos.setText("Alterar");
        mnuProdutos.add(itmAlterarProdutos);

        itmConsultarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmConsultarProdutos.setText("Consultar");
        mnuProdutos.add(itmConsultarProdutos);

        itmExcluirProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirProdutos.setText("Excluir");
        mnuProdutos.add(itmExcluirProdutos);

        barMenu.add(mnuProdutos);

        mnuFuncionarios.setMnemonic('F');
        mnuFuncionarios.setText("Funcionários");

        itmCadastrarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarFuncionarios.setText("Cadastrar");
        mnuFuncionarios.add(itmCadastrarFuncionarios);

        itmAlterarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarFuncionarios.setText("Alterar");
        mnuFuncionarios.add(itmAlterarFuncionarios);

        itmConsultarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmConsultarFuncionarios.setText("Consultar");
        mnuFuncionarios.add(itmConsultarFuncionarios);

        itmExcluirFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirFuncionarios.setText("Excluir");
        mnuFuncionarios.add(itmExcluirFuncionarios);

        barMenu.add(mnuFuncionarios);

        mnuAjuda.setMnemonic('u');
        mnuAjuda.setText("Ajuda");

        itmManual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmManual.setText("Manual de Instruções");
        mnuAjuda.add(itmManual);

        barMenu.add(mnuAjuda);

        setJMenuBar(barMenu);

        setSize(new java.awt.Dimension(734, 405));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarProdutosActionPerformed
        pnlProdutos.setVisible(true);
    }//GEN-LAST:event_itmCadastrarProdutosActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            //Conexão com o BD
            Connection conecta;
            PreparedStatement st;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conecta = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsistema", "root", "teruel");
            //Salva os dados dos campos da tela na tabela produtos do BD
            st = conecta.prepareStatement("INSERT INTO produtos VALUES(?,?,?,?)");
            st.setString(1, txtCodigo.getText());
            st.setString(2, txtNome.getText());
            st.setString(3, txtMarca.getText());
            st.setDouble(4, Double.parseDouble(txtPreco.getText().replace("," , ".")));
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto salvo com sucesso");
            //Limpar os campos
            txtCodigo.setText("");
            txtNome.setText("");
            txtMarca.setText("");
            txtPreco.setText("");
            txtCodigo.requestFocus();
            //Fecha a conexão com o Banco de dados
            conecta.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O Driver não foi encontrado na library " + ex.getMessage());
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) { //Tentativa de duplicação de chave primária (código)
                JOptionPane.showMessageDialog(null, "Este código de produto já está cadastrado");
            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema e informe o código:" + ex.getErrorCode());
            }
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JMenuItem itmAlterarFuncionarios;
    private javax.swing.JMenuItem itmAlterarProdutos;
    private javax.swing.JMenuItem itmCadastrarFuncionarios;
    private javax.swing.JMenuItem itmCadastrarProdutos;
    private javax.swing.JMenuItem itmConsultarFuncionarios;
    private javax.swing.JMenuItem itmConsultarProdutos;
    private javax.swing.JMenuItem itmExcluirFuncionarios;
    private javax.swing.JMenuItem itmExcluirProdutos;
    private javax.swing.JMenuItem itmManual;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuProdutos;
    private javax.swing.JPanel pnlProdutos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
