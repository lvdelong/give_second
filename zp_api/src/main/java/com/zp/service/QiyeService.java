/**
 * Copyright (C), 2019, 金科教育
 * FileName: QiyeService
 * Author:   ls
 * Date:     2019/5/12 18:13
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.service;

import com.zp.model.Qiye;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author ls
 * @create 2019/5/12
 * @since 1.0.0
 */
public interface QiyeService {

    @PostMapping("queryUser")
    @ResponseBody
    HashMap<String, Object> findhoutaiFeignPage(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows);

    @PostMapping("saveQiye")
    @ResponseBody
    void saveCaiPin(@RequestBody Qiye qiye);

    @RequestMapping("deleteOne")
    @ResponseBody
    void deleteOne(@RequestParam("id") Integer id);

    @RequestMapping("findPageAxy")
    @ResponseBody
    List findPageAxy(Qiye qiye);
}
