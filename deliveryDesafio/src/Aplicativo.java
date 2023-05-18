import javax.swing.*;

public class Aplicativo {
    public void start() {
        TelaInicio tela = new TelaInicio();
        tela.setVisible(true);

        CadastroRestaurantes restaurante = new CadastroRestaurantes();
        CadastroUsuarios usuarios = new CadastroUsuarios();
        Pedidos pedidos = new Pedidos();

        Menu menu = new Menu();



        tela.getBotaoCadastrarRestaurante().addActionListener(e -> restaurante.setVisible(true));

        tela.getBotaoCadastrarUsuario().addActionListener(e -> usuarios.setVisible(true));

        tela.getBotaoFazerPedido().addActionListener(e -> pedidos.setVisible(true));

        //tela.getBotaoFazerPedido().addActionListener(e -> menu.setVisible(true));

    }
}
