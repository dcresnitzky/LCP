package rc.unesp.br.lcp.beans;

public class Motoboy extends Funcionario {

	private String moto_placa;

       
    public Motoboy(String nome, int registro, String placa) {
        super(nome, registro);
        this.moto_placa = placa;
    }

    /**
     * @return the moto_placa
     */
    public String getMoto_placa() {
        return moto_placa;
    }

    /**
     * @param moto_placa the moto_placa to set
     */
    public void setMoto_placa(String moto_placa) {
        this.moto_placa = moto_placa;
    }


}
