package JavaGame;
import java.util.Scanner;

public class Start {
    
    public static void main(String[] args) {
        
        //instancia um objeto scanner para as entradas do usuario
        Scanner scan = new Scanner(System.in);              

        //inicializamos resposta com null para usarmos ela
        String resposta = "null";

        //instancia novo objeto jogador com seus dados
        Jogador jogador = new Jogador();
        jogador.setStatus();

        System.out.println("\n" + "REGRAS: \n"
                        + "Você deverá gerenciar sua sáude e seu dinheiro, \n"
                        + "Aceite o dilema ou negue, a escolha é sua. (Y=sim, N=não) \n"
                        + "cada dia será um novo desafio \n"
                        + "se algum status cair a zero, você não sobrevive \n"
                        + "sobrevivendo os dias você segue em frente e ganha o minigame");

        //loop while para rodar o game enquanto o jogador estiver vivo
        for(String test : jogador.getDilemas()) {            

            //menu do game para o jogador
            System.out.println( "\n\n"
                            + "===========================================================\n" 
                            + "                     Saúde: " + jogador.getSaude() + "\n" 
                            + "                     Dinheiro: " + jogador.getDinheiro() + "\n"
                            + "\n"
                            + "            Responda apenas com Y ou com N \n" 
                            + "===========================================================");
           

            //printa um dilema que estará no loop para o jogador
            System.out.println("\n" + test.toUpperCase());
            System.out.println("Sua escolha? ");

            //espera uma entrada do usuário e transforma em maiúsculas
            resposta = scan.nextLine().toUpperCase();

            //String é um tipo de objeto, por isso usamos o comparador .equals()
            if (resposta.equals("Y")){
                jogador.diminuirDinheiro();
                jogador.aumentarSaude();
            }
            else {
                jogador.aumentarDinheiro();
                jogador.diminuirSaude();
            }

            //verifica condições de derrota do game
            if ( (jogador.getDinheiro() <= 0) || (jogador.getSaude() <= 0) ) {
                System.out.println("Você foi derrotado...");
                break;
            }
        }

        //verifica se jogador terminou o jogo com saude e dinheiro
        if (jogador.getDinheiro() !=0 && jogador.getSaude() != 0){
            System.out.println("\n" 
            +  "PARABÉNS!!! \n"
            + "Desafios foram vencidos, e ainda há uma luz de esperança para você!!!");
        }
    }   
}