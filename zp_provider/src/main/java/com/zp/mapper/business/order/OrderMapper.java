/**
 * Copyright (C), 2015-2019
 * FileName: OrderMapper
 * Author:   Administrator
 * Date:     2019/5/14 14:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.mapper.business.order;


import com.zp.model.OrderBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/5/14
 * @since 1.0.0
 */
public interface OrderMapper {

    List<OrderBean> findOrderList(@Param("orderBean") OrderBean orderBean,@Param("searchSelect")String searchSelect,@Param("searchxq")String searchxq);

    void deleteOrder(@Param("ids") String[] ids);
}
