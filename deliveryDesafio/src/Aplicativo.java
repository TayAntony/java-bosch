public class Aplicativo {
    public void start() {
        TelaInicio tela = new TelaInicio();
        tela.setVisible(true);

        CadastroRestaurantes restaurante = new CadastroRestaurantes();
        CadastroUsuarios usuarios = new CadastroUsuarios();


        tela.getBotaoCadastrarRestaurante().addActionListener(e -> restaurante.setVisible(true));
        tela.getBotaoCadastrarUsuario().addActionListener(e -> usuarios.setVisible(true));
        //tela.getBotaoFazerPedido().addActionListener(e -> restaurante.setVisible(true));

    }
}
