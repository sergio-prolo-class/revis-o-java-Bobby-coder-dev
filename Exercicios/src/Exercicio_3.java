import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos: ");
        int alunos = sc.nextInt();
        System.out.println("Entre com as notas separadas dos alunos: ");
        String snotas = sc.nextLine();

        String[] vnotas = snotas.split(" ");

        System.out.println("0 - 2  |");
        for (int i = 0; i < alunos; i++) {
            int nota = Integer.parseInt(vnotas[i]);
            if (nota >= 0 && nota <= 2) {
                System.out.print(nota);
                System.out.println(" ");
            }
        }

        System.out.println("3 - 5  |");
        for (int i = 0; i < alunos; i++) {
            int nota = Integer.parseInt(vnotas[i]);
            if (nota >= 3 && nota <= 5) {
                System.out.print(nota);
                System.out.println(" ");
            }
        }

        System.out.println("6 - 8  |");
        for (int i = 0; i < alunos; i++) {
            int nota = Integer.parseInt(vnotas[i]);
            if (nota >= 6 && nota <= 8) {
                System.out.print(nota);
                System.out.println(" ");
            }
        }

        System.out.println("9 - 10  |");
        for (int i = 0; i < alunos; i++) {
            int nota = Integer.parseInt(vnotas[i]);
            if (nota >= 9 && nota <= 10) {
                System.out.print(nota);
                System.out.println(" ");
            }
        }




    }
}
