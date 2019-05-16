/**
 * Copyright (C), 2015-2019,金科教育
 * FileName: TcService
 * Author:  张成元
 * Date:     2019/5/12 17:33
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 张成元           修改时间           版本号              描述
 */
package com.zp.service;


import com.zp.model.TaoCan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author 张成元
 * @create 2019/5/12
 * @since 1.0.0
 */
public interface TcService {

    @GetMapping("findTaoCan")
    @ResponseBody
    List<TaoCan> findTaoCan();

    @PostMapping("saveTaoCan")
    @ResponseBody
    void saveTaoCan(@RequestBody TaoCan taoCan);

    //删除 模板
    @DeleteMapping("deleteTaoCan")
    @ResponseBody
    void deleteTaoCan(@RequestParam("ids") Integer[] ids);

    @GetMapping("findTaoCanById")
    @ResponseBody
    TaoCan findTaoCanById(@RequestParam("id") Integer id);
}
