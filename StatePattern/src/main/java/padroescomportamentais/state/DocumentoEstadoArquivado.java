package padroescomportamentais.state;

public class DocumentoEstadoArquivado extends DocumentoEstado {

    private DocumentoEstadoArquivado() {};
    private static DocumentoEstadoArquivado instance = new DocumentoEstadoArquivado();
    public static DocumentoEstadoArquivado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Arquivado";
    }

    public boolean elaborar(Documento documento) {
        documento.setEstado(DocumentoEstadoEmElaboracao.getInstance());
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

}

