/**
 * Copyright (C), 2015-2019, jk
 * FileName: JobServiceApi
 * Author:   lvdelong
 * Date:     2019/5/13 22:10
 * Description:
 * History:
 * lvdelong          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.service.job;

import org.springframework.web.bind.annotation.RequestMapping;
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
public interface JobServiceApi {

    @RequestMapping("/findPage")
    @ResponseBody
    public List findPagel();

    @RequestMapping("/delJob")
    @ResponseBody
    void delJob(@RequestParam("id") String id);
}