public class Gato extends Animal {

    public Gato(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public void som() {
        System.out.println(this.getNome()+" está miando: Miau! !");
    }
    
    public String toString() {
        return "Oi, eu sou o " + nome + " e consumo " + quantidadeDeRacao(peso);
    }

}