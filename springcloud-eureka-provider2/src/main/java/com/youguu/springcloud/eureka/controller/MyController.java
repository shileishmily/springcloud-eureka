package com.youguu.springcloud.eureka.controller;

import com.youguu.springcloud.eureka.pojo.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping(value = "/info", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson() {
        Person person = new Person();

        person.setId(1);
        person.setAge(18);
        person.setName("atm");

        return person;
    }

    @RequestMapping(value = "/person/{personId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable("personId") Integer personId) {
        Person person = new Person();

        person.setId(personId);
        person.setAge(18);
        person.setName("atm");

        return person;
    }
}