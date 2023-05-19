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


        //BOTOES DE AUMENTAR QNTD
        Botao aumentarXpeixe = new Botao();
        aumentarXpeixe.setBounds(517, 124, 50, 50);

        Botao aumentarBatata = new Botao();
        aumentarBatata.setBounds(517, 186, 50, 50);

        Botao aumentarSorvete = new Botao();
        aumentarSorvete.setBounds(517, 248, 50, 50);

        Botao aumentarRefrigerante = new Botao();
        aumentarRefrigerante.setBounds(517, 310, 50, 50);

        //BOTOES DIMINUIR QTD
        Botao diminuirXpeixe = new Botao();
        diminuirXpeixe.setBounds(83, 121, 50, 50);

        Botao diminuirBatata = new Botao();
        diminuirBatata.setBounds(83, 182, 50, 50);

        Botao diminuirSorvete = new Botao();
        diminuirSorvete.setBounds(83, 244, 50, 50);

        Botao diminuirRefrigerante = new Botao();
        diminuirRefrigerante.setBounds(83, 305, 50, 50);


        //LABELS MOSTRAR QUANTIDADE
        Label qtdXpeixe = new Label();
        qtdXpeixe.setBounds(583, 125, 60, 42);

        Label qtdSorvete = new Label();
        qtdSorvete.setBounds(583, 186, 60, 42);

        Label qtdBatata = new Label();
        qtdBatata.setBounds(583, 247, 60, 42);

        Label qtdRefrigerante = new Label();
        qtdRefrigerante.setBounds(583, 309, 60, 42);


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

        diminuirXpeixe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Diminuir peixe");
            }
        });

        diminuirBatata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Diminuir batata");
            }
        });

        diminuirSorvete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Diminuir sorvete");
            }
        });

        diminuirRefrigerante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Diminuir refri");
            }
        });

        aumentarXpeixe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("aumentar peixe");
            }
        });

        aumentarBatata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("aumentar batata");
            }
        });

        aumentarSorvete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("aumentar sorvete");
            }
        });

        aumentarRefrigerante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("aumentar refri");
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
        getContentPane().add(qtdSorvete);
        getContentPane().add(qtdRefrigerante);
        getContentPane().add(qtdBatata);

        getContentPane().add(botaoVoltar);
        getContentPane().add(botaoNext);
    }
}
