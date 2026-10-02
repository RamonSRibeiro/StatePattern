package padroescomportamentais.state;

public class DocumentoEstadoRejeitado extends DocumentoEstado {

    private DocumentoEstadoRejeitado() {};
    private static DocumentoEstadoRejeitado instance = new DocumentoEstadoRejeitado();
    public static DocumentoEstadoRejeitado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Rejeitado";
    }

    public boolean cancelar(Documento documento) {
        documento.setEstado(DocumentoEstadoCancelado.getInstance());
        return true;
    }
}

