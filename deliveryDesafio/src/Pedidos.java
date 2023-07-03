import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Pedidos extends JFrame {
    String getNome(Restaurante restaurante){
        return restaurante.nome;
    }
    String getUsuarioNome(Usuario usuario){
        return usuario.nome;
    }

    public Pedidos(ArrayList<Restaurante> listaRestaurante, ArrayList<Usuario> listaUsuario){

        setTitle("Fazer pedido");
        setBounds(200, 100, 800, 535);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        String[] listaClientes = Arrays.stream(listaUsuario.toArray()).map(n -> getUsuarioNome((Usuario) n)).toArray(String[]::new);
        String[] listaRestaurantes = Arrays.stream(listaRestaurante.toArray()).map(n -> getNome((Restaurante) n)).toArray(String[]::new);

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

                new Menu().setVisible(true);
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
