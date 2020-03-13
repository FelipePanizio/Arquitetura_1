package teste;

import java.util.Scanner;

public class ListaAluno{

    private static Scanner ler;
    private static Aluno[] lista;
    private static int cont=0;

/*Ideialmente um codigo dessa complexidade nao nescessita de classes adicionais, porem nao mudamos a estrutura original do projeto */
    public static void main(final String args[]) { /* O codigo presente na main estava muito grande, portanto dividimos o codigo em funcoes, facilitando a manutencao, legibilidade e tornando-o mais eficiente. */ 
        
        /* int cont = 0;
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
        } */

        lista = new Aluno[15];
        ler = new Scanner(System.in);
        mostraMenu(0);

    }
/*Inicio dos metodos*/ 
    public static void mostraMenu(int menu) {
        while (menu < 1) {
            System.out.println("MENU:");
            System.out.println("1 - Adicionar nome");
            System.out.println("2 - Ver a lista");
            System.out.println("3 - Sair");
            menu = Integer.parseInt(ler.nextLine());
            switch (menu) {
                case 1:
                    lerNome(lista[cont]);
                    break;
                case 2:
                    lerLista(lista[cont]);
                    break;
                case 3:
                    menu = 1;
                    break;
            }
        }
    } 

    public static void lerNome(Aluno[] lista) {
        lista[cont].setNome(ler.nextLine());
        cont++;
    }

    public static void lerLista(Aluno[] lista) {
        for (int i = 0; i <= cont; i++) {
            System.out.printf("%s\n", lista[cont].getNome);
        }
        final String pausa = ler.nextLine();
    }
/*Fim dos metodos*/
}