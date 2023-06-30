import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu  extends JFrame {
    private JButton aumentarQtd;
    private JButton diminuirQtd;
    private JLabel labelTotalItens;
    private JLabel labelQtdProdutoAtual;

    public Menu(){
        setTitle("Mienu");
        setBounds(200, 100, 800, 535);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Total telaTotal = new Total();
        int quantidadeProduto = 0;
        int quantidadeTotal = 0;


        Botao botaoVoltar = new Botao();
        botaoVoltar.setBounds(60, 440, 100, 50);

        Botao botaoNext = new Botao();
        botaoNext.setBounds(700, 50, 50, 50);

        Botao botaoOk = new Botao();
        botaoOk.setBounds(584, 122, 52, 55);


        //BOTOES DE AUMENTAR QNTD
        aumentarQtd = new Botao();
        aumentarQtd.setBounds(446, 125, 50, 50);

        //BOTOES DIMINUIR QTD
        diminuirQtd = new Botao();
        diminuirQtd.setBounds(154, 125, 50, 50);

        //LABELS MOSTRAR QUANTIDADE
        labelQtdProdutoAtual = new Label();
        labelQtdProdutoAtual.setBounds(535, 120, 60, 40);
        labelQtdProdutoAtual.setText("" + quantidadeProduto);

        labelTotalItens = new Label();
        labelTotalItens.setBounds(540, 380, 91, 64);
        labelTotalItens.setText("" + quantidadeTotal);


        botaoVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        botaoNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                telaTotal.setVisible(true);
                dispose();
            }
        });

        botaoOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelTotalItens.setText("" + (quantidadeProduto+quantidadeTotal));
                labelQtdProdutoAtual.setText("" + 0);

                System.out.println("adicionando " + quantidadeProduto + " á " + quantidadeTotal);
            }
        });

        aumentarQtd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelQtdProdutoAtual.setText("" + (quantidadeProduto+1));
                System.out.println(quantidadeProduto);
            }
        });

        diminuirQtd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelQtdProdutoAtual.setText("" + (quantidadeProduto-1));
                System.out.println(quantidadeProduto);
            }
        });


        getContentPane().add(botaoVoltar);
        getContentPane().add(botaoNext);
        getContentPane().add(botaoOk);
        getContentPane().add(labelTotalItens);
        getContentPane().add(aumentarQtd);
        getContentPane().add(diminuirQtd);
        getContentPane().add(labelQtdProdutoAtual);

        ImageIcon imagem = new ImageIcon("src/imagens/cardapio.png");
        Image imagemRedimensionada = imagem.getImage().getScaledInstance(800, 550, Image.SCALE_DEFAULT);
        ImageIcon imagemFinal = new ImageIcon(imagemRedimensionada);
        JLabel labelImagem = new JLabel(imagemFinal);
        labelImagem.setBounds(0,  0, 800, 500);

        getContentPane().add(labelImagem);
        labelImagem.setVisible(true);
    }

}

