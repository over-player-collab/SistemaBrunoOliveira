package dao;

import bean.BsoCompras;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author famil
 */
public class DaoBsoCompra extends DaoAbstract {

    @Override
    public void insert(Object object) {
        BsoCompras compras = (BsoCompras) object;

        String url = "jdbc:mysql://10.0.7.51:33062/db_bruno_oliveira";
        String user = "bruno_oliveira";
        String password = "bruno_oliveira";

        String sql = "INSERT INTO bso_compras (bso_idcompra, bso_fkfornecedor, bso_idusuario, bso_data, bso_forma_pagamento, bso_valor_total) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, compras.getBso_idcompra());
            pst.setInt(2, compras.getBso_fkfornecedor());
            pst.setInt(3, compras.getBso_idusuario());
            pst.setDate(4, null);
            pst.setString(5, compras.getBso_forma_pagamento());
            pst.setString(6, compras.getBso_valor_total());

            pst.executeUpdate();

            System.out.println("Compra inserida com sucesso!");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoBsoCompra.class.getName()).log(Level.SEVERE, "Driver não encontrado", ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoBsoCompra.class.getName()).log(Level.SEVERE, "Erro ao inserir compra no banco", ex);
        }
    }
}