/**
 * Copyright (C), 2015-2019
 * FileName: ApiService
 * Author:   Administrator
 * Date:     2019/5/14 11:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.service;

import com.zp.model.OrderBean;
import com.zp.model.TaskBean;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/5/14
 * @since 1.0.0
 */
public interface ApiService {


    @GetMapping("findOrderList")
    @ResponseBody
    List<OrderBean> findOrderList(@RequestParam("payTheBill") String payTheBill, @RequestParam("applyTime") String applyTime, @RequestParam("status") String status,@RequestParam("orderType") String orderType,@RequestParam("searchSelect") String searchSelect,@RequestParam("searchxq")String searchxq);

    @DeleteMapping("deleteOrder/{ids}")
    @ResponseBody
    void deleteOrder(@PathVariable("ids") String[] ids);

    @GetMapping("findTaskLvErGou")
    @ResponseBody
    List<TaskBean> findTaskLvErGou();

    @DeleteMapping("deleteTaskLvErGou/{ids}")
    @ResponseBody
    void deleteTaskLvErGou(@PathVariable("ids") String[] ids);

    @PostMapping("addTaskLvErGou")
    @ResponseBody
    void addTaskLvErGou(@RequestBody TaskBean taskBean);

    @GetMapping("findTaskBeanLvErGou/{tid}")
    @ResponseBody
    TaskBean findTaskBeanLvErGou(@PathVariable("tid") String tid);

    @PostMapping("upDateTaskLvErGou")
    @ResponseBody
    void upDateTaskLvErGou(@RequestBody TaskBean taskBean);

    //订单完成数量
    @GetMapping("findOrderCountLvErGou")
    @ResponseBody
    HashMap<String,Object> findOrderCountLvErGou();
}
