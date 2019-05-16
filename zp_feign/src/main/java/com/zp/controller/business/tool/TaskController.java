/**
 * Copyright (C), 2015-2019
 * FileName: TaskController
 * Author:   Administrator
 * Date:     2019/5/16 15:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.controller.business.tool;

import com.zp.model.OrderBean;
import com.zp.model.TaskBean;
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
 * @create 2019/5/16
 * @since 1.0.0
 */
@RestController
@RequestMapping("task")
@CrossOrigin
public class TaskController {
    @Autowired
    private ZpFeignService zpFeignService;

    //查询任务计划表
    @GetMapping("findTaskLvErGou")
    @ResponseBody
    public List<TaskBean> findTaskLvErGou(){
        List<TaskBean>  taskList=zpFeignService.findTaskLvErGou();
        return taskList;
    }

    //批量删除+单删除
    @DeleteMapping("deleteTaskLvErGou/{ids}")
    @ResponseBody
    public HashMap<String,Object> deleteTaskLvErGou(@PathVariable("ids") String[] ids){
        HashMap<String, Object> result = new HashMap<>();

        try {
            zpFeignService.deleteTaskLvErGou(ids);
            result.put("status",true);
            return result;

        }catch (Exception e){
            e.printStackTrace();
            result.put("status",false);
            return result;
        }
    }

    //保存
    @PostMapping("addTaskLvErGou")
    @ResponseBody
    public HashMap<String, Object> addTaskLvErGou(@RequestBody TaskBean taskBean){
        HashMap<String, Object> result = new HashMap<>();

        try {
            if (taskBean.getTaskId()!=""&&taskBean.getTaskId()!=null){
                zpFeignService.upDateTaskLvErGou(taskBean);
                result.put("status",true);
                return result;
            }
            zpFeignService.addTaskLvErGou(taskBean);
            result.put("status",true);
            return result;

        }catch (Exception e){
            e.printStackTrace();
            result.put("status",false);
            return result;
        }


    }


    //修改回显
    @GetMapping("findTaskBeanLvErGou/{tid}")
    @ResponseBody
    public TaskBean findTaskBeanLvErGou(@PathVariable("tid") String tid){
        System.out.println(tid+"-------");
         TaskBean  taskBean=zpFeignService.findTaskBeanLvErGou(tid);
        return taskBean;
    }




}
