/**
 * Copyright (C), 2015-2019, jk
 * FileName: JobServiceImpl
 * Author:   lvdelong
 * Date:     2019/5/13 22:14
 * Description:
 * History:
 * lvdelong          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.service.job;

import com.zp.mapper.job.JobMapper;
import com.zp.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉
 *
 *
 * @author lvdelong
 * @create 2019/5/13
 * @since 1.0.0
 */
@Controller
public class JobServiceImpl implements JobServiceApi{

    @Autowired
    private JobMapper jobMapper;

    @Override
    @ResponseBody
    public List findPage() {
        List<Job> jobList = jobMapper.jobListPagination();
        return jobList;
    }

    @Override
    @ResponseBody
    public void delJob(String id) {
        jobMapper.delJob(id);
    }
}