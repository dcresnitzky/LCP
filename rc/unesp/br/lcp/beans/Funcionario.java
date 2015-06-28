package rc.unesp.br.lcp.beans;

public abstract class Funcionario extends Pessoa {

    protected int registro;
    protected String login;
    protected char[] senha;
    
    public Funcionario(String nome,int registro) {
        super(nome);
        this.registro = registro;
    }

    /**
     * @return the registro
     */
    public int getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    public char[] getSenha() {
        return senha;
    }

    public String getLogin() {
        return login;
    }
}
