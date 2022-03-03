
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela extends JFrame {

    //Construtor da classe
    public Tela() {
        //Criação da janela
        setTitle("Cadastro de funcionários");
        setSize(900, 500); //Largura, altura da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Fechar a janela ao clicar no x
        setLocation(200, 150); //Margem esquerda, acima
        setLayout(null);

        //Colocar conteúdos na janela
        JLabel labelNome; //Varíavel para armazenar o rótulo na memória
        labelNome = new JLabel("Nome:"); //O que vai aparecer
        labelNome.setSize(100, 30); //Largura, altura
        labelNome.setLocation(10, 10); //margem esquerda, acima
        add(labelNome);

        JTextField textNome;
        textNome = new JTextField();
        textNome.setSize(400, 30);
        textNome.setLocation(60, 10);
        add(textNome);

        JLabel labelEndereco; //Varíavel para armazenar o rótulo na memória
        labelEndereco = new JLabel("Endereço:"); //O que vai aparecer
        labelEndereco.setSize(100, 30); //Largura, altura
        labelEndereco.setLocation(10, 50); //margem esquerda, acima
        add(labelEndereco);

        JTextField textEndereco;
        textEndereco = new JTextField();
        textEndereco.setSize(500, 30);
        textEndereco.setLocation(80, 50);
        add(textEndereco);

    }

    public static void main(String[] args) {
        Tela t;
        t = new Tela();
        t.setVisible(true);
    }
}
