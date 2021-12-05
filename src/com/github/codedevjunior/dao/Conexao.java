package com.github.codedevjunior.dao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Connection conectaBD(){
        Connection con = null;

        try{
            String url = "jdbc:postgresql://localhost:5432/EmpresaSoftware?user=postgres&password=721570";
            con = DriverManager.getConnection(url);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Conexao" + e.getMessage());
        }
        return con;
    }
}
