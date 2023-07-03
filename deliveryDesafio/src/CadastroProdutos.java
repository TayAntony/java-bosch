import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CadastroProdutos extends JFrame {

    private JTextField campoNome;
    private JTextField campoPreco;
    public CadastroProdutos(ArrayList<Restaurante> listaRestaurante, ArrayList<Usuario> listaUsuario, Restaurante restauranteSelecionado) {
        setTitle("Cadastro de produtos");
        setBounds(200, 100, 800, 535);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Font fonte = new Font("Arial", Font.BOLD, 24);
        Font fonteAviso = new Font("Arial", Font.ITALIC, 12);

        campoNome = new JTextField(20);
        campoNome.setBounds(150, 205, 300, 45);
        campoNome.setFont(fonte);

        campoPreco = new JTextField(14);
        campoPreco.setBounds(150, 280, 300, 45);
        campoPreco.setFont(fonte);

        JLabel aviso = new JLabel();
        aviso.setText("Produto cadastrado com sucesso!");
        aviso.setBounds(150, 330, 200, 20);
        aviso.setFont(fonteAviso);
        aviso.setForeground(Color.GREEN);
        aviso.setVisible(false);


        Botao botaoCadastrar = new Botao();
        botaoCadastrar.setBounds(550, 280, 80, 80);

        Botao botaoPedir = new Botao();
        botaoPedir.setBounds(60, 440, 100, 50);

        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                String preco = campoPreco.getText();

                System.out.println("produto cadastrado com sucesso");
                restauranteSelecionado.lanches.add(new Lanche(nome, Double.parseDouble(preco)));
                aviso.setVisible(true);

                campoNome.setText("");
                campoPreco.setText("");

                Timer timer = new Timer(1500, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        aviso.setVisible(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        });

        botaoPedir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Pedidos(listaRestaurante, listaUsuario).setVisible(true);
                dispose();
            }
        });

        getContentPane().add(campoPreco);
        getContentPane().add(campoNome);
        getContentPane().add(botaoCadastrar);
        getContentPane().add(botaoPedir);
        getContentPane().add(aviso);

        ImageIcon imagem = new ImageIcon("src/imagens/cadastrar_produto.png");
        Image imagemRedimensionada = imagem.getImage().getScaledInstance(800, 550, Image.SCALE_DEFAULT);
        ImageIcon imagemFinal = new ImageIcon(imagemRedimensionada);
        JLabel labelImagem = new JLabel(imagemFinal);
        labelImagem.setBounds(0,  0, 800, 500);
        getContentPane().add(labelImagem);

        labelImagem.setVisible(true);
    }

}
