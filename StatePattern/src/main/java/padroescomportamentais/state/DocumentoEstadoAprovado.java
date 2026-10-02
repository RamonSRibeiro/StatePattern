package padroescomportamentais.state;

public class DocumentoEstadoAprovado extends DocumentoEstado {

    private DocumentoEstadoAprovado() {};
    private static DocumentoEstadoAprovado instance = new DocumentoEstadoAprovado();
    public static DocumentoEstadoAprovado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aprovado";
    }


}

