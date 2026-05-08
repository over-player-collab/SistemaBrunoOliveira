/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.BsoComprasProduto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author famil
 */
public class DaoBsoComprasProduto extends DaoAbstract{
     @Override
public void insert(Object object) {

    BsoComprasProduto cp = (BsoComprasProduto) object;

    String url = "jdbc:mysql://127.0.0.1:3306/banco_trabalho";
    String user = "root";
    String password = "";

    String sql = "INSERT INTO bso_compras_produto (bso_idcompras_produto, bso_fkproduto, bso_quantidade, bso_valor_unitario, bso_subtotal, bso_desconto) VALUES (?, ?, ?, ?, ?, ?)";

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection cnt = DriverManager.getConnection(url, user, password);
        PreparedStatement pst = cnt.prepareStatement(sql);
        pst.setInt(1, cp.getBso_idcompras_produto());
        pst.setInt(2, cp.getBso_fkproduto());
        pst.setInt(3, cp.getBso_quantidade());
        pst.setDouble(4, cp.getBso_valor_unitario());
        pst.setDouble(5, cp.getBso_subtotal());
        pst.setDouble(6, cp.getBso_desconto());

        pst.executeUpdate();  
        System.out.println("Inserido com sucesso!");

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(DaoBsoComprasProduto.class.getName()).log(Level.SEVERE, "Driver não encontrado", ex);
    } catch (SQLException ex) {
        Logger.getLogger(DaoBsoComprasProduto.class.getName()).log(Level.SEVERE, "Erro de SQL", ex);
    }
}
}
    
    
