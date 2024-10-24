public class Pessoa {
    String nome;

    public Pessoa(){}
    public Pessoa (String Nome) {this.nome = nome;}

    public String getNome() {return this.nome;}

    public void setNome(String Nome){this.nome = nome;}

    public void Identificacao(){
        System.out.println("Nome: " + this.nome);

    }

}

