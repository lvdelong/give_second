/**
 * Copyright (C), 2015-2019
 * FileName: OrderController
 * Author:   Administrator
 * Date:     2019/5/14 10:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.controller.business.order;

import com.zp.model.OrderBean;
import com.zp.service.ZpFeignService;
import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("order")
@CrossOrigin
public class OrderController {

    @Autowired
    private ZpFeignService zpFeignService;

    @GetMapping("findOrderList")
    @ResponseBody
    public List<OrderBean> findOrderList(@RequestParam("payTheBill") String payTheBill,@RequestParam("applyTime") String applyTime,@RequestParam("status") String status,
                                         @RequestParam("orderType") String orderType,@RequestParam("searchSelect") String searchSelect,@RequestParam("searchxq") String searchxq){

        List<OrderBean> orderList = zpFeignService.findOrderList(payTheBill,applyTime,status,orderType,searchSelect,searchxq);

        return orderList;
    }

    @DeleteMapping("deleteOrder/{ids}")
    @ResponseBody
    public HashMap<String,Object> deleteOrder(@PathVariable("ids") String[] ids){
           HashMap<String, Object> result = new HashMap<>();

        try {

           zpFeignService.deleteOrder(ids);

            result.put("status",true);
            return result;

        }catch (Exception e){
            e.printStackTrace();
            result.put("status",false);
            return result;
        }
    }
}
