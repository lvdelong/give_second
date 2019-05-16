/**
 * Copyright (C), 2015-2019,金科教育
 * FileName: TcServiceFeign
 * Author:  张成元
 * Date:     2019/5/12 17:33
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 张成元           修改时间           版本号              描述
 */
package com.zp.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author 张成元
 * @create 2019/5/12
 * @since 1.0.0
 */
@FeignClient(value ="zp-provider")
public interface TcServiceFeign extends TcService {

}
