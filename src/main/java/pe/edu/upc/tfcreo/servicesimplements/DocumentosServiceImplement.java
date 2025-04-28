package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.Documentos;
import pe.edu.upc.tfcreo.repositories.IDocumentosRepository;
import pe.edu.upc.tfcreo.servicesinterface.IDocumentosService;

import java.util.List;

@Service
public class DocumentosServiceImplement implements IDocumentosService {

    @Autowired
    private IDocumentosRepository documentosR;

    @Override
    public void insertarDocumentos(Documentos documentos) {

    }

    @Override
    public void updateDocumentos(Documentos documentos) {

    }

    @Override
    public void eliminarDocumentos(int id) {

    }

    @Override
    public List<Documentos> listarDocumentos() {
        return documentosR.findAll();
    }
}
