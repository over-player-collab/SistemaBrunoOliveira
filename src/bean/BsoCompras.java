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
public class BsoCompras {
    private int bso_idcompra;
    private int bso_fkfornecedor;
    private int bso_idusuario;
    private Date bso_data;
    private String bso_forma_pagamento;
    private String bso_valor_total;

    public int getBso_idcompra() {
        return bso_idcompra;
    }

    public void setBso_idcompra(int bso_idcompra) {
        this.bso_idcompra = bso_idcompra;
    }

    public int getBso_fkfornecedor() {
        return bso_fkfornecedor;
    }

    public void setBso_fkfornecedor(int bso_fkfornecedor) {
        this.bso_fkfornecedor = bso_fkfornecedor;
    }

    public int getBso_idusuario() {
        return bso_idusuario;
    }

    public void setBso_idusuario(int bso_idusuario) {
        this.bso_idusuario = bso_idusuario;
    }

    public Date getBso_data() {
        return bso_data;
    }

    public void setBso_data(Date bso_data) {
        this.bso_data = bso_data;
    }

    public String getBso_forma_pagamento() {
        return bso_forma_pagamento;
    }

    public void setBso_forma_pagamento(String bso_forma_pagamento) {
        this.bso_forma_pagamento = bso_forma_pagamento;
    }

    public String getBso_valor_total() {
        return bso_valor_total;
    }

    public void setBso_valor_total(String bso_valor_total) {
        this.bso_valor_total = bso_valor_total;
    }
}
