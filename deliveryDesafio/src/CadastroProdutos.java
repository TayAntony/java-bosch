import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroProdutos extends JFrame {

    private JTextField campoNome;
    private JTextField campoPreco;
    public CadastroProdutos() {
        setTitle("Cadastro de produtos");
        setBounds(200, 100, 800, 535);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Pedidos pedidos = new Pedidos();

        Font fonte = new Font("Arial", Font.BOLD, 24);

        campoNome = new JTextField(20);
        campoNome.setBounds(150, 205, 300, 45);
        campoNome.setFont(fonte);

        campoPreco = new JTextField(14);
        campoPreco.setBounds(150, 280, 300, 45);
        campoPreco.setFont(fonte);

        Botao botaoCadastrar = new Botao();
        botaoCadastrar.setBounds(550, 280, 80, 80);

        Botao botaoPedir = new Botao();
        botaoPedir.setBounds(60, 440, 100, 50);

        ImageIcon imagem = new ImageIcon("src/imagens/cadastrar_produto.png");
        Image imagemRedimensionada = imagem.getImage().getScaledInstance(800, 550, Image.SCALE_DEFAULT);
        ImageIcon imagemFinal = new ImageIcon(imagemRedimensionada);
        JLabel labelImagem = new JLabel(imagemFinal);
        labelImagem.setBounds(0,  0, 800, 500);
        getContentPane().add(labelImagem);

        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("cadastrando produto");
            }
        });

        botaoPedir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                pedidos.setVisible(true);
                dispose();
            }
        });


        getContentPane().add(campoPreco);
        getContentPane().add(campoNome);
        getContentPane().add(botaoCadastrar);
        getContentPane().add(botaoPedir);

        labelImagem.setVisible(true);
    }

}
