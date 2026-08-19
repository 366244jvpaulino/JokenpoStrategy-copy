import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha uma das opcoes [ 1-PAPEL, 2-TESOURA, 3-PEDRA, 4-LAGARTO, 5-SPOCK ]\n");
        int escolha = in.nextInt();

        Jogada[] opcoes = { new Papel(), new Tesoura(), new Pedra(), new Lagarto(), new Spock() };

        Jogada jogadorJogada = opcoes[escolha - 1];
        Jogada computadorJogada = opcoes[new Random().nextInt(5)];

        System.out.println("O COMPUTADOR escolheu: " + computadorJogada.getNome());
        System.out.println("Voce escolheu: " + jogadorJogada.getNome());
        System.out.println(jogadorJogada.getMensagem(computadorJogada));

        in.close();
    }
}
