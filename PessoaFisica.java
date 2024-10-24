public class PessoaFisica extends Pessoa{
   String cpf;


    public PessoaFisica(){}

    public PessoaFisica (String nome, String cpf){
        super(nome);
        this.cpf = cpf; 
    }
    public String getCpf () {return this.cpf;}
    public void setCpf( String cpf){

    }
    public void Identificacao(){
        super.Identificacao() ;
        System.out.println("Nome: " + super.nome  + ", cpf: " + this.cpf);
  }
  public void Identificacao(String Telefone){
    super.Identificacao() ;
    System.out.println("Nome: " + super.nome  + ", cpf: " + this.cpf);
}

}
