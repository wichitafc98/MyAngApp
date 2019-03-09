package com.mytest.controller;

import com.mytest.data.Hero;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hero")
public class LoadUserControler {


    @RequestMapping(value="/getHeros",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Hero[] getHeros()
    {
        Hero[] listofHeros = new Hero[2];
        listofHeros[0] = generateHero("Mike Howard",250);
        listofHeros[1] = generateHero("Bill War",1000);
        return listofHeros;
    }

    public Hero generateHero(String name, Integer id){

        Hero h = new Hero();
        h.setName(name);
        h.setId(id);
        return h;
    }
}
