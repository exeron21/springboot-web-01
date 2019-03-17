package win.bojack.springboot.controller;

import org.springframework.web.bind.annotation.*;
import win.bojack.springboot.model.User;

@RestController // RestController = @Controller + @ResponseBody
public class MVCController {

    @RequestMapping(value = "/boot/getUser", method = RequestMethod.GET)
    public Object getUser() {
        User u = new User();
        u.setId(123);
        u.setName("张无忌");
        return u;
    }

    @GetMapping("/boot/getUser1")
    public Object getUser1() {
        User u = new User();
        u.setId(333);
        u.setName("张无忌哈哈");
        return u;
    }

    @PostMapping("/boot/getUser2")
    public Object getUser2() {
        User u = new User();
        u.setId(981);
        u.setName("赵敏");
        return u;
    }
}
