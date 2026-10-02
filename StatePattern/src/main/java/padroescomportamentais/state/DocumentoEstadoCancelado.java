package padroescomportamentais.state;

public class DocumentoEstadoCancelado extends DocumentoEstado {

    private DocumentoEstadoCancelado() {};
    private static DocumentoEstadoCancelado instance = new DocumentoEstadoCancelado();
    public static DocumentoEstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelado";
    }


}

