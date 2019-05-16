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
import com.zp.model.yemianguanli.JingTai;
import com.zp.model.yemianguanli.YeMian;
import org.apache.ibatis.annotations.Param;

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

    void deleteTaoCan(Integer id);

    TaoCan findTaoCanById(Integer id);



    /*----------------------------------------------------------------------------------*/
    //系统分类

    //系统分类添加
    /*void addSystem(Systematics systematics);*/

    /*----------------------------------------------------------------------------------*/
    //页面管理

    //查询
    List<YeMian>  findYeMian();

    //新增
    void addYeMian(YeMian yeMian);

    //删除
    void deleteYeMian(Integer id);

    //静态页面查询
    List<JingTai> findjingtai();

    void deleteOne(Integer id);
}
