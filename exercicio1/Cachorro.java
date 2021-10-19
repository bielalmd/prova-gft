public class Cachorro extends Animal {

    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }


    @Override
    public void som() {
        System.out.println(this.getNome()+ " está latindo: au! au!");
    }

    public String toString() {
        return "Oi, eu sou o " + nome + " e consumo "+quantidadeDeRacao(peso);
    }
}
