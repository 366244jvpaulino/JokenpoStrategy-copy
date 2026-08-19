public class Papel implements Jogada {

    public String getNome() {
        return "Papel";
    }

    public String resultadoContra(Jogada oponente) {
        switch (oponente.getNome()) {
            case "Papel": return "EMPATE";
            case "Tesoura": return "PERDEU";
            case "Pedra": return "GANHOU";
            case "Lagarto": return "PERDEU";
            case "Spock": return "GANHOU";
            default: throw new IllegalArgumentException();
        }
    }

    public String getMensagem(Jogada oponente) {
        switch (oponente.getNome()) {
            case "Papel": return "Empate. Papel empata com papel!";
            case "Tesoura": return "Perdeu! Tesoura corta o papel!";
            case "Pedra": return "Ganhou! Pedra embrulha o papel!";
            case "Lagarto": return "Perdeu! Lagarto come o papel!";
            case "Spock": return "Ganhou! Papel refuta o Spock!";
            default: throw new IllegalArgumentException();
        }
    }
}
