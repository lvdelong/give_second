/**
 * Copyright (C), 2015-2019, jk
 * FileName: JobController
 * Author:   lvdelong
 * Date:     2019/5/13 22:02
 * Description: 职位管理
 * History:
 * lvdelong          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.controller.job;

import com.zp.service.job.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉
 *
 *
 * @author lvdelong
 * @create 2019/5/13
 * @since 1.0.0
 */
@RestController
@RequestMapping("/job")
@CrossOrigin
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping("findPagel")
    public List findPagel() {
        return jobService.findPagel();
    }

    @RequestMapping("delJob")
    public Map<String,Object> delJob(String id){
        HashMap<String, Object> map = new HashMap<String, Object>();
        try {
            jobService.delJob(id);
            map.put("success",true);
            map.put("msg","删除成功了");
        }catch (Exception e){
            e.printStackTrace();
            map.put("success",false);
            map.put("msg","删除失败了");
        }

        return map;
    }

}