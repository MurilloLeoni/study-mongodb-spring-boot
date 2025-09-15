package com.murilloleoni.studieswithmongodb.services;

import com.murilloleoni.studieswithmongodb.domain.User;
import com.murilloleoni.studieswithmongodb.dto.UserDTO;
import com.murilloleoni.studieswithmongodb.exception.ObjectNotFoundException;
import com.murilloleoni.studieswithmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Conecta com o banco de dados, e utiliza funções prontas como findAll, findById...
@Service
public class UserService {

    @Autowired //Próprio string instacia. Não precisa usar o 'new'
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        return repo.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public User update(User obj) {
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

    public void delete(String id) {
        findById(id);
        repo.deleteById(id);
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
