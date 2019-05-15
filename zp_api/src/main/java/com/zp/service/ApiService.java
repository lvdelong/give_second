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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

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
    List<OrderBean> findOrderList();

    @DeleteMapping("deleteOrder/{id}")
    @ResponseBody
    void deleteOrder(@PathVariable("id") String id);
}
