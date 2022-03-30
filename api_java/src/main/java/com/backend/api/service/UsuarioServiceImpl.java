package com.backend.api.service;

import com.backend.api.dao.IUsuarioDAO;
import com.backend.api.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    private IUsuarioDAO usuarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioDao.findAll();
    }

    @Override
    public void save(Usuario usuario) {
        usuarioDao.save(usuario);
       // return new ResponseEntity<Void>(HttpStatus.CREATED);

    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findUsuario(Usuario usuario) {
        return (Usuario) usuarioDao.findByEmail(usuario.getEmail());
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario checkUsuarioLogin(Usuario usuario) {
        return (Usuario) usuarioDao.findByEmailAndPassword(usuario.getEmail(), usuario.getPassword());
    }

    @Override
    @Transactional
    public void deleteUsuario(Usuario usuario) {
        usuarioDao.deleteById(usuario.getId());
    }

    @Override
    @Transactional
    public Usuario uptadeUsuario(Usuario usuario) {
        return (Usuario)usuarioDao.save(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Usuario> findUsuarioById(Long usuario_id) {
        return (Optional<Usuario>)usuarioDao.findById(usuario_id);
    }

    @Override
    @Transactional
    public void deleteUsuario(Long id) {
        usuarioDao.deleteById(id);
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findByIdSQL(Long id) {
        return usuarioDao.findByIdSQL(id);
    }
}
