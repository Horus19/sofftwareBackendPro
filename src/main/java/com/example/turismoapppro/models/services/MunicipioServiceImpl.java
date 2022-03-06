package com.example.turismoapppro.models.services;

import com.example.turismoapppro.models.dao.IMunicipioDao;
import com.example.turismoapppro.models.entity.Municipio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MunicipioServiceImpl implements IMunicipioService{
    @Autowired
    private IMunicipioDao municipioDao;
    @Override
    public List<Municipio> findAll() {
        return (List<Municipio>) municipioDao.findAll();
    }
}
