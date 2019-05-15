/**
 * Copyright (C), 2015-2019, jk
 * FileName: QiyeFeign
 * Author:   lvdelong
 * Date:     2019/5/14 22:11
 * Description:
 * History:
 * lvdelong          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 〈一句话功能简述〉
 *
 *
 * @author lvdelong
 * @create 2019/5/14
 * @since 1.0.0
 */
@FeignClient(value = "zp-provider")
public interface QiyeFeign extends QiyeService{

}