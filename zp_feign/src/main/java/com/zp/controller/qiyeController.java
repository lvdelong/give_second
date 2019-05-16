/**
 * Copyright (C), 2019, 金科教育
 * FileName: qiyeController
 * Author:   ls
 * Date:     2019/5/12 18:08
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.controller;

import com.zp.model.Qiye;
import com.zp.service.QiyeFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author ls
 * @create 2019/5/12
 * @since 1.0.0
 */
@CrossOrigin
@Controller
@RequestMapping("qiye")
public class qiyeController {

    @Autowired
    QiyeFeign qiyeFeign;


    @PostMapping("queryqiye")
    @ResponseBody
    public HashMap<String,Object> findMoviePage(@RequestParam("page")Integer page, @RequestParam("rows")Integer rows){
        return qiyeFeign.findhoutaiFeignPage(page,rows);
    }

    @RequestMapping("findPageAxy")
    @ResponseBody
    public List findPageAxy(Qiye qiye) {
        return qiyeFeign.findPageAxy(qiye);
    }
    //新增
    @PostMapping("saveQiye")
    @ResponseBody
    public String saveCaiPin(Qiye qiye){
        qiyeFeign.saveCaiPin(qiye);
        return "1";
    }

    @RequestMapping("deleteOne")
    @ResponseBody
    public Map<String, Object> deleteOne(Integer id){
        Map<String, Object> params = new HashMap<String, Object>();
        try {
            qiyeFeign.deleteOne(id);
            params.put("success", true);
            params.put("msg", "删除成功");
            return params;
        } catch (Exception e) {
            e.printStackTrace();
            params.put("success", false);
            params.put("msg", "删除失败");
            return params;
        }
    }



}
