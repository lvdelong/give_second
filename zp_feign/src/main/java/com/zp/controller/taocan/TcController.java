/**
 * Copyright (C), 2015-2019,金科教育
 * FileName: TcController
 * Author:  张成元
 * Date:     2019/5/12 17:28
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 张成元           修改时间           版本号              描述
 */
package com.zp.controller.taocan;

import com.zp.model.TaoCan;
import com.zp.service.TcService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RestController
@RequestMapping("taocan")
@CrossOrigin
public class TcController {

    @Autowired
    private TcService tcService;

    //查询商品表
    @GetMapping("findTaoCan")
    @ResponseBody
    public List<TaoCan> findTaoCan(){
        System.out.println("-----------------成功进入");
        List<TaoCan> list=tcService.findTaoCan();
        return list;
    }

    //新增
    @PostMapping("saveTaoCan")
    @ResponseBody
    public void saveTaoCan(@RequestBody TaoCan taoCan){
        tcService.saveTaoCan(taoCan);
    }

    //批量删除
    @DeleteMapping("deleteTaoCan/{ids}")
    @ResponseBody
    public void deleteTaoCan(@PathVariable Integer[] ids){
        tcService.deleteTaoCan(ids);
    }

    //回显
    @GetMapping("findTaoCanById/{id}")
    @ResponseBody
    public TaoCan findTaoCanById(@PathVariable("id") Integer id){
        TaoCan mer = tcService.findTaoCanById(id);
        return mer;
    }

}
