import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a quantidade de alunos: ");
        int quantidade = sc.nextInt();

        int[] faixas = new int[4];
        //vetor para obter o numero de notas presentes em cada faixa sendo armazenadas nos indíces

        System.out.println("Entre com a nota dos alunos separadas por espaço: ");

        for (int i = 0; i < quantidade; i++) {
            double nota = sc.nextDouble(); //leitura contínua dos inteiros
            if (nota >= 0 && nota <= 2){
                faixas[0]++;
            } else if (nota >= 3 && nota <= 5){
                faixas[1]++;
            } else if (nota >= 6 && nota <= 8){
                faixas[2]++;
            } else if (nota >= 9 && nota <= 10){
                faixas[3]++;
            }
        }

        sc.close();

        System.out.println("0 − 2   | "+"*".repeat(faixas[0]));
        System.out.println("3 − 5   | "+"*".repeat(faixas[1]));
        System.out.println("6 − 8   | "+"*".repeat(faixas[2]));
        System.out.println("9 − 10  | "+"*".repeat(faixas[3]));

    }
}
