package com.anatech.umkm.repository;

import com.anatech.umkm.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
