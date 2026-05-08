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
public class BsoVendedor {
    private int bso_idvendedor;
    private String bso_nome;
    private Date bso_data_nascmento;
    private String bso_telefone;
    private String bso_email;
    private String bso_cpf;
    private String bso_cidade;
    private String bso_ativo;

    public int getBso_idvendedor() {
        return bso_idvendedor;
    }

    public void setBso_idvendedor(int bso_idvendedor) {
        this.bso_idvendedor = bso_idvendedor;
    }

    public String getBso_nome() {
        return bso_nome;
    }

    public void setBso_nome(String bso_nome) {
        this.bso_nome = bso_nome;
    }

    public Date getBso_data_nascmento() {
        return bso_data_nascmento;
    }

    public void setBso_data_nascmento(Date bso_data_nascmento) {
        this.bso_data_nascmento = bso_data_nascmento;
    }

    public String getBso_telefone() {
        return bso_telefone;
    }

    public void setBso_telefone(String bso_telefone) {
        this.bso_telefone = bso_telefone;
    }

    public String getBso_email() {
        return bso_email;
    }

    public void setBso_email(String bso_email) {
        this.bso_email = bso_email;
    }

    public String getBso_cpf() {
        return bso_cpf;
    }

    public void setBso_cpf(String bso_cpf) {
        this.bso_cpf = bso_cpf;
    }

    public String getBso_cidade() {
        return bso_cidade;
    }

    public void setBso_cidade(String bso_cidade) {
        this.bso_cidade = bso_cidade;
    }

    public String getBso_ativo() {
        return bso_ativo;
    }

    public void setBso_ativo(String bso_ativo) {
        this.bso_ativo = bso_ativo;
    }
}
