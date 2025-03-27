import java.util.Scanner;

public class Exercicio_1{
    public static void main(String[] args){
        Scanner ler=new Scanner(System.in);
        System.out.println("Entre com seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Entre com o ano que nasceu: ");
        Short anoNas = ler.nextShort();

        System.out.println("Entre com o ano atual: ");
        Short anoAtual = ler.nextShort();

        System.out.printf("%s, possui %d", nome, anoAtual - anoNas );

    }
}