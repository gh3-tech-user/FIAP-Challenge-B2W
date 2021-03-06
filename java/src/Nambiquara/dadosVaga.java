package Nambiquara;

import java.io.Serializable;

public class dadosVaga extends nambiquaraRh implements Serializable {

    private String detalhesVaga;
    private String curso;
    private String certificado;
    private String idioma;
    private String deficiencia;
    private String departamento;
    private boolean provaPratica;

    public String getDetalhesVaga() {
        return detalhesVaga;
    }

    public void setDetalhesVaga(String detalhesVaga) {
        this.detalhesVaga = detalhesVaga;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(String deficiencia) {
        this.deficiencia = deficiencia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isProvaPratica() {
        return provaPratica;
    }

    public void setProvaPratica(boolean provaPratica) {
        this.provaPratica = provaPratica;
    }

}