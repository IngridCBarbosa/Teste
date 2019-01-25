package stringquestao1;

import java.util.Scanner;

public class Stringquestao1 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String nome;
        int qtdVogais;
        System.out.print("Digite um nome:");
        nome = enter.nextLine();
        qtdVogais = vogais(nome);
        System.out.println("A quantidade de vogai do nome é: " + qtdVogais);
    }

    public static int vogais(String n) {
        int i, j;
        int cont = 0;
        int TAM = n.length();
        char[] v = {'a', 'e', 'i', 'o', 'u'};
        for (i = 0; i < TAM; i++) {
            for (j = 0; j < TAM; j++) {
                if (v[i] == n.charAt(j)) {
                    cont++;
                }
            }
        }
        return cont;
    }
}
