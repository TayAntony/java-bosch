package funçoes;

public class Equacoes {
    public double posicao_final;
    public double equacao_tempo;
    public double equacao_tempo_segundos;

    public void equacao(int posicao_a, int posicao_b, int velocidade_a, int velocidade_b) {
        Start contas = new Start();

        equacao_tempo = (double)(posicao_a - posicao_b) / (velocidade_b - velocidade_a);

        posicao_final = (posicao_a + velocidade_a * equacao_tempo);

        equacao_tempo_segundos = equacao_tempo*3600;

        System.out.printf("A colisão dos trens acontecerá no KM %.0f e ocorrerá após %.0f segundos\n", posicao_final, equacao_tempo_segundos);

    }
}
