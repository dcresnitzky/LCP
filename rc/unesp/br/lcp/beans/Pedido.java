package rc.unesp.br.lcp.beans;

import java.util.List;
import java.util.Date;

public class Pedido {

	private Cliente cliente;
	private List<ProdutoPedido> produtos;
	private Funcionario atendente;
	private Funcionario entregador;
	private Endereco endereco;
	private boolean entrega;
	private double desconto;
	private double taxa_entrega;
	private double valor;
	private int forma_pagamento;
	private double troco;
	private Date data;
	private Date hora;
	private int status;
        
    public Pedido(Cliente cliente, List<ProdutoPedido> produtos){
        this.cliente = cliente;
        this.produtos = produtos;
    }
    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the produtos
     */
    public List<ProdutoPedido> getProdutos() {
        return produtos;
    }

    /**
     * @param produtos the produtos to set
     */
    public void setProdutos(List<ProdutoPedido> produtos) {
        this.produtos = produtos;
    }

    /**
     * @return the atendente
     */
    public Funcionario getAtendente() {
        return atendente;
    }

    /**
     * @param atendente the atendente to set
     */
    public void setAtendente(Funcionario atendente) {
        this.atendente = atendente;
    }

    /**
     * @return the entregador
     */
    public Funcionario getEntregador() {
        return entregador;
    }

    /**
     * @param entregador the entregador to set
     */
    public void setEntregador(Funcionario entregador) {
        this.entregador = entregador;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the entrega
     */
    public boolean isEntrega() {
        return entrega;
    }

    /**
     * @param entrega the entrega to set
     */
    public void setEntrega(boolean entrega) {
        this.entrega = entrega;
    }

    /**
     * @return the desconto
     */
    public double getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the taxa_entrega
     */
    public double getTaxa_entrega() {
        return taxa_entrega;
    }

    /**
     * @param taxa_entrega the taxa_entrega to set
     */
    public void setTaxa_entrega(double taxa_entrega) {
        this.taxa_entrega = taxa_entrega;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the forma_pagamento
     */
    public int getForma_pagamento() {
        return forma_pagamento;
    }

    /**
     * @param forma_pagamento the forma_pagamento to set
     */
    public void setForma_pagamento(int forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    /**
     * @return the troco
     */
    public double getTroco() {
        return troco;
    }

    /**
     * @param troco the troco to set
     */
    public void setTroco(double troco) {
        this.troco = troco;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the hora
     */
    public Date getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Date hora) {
        this.hora = hora;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

}
