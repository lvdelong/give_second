package com.zp.controller.person;

import com.alibaba.fastjson.JSON;
import com.zp.model.person.PersonBean;
import com.zp.service.PersonService;
import com.zp.mapper.person.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    @ResponseBody
    public HashMap<String, Object> findPerson(Integer page, Integer rows, String searchList) {
        PersonBean personBean = JSON.parseObject(searchList, PersonBean.class);
        HashMap<String, Object> hashMap = new HashMap<>();
        //查询总条数
        int total = personMapper.findPersonCount(personBean);
        //分页查询
        int start = (page-1)*rows;
        List<PersonBean> list = personMapper.findPerson(start,rows,personBean);
        hashMap.put("total", total);
        hashMap.put("rows", list);
        return hashMap;
    }

    @Override
    @ResponseBody
    public void delOne(Integer id) {
        personMapper.delOne(id);
    }

    @Override
    @ResponseBody
    public void deleteMany(Integer[] ids) {
        personMapper.deleteMany(ids);
    }

    @Override
    @ResponseBody
    public List<PersonBean> queryPerson() {
        return personMapper.queryPerson();
    }
}
