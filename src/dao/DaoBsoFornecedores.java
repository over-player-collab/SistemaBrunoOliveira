package dao;

import bean.BsoFornecedores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoBsoFornecedores extends DaoAbstract {

    @Override
    public void insert(Object object) {
        BsoFornecedores fornc = (BsoFornecedores) object;

        String url = "jdbc:mysql://10.0.7.51:33062/db_bruno_oliveira";
        String user = "bruno_oliveira";
        String password = "bruno_oliveira";
        
        String sql = "insert into bso_fornecedores values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, fornc.getBso_idfornecedores());
            pst.setString(2, fornc.getBso_nome_empresa());
            pst.setString(3, fornc.getBso_nome_responsavel());
            pst.setString(4, fornc.getBso_cnpj());
            pst.setString(5, fornc.getBso_inscricao());
            pst.setString(6, fornc.getBso_email());
            pst.setString(7, fornc.getBso_telefone());
            pst.setString(8, fornc.getBso_contato_responsavel());
            pst.setString(9, fornc.getBso_cep());
            pst.setString(10, fornc.getBso_endereco());
            pst.setString(11, fornc.getBso_bairro());
            pst.setString(12, fornc.getBso_cidade());
            pst.setString(13, fornc.getBso_estado());
            pst.setString(14, fornc.getBso_site_oficial());
            pst.setString(15, fornc.getBso_ativo());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoBsoFornecedores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoBsoFornecedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}