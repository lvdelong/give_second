/**
 * Copyright (C), 2015-2019, jk
 * FileName: ServiceHiHystric
 * Author:   lvdelong
 * Date:     2019/5/10 16:53
 * Description: 熔断器
 * History:
 * lvdelong          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.hystric;

import com.zp.service.ServiceHi;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉
 *
 *
 * @author lvdelong
 * @create 2019/5/10
 * @since 1.0.0
 */
@Component
public class ServiceHiHystric implements ServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "太抱歉了"+name+"，您访问失败了！";
    }
}