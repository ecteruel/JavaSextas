
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela extends JFrame implements ActionListener   {
    
    JLabel labelNome; 
    JTextField textNome;    
    JLabel labelEndereco; 
    JTextField textEndereco;
    JLabel labelCargo;
    JTextField textCargo;
    JLabel labelSalario;
    JTextField textSalario;
    JButton botaoSalvar; 
    JButton botaoSair;
        
    //Construtor da classe
    public Tela() {
        //Criação da janela
        setTitle("Cadastro de funcionários");
        setSize(600, 250); //Largura, altura da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Fechar a janela ao clicar no x
        setLocation(200, 150); //Margem esquerda, acima
        setLayout(null);

        //Colocar conteúdos na janela
        labelNome = new JLabel("Nome:"); //O que vai aparecer
        labelNome.setSize(100, 30); //Largura, altura
        labelNome.setLocation(10, 10); //margem esquerda, acima
        add(labelNome);

        textNome = new JTextField();
        textNome.setSize(400, 30);
        textNome.setLocation(80, 10);
        add(textNome);

        labelEndereco = new JLabel("Endereço:"); //O que vai aparecer
        labelEndereco.setSize(100, 30); //Largura, altura
        labelEndereco.setLocation(10, 50); //margem esquerda, acima
        add(labelEndereco);

        textEndereco = new JTextField();
        textEndereco.setSize(500, 30);
        textEndereco.setLocation(80, 50);
        add(textEndereco);
        
        labelCargo = new JLabel("Cargo:");
        labelCargo.setSize(80,30);
        labelCargo.setLocation(10,90);
        add(labelCargo);
        
        textCargo = new JTextField();
        textCargo.setSize(300,30);
        textCargo.setLocation(80,90);
        add(textCargo);

        labelSalario = new JLabel("Salário:");
        labelSalario.setSize(80,30);
        labelSalario.setLocation(10,130);
        add(labelSalario);
        
        textSalario = new JTextField();
        textSalario.setSize(200,30);
        textSalario.setLocation(80,130);
        add(textSalario);
        
        botaoSalvar = new JButton("Salvar");
        botaoSalvar.setSize(80,30);
        botaoSalvar.setLocation(10, 170);
        //Monitora o botão aguardando click e chama o método actionPerformed quando o click ocorre
        botaoSalvar.addActionListener(this);
        add(botaoSalvar);

        botaoSair = new JButton("Sair");
        botaoSair.setSize(80,30);
        botaoSair.setLocation(100,170);
        //Monitora o botão aguardando click e chama o método actionPerformed quando o click ocorre
        botaoSair.addActionListener(this); 
        add(botaoSair);
        
    }

    public static void main(String[] args) {
        Tela x;
        x = new Tela();
        x.setVisible(true);
    }

    //Toda vez que você clicar em um botão este método será executado
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==botaoSalvar){
          JOptionPane.showMessageDialog(null,"Clicou no Salvar");
        }else if(e.getSource()==botaoSair){
          JOptionPane.showMessageDialog(null,"Clicou no Sair");
          dispose();
        }
    }
}
