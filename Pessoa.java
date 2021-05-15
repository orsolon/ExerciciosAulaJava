public class Pessoa {
    
    private String nome;
	private int idade;

    // padrão
    public Pessoa( ) {
        
    }
	
    // completo
    public Pessoa( String nome, int idade) {
    this.nome = nome;
    this.idade = idade; 
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNome(int idade){
        this.idade = idade;
    }

	public String toString ( ) {
	return "Pessoa{" +
	"nome=" + this.nome + '\' +
	",idade=" + this.idade +
	' } ';
    }
}
