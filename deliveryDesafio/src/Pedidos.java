import javax.swing.*;
import java.awt.*;

public class Pedidos extends JFrame {
    public Pedidos(){
        setTitle("Fazer pedido");
        setBounds(200, 100, 800, 535);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Botao botaoVoltar = new Botao();
        botaoVoltar.setBounds(40, 120, 100, 50);

        Botao botaoNext = new Botao();
        botaoNext.setBounds(700, 50, 50, 50);

        ImageIcon imagem = new ImageIcon("src/imagens/fazer_pedido.png");
        Image imagemRedimensionada = imagem.getImage().getScaledInstance(800, 550, Image.SCALE_DEFAULT);
        ImageIcon imagemFinal = new ImageIcon(imagemRedimensionada);
        JLabel labelImagem = new JLabel(imagemFinal);
        labelImagem.setBounds(0,  0, 800, 500);

        getContentPane().add(labelImagem);
        getContentPane().add(botaoVoltar);
        getContentPane().add(botaoNext);
    }



}
