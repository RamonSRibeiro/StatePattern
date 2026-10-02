package padroescomportamentais.state;

public class DocumentoEstadoEmElaboracao extends DocumentoEstado {

    private DocumentoEstadoEmElaboracao() {};
    private static DocumentoEstadoEmElaboracao instance = new DocumentoEstadoEmElaboracao();
    public static DocumentoEstadoEmElaboracao getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Elaboracao";
    }

    public boolean aprovar(Documento documento) {
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        return true;
    }

    public boolean arquivar(Documento documento) {
        documento.setEstado(DocumentoEstadoArquivado.getInstance());
        return true;
    }

    public boolean cancelar(Documento documento) {
        documento.setEstado(DocumentoEstadoCancelado.getInstance());
        return true;
    }

    public boolean rejeitar(Documento documento) {
        documento.setEstado(DocumentoEstadoRejeitado.getInstance());
        return true;
    }

    public boolean publicar(Documento documento) {
        documento.setEstado(DocumentoEstadoPublicado.getInstance());
        return true;
    }

}

