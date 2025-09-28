package JavaGame;

public class Jogador {

    //variaveis de instancia de jogador
    private int dinheiro;
    private int saude;

    //array para alocar os dilemas do jogador
    private String[] dilemas = new String[6];      

    //inicia o jogador com valores padrões e configura o array de dilemas já
    public void setStatus(){
        dinheiro = 200;
        saude = 200;    

        //setando strings para os dilemas do jogador
        String dil1 = "Sua filha acorda febril. Ela precisa urgentemente de um medicamento que custa R$80,\n" +
                        "o que consumirá quase todo seu dinheiro restante para o transporte da semana." ;

        String dil2 = "Um agiota da vizinhança oferece um pequeno empréstimo com juros altíssimos para cobrir \n" +
                        "a conta de luz atrasada e evitar o corte. Você aceita?";	

        String dil3 = "Você encontrou um trabalho extra, mas ele exige 4 horas de sono a menos por noite \n" +
                        "durante uma semana, esgotando suas reservas físicas. Você aceita a carga extra?";

        String dil4 = "O único par de sapatos que você usa para trabalhar está rasgando e causando bolhas nos pés, \n" +
                        "mas você precisa economizar para a comida de amanhã. Você gasta R$50 em um par usado?";

        String dil5 = "Você encontrou uma carteira grossa no chão. Ninguém está olhando. O dinheiro resolveria \n" +
                        "seus problemas por semanas, mas há documentos que a identificam. Você a devolve?";

        String dil6 = "Um amigo te convida para um curso técnico gratuito que pode garantir um emprego melhor no futuro, \n" +
                        "mas o curso é no mesmo horário de um bico diário crucial. Você vai ao curso?";
        
        dilemas[0] = dil1;
        dilemas[1] = dil2;
        dilemas[2] = dil3;
        dilemas[3] = dil4;
        dilemas[4] = dil5;
        dilemas[5] = dil6;
    }

    //retorna o array de dilemas
    public String[] getDilemas(){
        return dilemas;
    }

    //metodos para retornar os valores do jogador
    public int getDinheiro(){
        return dinheiro;
    }

    public int getSaude(){
        return saude;
    }    
    
    //metodos para aumentar e diminuir status jogador
    public void aumentarDinheiro(){
        dinheiro = dinheiro + 50;
    }

    public void aumentarSaude(){
        saude = saude + 50;
    }

    public void diminuirDinheiro(){
        dinheiro = dinheiro - 50;
    }

    public void diminuirSaude(){
        saude = saude - 50;
    }

}
