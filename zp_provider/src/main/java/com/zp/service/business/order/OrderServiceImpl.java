/**
 * Copyright (C), 2015-2019
 * FileName: OrderService
 * Author:   Administrator
 * Date:     2019/5/14 11:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.service.business.order;

import com.zp.mapper.business.order.OrderMapper;
import com.zp.model.OrderBean;
import com.zp.model.TaskBean;
import com.zp.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/5/14
 * @since 1.0.0
 */
@Controller
public class OrderServiceImpl implements ApiService {

    @Autowired
    private OrderMapper orderMapper;

    //条件查询
    @Override
    public List<OrderBean> findOrderList(String payTheBill, String applyTime,String status,String orderType, String searchSelect,String searchxq) {
        OrderBean orderBean = new OrderBean();
        orderBean.setPayTheBill(payTheBill);
        orderBean.setApplyTime(applyTime);
        orderBean.setStatus(status);
        orderBean.setOrderType(orderType);
        return orderMapper.findOrderList(orderBean,searchSelect, searchxq);
    }

    //批量删除
    @Override
    public void deleteOrder(String[] ids) {
        orderMapper.deleteOrder(ids);
    }

    //任务列表查询
    @Override
    public List<TaskBean> findTaskLvErGou() {
        List<TaskBean> taskList=orderMapper.findTaskLvErGou();
        return taskList;
    }

    @Override
    public void deleteTaskLvErGou(String[] ids) {
        orderMapper.deleteTaskLvErGou(ids);
    }

    @Override
    public void addTaskLvErGou(TaskBean taskBean) {
        taskBean.setTaskType("内置");
        orderMapper.addTaskLvErGou(taskBean);
    }

    @Override
    public TaskBean findTaskBeanLvErGou(String tid) {
        TaskBean taskBean=orderMapper.findTaskBeanLvErGou(tid);
        return taskBean;
    }

    @Override
    public void upDateTaskLvErGou(TaskBean taskBean) {
        taskBean.setTaskType("内置");
        orderMapper.upDateTaskLvErGou(taskBean);
    }
}
