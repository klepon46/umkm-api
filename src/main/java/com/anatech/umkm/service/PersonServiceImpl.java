package com.anatech.umkm.service;

import com.anatech.umkm.model.Person;
import com.anatech.umkm.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
