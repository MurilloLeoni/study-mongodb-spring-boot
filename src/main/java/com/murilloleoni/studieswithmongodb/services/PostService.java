package com.murilloleoni.studieswithmongodb.services;

import com.murilloleoni.studieswithmongodb.domain.Post;
import com.murilloleoni.studieswithmongodb.exception.ObjectNotFoundException;
import com.murilloleoni.studieswithmongodb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Conecta com o banco de dados, e utiliza funções prontas como findAll, findById...
@Service
public class PostService {

    @Autowired //Próprio string instacia. Não precisa usar o 'new'
    private PostRepository repo;

    public Post findById(String id) {
        return repo.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }
}
