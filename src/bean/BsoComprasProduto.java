/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author famil
 */
public class BsoComprasProduto {
    private int bso_idcompras_produto;
    private int bso_fkproduto;
    private int bso_quantidade;
    private Double bso_valor_unitario;
    private Double bso_subtotal;
    private Double bso_desconto;

    public int getBso_idcompras_produto() {
        return bso_idcompras_produto;
    }

    public void setBso_idcompras_produto(int bso_idcompras_produto) {
        this.bso_idcompras_produto = bso_idcompras_produto;
    }

    public int getBso_fkproduto() {
        return bso_fkproduto;
    }

    public void setBso_fkproduto(int bso_fkproduto) {
        this.bso_fkproduto = bso_fkproduto;
    }

    public int getBso_quantidade() {
        return bso_quantidade;
    }

    public void setBso_quantidade(int bso_quantidade) {
        this.bso_quantidade = bso_quantidade;
    }

    public Double getBso_valor_unitario() {
        return bso_valor_unitario;
    }

    public void setBso_valor_unitario(Double bso_valor_unitario) {
        this.bso_valor_unitario = bso_valor_unitario;
    }

    public Double getBso_subtotal() {
        return bso_subtotal;
    }

    public void setBso_subtotal(Double bso_subtotal) {
        this.bso_subtotal = bso_subtotal;
    }

    public Double getBso_desconto() {
        return bso_desconto;
    }

    public void setBso_desconto(Double bso_desconto) {
        this.bso_desconto = bso_desconto;
    }
}
