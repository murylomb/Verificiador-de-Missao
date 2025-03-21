package DesafioIfElse;

public class Main {

    public static void main(String[] args) {

        String ninja1 = "Naruto";
        int idadeNinja1 = 15;
        String missaoNinja1 = "Resgatar gato da Arvore";
        char rankMissaoNinja1 = 'C';
        String statusMissaoNinja1 = "";

        String ninja2 = "Sasuke";
        int idadeNinja2 = 16;
        String missaoNinja2 = "Proteger construtor da ponte";
        char rankMissaoNinja2 = 'B';
        String statusMissaoNinja2 = "";

        String ninja3 = "Konohamaru";
        int idadeNinja3 = 12;
        String missaoNinja3 = "Derrotar Akatsuki";
        char rankMissaoNinja3 = 'A';
        String statusMissaoNinja3 = "";

        if (idadeNinja1 >= 15) {
            statusMissaoNinja1 = "Missão concluída";
        } else if (rankMissaoNinja1 == 'C' || rankMissaoNinja1 == 'D') {
            statusMissaoNinja1 = "Missão concluída";
        } else {
            statusMissaoNinja1 = "Missão não concluída";
        }

        if (idadeNinja2 >= 15) {
            statusMissaoNinja2 = "Missão concluída";
        } else if (rankMissaoNinja2 == 'C' || rankMissaoNinja2 == 'D') {
            statusMissaoNinja2 = "Missão concluída";
        } else {
            statusMissaoNinja2 = "Missão não concluída";
        }

        if (idadeNinja3 >= 15) {
            statusMissaoNinja3 = "Missão concluída";
        } else if (rankMissaoNinja3 == 'C' || rankMissaoNinja3 == 'D') {
            statusMissaoNinja3 = "Missão concluída";
        } else {
            statusMissaoNinja3 = "Missão não concluída";
        }

        System.out.println("\n------------------------Ninja 1-------------------------\n");
        System.out.printf("Nome: %s, Idade: %d, Missão: %s, Rank da Missão: %c, Status de Conclusão da Missão: %s\n", ninja1, idadeNinja1, missaoNinja1, rankMissaoNinja1, statusMissaoNinja1);
        System.out.println("\n------------------------Ninja 2-------------------------\n");
        System.out.printf("Nome: %s, Idade: %d, Missão: %s, Rank da Missão: %c, Status de Conclusão da Missão: %s\n", ninja2, idadeNinja2, missaoNinja2, rankMissaoNinja2, statusMissaoNinja2);
        System.out.println("\n------------------------Ninja 3-------------------------\n");
        System.out.printf("Nome: %s, Idade: %d, Missão: %s, Rank da Missão: %c, Status de Conclusão da Missão: %s\n", ninja3, idadeNinja3, missaoNinja3, rankMissaoNinja3, statusMissaoNinja3);

    }
}