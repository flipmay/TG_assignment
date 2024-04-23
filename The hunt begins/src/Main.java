
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenorCaminho menorcaminho = new MenorCaminho();
        Predador predador = new Predador();
        Mapa mapa = new Mapa(9);
        mapa.addpath(0, 3);
        mapa.addpath(0, 1);
        mapa.addpath(1, 2);
        mapa.addpath(2, 3);
        mapa.addpath(3, 4);
        mapa.addpath(4,5);
        mapa.addpath(5,6);
        mapa.addpath(5,7);
        mapa.addpath(6,7);
        mapa.addpath(7,8);


        Scanner scanner = new Scanner(System.in);
        Player player = new Player("Luis");

        int contador = 0;


        int x = 1,l,p;
        System.out.println("Seja Bem Vindo ao The Hunte Begins\n" + "Pressione enter para continuar:");
        scanner.nextLine();


        for (int i = 0; i < 50; i++)
            System.out.println();

        System.out.println("Antes de iniciar o jogo digite aonde será a toca: ");
        mapa.setToca(scanner.nextInt());
        System.out.println("\n\nAgora digite aonde o player,depois o predador irão inciar:");
        player.setPosicaoAtual(scanner.nextInt());
        predador.setPosicaoatual(scanner.nextInt());


        do{
            System.out.println("\n");
            System.out.println("Selecione uma opção:\n");
            System.out.println("1. Mostrar o mapa ");
            System.out.println("2. Mover ");
            System.out.println("3. Depositar comida:");
            System.out.println("4. Usar escavação");
            System.out.println("5. Mostrar posição do jogador");
            System.out.println("6. Mostrar posição do predador");
            System.out.println("7. Mostra pontos");
            System.out.println("0. Encerrar jogo.");

            x = scanner.nextInt();

            for (int i = 0; i < 50; i++)
                System.out.println();


            switch (x) {
                case 1:
                   mapa.mostramapa();
                    continue;
                case 2:
                    System.out.println("Para qual vertice deseja mover ?\n");
                    mapa.verificaadj(player.getPosicaoAtual());
                    l = scanner.nextInt();
                    player.setPosicaoAtual(l);
                    break;

                case 3:
                    if(player.getPosicaoAtual() != mapa.getToca()) {
                        System.out.println("Aqui não é sua toca!!!!!!");
                        break;
                    }
                    if(player.getComidas() < 1){
                        System.out.println("Você não tem comida");
                        break;
                    }
                    player.setComidas(0);
                    player.aumentapontos();
                    System.out.println("Comida depositada !!");
                    break;

                case 4:
                    if(player.getCharge() < 1){
                        System.out.println("Sem cargas de habilidade");
                        continue;
                    }
                    System.out.println("Para qual vertice deseja escavar ?");
                    for(int i=0; i < mapa.getTamanho(); i++){
                        if(i != player.getPosicaoAtual())
                            System.out.println(i);
                    }
                    player.setCharge(0);
                    l = scanner.nextInt();
                    player.setPosicaoAtual(l);
                    break;

                case 5:
                    System.out.println("Jogador esta no vertice: " + player.getPosicaoAtual());
                    continue;

                case 6:
                    System.out.println("Predador esta no vertice: " +predador.getPosicaoatual());
                    continue;

                case 7:
                    System.out.println("Você tem " + player.getPontos() + " pontos !!");
                    continue;

                case 0:
                    System.out.println("Obrigado por jogar !!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }





            for(int i=0; i<mapa.getTamanho(); i++){
                    if(mapa.getMapa()[predador.getPosicaoatual()][player.getPosicaoAtual()] == 1 || predador.getPosicaoatual() == player.getPosicaoAtual()){
                        System.out.println("Game Over");

                        System.out.println("          |||||          ");
                        System.out.println("        ||     ||        ");
                        System.out.println("       || X   X ||       ");
                        System.out.println("       |        |       ");
                        System.out.println("       |    ___  |       ");
                        System.out.println("        ||   _  ||      ");
                        System.out.println("         || ___ ||        ");
                        System.out.println("         |       ||       ");
                        System.out.println("        | | | | | |      ");
                        System.exit(0);
                    }
                }


            predador.setPosicaoatual(menorcaminho.menorCaminho(mapa.getMapa(), predador.getPosicaoatual(), player.getPosicaoAtual()));


            contador += 1;
        if (contador == 3) {
            player.aumentacomidas();
            player.aumentacharge();
            contador  = 0;
        }

        System.out.println("Pressione enter para continuar:");
        scanner.nextLine();
        scanner.nextLine();

        if(player.getPosicaoAtual() == predador.getPosicaoatual()){
            System.out.println("Game Over");

                System.out.println("          |||||          ");
                System.out.println("        ||     ||        ");
                System.out.println("       || X   X ||       ");
                System.out.println("       |        |       ");
                System.out.println("       |    ___  |       ");
                System.out.println("        ||   _  ||      ");
                System.out.println("         || ___ ||        ");
                System.out.println("         |       ||       ");
                System.out.println("        | | | | | |      ");
            break;
        }

        }while(x != 0);

    }
}