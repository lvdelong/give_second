package com.zp.mapper.person;

import com.zp.model.person.PersonBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonMapper {
    int findPersonCount(@Param("personBean") PersonBean personBean);

    List<PersonBean> findPerson(@Param("start") int start, @Param("rows") Integer rows, @Param("personBean") PersonBean personBean);

    void delOne(Integer id);

    void deleteMany(Integer[] ids);

    List<PersonBean> queryPerson();
}
