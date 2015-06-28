package rc.unesp.br.lcp.beans;

public class Endereco {

	private String rua;

	private int numero;

	private String referencia;

        
    public Endereco(String rua, int numero, String referencia){
        
        this.rua = rua;
        this.numero = numero;
        this.referencia = referencia;
    }
    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

}
