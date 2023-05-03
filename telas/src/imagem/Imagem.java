package imagem;

import javax.swing.*;
import java.awt.*;

public class Imagem {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de imagem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,900,600);

        ImageIcon imagem = new ImageIcon("src/imagem/resources/yuumi.jpg");
        imagem.setImage(imagem.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT));
        JLabel labelImagem = new JLabel(imagem);

        frame.add(labelImagem);
        frame.setVisible(true);
    }
}
