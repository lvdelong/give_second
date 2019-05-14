/**
 * Copyright (C), 2015-2019, jk
 * FileName: JobMapper
 * Author:   lvdelong
 * Date:     2019/5/13 22:18
 * Description:
 * History:
 * lvdelong          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.mapper.job;

import com.zp.model.Job;

import java.util.List;

/**
 * 〈一句话功能简述〉
 *
 *
 * @author lvdelong
 * @create 2019/5/13
 * @since 1.0.0
 */
public interface JobMapper {

    public List<Job> jobListPagination();

    void delJob(String id);
}