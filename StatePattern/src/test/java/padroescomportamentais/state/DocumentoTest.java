package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentoTest {

    Documento documento;

    @BeforeEach
    public void setUp() {
        documento = new Documento();
    }

    // Documento em elaboração

    @Test
    public void naoDeveElaborarDocumentoEmElaboracao() {
        documento.setEstado(DocumentoEstadoEmElaboracao.getInstance());
        assertFalse(documento.elaborar());
    }

    @Test
    public void deveAprovarDocumentoEmElaboracao() {
        documento.setEstado(DocumentoEstadoEmElaboracao.getInstance());
        assertTrue(documento.aprovar());
        assertEquals(DocumentoEstadoAprovado.getInstance(), documento.getEstado());
    }

    @Test
    public void deveArquivarDocumentoEmElaboracao() {
        documento.setEstado(DocumentoEstadoEmElaboracao.getInstance());
        assertTrue(documento.arquivar());
        assertEquals(DocumentoEstadoArquivado.getInstance(), documento.getEstado());
    }

    @Test
    public void deveCancelarDocumentoEmElaboracao() {
        documento.setEstado(DocumentoEstadoEmElaboracao.getInstance());
        assertTrue(documento.cancelar());
        assertEquals(DocumentoEstadoCancelado.getInstance(), documento.getEstado());
    }

    @Test
    public void deveRejeitarDocumentoEmElaboracao() {
        documento.setEstado(DocumentoEstadoEmElaboracao.getInstance());
        assertTrue(documento.rejeitar());
        assertEquals(DocumentoEstadoRejeitado.getInstance(), documento.getEstado());
    }

    @Test
    public void devePublicarDocumentoEmElaboracao() {
        documento.setEstado(DocumentoEstadoEmElaboracao.getInstance());
        assertTrue(documento.publicar());
        assertEquals(DocumentoEstadoPublicado.getInstance(), documento.getEstado());
    }

    // Documento arquivado

    @Test
    public void deveElaborarDocumentoArquivado() {
        documento.setEstado(DocumentoEstadoArquivado.getInstance());
        assertTrue(documento.elaborar());
        assertEquals(DocumentoEstadoEmElaboracao.getInstance(), documento.getEstado());
    }

    @Test
    public void naoDeveAprovarDocumentoArquivado() {
        documento.setEstado(DocumentoEstadoArquivado.getInstance());
        assertFalse(documento.aprovar());
    }

    @Test
    public void naoDeveArquivarDocumentoArquivado() {
        documento.setEstado(DocumentoEstadoArquivado.getInstance());
        assertFalse(documento.arquivar());
    }

    @Test
    public void deveCancelarDocumentoArquivado() {
        documento.setEstado(DocumentoEstadoArquivado.getInstance());
        assertTrue(documento.cancelar());
        assertEquals(DocumentoEstadoCancelado.getInstance(), documento.getEstado());
    }

    @Test
    public void deveRejeitarDocumentoArquivado() {
        documento.setEstado(DocumentoEstadoArquivado.getInstance());
        assertTrue(documento.rejeitar());
        assertEquals(DocumentoEstadoRejeitado.getInstance(), documento.getEstado());
    }

    @Test
    public void naoDevePublicarDocumentoArquivado() {
        documento.setEstado(DocumentoEstadoArquivado.getInstance());
        assertFalse(documento.publicar());
    }

    // Documento aprovado

    @Test
    public void naoDeveElaborarDocumentoAprovado() {
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        assertFalse(documento.elaborar());
    }

    @Test
    public void naoDeveAprovarDocumentoAprovado() {
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        assertFalse(documento.aprovar());
    }

    @Test
    public void naoDeveArquivarDocumentoAprovado() {
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        assertFalse(documento.arquivar());
    }

    @Test
    public void naoDeveCancelarDocumentoAprovado() {
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        assertFalse(documento.cancelar());
    }

    @Test
    public void naoDeveRejeitarDocumentoAprovado() {
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        assertFalse(documento.rejeitar());
    }

    @Test
    public void naoDevePublicarDocumentoAprovado() {
        documento.setEstado(DocumentoEstadoAprovado.getInstance());
        assertFalse(documento.publicar());
    }

    // Documento cancelado

    @Test
    public void naoDeveElaborarDocumentoCancelado() {
        documento.setEstado(DocumentoEstadoCancelado.getInstance());
        assertFalse(documento.elaborar());
    }

    @Test
    public void naoDeveAprovarDocumentoCancelado() {
        documento.setEstado(DocumentoEstadoCancelado.getInstance());
        assertFalse(documento.aprovar());
    }

    @Test
    public void naoDeveArquivarDocumentoCancelado() {
        documento.setEstado(DocumentoEstadoCancelado.getInstance());
        assertFalse(documento.arquivar());
    }

    @Test
    public void naoDeveCancelarDocumentoCancelado() {
        documento.setEstado(DocumentoEstadoCancelado.getInstance());
        assertFalse(documento.cancelar());
    }

    @Test
    public void naoDeveRejeitarDocumentoCancelado() {
        documento.setEstado(DocumentoEstadoCancelado.getInstance());
        assertFalse(documento.rejeitar());
    }

    @Test
    public void naoDevePublicarDocumentoCancelado() {
        documento.setEstado(DocumentoEstadoCancelado.getInstance());
        assertFalse(documento.publicar());
    }

    // Documento rejeitado

    @Test
    public void naoDeveElaborarDocumentoRejeitado() {
        documento.setEstado(DocumentoEstadoRejeitado.getInstance());
        assertFalse(documento.elaborar());
    }

    @Test
    public void naoDeveAprovarDocumentoRejeitado() {
        documento.setEstado(DocumentoEstadoRejeitado.getInstance());
        assertFalse(documento.aprovar());
    }

    @Test
    public void naoDeveArquivarDocumentoRejeitado() {
        documento.setEstado(DocumentoEstadoRejeitado.getInstance());
        assertFalse(documento.arquivar());
    }

    @Test
    public void deveCancelarDocumentoRejeitado() {
        documento.setEstado(DocumentoEstadoRejeitado.getInstance());
        assertTrue(documento.cancelar());
        assertEquals(DocumentoEstadoCancelado.getInstance(), documento.getEstado());
    }

    @Test
    public void naoDeveRejeitarDocumentoRejeitado() {
        documento.setEstado(DocumentoEstadoRejeitado.getInstance());
        assertFalse(documento.rejeitar());
    }

    @Test
    public void naoDevePublicarDocumentoRejeitado() {
        documento.setEstado(DocumentoEstadoRejeitado.getInstance());
        assertFalse(documento.publicar());
    }

    // Documento publicado

    @Test
    public void naoDeveElaborarDocumentoPublicado() {
        documento.setEstado(DocumentoEstadoPublicado.getInstance());
        assertFalse(documento.elaborar());
    }

    @Test
    public void naoDeveAprovarDocumentoPublicado() {
        documento.setEstado(DocumentoEstadoPublicado.getInstance());
        assertFalse(documento.aprovar());
    }

    @Test
    public void naoDeveArquivarDocumentoPublicado() {
        documento.setEstado(DocumentoEstadoPublicado.getInstance());
        assertFalse(documento.arquivar());
    }

    @Test
    public void naoDeveCancelarDocumentoPublicado() {
        documento.setEstado(DocumentoEstadoPublicado.getInstance());
        assertFalse(documento.cancelar());
    }

    @Test
    public void naoDeveRejeitarDocumentoPublicado() {
        documento.setEstado(DocumentoEstadoPublicado.getInstance());
        assertFalse(documento.rejeitar());
    }

    @Test
    public void naoDevePublicarDocumentoPublicado() {
        documento.setEstado(DocumentoEstadoPublicado.getInstance());
        assertFalse(documento.publicar());
    }

}

