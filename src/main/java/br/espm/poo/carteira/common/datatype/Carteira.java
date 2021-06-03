package br.espm.poo.carteira.common.datatype;

import java.util.List;

public class Carteira {

    private String id;
    //TODO:
    // private Usuario usuario;
    private Double saldo;
    private List<TransacaoCambio> transacoesCambio;

    public String getId() {
        return id;
    }

    public Double getSaldo() {
        return saldo;
    }

    public List<TransacaoCambio> getTransacoesCambio() {
        return transacoesCambio;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setTransacoesCambio(List<TransacaoCambio> transacoesCambio) {
        this.transacoesCambio = transacoesCambio;
    }

}
