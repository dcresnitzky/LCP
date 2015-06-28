package rc.unesp.br.lcp.beans;

public abstract class Pessoa {

	protected String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }    
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}

 