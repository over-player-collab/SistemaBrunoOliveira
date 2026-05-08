package dao;

import bean.BsoVendedor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoBsoVendedor extends DaoAbstract {

    @Override
    public void insert(Object object) {
        BsoVendedor vend = (BsoVendedor) object;

        String url = "jdbc:mysql://10.0.7.51:3306/db_bruno_oliveira";
        String user = "bruno_oliveira";
        String password = "bruno_oliveira";

        String sql = "insert into bso_vendedor values(?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, vend.getBso_idvendedor());
            pst.setString(2, vend.getBso_nome());
            pst.setDate(3, null);
            pst.setString(4, vend.getBso_telefone());
            pst.setString(5, vend.getBso_email());
            pst.setString(6, vend.getBso_cpf());
            pst.setString(7, vend.getBso_cidade());
            pst.setString(8, vend.getBso_ativo());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoBsoVendedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoBsoVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}