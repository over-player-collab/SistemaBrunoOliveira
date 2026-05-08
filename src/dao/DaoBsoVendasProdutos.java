package dao;

import bean.BsoVendasProduto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoBsoVendasProdutos extends DaoAbstract {

    @Override
    public void insert(Object object) {
        BsoVendasProduto vp = (BsoVendasProduto) object;

        String url = "jdbc:mysql://127.0.0.1:3306/banco_trabalho";
        String user = "root";
        String password = "";

        String sql = "insert into bso_vendas_produto values(?, ?, ?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, vp.getBso_idvendas_produto());
            pst.setInt(2, vp.getBso_fkvendas());
            pst.setInt(3, vp.getBso_fkproduto());
            pst.setInt(4, vp.getBso_quantidade());
            pst.setString(5, vp.getBso_forma_pagamento());
            pst.setDouble(6, vp.getBso_subtotal());
            pst.setDouble(7, vp.getBso_preco_unitario());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoBsoVendasProdutos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoBsoVendasProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}