package padroescomportamentais.state;

public class Documento {

    private String nome;
    private DocumentoEstado estado;

    public Documento() {
        this.estado = DocumentoEstadoEmElaboracao.getInstance();
    }

    public void setEstado(DocumentoEstado estado) {
        this.estado = estado;
    }

    public boolean elaborar() {
        return estado.elaborar(this);
    }

    public boolean aprovar() {
        return estado.aprovar(this);
    }

    public boolean arquivar() {
        return estado.arquivar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean rejeitar() {
        return estado.rejeitar(this);
    }

    public boolean publicar() {
        return estado.publicar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DocumentoEstado getEstado() {
        return estado;
    }
}

