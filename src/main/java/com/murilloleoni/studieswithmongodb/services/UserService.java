package com.murilloleoni.studieswithmongodb.services;

import com.murilloleoni.studieswithmongodb.domain.User;
import com.murilloleoni.studieswithmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Conecta com o banco de dados, e utiliza funções prontas como findAll, findById...
@Service
public class UserService {

    @Autowired //Próprio string instacia. Não precisa usar o 'new'
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
}
