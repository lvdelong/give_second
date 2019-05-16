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
import com.zp.model.yemianguanli.JingTai;
import com.zp.model.yemianguanli.YeMian;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    void deleteTaoCan(@RequestParam("id") Integer id);

    @GetMapping("findTaoCanById")
    @ResponseBody
    TaoCan findTaoCanById(@RequestParam("id") Integer id);




    /*-----------------------------------------------------------------------------------------*/
    /*系统分类*/

    //系统分类添加
/*    void addSystem(@RequestBody Systematics systematics);*/


    /*-----------------------------------------------------------------------------------------*/
    //页面管理

    //页面查询
    @GetMapping("findYeMian")
    @ResponseBody
    List<YeMian> findYeMian();

    @PostMapping("addYeMian")
    @ResponseBody
    void addYeMian(@RequestBody YeMian yeMian);

    //删除 模板
    @DeleteMapping("deleteYeMian")
    @ResponseBody
    void deleteYeMian(@RequestParam("id") Integer id);

    @GetMapping("findjingtai")
    @ResponseBody
    List<JingTai> findjingtai();

    //删除 模板
    @DeleteMapping("deleteOne")
    @ResponseBody
    void deleteOne(@RequestParam("id")Integer id);
}
