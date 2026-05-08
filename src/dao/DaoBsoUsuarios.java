package dao;

import bean.BsoUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoBsoUsuarios extends DaoAbstract {

    @Override
    public void insert(Object object) {
        BsoUsuarios usu = (BsoUsuarios) object;

        String url = "jdbc:mysql://10.0.7.51:33062/db_bruno_oliveira";
        String user = "bruno_oliveira";
        String password = "bruno_oliveira";

        String sql = "insert into bso_usuarios values(?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, usu.getBsoUsuarios());
            pst.setString(2, usu.getBsoNome());
            pst.setString(3, usu.getBsoApelido());
            pst.setString(4, usu.getBsoCpf());
            pst.setDate(5, null);
            pst.setInt(6, usu.getBsoNivel());
            pst.setString(7, usu.getBsoSenha());
            pst.setString(8, usu.getBsoAtivo());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoBsoUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoBsoUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}