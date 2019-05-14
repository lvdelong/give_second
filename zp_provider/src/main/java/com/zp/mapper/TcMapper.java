/**
 * Copyright (C), 2015-2019,金科教育
 * FileName: TcMapper
 * Author:  张成元
 * Date:     2019/5/12 17:37
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 张成元           修改时间           版本号              描述
 */
package com.zp.mapper;

import com.zp.model.TaoCan;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author 张成元
 * @create 2019/5/12
 * @since 1.0.0
 */
public interface TcMapper {

    /*int findTaoCanCount();*/

    List<TaoCan> findTaoCan();

    void saveTaoCan(TaoCan taoCan);

    void deleteTaoCan(Integer[] ids);

    TaoCan findTaoCanById(Integer id);
}
