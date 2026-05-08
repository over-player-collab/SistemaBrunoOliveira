/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author famil
 */
public class BsoProdutos {
    private int bso_idprodutos;
    private String bso_titulo;
    private String bso_desenvolvedora;
    private String bso_plataforma;
    private String bso_classificacao;
    private String bso_tipo;
    private Double bso_preco;
    private int bso_fkfornecedores;

    public int getBso_idprodutos() {
        return bso_idprodutos;
    }

    public void setBso_idprodutos(int bso_idprodutos) {
        this.bso_idprodutos = bso_idprodutos;
    }

    public String getBso_titulo() {
        return bso_titulo;
    }

    public void setBso_titulo(String bso_titulo) {
        this.bso_titulo = bso_titulo;
    }

    public String getBso_desenvolvedora() {
        return bso_desenvolvedora;
    }

    public void setBso_desenvolvedora(String bso_desenvolvedora) {
        this.bso_desenvolvedora = bso_desenvolvedora;
    }

    public String getBso_plataforma() {
        return bso_plataforma;
    }

    public void setBso_plataforma(String bso_plataforma) {
        this.bso_plataforma = bso_plataforma;
    }

    public String getBso_classificacao() {
        return bso_classificacao;
    }

    public void setBso_classificacao(String bso_classificacao) {
        this.bso_classificacao = bso_classificacao;
    }

    public String getBso_tipo() {
        return bso_tipo;
    }

    public void setBso_tipo(String bso_tipo) {
        this.bso_tipo = bso_tipo;
    }

    public Double getBso_preco() {
        return bso_preco;
    }

    public void setBso_preco(Double bso_preco) {
        this.bso_preco = bso_preco;
    }

    public int getBso_fkfornecedores() {
        return bso_fkfornecedores;
    }

    public void setBso_fkfornecedores(int bso_fkfornecedores) {
        this.bso_fkfornecedores = bso_fkfornecedores;
    }
}
