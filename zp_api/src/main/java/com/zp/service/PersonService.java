package com.zp.service;

import com.zp.model.person.PersonBean;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

public interface PersonService {

    @GetMapping("findPerson")
    @ResponseBody
    HashMap<String, Object> findPerson(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, @RequestParam("searchList") String searchList);

    @DeleteMapping("delOne/{id}")
    @ResponseBody
    void delOne(@PathVariable("id") Integer id);

    @DeleteMapping("deleteMany")
    @ResponseBody
    void deleteMany(@RequestParam("ids") Integer[] ids);

    @GetMapping("queryPerson")
    @ResponseBody
    List<PersonBean> queryPerson();
}
