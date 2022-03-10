package com.example.turismoapppro.Service.Class;

import com.example.turismoapppro.Mappers.IPublicacionMapper;
import com.example.turismoapppro.Repository.IImagenesDAO;
import com.example.turismoapppro.Service.Interfaces.IPublicacionService;
import com.example.turismoapppro.Repository.IPublicacionDao;
import com.example.turismoapppro.models.DTO.PublicacionDTO;
import com.example.turismoapppro.models.DTO.getPublicacionDTO;
import com.example.turismoapppro.models.entity.Imagen;
import com.example.turismoapppro.models.entity.Publicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PublicacionService implements IPublicacionService {

    public IPublicacionDao publicacionDao;

    private IImagenesDAO imagenesDAO;

    @Override
    public List<getPublicacionDTO> findAll() {
        var publicationList = this.publicacionDao.findAll();
        return IPublicacionMapper.INSTANCE.togetPublicacionDTOList(publicationList);
    }

    @Override
    public getPublicacionDTO findById(Long id) {
        var response = this.publicacionDao.findById(id);
        if(response.isPresent()) {
            var asd = response.get();
            return IPublicacionMapper.INSTANCE.togetPublicacionDTO(asd);
        }
        return null;
    }

    @Override
    @Transactional
    public Boolean savePublicacion(PublicacionDTO publicacionDTO) {
        var nuevaPublicacion = new Publicacion();
        nuevaPublicacion.setDescripcion(publicacionDTO.getDescripcion());
        nuevaPublicacion.setId_municipio(publicacionDTO.getId_municipio());
        nuevaPublicacion.setId_user(publicacionDTO.getId_user());
        nuevaPublicacion.setTitulo(publicacionDTO.getTitulo());
        var object = publicacionDao.save(nuevaPublicacion);
        publicacionDTO.getImagenList().forEach(x->{
            var add = new Imagen();
            add.setIdPublicacion(object.getId());
            add.setUrl(x.getUrl());
            this.imagenesDAO.save(add);
        });
        return true;
    }
    @Override
    @Transactional
    public Optional<Publicacion> update(PublicacionDTO publicacionDTO){
        var publicacion = this.publicacionDao.findById(publicacionDTO.getId());
        if(publicacion.isPresent()) {
            publicacion.get().setDescripcion(publicacionDTO.getDescripcion());
            publicacion.get().setId_municipio(publicacionDTO.getId_municipio());
            publicacion.get().setId_user(publicacionDTO.getId_user());
            publicacion.get().setTitulo(publicacionDTO.getTitulo());
            publicacionDao.save(publicacion.get());
        }
        return publicacion;
    }
    @Override
    public List<getPublicacionDTO> findAllByMunicipio(Long idMunicipio){
        var response  = this.publicacionDao.findAllById_municipio(idMunicipio);
        return IPublicacionMapper.INSTANCE.togetPublicacionDTOList(response);
    }
    @Override
    public List<getPublicacionDTO> findAllByUsuario(Long idUsuario){
        var response = this.publicacionDao.findAllByIdUser(idUsuario);
        return IPublicacionMapper.INSTANCE.togetPublicacionDTOList(response);
    }

    @Override
    public void delete(Long id) {
        publicacionDao.deleteById(id);
    }

    @Autowired
    public void setPublicacionDao(IPublicacionDao publicacionDao) {
        this.publicacionDao = publicacionDao;
    }
    @Autowired
    public void setImagenesDAO(IImagenesDAO imagenesDAO) {
        this.imagenesDAO = imagenesDAO;
    }
}

