package com.backend.api;

import com.backend.api.entity.Usuario;
import com.backend.api.model.MUsuario;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component("mapper")
public class Mapper {
    public static List<MUsuario> convertirLista(List<Usuario> usuarios){
        List<MUsuario> mUsuarios = new ArrayList<>();
        for(Usuario usuario: usuarios) {
            mUsuarios.add(new MUsuario(usuario));
        }
        return mUsuarios;
    }
}
