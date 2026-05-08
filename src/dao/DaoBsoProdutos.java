package dao;

import bean.BsoProdutos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoBsoProdutos extends DaoAbstract {

    @Override
    public void insert(Object object) {
        BsoProdutos prod = (BsoProdutos) object;

        String url = "jdbc:mysql://127.0.0.1:3306/banco_trabalho";
        String user = "root";
        String password = "";

        String sql = "insert into bso_produtos values(?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, prod.getBso_idprodutos());
            pst.setString(2, prod.getBso_titulo());
            pst.setString(3, prod.getBso_desenvolvedora());
            pst.setString(4, prod.getBso_plataforma());
            pst.setString(5, prod.getBso_classificacao());
            pst.setString(6, prod.getBso_tipo());
            pst.setDouble(7, prod.getBso_preco());
            pst.setInt(8, prod.getBso_fkfornecedores());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoBsoProdutos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoBsoProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}