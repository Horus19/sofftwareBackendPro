package com.example.turismoapppro.models.services;

import com.example.turismoapppro.models.dao.IUsuarioDao;
import com.example.turismoapppro.models.entity.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioService implements UserDetailsService {
    private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
    private IUsuarioDao usuarioDao;
    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioDao.findByUsername(username);
        if(usuario == null){
            logger.error("Error en el login: no existe el usuario '"+username+"' en el sistema");
        }
        List<GrantedAuthority> authorities = usuario.getRoles()
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getNombre()))
                .peek(authority -> logger.info("Role: "+ authority.getAuthority()))
                .collect(Collectors.toList());
        return new User(usuario.getUsername(), usuario.getPassword() , usuario.getEnable(), true, true, true, authorities );
    }
}
