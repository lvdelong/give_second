/**
 * Copyright (C), 2015-2019, jk
 * FileName: ServiceHi
 * Author:   lvdelong
 * Date:     2019/5/10 16:45
 * Description:
 * History:
 * lvdelong          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.service;

import com.zp.hystric.ServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉
 *
 *
 * @author lvdelong
 * @create 2019/5/10
 * @since 1.0.0
 */
@FeignClient(value = "zp-provider",fallback = ServiceHiHystric.class)
public interface ServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}