package win.bojack.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import win.bojack.springboot.service.PersonService;

@RestController
public class MyBatisController {

    @Autowired
    private PersonService personService;

    @GetMapping("/boot/person")
    public Object getAllPerson() {
        return personService.getAllPerson();
    }

    @GetMapping("/boot/update")
    public Object update() {
        return personService.update();
    }
}
