package antoniocalebethiago;

public class Cavaleiro extends Personagem implements ComportamentoHeroico {
    

    public Cavaleiro(String nome){
        super(nome);
        //this.setNome(nome);
    }

    //Interface ComportamentoNormal
    @Override
    public void andar() {
        System.out.println("Cavaleiro Sir " + this.getNome() + " esta andando.");
    }

    @Override
    public void guardarItem() {
        System.out.println("Cavaleiro Sir " + this.getNome() + " guardou a sua espada.");
    }

    @Override
    public void usarItem() {
        System.out.println("Cavaleiro Sir " + this.getNome() + " usou o item de cura.");
    }

    //Interface ComportamentoHeroico
    @Override
    public void atacar() {
        System.out.println("Cavaleiro Sir " + this.getNome() + " esta em atacando de forma feroz o exercito inimigo.");
    }

    @Override
    public void defender() {
        System.out.println("Cavaleiro Sir " + this.getNome() + " defendeu o seu reino com exito.");
    }

    @Override
    public void saltar() {
        System.out.println("Cavaleiro Sir " + this.getNome() + " esta saltando.");
    }
    
}
