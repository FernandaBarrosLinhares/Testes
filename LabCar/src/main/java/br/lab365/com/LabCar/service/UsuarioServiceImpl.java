package br.lab365.com.LabCar.service;

import br.lab365.com.LabCar.model.UsuarioModel;
import br.lab365.com.LabCar.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService  {

    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UsuarioModel salvar(UsuarioModel usuario) throws Exception {
        if (usuario.getId() != null) {
            throw new Exception("Dados de Usuários NÃO podem ser alterados!");
        }
        return usuarioRepository.save(usuario);
    }

    @Override
    public Boolean existe(String email) {
        return usuarioRepository.existsByEmailIgnoreCase(email);
    }

}
