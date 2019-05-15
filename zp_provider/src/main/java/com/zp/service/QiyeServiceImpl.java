package com.zp.service;

import com.zp.mapper.QiyeMapper;
import com.zp.model.Qiye;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.smartcardio.Card;
import java.util.HashMap;
import java.util.List;

@Controller
public class QiyeServiceImpl implements QiyeService{

    @Autowired
    private QiyeMapper qiyeMapper;

    @Override
    @ResponseBody
    public HashMap<String, Object> findhoutaiFeignPage(Integer page, Integer rows) {

        HashMap<String, Object> hashMap = new HashMap<>();
        //查询总条数
        int total = qiyeMapper.findUserCount();
        //分页查询
        int start = (page - 1) * rows;
        List<Qiye> list = qiyeMapper.findUserList(start,rows);
        hashMap.put("total", total);
        hashMap.put("rows", list);
        return hashMap;

    }

    @Override
    @ResponseBody
    public void saveCaiPin(Qiye qiye) {
        qiyeMapper.saveCaiPin(qiye);
    }

    @Override
    @ResponseBody
    public void deleteOne(Integer id) {
        qiyeMapper.deleteOne(id);
    }

    @Override
    @ResponseBody
    public List findPageAxy(Qiye qiye) {
        return qiyeMapper.findPageAxy(qiye);
    }


}
