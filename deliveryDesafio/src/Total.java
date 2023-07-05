import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Total extends JFrame{
    public Total(Restaurante restaurante, Usuario usuario, ArrayList<Lanche> listaLanches){
        setTitle("Total");
        setBounds(200, 100, 800, 535);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Botao botaoVoltar = new Botao();
        botaoVoltar.setBounds(50, 430, 100, 50);

        Botao botaoImprimirNotaFiscal = new Botao();
        botaoImprimirNotaFiscal.setBounds(130, 305, 215, 40);
        botaoVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        Label nomeRestaurante = new Label();
        nomeRestaurante.setBounds(260, 70, 310, 45);
        nomeRestaurante.setText(restaurante.nome.toUpperCase());

        Label nomeCliente = new Label();
        nomeCliente.setBounds(200, 120, 310, 45);
        nomeCliente.setText(usuario.nome.toUpperCase());

        Label total = new Label();
        total.setBounds(150, 204, 293, 83);

        double totalPedido = 0;
        for (Lanche lanche : listaLanches) {
            totalPedido = lanche.preco + totalPedido;
        }
        total.setText("R$" + totalPedido + "0");

        double finalTotalPedido = totalPedido;
        botaoImprimirNotaFiscal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Nota fiscal de: " + restaurante.nome.toUpperCase());
                System.out.println("PRODUTO........................PREÇO");
                String indent = "...............................";
                for (Lanche lanche: listaLanches) {
                    String output = lanche.nome;
                    output += indent.substring(0, indent.length() - output.length());
                    System.out.println(output + "R$" + lanche.preco);
                }
                System.out.println("TOTAL..........................R$" + finalTotalPedido);
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            }
        });

        getContentPane().add(botaoVoltar);
        getContentPane().add(nomeRestaurante);
        getContentPane().add(nomeCliente);
        getContentPane().add(total);
        getContentPane().add(botaoImprimirNotaFiscal);

        ImageIcon imagem = new ImageIcon("src/imagens/total.png");
        Image imagemRedimensionada = imagem.getImage().getScaledInstance(800, 550, Image.SCALE_DEFAULT);
        ImageIcon imagemFinal = new ImageIcon(imagemRedimensionada);
        JLabel labelImagem = new JLabel(imagemFinal);
        labelImagem.setBounds(0,  0, 800, 500);

        getContentPane().add(labelImagem);

        labelImagem.setVisible(true);
    }
}
