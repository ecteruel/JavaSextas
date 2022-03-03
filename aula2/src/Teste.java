
import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        //Declarando a varíavel (reservar espaço na memória)  

        String nome;
        String endereco;
        byte idade;
        double salario; 
        //Entrando com dados na varíavel na memória
        nome = JOptionPane.showInputDialog("Qual seu nome?");
        endereco = JOptionPane.showInputDialog("Qual seu endereço?");
        idade = Byte.parseByte(JOptionPane.showInputDialog("Qual sua idade?"));
        salario = Float.parseFloat(JOptionPane.showInputDialog("Qual seu salário?"));
        //Exibindo os dados que estão na varíavel nome na memória 
        JOptionPane.showMessageDialog(null, "Olá " + nome + ", boa noite!");
        JOptionPane.showMessageDialog(null, "Você mora na rua " + endereco);
        JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos");
        JOptionPane.showMessageDialog(null, "Seu salário é " + salario);
        salario = salario * 1.20;
        JOptionPane.showMessageDialog(null, "Seu salário reajustado é " + salario);
        
    } 

}
