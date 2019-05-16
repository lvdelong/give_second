/**
 * Copyright (C), 2015-2019,金科教育
 * FileName: taocan
 * Author:  张成元
 * Date:     2019/5/12 17:19
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 张成元           修改时间           版本号              描述
 */
package com.zp.model;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author 张成元
 * @create 2019/5/12
 * @since 1.0.0
 */
public class TaoCan implements Serializable {

    private static final long serialVersionUID = -7603095677987486474L;

    /*id*/
    private Integer id;

    /*套餐名称*/
    private String tcname;

    /*公司名称*/
    private String gsname;

    /*员工名称*/
    private String ygname;

    /*开始时间*/
    private String starttime;

    /*结束时间*/
    private String endtime;

    /*剩余天数*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTcname() {
        return tcname;
    }

    public void setTcname(String tcname) {
        this.tcname = tcname;
    }

    public String getGsname() {
        return gsname;
    }

    public void setGsname(String gsname) {
        this.gsname = gsname;
    }

    public String getYgname() {
        return ygname;
    }

    public void setYgname(String ygname) {
        this.ygname = ygname;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    @Override
    public String toString() {
        return "TaoCan{" +
                "id=" + id +
                ", tcname='" + tcname + '\'' +
                ", gsname='" + gsname + '\'' +
                ", ygname='" + ygname + '\'' +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                '}';
    }
}
