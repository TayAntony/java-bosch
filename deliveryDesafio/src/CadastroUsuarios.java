import javax.swing.*;
import java.awt.*;

public class CadastroUsuarios extends JFrame {
    private JTextField campoNome;
    private JTextField campoCpf;
    private JTextField campoEndereco;
    private JButton botaoCadastrar;
    public CadastroUsuarios() {
        setTitle("Cadastro de usuários");
        setBounds(200, 100, 800, 535);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);


        campoNome = new JTextField(20);
        campoNome.setBounds(200, 400, 300, 50);

        campoCpf = new JTextField(14);
        campoCpf.setBounds(200, 500, 300, 50);

        campoEndereco = new JTextField(14);
        campoEndereco.setBounds(240, 500, 260, 50);


        botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBounds(120, 280, 100, 100);
        //botaoCadastrar.setOpaque(false);
        //botaoCadastrar.setContentAreaFilled(false);
        //botaoCadastrar.setBorderPainted(false);

        ImageIcon imagem = new ImageIcon("src/imagens/cadastrar_usuario.png");
        Image imagemRedimensionada = imagem.getImage().getScaledInstance(800, 550, Image.SCALE_DEFAULT);
        ImageIcon imagemFinal = new ImageIcon(imagemRedimensionada);
        JLabel labelImagem = new JLabel(imagemFinal);
        labelImagem.setBounds(0,  0, 800, 500);
        getContentPane().add(labelImagem);

        labelImagem.setVisible(true);
    }

}
