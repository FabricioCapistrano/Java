import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int escolha = 1;
        int escolha2;
        int escolha3;
        int escolha4;

        String[] hp = new String[8];
        String[] pj = new String[6];
        String[] sa = new String[4];
        String[] tw = new String[8];
        String[] jv = new String[4];
        String[] cn = new String[8];
        String[] mp = new String[4];
        String[] tm = new String[4];
        String[] sh = new String[5];
        String[] go = new String[3];

        hp[1] = "Harry Potter e a Pedra Filosofal";
        hp[2] = "Harry Potter e a Câmara Secreta";
        hp[3] = "Harry Potter e o Prisioneiro de Azkaban";
        hp[4] = "Harry Potter e o Cálice de Fogo";
        hp[5] = "Harry Potter e a Ordem da Fênix";
        hp[6] = "Harry Potter e o Enigma do Príncipe";
        hp[7] = "Harry Potter e as Relíquias da Morte";

        pj[1] = "Percy Jackson e o Ladrão de Raios";
        pj[2] = "Percy Jackson e o Mar de Monstros";
        pj[3] = "Percy Jackson e a Maldição do Titã";
        pj[4] = "Percy Jackson e a Batalha do Labirinto";
        pj[5] = "Percy Jackson e o Último Olimpiano";

        sa[1] = "O Senhor dos Anéis: A Sociedade do Anel";
        sa[2] = "O Senhor dos Aneis: As duas torres";
        sa[3] = "O Senhor dos Anéis: O retorno do rei";

        jv[1] = "Jogos Vorazes";
        jv[1] = "Jogos Vorazes: Em Chamas";
        jv[1] = "Jogos Vorazes: A Esperança";

        tw[1] = "The Witcher: O Último Desejo";
        tw[2] = "The Witcher: A Espada do Destino";
        tw[3] = "The Witcher: O Sangue dos Elfos";
        tw[4] = "The Witcher: Tempo do Desprezo";
        tw[5] = "The Witcher: Batismo de Fogo";
        tw[6] = "The Witcher: A Torre da Andorinha";
        tw[7] = "The Witcher: A Dama do Lago";

        cn[1] = "As Crônicas de Nárnia: Príncipe Caspian";
        cn[2] = "As Crônicas de Nárnia: A Viagem do Peregrino da Alvorada";
        cn[3] = "As Crônicas de Nárnia: A Cadeira de Prata";
        cn[4] = "As Crônicas de Nárnia: O Cavalo e seu Menino";
        cn[5] = "As Crônicas de Nárnia: O Sobrinho do Mago";
        cn[6] = "As Crônicas de Nárnia: A Última Batalha";
        cn[7] = "As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-roupa";

        mp[1] = "O futuro da humanidade";
        mp[2] = "O homem mais inteligente da história";
        mp[3] = "O homem mais feliz da história";

        tm[1] = "Edgar Allan Poe";
        tm[2] = "H.P. Lovecraft";
        tm[3] = "Sir Arthur Conan Doyle";

        sh[1] = "Sherlock Holmes: O Signo dos Quatro";
        sh[2] = "O Retorno de Sherlock Holmes";
        sh[3] = "Sherlock Holmes: O Caso";
        sh[4] = "Mais Aventuras de Sherlock Holmes";

        go[1] = "1984";
        go[2] = "A Revolução dos Bichos";

        System.out.println("~~~~~  Seja Bem-Vindo!  ~~~~~");

        while (escolha != 0) {

            System.out.println("~~~~~ Biblioteca Asgard ~~~~~");
            System.out.println("-----------------------------");
            System.out.println("~~~~~  Ver coleções - 1  ~~~~~");
            System.out.println("~~~~~     Sair - 0      ~~~~~");

            escolha = in.nextInt();
            if (escolha == 1) {

                System.out.println("~~~~~ Selecionar Coleção ~~~~~");
                System.out.println("1- Harry Potter");
                System.out.println("2- Percy Jackson");
                System.out.println("3- O Senhor dos Anéis");
                System.out.println("4- Jogos Vorazes");
                System.out.println("5- The Witcher");
                System.out.println("6- As Crônicas de Nárnia");
                System.out.println("7- As Aventuras de Marco Polo");
                System.out.println("8- Terríveis Mestres");
                System.out.println("9- Sherlock Holmes");
                System.out.println("10- George Orwell");

                escolha2 = in.nextInt();
                //HARRY POTTER
                //
                if (escolha2 == 1) {
                    System.out.println("~~~~~HARRY POTTER~~~~~");
                    for (int i = 1; i < hp.length; i++) {
                        System.out.println(i + "- " + hp[i]);
                    }
                    System.out.println(" ");
                    System.out.println("~~~~~ Voltar - 0 ~~~~~");

                    escolha3 = in.nextInt();
                    if (escolha3 == 1) {
                        if (hp[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + hp[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            hp[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }

                    } else if (escolha3 == 2) {
                        if (hp[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + hp[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            hp[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 3) {
                        if (hp[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + hp[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            hp[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 4) {
                        if (hp[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + hp[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            hp[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 5) {
                        if (hp[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + hp[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            hp[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 6) {
                        if (hp[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + hp[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            hp[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 7) {
                        if (hp[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + hp[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            hp[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 0) {
                        continue;
                    }
                } //PERCY JACKSON
                else if (escolha2 == 2) {
                    System.out.println("~~~~~PERCY JACKSON~~~~~");
                    for (int i = 1; i < pj.length; i++) {

                        System.out.println(i + "- " + pj[i]);
                    }
                    System.out.println(" ");
                    System.out.println("~~~~~ Voltar - 0 ~~~~~");
                    escolha3 = in.nextInt();
                    if (escolha3 == 1) {
                        if (pj[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + pj[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            pj[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 2) {
                        if (pj[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + pj[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            pj[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 3) {
                        if (pj[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + pj[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            pj[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 4) {
                        if (pj[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + pj[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            pj[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 5) {
                        if (pj[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + pj[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            pj[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 0) {
                        continue;
                    }
                } //SENHOR DOS ANÉIS
                else if (escolha2 == 3) {
                    System.out.println("~~~~~SENHOR DOS ANÉIS~~~~~");
                    for (int i = 1; i < sa.length; i++) {

                        System.out.println(i + "- " + sa[i]);
                    }
                    System.out.println(" ");
                    System.out.println("~~~~~ Voltar - 0 ~~~~~");
                    escolha3 = in.nextInt();
                    if (escolha3 == 1) {
                        if (sa[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + sa[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            sa[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 2) {
                        if (sa[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + sa[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            sa[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 3) {
                        if (sa[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + sa[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            sa[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    }
                } //Jogos Vorazes
                else if (escolha2 == 4) {
                    System.out.println("~~~~~JOGOS VORAZES~~~~~");
                    for (int i = 1; i < jv.length; i++) {

                        System.out.println(i + "- " + jv[i]);
                    }
                    System.out.println(" ");
                    System.out.println("~~~~~ Voltar - 0 ~~~~~");
                    escolha3 = in.nextInt();
                    if (escolha3 == 1) {
                        if (jv[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + jv[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            jv[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 2) {
                        if (jv[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + jv[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            jv[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 3) {
                        if (jv[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + jv[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            jv[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    }

                } //The Witcher
                else if (escolha2 == 5) {
                    System.out.println("~~~~~THE WITCHER~~~~~");
                    for (int i = 1; i < tw.length; i++) {

                        System.out.println(i + "- " + tw[i]);
                    }
                    System.out.println(" ");
                    System.out.println("~~~~~ Voltar - 0 ~~~~~");
                    escolha3 = in.nextInt();
                    if (escolha3 == 1) {
                        if (tw[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + tw[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            tw[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 2) {
                        if (tw[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + tw[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            tw[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 3) {
                        if (tw[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + tw[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            tw[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 4) {
                        if (tw[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + tw[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            tw[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 5) {
                        if (tw[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + tw[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            tw[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 6) {
                        if (tw[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + tw[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            tw[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 7) {
                        if (tw[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + tw[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            tw[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    }
                } //As Crônicas de Nárnia
                else if (escolha2 == 6) {
                    System.out.println("~~~~~AS CRÔNICAS DE NÁRNIA~~~~~");
                    for (int i = 1; i < cn.length; i++) {

                        System.out.println(i + "- " + cn[i]);
                    }
                    System.out.println(" ");
                    System.out.println("~~~~~ Voltar - 0 ~~~~~");
                    escolha3 = in.nextInt();
                    if (escolha3 == 1) {
                        if (cn[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + cn[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            cn[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 2) {
                        if (cn[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + cn[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            cn[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 3) {
                        if (cn[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + cn[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            cn[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 4) {
                        if (cn[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + cn[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            cn[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 5) {
                        if (cn[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + cn[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            cn[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 6) {
                        if (cn[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + cn[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            cn[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 7) {
                        if (cn[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + cn[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            cn[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    }
                } //As Aventuras de Marco Polo
                else if (escolha2 == 7) {
                    System.out.println("~~~~~AS AVENTURAS DE MARCO POLO~~~~~");
                    for (int i = 1; i < mp.length; i++) {

                        System.out.println(i + "- " + mp[i]);
                    }
                    System.out.println(" ");
                    System.out.println("~~~~~ Voltar - 0 ~~~~~");
                    escolha3 = in.nextInt();
                    if (escolha3 == 1) {
                        if (mp[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + mp[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            mp[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 2) {
                        if (mp[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + mp[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            mp[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 3) {
                        if (mp[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + mp[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            mp[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    }
                } //Terríveis Mestres
                else if (escolha2 == 8) {
                    System.out.println("~~~~~TERRÍVEIS MESTRES~~~~~");
                    for (int i = 1; i < tm.length; i++) {

                        System.out.println(i + "- " + tm[i]);
                    }
                    System.out.println(" ");
                    System.out.println("~~~~~ Voltar - 0 ~~~~~");
                    escolha3 = in.nextInt();
                    if (escolha3 == 1) {
                        if (tm[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + tm[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            tm[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 2) {
                        if (tm[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + tm[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            tm[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 3) {
                        if (tm[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + tm[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            tm[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    }
                } //Sherlock Holmes
                else if (escolha2 == 9) {
                    System.out.println("~~~~~SHERLOCK HOLMES~~~~~");
                    for (int i = 1; i < sh.length; i++) {

                        System.out.println(i + "- " + sh[i]);
                    }
                    System.out.println(" ");
                    System.out.println("~~~~~ Voltar - 0 ~~~~~");
                    escolha3 = in.nextInt();
                    if (escolha3 == 1) {
                        if (sh[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + sh[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            sh[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 2) {
                        if (sh[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + sh[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            sh[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 3) {
                        if (sh[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + sh[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            sh[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 4) {
                        if (sh[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + sh[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            sh[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    }
                } //George Orwell
                else if (escolha2 == 10) {
                    System.out.println("~~~~~GEORGE ORWELL~~~~~");
                    for (int i = 1; i < go.length; i++) {
                        System.out.println(i + "- " + go[i]);
                    }
                    System.out.println(" ");
                    System.out.println("~~~~~ Voltar - 0 ~~~~~");
                    escolha3 = in.nextInt();
                    if (escolha3 == 1) {
                        if (go[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + go[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            go[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    } else if (escolha3 == 2) {
                        if (go[escolha3] == "Titulo Indisponivel") {
                            System.out.println("Título Indisponível!");
                            continue;
                        }
                        System.out.println("Você quer alugar " + go[escolha3] + "?");
                        System.out.println("Sim - 1");
                        System.out.println("Não - 2");
                        escolha4 = in.nextInt();
                        if (escolha4 == 1) {
                            System.out.println("Obrigado por alugar conosco!");
                            go[escolha3] = "Titulo Indisponivel";
                        } else {
                            continue;
                        }
                    }
                } else if (escolha2 > 10 && escolha2 < 1) {
                    System.out.println("Essa opção não existe.");
                    System.out.println("~Tente Novamente~");
                }
            }
        }
        in.close();
    }
}
