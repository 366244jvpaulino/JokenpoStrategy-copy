public class Spock implements Jogada {

    public String getNome() {
        return "Spock";
    }

    public String resultadoContra(Jogada oponente) {
        switch (oponente.getNome()) {
            case "Papel": return "PERDEU";
            case "Tesoura": return "GANHOU";
            case "Pedra": return "GANHOU";
            case "Lagarto": return "PERDEU";
            case "Spock": return "EMPATE";
            default: throw new IllegalArgumentException();
        }
    }

    public String getMensagem(Jogada oponente) {
        switch (oponente.getNome()) {
            case "Papel": return "Perdeu! Papel refuta o Spock!";
            case "Tesoura": return "Ganhou! Spock derrete a tesoura!";
            case "Pedra": return "Ganhou! Spock vaporiza a pedra!";
            case "Lagarto": return "Perdeu! Lagarto envenena o Spock!";
            case "Spock": return "Empatou! Spock empata com Spock!";
            default: throw new IllegalArgumentException();
        }
    }
}
