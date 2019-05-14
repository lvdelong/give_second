/**
 * Copyright (C), 2015-2019, jk
 * FileName: JobService
 * Author:   lvdelong
 * Date:     2019/5/13 22:09
 * Description:
 * History:
 * lvdelong          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.service.job;

/**
 * 〈一句话功能简述〉
 *
 *
 * @author lvdelong
 * @create 2019/5/13
 * @since 1.0.0
 */

import com.zp.hystric.JobServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "zp-provider",fallback = JobServiceHystric.class)
public interface JobService extends JobServiceApi{

}