public class Pedra implements Jogada {

    public String getNome() {
        return "Pedra";
    }

    public String resultadoContra(Jogada oponente) {
        switch (oponente.getNome()) {
            case "Papel": return "PERDEU";
            case "Tesoura": return "GANHOU";
            case "Pedra": return "EMPATE";
            case "Lagarto": return "GANHOU";
            case "Spock": return "PERDEU";
            default: throw new IllegalArgumentException();
        }
    }

    public String getMensagem(Jogada oponente) {
        switch (oponente.getNome()) {
            case "Papel": return "Perdeu! Papel embrulha a pedra!";
            case "Tesoura": return "Ganhou! Pedra quebra a tesoura!";
            case "Pedra": return "Empatou! Pedra empata com pedra!";
            case "Lagarto": return "Ganhou! Pedra esmaga o lagarto!";
            case "Spock": return "Perdeu! Spock vaporiza a pedra!";
            default: throw new IllegalArgumentException();
        }
    }
}
