package com.zp.controller.person;

import com.zp.model.person.PersonBean;
import com.zp.service.person.PersonServicefeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("person")
@CrossOrigin
public class PersonController {

    @Autowired
    private PersonServicefeign personServicefeign;

    @GetMapping("findPerson")
    @ResponseBody
    public HashMap<String, Object> findPerson(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, @RequestParam("searchList") String searchList) {
        return personServicefeign.findPerson(page, rows,searchList);
    }
    @GetMapping("queryPerson")
    @ResponseBody
    public List<PersonBean> queryPerson(){
        return personServicefeign.queryPerson();
    }

    //购物车删除
    @DeleteMapping("delOne/{id}")
    @ResponseBody
    public void delOne(@PathVariable("id") Integer id) {
        personServicefeign.delOne(id);
    }
    //删除
    @DeleteMapping("deleteMany")
    @ResponseBody
    public void deleteMany(@RequestParam("ids") Integer[] ids) {
        personServicefeign.deleteMany(ids);
    }

}
