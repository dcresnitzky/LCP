package rc.unesp.br.lcp.beans;

public class Gerente extends Funcionario implements Autenticavel {

    public Gerente(String nome, int registro) {
        super(nome, registro);
    }

    @Override
    public int autentica(String login, char[] senha) {
        if(!this.login.equals(login)) {
            return 0;
        }
        if(!this.senha.equals(senha)) {
            return 0;
        }
    return 3;
    }
    
}
