/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;
/**
 *
 * @author famil
 */
public class BsoVendas {
    private int bso_idvendas;
    private Double bso_valor_unitario;
    private String bso_forma_pagamento;
    private Date bso_data_venda;
    private String bso_status;
    private int bso_fkclientes ;
    private int bso_fkvendedor;

    public int getBso_idvendas() {
        return bso_idvendas;
    }

    public void setBso_idvendas(int bso_idvendas) {
        this.bso_idvendas = bso_idvendas;
    }

    public Double getBso_valor_unitario() {
        return bso_valor_unitario;
    }

    public void setBso_valor_unitario(Double bso_valor_unitario) {
        this.bso_valor_unitario = bso_valor_unitario;
    }

    public String getBso_forma_pagamento() {
        return bso_forma_pagamento;
    }

    public void setBso_forma_pagamento(String bso_forma_pagamento) {
        this.bso_forma_pagamento = bso_forma_pagamento;
    }

    public Date getBso_data_venda() {
        return bso_data_venda;
    }

    public void setBso_data_venda(Date bso_data_venda) {
        this.bso_data_venda = bso_data_venda;
    }

    public String getBso_status() {
        return bso_status;
    }

    public void setBso_status(String bso_status) {
        this.bso_status = bso_status;
    }

    public int getBso_fkclientes() {
        return bso_fkclientes;
    }

    public void setBso_fkclientes(int bso_fkclientes) {
        this.bso_fkclientes = bso_fkclientes;
    }

    public int getBso_fkvendedor() {
        return bso_fkvendedor;
    }

    public void setBso_fkvendedor(int bso_fkvendedor) {
        this.bso_fkvendedor = bso_fkvendedor;
    }
}
