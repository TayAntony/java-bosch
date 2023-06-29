import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Total extends JFrame{
    public Total(){
        setTitle("Total");
        setBounds(200, 100, 800, 535);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Botao botaoVoltar = new Botao();
        botaoVoltar.setBounds(50, 430, 100, 50);
        botaoVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        Label nomeRestaurante = new Label();
        nomeRestaurante.setBounds(260, 70, 310, 45);
        nomeRestaurante.setText("Restaurante da tay");

        Label nomeCliente = new Label();
        nomeCliente.setBounds(200, 120, 310, 45);
        nomeCliente.setText("Tayssa Antoniasse");

        Label total = new Label();
        total.setBounds(150, 204, 293, 83);
        total.setText("R$ 32,00");



        getContentPane().add(botaoVoltar);
        getContentPane().add(nomeRestaurante);
        getContentPane().add(nomeCliente);
        getContentPane().add(total);

        ImageIcon imagem = new ImageIcon("src/imagens/total.png");
        Image imagemRedimensionada = imagem.getImage().getScaledInstance(800, 550, Image.SCALE_DEFAULT);
        ImageIcon imagemFinal = new ImageIcon(imagemRedimensionada);
        JLabel labelImagem = new JLabel(imagemFinal);
        labelImagem.setBounds(0,  0, 800, 500);

        getContentPane().add(labelImagem);

        labelImagem.setVisible(true);
    }
}
