package br.lab365.com.LabCar.service;

import br.lab365.com.LabCar.model.UsuarioModel;

public interface UsuarioService {

    UsuarioModel salvar(UsuarioModel usuario) throws Exception;

    Boolean existe(String email);
}
