package win.bojack.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import win.bojack.springboot.mapper.PersonMapper;
import win.bojack.springboot.model.Person;
import win.bojack.springboot.service.PersonService;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    // 注入SpringBoot自动配置好的RedisTemplate
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Autowired
    PersonMapper personMapper;

    @Override
    public List<Person> getAllPerson() {
        List<Person> personList = (List<Person>)redisTemplate.opsForValue().get("allPerson");
        if (personList == null) {
            // 缓存为空，查数据库
            personList = personMapper.getAllPerson();
            // 把数据查询出来的数据，放入redis中
            redisTemplate.opsForValue().set("allPerson", personList);
        }
        return personList;
    }

    @Override
    @Transactional
    public int update() {
        Person person = new Person();
        person.setId(123);
        person.setName("张无忌");
        int i = personMapper.updateByPrimaryKeySelective(person);
        System.out.println("更新结果： " + i);

        // 模拟抛异常
        int a = 10 /0 ;
        return i;
    }
}
