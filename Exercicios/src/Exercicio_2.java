public class Exercicio_2 {
    public static void main(String[] args) {
        int nota1 = Integer.parseInt(args[0]);
        int nota2 = Integer.parseInt(args[1]);
        int partcipacao = Integer.parseInt(args[2]);
        int peso1 = 2;
        int peso2 = 3;

        double cf1 = ((nota1 * peso1) + (nota2 * peso2))/(peso1 + peso2) * 0.9;
        double cf2 = partcipacao * 0.1;
        double cf = cf1 + cf2;


        System.out.println(cf);
        if (cf >= 6){
            System.out.println("Aprovado com sucesso!");
        } else {
            System.out.println("Sinto Muito, Reprovado!");
        }
    }
}
