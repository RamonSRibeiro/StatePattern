package padroescomportamentais.state;

public class DocumentoEstadoPublicado extends DocumentoEstado {

    private DocumentoEstadoPublicado() {};
    private static DocumentoEstadoPublicado instance = new DocumentoEstadoPublicado();
    public static DocumentoEstadoPublicado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Publicado";
    }

}

