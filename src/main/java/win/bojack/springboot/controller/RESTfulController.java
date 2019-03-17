package win.bojack.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import win.bojack.springboot.model.User;

@RestController
public class RESTfulController {

    @RequestMapping("/boot/user/{id}")
    public Object user(@PathVariable("id") Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("张wuji");
        return user;
    }

    @RequestMapping("/boot/user/{id}/{name}")
    public Object user(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }
}
