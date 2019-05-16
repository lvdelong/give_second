/**
 * Copyright (C), 2019, 金科教育
 * FileName: Qiye
 * Author:   ls
 * Date:     2019/5/12 18:00
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zp.model;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author ls
 * @create 2019/5/12
 * @since 1.0.0
 */
public class Qiye implements Serializable {

    private static final long serialVersionUID = -8866758182072636427L;
    private Integer id;
    private String name;
    private String renzheng;
    private String shidirenzheng;
    private String time;
    private String date;
    private String taocan;
    private String zhiwei;

    @Override
    public String toString() {
        return "Qiye{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", renzheng='" + renzheng + '\'' +
                ", shidirenzheng='" + shidirenzheng + '\'' +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                ", taocan='" + taocan + '\'' +
                ", zhiwei='" + zhiwei + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRenzheng() {
        return renzheng;
    }

    public void setRenzheng(String renzheng) {
        this.renzheng = renzheng;
    }

    public String getShidirenzheng() {
        return shidirenzheng;
    }

    public void setShidirenzheng(String shidirenzheng) {
        this.shidirenzheng = shidirenzheng;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTaocan() {
        return taocan;
    }

    public void setTaocan(String taocan) {
        this.taocan = taocan;
    }

    public String getZhiwei() {
        return zhiwei;
    }

    public void setZhiwei(String zhiwei) {
        this.zhiwei = zhiwei;
    }
}
