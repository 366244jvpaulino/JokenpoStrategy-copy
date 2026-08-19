public interface Jogada {
    String getNome();
    String resultadoContra(Jogada oponente);
    String getMensagem(Jogada oponente);
}
