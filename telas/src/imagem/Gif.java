package imagem;

import javax.swing.*;
import java.awt.*;

public class Gif {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Janela com gif");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,500,400);

        ImageIcon gif = new ImageIcon("src/imagem/resources/yuumi-lol.gif");
        gif.setImage(gif.getImage().getScaledInstance(400,300, Image.SCALE_DEFAULT));

        JLabel labelGif = new JLabel(gif);
        frame.add(labelGif);
        frame.setVisible(true);
    }

}
