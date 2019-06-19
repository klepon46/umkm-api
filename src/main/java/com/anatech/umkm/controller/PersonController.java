package com.anatech.umkm.controller;

import com.anatech.umkm.service.PersonService;
import com.anatech.umkm.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(value = "all")
    ResponseEntity<Response> findAll() {

        Response response = new Response();
        response.setMessage("200");
        response.setData(personService.findAll());


        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(response);
    }


}
