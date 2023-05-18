import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu  extends JFrame {
    public Menu(){
        setTitle("Mienu");
        setBounds(200, 100, 800, 535);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);


        Botao botaoVoltar = new Botao();
        botaoVoltar.setBounds(60, 440, 100, 50);

        Botao botaoNext = new Botao();
        botaoNext.setBounds(700, 50, 50, 50);

        Botao aumentarXpeixe = new Botao();
        aume
        Botao aumentarBatata = new Botao();
        Botao aumentarSorvete = new Botao();
        Botao aumentarRefrigerante = new Botao();

        Botao diminuirXpeixe = new Botao();
        Botao diminuirBatata = new Botao();
        Botao diminuirSorvete = new Botao();
        Botao diminuirRefrigerante = new Botao();

        Label qtdXpeixe = new Label();
        qtdXpeixe.setBounds(600, 100, 30, 30);

        botaoVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        botaoNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.out.println("redirecionar para total");
            }
        });

        ImageIcon imagem = new ImageIcon("src/imagens/cardapio.png");
        Image imagemRedimensionada = imagem.getImage().getScaledInstance(800, 550, Image.SCALE_DEFAULT);
        ImageIcon imagemFinal = new ImageIcon(imagemRedimensionada);
        JLabel labelImagem = new JLabel(imagemFinal);
        labelImagem.setBounds(0,  0, 800, 500);

        getContentPane().add(labelImagem);

        getContentPane().add(aumentarBatata);
        getContentPane().add(aumentarSorvete);
        getContentPane().add(aumentarRefrigerante);
        getContentPane().add(aumentarXpeixe);
        getContentPane().add(diminuirBatata);
        getContentPane().add(diminuirSorvete);
        getContentPane().add(diminuirRefrigerante);
        getContentPane().add(diminuirXpeixe);
        getContentPane().add(qtdXpeixe);

        getContentPane().add(botaoVoltar);
        getContentPane().add(botaoNext);
    }
}
