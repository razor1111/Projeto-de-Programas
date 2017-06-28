package antoniocalebethiago;

import java.util.ArrayList;

public class AntonioCalebeThiago {
    public static void main(String[] args) {
        //3a Questao -> Letra a
        ArrayList<Personagem> personagens = new ArrayList();
        personagens.add(new Cavaleiro("Ragnar Lodbrok"));
        personagens.add(new Cavaleiro("Bjorn Ironside"));
        personagens.add(new Mago("O Vidente"));
        personagens.add(new Mago("Gandalf"));
        personagens.add(new Dragao("Dragao de gelo"));
        personagens.add(new Dragao("Dragao de fogo"));
        
        //3a Questao -> Letra b
        int i;
        Jogo j = new Jogo();
        for(i = 0;i < personagens.size();i++){
            j.executaAcoesComuns(personagens.get(i));
        }
        
        //3a Questao -> Letra c
        // foi criada uma variavel (p) do tipo genérico
        Personagem p;
        p = new Mago("Reure Porco");//
        // foi instanciado um mago e essa instancia foi armazenado na variavel generica

        ((Mago) p).invisibilidade();
        // foi utilizado casting para através da variável genérica termos acesso a um método específico da classe mago
    }    
}
