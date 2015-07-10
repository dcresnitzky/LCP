/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.unesp.br.lcp.controller;

import rc.unesp.br.lcp.beans.Funcionario;
import rc.unesp.br.lcp.beans.Gerente;
import rc.unesp.br.lcp.view.MainView;

/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario gerente = new Gerente("Cleber",1);
        gerente.setLogin("root");
        gerente.setSenha("root".toCharArray());
        
        new MainView().setVisible(true);
    }
    
}
