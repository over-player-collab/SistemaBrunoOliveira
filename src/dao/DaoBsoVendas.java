package dao;

import bean.BsoVendas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoBsoVendas extends DaoAbstract {

    @Override
    public void insert(Object object) {
        BsoVendas venda = (BsoVendas) object;

        String url = "jdbc:mysql://127.0.0.1:3306/banco_trabalho";
        String user = "root";
        String password = "";

        String sql = "insert into bso_vendas values(?, ?, ?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, venda.getBso_idvendas());
            pst.setDouble(2, venda.getBso_valor_unitario());
            pst.setString(3, venda.getBso_forma_pagamento());
            pst.setDate(4, null);
            pst.setString(5, venda.getBso_status());
            pst.setInt(6, venda.getBso_fkclientes());
            pst.setInt(7, venda.getBso_fkvendedor());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoBsoVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoBsoVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}