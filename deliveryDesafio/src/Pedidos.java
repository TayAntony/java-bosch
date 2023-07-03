import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pedidos extends JFrame {
    public Pedidos(){
        setTitle("Fazer pedido");
        setBounds(200, 100, 800, 535);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Menu menu = new Menu();

        String[] listaClientes = {"tayssa antoniasse", "viktor marinho", "raissa rossi"};
        String[] listaRestaurantes = {"Burguer king", "mc donalds", "esfihas donatello"};

        JComboBox<String> dropdownClientes = new JComboBox<>(listaClientes);
        dropdownClientes.setBounds(105, 250, 200, 30);

        JComboBox<String> dropdownRestaurantes = new JComboBox<>(listaRestaurantes);
        dropdownRestaurantes.setBounds(495, 250, 200, 30);

        Botao botaoVoltar = new Botao();
        botaoVoltar.setBounds(40, 120, 100, 50);

        Botao botaoNext = new Botao();
        botaoNext.setBounds(700, 50, 50, 50);

        botaoVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        botaoNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                menu.setVisible(true);
                dispose();
            }
        });

        ImageIcon imagem = new ImageIcon("src/imagens/fazer_pedido.png");
        Image imagemRedimensionada = imagem.getImage().getScaledInstance(800, 550, Image.SCALE_DEFAULT);
        ImageIcon imagemFinal = new ImageIcon(imagemRedimensionada);
        JLabel labelImagem = new JLabel(imagemFinal);
        labelImagem.setBounds(0,  0, 800, 500);

        getContentPane().add(dropdownClientes);
        getContentPane().add(dropdownRestaurantes);
        getContentPane().add(labelImagem);
        getContentPane().add(botaoVoltar);
        getContentPane().add(botaoNext);
    }
}
