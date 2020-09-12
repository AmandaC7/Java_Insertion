import java.sql.SQLOutput;
import java.util.Scanner;

public class exer1 {
    public static void main(String[] args){
        System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva seu nome");
        String nome = scan.nextLine();
        System.out.println("Seu nome é: " + nome);
        System.out.println("Escreva dois números " + nome);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Seu primeiro número escolhido foi: " + a);
        System.out.println("Seu segundo número escolhido foi: " + b);
        System.out.println("Escreva um double");
        double d = scan.nextDouble();
        System.out.print("O double escolhido foi: " + d);




    }

}



