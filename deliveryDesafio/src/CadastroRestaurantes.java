import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroRestaurantes extends JFrame {

    private JTextField campoNome;
    private JTextField campoCnpj;
    private JTextField campoEndereco;
    public CadastroRestaurantes() {
        setTitle("Cadastro de restaurantes");
        setBounds(200, 100, 800, 535);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        CadastroProdutos produtos = new CadastroProdutos();

        Font fonte = new Font("Arial", Font.BOLD, 24);

        campoNome = new JTextField(20);
        campoNome.setBounds(150, 205, 300, 45);
        campoNome.setFont(fonte);

        campoCnpj = new JTextField(14);
        campoCnpj.setBounds(150, 280, 300, 45);
        campoCnpj.setFont(fonte);

        campoEndereco = new JTextField(14);
        campoEndereco.setBounds(200, 350, 250, 45);
        campoEndereco.setFont(fonte);

        Botao botaoCadastrar = new Botao();
        botaoCadastrar.setBounds(550, 280, 80, 80);

        Botao botaoVoltar = new Botao();
        botaoVoltar.setBounds(60, 440, 100, 50);

        ImageIcon imagem = new ImageIcon("src/imagens/cadastrar_restaurante.png");
        Image imagemRedimensionada = imagem.getImage().getScaledInstance(800, 550, Image.SCALE_DEFAULT);
        ImageIcon imagemFinal = new ImageIcon(imagemRedimensionada);
        JLabel labelImagem = new JLabel(imagemFinal);
        labelImagem.setBounds(0,  0, 800, 500);
        getContentPane().add(labelImagem);

        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                produtos.setVisible(true);
            }
        });

        botaoVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        botaoVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        getContentPane().add(campoCnpj);
        getContentPane().add(campoNome);
        getContentPane().add(campoEndereco);
        getContentPane().add(botaoCadastrar);
        getContentPane().add(botaoVoltar);

        labelImagem.setVisible(true);
    }

}
