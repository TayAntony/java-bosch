import javax.swing.*;
import java.util.ArrayList;

public class Aplicativo {
    public void start() {
        ArrayList<Restaurante> listaRestaurantes = new ArrayList<>();
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        TelaInicio tela = new TelaInicio();
        tela.setVisible(true);

        CadastroRestaurantes restaurante = new CadastroRestaurantes(listaRestaurantes, listaUsuarios);
        CadastroUsuarios usuarios = new CadastroUsuarios(listaRestaurantes, listaUsuarios);

        tela.getBotaoCadastrarRestaurante().addActionListener(e -> restaurante.setVisible(true));

        tela.getBotaoCadastrarUsuario().addActionListener(e -> usuarios.setVisible(true));

        tela.getBotaoFazerPedido().addActionListener(e -> new Pedidos(listaRestaurantes, listaUsuarios).setVisible(true));

    }
}
