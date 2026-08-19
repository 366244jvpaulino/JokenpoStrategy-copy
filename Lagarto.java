public class Lagarto implements Jogada {

    public String getNome() {
        return "Lagarto";
    }

    public String resultadoContra(Jogada oponente) {
        switch (oponente.getNome()) {
            case "Papel": return "GANHOU";
            case "Tesoura": return "PERDEU";
            case "Pedra": return "PERDEU";
            case "Lagarto": return "EMPATE";
            case "Spock": return "GANHOU";
            default: throw new IllegalArgumentException();
        }
    }

    public String getMensagem(Jogada oponente) {
        switch (oponente.getNome()) {
            case "Papel": return "Ganhou! Lagarto come o papel!";
            case "Tesoura": return "Perdeu! Tesoura decapta o lagarto!";
            case "Pedra": return "Perdeu! Pedra esmaga o lagarto!";
            case "Lagarto": return "Empatou! Lagarto empata com lagarto!";
            case "Spock": return "Ganhou! Lagarto envenena o Spock!";
            default: throw new IllegalArgumentException();
        }
    }
}
