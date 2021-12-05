package com.github.codedevjunior.view;

public class Empresa {

    private String codigoEmpresa;
    private String nomeEmpresa;
    private String nomeFantasiaEmpresa;
    private String cnpjEmpresa;

    public Empresa(String codigoEmpresa, String nomeEmpresa, String nomeFantasiaEmpresa, String cnpjEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
        this.nomeEmpresa = nomeEmpresa;
        this.nomeFantasiaEmpresa = nomeFantasiaEmpresa;
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeFantasiaEmpresa() {
        return nomeFantasiaEmpresa;
    }

    public void setNomeFantasiaEmpresa(String nomeFantasiaEmpresa) {
        this.nomeFantasiaEmpresa = nomeFantasiaEmpresa;
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }
}
