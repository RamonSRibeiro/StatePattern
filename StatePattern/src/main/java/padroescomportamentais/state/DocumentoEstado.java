package padroescomportamentais.state;

public abstract class DocumentoEstado {

    public abstract String getEstado();

    public boolean elaborar(Documento documento) {
        return false;
    }

    public boolean aprovar(Documento documento) {
        return false;
    }

    public boolean arquivar(Documento documento) {
        return false;
    }

    public boolean cancelar(Documento documento) {
        return false;
    }

    public boolean rejeitar(Documento documento) {
        return false;
    }

    public boolean publicar(Documento documento) {
        return false;
    }

}

