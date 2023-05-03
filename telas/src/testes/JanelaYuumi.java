package testes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import java.io.File;

import javax.swing.*;
import java.awt.*;

public class JanelaYuumi {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.getContentPane().setBackground(Color.BLACK);
        janela.setBounds(300, 300, 700, 400);
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton botao1 = new JButton("Clique aqui");
        botao1.setBounds(350, 100, 100, 50);
        botao1.setBackground(Color.MAGENTA);

        JButton botao2 = new JButton("Agora aqui");
        botao2.setBounds(50, 150, 100, 50);
        botao2.setBackground(Color.cyan);
        botao2.setForeground(Color.black);
        botao2.setVisible(false);

        JButton botao3 = new JButton("Peixinho, peixinho");
        botao3.setBounds(350, 300, 200, 50);
        botao3.setBackground(Color.green);
        botao3.setForeground(Color.black);
        botao3.setVisible(false);

        Media video = new Media(new File("caminho/do/video.mp4").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(video);

        ImageIcon imagem = new ImageIcon("src/testes/resources/yuumi.jpg"); //definindo qual arquivo é a imagem
        imagem.setImage(imagem.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT));  //redimensionando a imagem
        JLabel labelImagem = new JLabel(imagem); //enviando a nova imagem redimencionada para a label

        labelImagem.setVisible(true);
        janela.add(botao1);
        janela.add(botao2);
        janela.add(botao3);
        janela.add(labelImagem);

        botao1.addActionListener(e -> botao2.setVisible(true));
        botao1.addActionListener(e -> botao1.setVisible(false));
        botao2.addActionListener(e -> botao3.setVisible(true));
        botao2.addActionListener(e -> botao2.setVisible(false));
        botao3.addActionListener(e -> botao3.setVisible(false));
        botao3.addActionListener(e -> labelImagem.setVisible(true));

        labelImagem.setVisible(true);
        janela.setVisible(true);


    }

}
