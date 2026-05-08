package dao;

import bean.BsoClientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoBsoClientes extends DaoAbstract {

    @Override
    public void insert(Object object) {
        BsoClientes cli = (BsoClientes) object;

        String url = "jdbc:mysql://127.0.0.1:3306/banco_trabalho";
        String user = "root";
        String password = "";
        
        String sql = "INSERT INTO bso_clientes VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, cli.getBso_idclientes());
            pst.setString(2, cli.getBso_nome());
            pst.setString(3, cli.getBso_cpf());
            pst.setDate(4, null);
            pst.setString(5, cli.getBso_genero());
            pst.setString(6, cli.getBso_email());
            pst.setString(7, cli.getBso_telefone_fixo());
            pst.setString(8, cli.getBso_celular());
            pst.setString(9, cli.getBso_cep());
            pst.setString(10, cli.getBso_numero_casa());
            pst.setString(11, cli.getBso_endereco());
            pst.setString(12, cli.getBso_bairro());
            pst.setString(13, cli.getBso_cidade());
            pst.setString(14, cli.getBso_estado());
            pst.setString(15, cli.getBso_ativo());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoBsoClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoBsoClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}