package com.github.codedevjunior.view;

import com.github.codedevjunior.dao.Conexao;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

        String codigoEmpresa = JOptionPane.showInputDialog("Codigo: ");
        String nomeEmpresa = JOptionPane.showInputDialog("Nome: ");
        String nomeFantasiaEmpresa = JOptionPane.showInputDialog("Nome Fantasia: ");
        String cnpjEmpresa = JOptionPane.showInputDialog("CNPJ: ");

        Empresa empresa = new Empresa(codigoEmpresa, nomeEmpresa, nomeFantasiaEmpresa, cnpjEmpresa);

        System.out.println("Codigo Empresa: " + empresa.getCodigoEmpresa());
        System.out.println("Nome Empresa: " + empresa.getNomeEmpresa());
        System.out.println("Nome Fantasia Empresa: " + empresa.getNomeFantasiaEmpresa());
        System.out.println("CNPJ Empresa: " + empresa.getCnpjEmpresa());

    }
}
