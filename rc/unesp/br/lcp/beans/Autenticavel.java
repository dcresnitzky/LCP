package rc.unesp.br.lcp.beans;


public interface Autenticavel{
    /**
    *
    * @param login 
    * @param senha 
    * @return 0 não autenticou, 1 acesso ao usuario, 2 acesso a atendente
    *  3 acesso total
    */
    public int autentica(String login,char[] senha); 
}
