package rc.unesp.br.lcp.beans;

import java.util.List;

public class Cliente extends Pessoa {
    
        private int telefone;        
	private List<Endereco> endereco;
	private List<Pedido> pedido;
        
    public Cliente(String nome, int telefone) {
        super(nome);
        this.telefone = telefone;
    }
    
    /**
     * @return the endereco
     */
    public List<Endereco> getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the pedido
     */
    public List<Pedido> getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(List<Pedido> pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
