package teste;

import java.util.Scanner;

public class ListaAluno{
    public static void main(final String args[]) {
        int cont = 0;
        int menu;
        final Scanner ler;
        final Aluno[] lista = new Aluno[15];
        while (menu < 1) {
            System.out.println("MENU:");
            System.out.println("1 - Adicionar nome");
            System.out.println("2 - Ver a lista");
            System.out.println("3 - Sair");
            menu = Integer.parseInt(ler.nextLine());
            switch (menu) {
                case 1:
                    lista[cont].setNome(ler.nextLine());
                    cont++;
                    break;
                case 2:
                    for (int i = 0; i <= cont; i++) {
                        System.out.printf("%s\n", Aluno.getNome[i]);
                    }
                    final String pausa = ler.nextLine();
                    break;
                case 3:
                    menu = 1;
                    break;
            }
        }
        
    }
}