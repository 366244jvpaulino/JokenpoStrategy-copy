public class Tesoura implements Jogada {

    public String getNome() {
        return "Tesoura";
    }

    public String resultadoContra(Jogada oponente) {
        switch (oponente.getNome()) {
            case "Papel": return "GANHOU";
            case "Tesoura": return "EMPATE";
            case "Pedra": return "PERDEU";
            case "Lagarto": return "GANHOU";
            case "Spock": return "PERDEU";
            default: throw new IllegalArgumentException();
        }
    }

    public String getMensagem(Jogada oponente) {
        switch (oponente.getNome()) {
            case "Papel": return "Ganhou! Tesoura corta o papel!";
            case "Tesoura": return "Empate! Tesoura empata com tesoura!";
            case "Pedra": return "Perdeu! Pedra quebra a tesoura!";
            case "Lagarto": return "Ganhou! Tesoura decapta o lagarto!";
            case "Spock": return "Perdeu! Spock derrete a tesoura!";
            default: throw new IllegalArgumentException();
        }
    }
}
