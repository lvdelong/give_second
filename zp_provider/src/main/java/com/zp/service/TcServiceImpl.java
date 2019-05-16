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

import com.alibaba.fastjson.JSON;
import com.zp.mapper.TcMapper;
import com.zp.model.TaoCan;
import com.zp.model.yemianguanli.JingTai;
import com.zp.model.yemianguanli.YeMian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
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
        return tcMapper.findTaoCan();
    }

    @Override
    @ResponseBody
    public void saveTaoCan(TaoCan taoCan) {
        tcMapper.saveTaoCan(taoCan);
    }

    @Override
    public void deleteTaoCan(Integer id) {
        tcMapper.deleteTaoCan(id);
    }

    @Override
    public TaoCan findTaoCanById(Integer id) {
        return tcMapper.findTaoCanById(id);
    }




    /*--------------------------------------------------------------------------------------*/
    //系统分类


    //系统分类添加
    /*@Override
    @ResponseBody
    public void addSystem(Systematics systematics) {
        tcMapper.addSystem(systematics);
    }*/


    /*--------------------------------------------------------------------------------------*/
    //页面管理


    //页面查询
    @Override
    @ResponseBody
    public List<YeMian> findYeMian() {
        return tcMapper.findYeMian();
    }

    @Override
    @ResponseBody
    public void addYeMian(YeMian yeMian) {
        tcMapper.addYeMian(yeMian);
    }

    @Override
    public void deleteYeMian(Integer id) {
        tcMapper.deleteYeMian(id);
    }

    @Override
    public List<JingTai> findjingtai() {
        return tcMapper.findjingtai();
    }

    @Override
    public void deleteOne(Integer id) {
        tcMapper.deleteOne(id);
    }


}
