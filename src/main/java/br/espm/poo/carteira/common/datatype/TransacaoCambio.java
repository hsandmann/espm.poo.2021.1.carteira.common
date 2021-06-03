package br.espm.poo.carteira.common.datatype;

import br.espm.poo.cambio.common.datatype.Cotacao;

import java.util.Date;

public class TransacaoCambio {

    private String id;
    private Carteira carteira;
    private Cotacao cotacao;
    private Date data;
    private Double quantidade;

    public String getId() {
        return id;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public Cotacao getCotacao() {
        return cotacao;
    }

    public Date getData() {
        return data;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    public void setCotacao(Cotacao cotacao) {
        this.cotacao = cotacao;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

}
