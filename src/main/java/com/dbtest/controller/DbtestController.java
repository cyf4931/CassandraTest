package com.dbtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dbtest.service.PersonService;

@Controller
@RequestMapping("/services/dbtest")
public class DbtestController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/selectPerson")
    @ResponseBody
    public String selectPerson() {
        personService.test();
        return "HEllo!";
    }
    
    @RequestMapping(value = "/selectPersonById")
    @ResponseBody
    public String selectPersonById() {
        personService.selectPersonById();
        return "HEllo!";
    }
    
    @RequestMapping(value = "/addPerson")
    @ResponseBody
    public String addPerson() {
        personService.addPerson();
        return "HEllo!";
    }

}
