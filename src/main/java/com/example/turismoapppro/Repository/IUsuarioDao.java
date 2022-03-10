package com.example.turismoapppro.Repository;

import com.example.turismoapppro.models.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioDao extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);

    @Query("select u from Usuario u where u.username=?1")
    Usuario findByUsername2(String username);

    Usuario findUsuarioById(Long id);
}
