package pe.edu.upc.tfcreo.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfcreo.entities.Imagenes;
import pe.edu.upc.tfcreo.repositories.IImagenesRepository;
import pe.edu.upc.tfcreo.servicesinterface.IImagenesService;

import java.util.List;

@Service
public class ImagenesServiceImplement implements IImagenesService {

    @Autowired
    private IImagenesRepository imagenesR;

    @Override
    public void insertarImagenes(Imagenes imagenes) {

    }

    @Override
    public void updateImagenes(Imagenes imagenes) {

    }

    @Override
    public void eliminarImagenes(int id) {

    }

    @Override
    public List<Imagenes> listarImagenes() {
        return imagenesR.findAll();
    }
}
