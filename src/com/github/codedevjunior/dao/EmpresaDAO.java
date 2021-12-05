package com.github.codedevjunior.dao;

import com.github.codedevjunior.view.Empresa;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmpresaDAO {

    Connection con;
    PreparedStatement pstm;

    public void cadastrarEmpresa(Empresa empresa){
        String sql = "INSERT INTO empresa (codigoEmpresa, nomeEmpresa, nomeFantasiaEmpresa, cnpjEmpresa) values (?,?,?,?)";

        con = new Conexao().conectaBD();

        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, empresa.getCodigoEmpresa());
            pstm.setString(2, empresa.getNomeEmpresa());
            pstm.setString(3, empresa.getNomeFantasiaEmpresa());
            pstm.setString(4, empresa.getCnpjEmpresa());

            pstm.execute();
            pstm.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
