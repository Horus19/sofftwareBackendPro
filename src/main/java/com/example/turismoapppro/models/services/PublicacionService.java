package com.example.turismoapppro.models.services;

import com.example.turismoapppro.models.dao.IPublicacionDao;
import com.example.turismoapppro.models.entity.Publicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacionService implements IPublicacionService {
    @Autowired
    public IPublicacionDao publicacionDao;
    @Override
    public List<Publicacion> findAll() {
        return (List<Publicacion>) publicacionDao.findAll();
    }

    @Override
    public Publicacion findById(Long id) {
        return publicacionDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        publicacionDao.deleteById(id);
    }
}
