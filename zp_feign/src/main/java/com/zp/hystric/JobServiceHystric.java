/**
 * Copyright (C), 2015-2019, jk
 * FileName: JobServiceHystric
 * Author:   lvdelong
 * Date:     2019/5/14 9:31
 * Description:
 * History:
 * lvdelong          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.hystric;

import com.zp.service.job.JobService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉
 *
 *
 * @author lvdelong
 * @create 2019/5/14
 * @since 1.0.0
 */
@Component
public class JobServiceHystric implements JobService {

    @Override
    public List findPage() {
        return null;
    }

    @Override
    public void delJob(String id) {

    }
}