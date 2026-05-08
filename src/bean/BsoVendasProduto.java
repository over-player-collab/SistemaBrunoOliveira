/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author famil
 */
public class BsoVendasProduto {
    private int bso_idvendas_produto;
    private int bso_fkvendas;
    private int bso_fkproduto;
    private int bso_quantidade;
    private String bso_forma_pagamento;
    private Double bso_subtotal;
    private Double bso_preco_unitario;

    public int getBso_idvendas_produto() {
        return bso_idvendas_produto;
    }

    public void setBso_idvendas_produto(int bso_idvendas_produto) {
        this.bso_idvendas_produto = bso_idvendas_produto;
    }

    public int getBso_fkvendas() {
        return bso_fkvendas;
    }

    public void setBso_fkvendas(int bso_fkvendas) {
        this.bso_fkvendas = bso_fkvendas;
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

    public String getBso_forma_pagamento() {
        return bso_forma_pagamento;
    }

    public void setBso_forma_pagamento(String bso_forma_pagamento) {
        this.bso_forma_pagamento = bso_forma_pagamento;
    }

    public Double getBso_subtotal() {
        return bso_subtotal;
    }

    public void setBso_subtotal(Double bso_subtotal) {
        this.bso_subtotal = bso_subtotal;
    }

    public Double getBso_preco_unitario() {
        return bso_preco_unitario;
    }

    public void setBso_preco_unitario(Double bso_preco_unitario) {
        this.bso_preco_unitario = bso_preco_unitario;
    }
}
