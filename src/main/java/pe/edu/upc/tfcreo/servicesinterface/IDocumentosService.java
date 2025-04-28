package pe.edu.upc.tfcreo.servicesinterface;

import pe.edu.upc.tfcreo.entities.Documentos;

import java.util.List;

public interface IDocumentosService {

    public void insertarDocumentos(Documentos documentos);
    public void updateDocumentos(Documentos documentos);
    public void eliminarDocumentos(int id);
    public List<Documentos> listarDocumentos();
}
