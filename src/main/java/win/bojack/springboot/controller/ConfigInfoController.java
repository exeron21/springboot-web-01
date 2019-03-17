package win.bojack.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfigInfoController {

    @Value("${boot.name}")
    private String name;

    @Value("${boot.location}")
    private String location;

    @Autowired
    private ConfigInfo info;

    @RequestMapping("/boot/sayHello")
    public @ResponseBody String sayHello() {
        return info.getName() + "," + info.getSomething();
//        return name + "," + location;
    }
}
