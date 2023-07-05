import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Menu  extends JFrame {
    private JButton aumentarQtd;
    private JButton diminuirQtd;
    private JLabel labelTotalItens;
    private JLabel labelQtdProdutoAtual;
    String getLancheNome(Lanche lanche){
        return lanche.nome + " - R$ " + lanche.preco;
    }

    public Menu(Restaurante restaurante, Usuario usuario){
        setTitle("Mienu");
        setBounds(200, 100, 800, 535);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        int quantidadeProduto = 0;
        int quantidadeTotal = 0;

        ArrayList<Lanche> pedido = new ArrayList<>();


        Botao botaoVoltar = new Botao();
        botaoVoltar.setBounds(60, 440, 100, 50);

        Botao botaoNext = new Botao();
        botaoNext.setBounds(700, 50, 50, 50);

        Botao botaoOk = new Botao();
        botaoOk.setBounds(584, 122, 52, 55);

        Botao botaoImprimir = new Botao();
        botaoImprimir.setBounds(440, 0, 140, 40);

        String[] listaProdutos = Arrays.stream(restaurante.lanches.toArray()).map(n -> getLancheNome((Lanche) n)).toArray(String[]::new);

        JComboBox<String> dropdownProdutos = new JComboBox<>(listaProdutos);
        dropdownProdutos.setBounds(230, 120, 200, 30);

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
                new Total(restaurante, usuario, pedido).setVisible(true);
                dispose();
            }
        });

        botaoOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int quantidadeAadicionar = Integer.parseInt(labelQtdProdutoAtual.getText());
                String nomeProduto = listaProdutos[dropdownProdutos.getSelectedIndex()].split(" - ")[0];
                Lanche lanche = null;

                for (Lanche _lanche : restaurante.lanches) {
                    if (_lanche.nome.equals(nomeProduto)){
                        lanche = _lanche;
                    }

                }


                for (int i = 0; i < quantidadeAadicionar; i++) {
                    pedido.add(new Lanche(lanche.nome, lanche.preco));
                }

                labelTotalItens.setText("" + (pedido.size()));
                labelQtdProdutoAtual.setText("" + 0);

                System.out.println("adicionando " + labelQtdProdutoAtual.getText() + " á " + quantidadeTotal);
            }
        });

        aumentarQtd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelQtdProdutoAtual.setText("" + (Integer.parseInt(labelQtdProdutoAtual.getText())+1));
                System.out.println(quantidadeProduto);
            }
        });

        diminuirQtd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelQtdProdutoAtual.setText("" + (Integer.parseInt(labelQtdProdutoAtual.getText())-1));
                System.out.println(quantidadeProduto);
            }
        });

        botaoImprimir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Restaurante Esfihas Donatello");
                System.out.println("PRODUTO ................... PREÇO");
                System.out.println("Esfiha doce ............... R$ 13,00");
                System.out.println("Esfiha salgada ............ R$ 15,00");
                System.out.println("Mini pizza ................ R$ 22,00");
                System.out.println("Refrigerante .............. R$ 6,00");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            }
        });

        getContentPane().add(botaoVoltar);
        getContentPane().add(botaoNext);
        getContentPane().add(botaoOk);
        getContentPane().add(labelTotalItens);
        getContentPane().add(aumentarQtd);
        getContentPane().add(diminuirQtd);
        getContentPane().add(labelQtdProdutoAtual);
        getContentPane().add(botaoImprimir);
        getContentPane().add(dropdownProdutos);

        ImageIcon imagem = new ImageIcon("src/imagens/cardapio.png");
        Image imagemRedimensionada = imagem.getImage().getScaledInstance(800, 550, Image.SCALE_DEFAULT);
        ImageIcon imagemFinal = new ImageIcon(imagemRedimensionada);
        JLabel labelImagem = new JLabel(imagemFinal);
        labelImagem.setBounds(0,  0, 800, 500);

        getContentPane().add(labelImagem);
        labelImagem.setVisible(true);
    }

}

