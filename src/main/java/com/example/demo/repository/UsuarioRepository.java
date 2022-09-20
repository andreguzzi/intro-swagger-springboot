package com.example.demo.repository;


import com.example.demo.handler.BusinessException;
import com.example.demo.handler.CampoObrigatorioException;
import com.example.demo.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        if (usuario.getLogin()==null)
            throw new CampoObrigatorioException("login");
        if (usuario.getPassword()==null)
            throw new CampoObrigatorioException("password");

        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("andre","senha"));
        usuarios.add(new Usuario("eva","senha"));
        usuarios.add(new Usuario("ana","senha"));
        return usuarios;
    }
    public Usuario finById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("gleyson","password");
    }

    public Usuario finByNomeUsuario(String nomeusuario){
        System.out.println(String.format("Find/nomeusuario - Recebendo o nome do usuario: %s para localizar um usuário", nomeusuario));
        return new Usuario("andre","senha");
    }

}