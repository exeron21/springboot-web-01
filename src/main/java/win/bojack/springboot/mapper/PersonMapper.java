package win.bojack.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import win.bojack.springboot.model.Person;

import java.util.List;

@Mapper
public interface PersonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    List<Person> getAllPerson();
}