package rc.unesp.br.lcp.beans;

public class Atendente extends Funcionario implements Autenticavel {

    private int ramal;

    public Atendente(String nome, int registro,int ramal) {
        super(nome, registro);
        this.ramal = ramal;
    }

    /**
     * @return the ramal
     */
    public int getRamal() {
        return ramal;
    }

    /**
     * @param ramal the ramal to set
     */
    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    @Override
    public int autentica(String login, char[] senha) {
        if(!this.login.equals(login)) {
            return 0;
        }
        if(!this.senha.equals(senha)) {
            return 0;
        }
    return 2;
    }
}
