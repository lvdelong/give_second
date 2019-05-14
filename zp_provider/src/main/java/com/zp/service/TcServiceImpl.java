/**
 * Copyright (C), 2015-2019,金科教育
 * FileName: TcServiceImpl
 * Author:  张成元
 * Date:     2019/5/12 17:34
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 张成元           修改时间           版本号              描述
 */
package com.zp.service;

import com.zp.mapper.TcMapper;
import com.zp.model.TaoCan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author 张成元
 * @create 2019/5/12
 * @since 1.0.0
 */
@Controller
public class TcServiceImpl implements TcService{

    @Autowired
    private TcMapper tcMapper;

    @Override
    @ResponseBody
    public List<TaoCan> findTaoCan() {
        System.out.println(TaoCan.class);
        return tcMapper.findTaoCan();
    }

    @Override
    public void saveTaoCan(TaoCan taoCan) {
        tcMapper.saveTaoCan(taoCan);
    }

    @Override
    public void deleteTaoCan(Integer[] ids) {
        tcMapper.deleteTaoCan(ids);
    }

    @Override
    public TaoCan findTaoCanById(Integer id) {
        return tcMapper.findTaoCanById(id);
    }


}
