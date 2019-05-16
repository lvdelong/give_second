/**
 * Copyright (C), 2015-2019,金科教育
 * FileName: JingTai
 * Author:  张成元
 * Date:     2019/5/16 17:38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 张成元           修改时间           版本号              描述
 */
package com.zp.model.yemianguanli;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 张成元
 * @create 2019/5/16
 * @since 1.0.0
 */
public class JingTai implements Serializable {

    private static final long serialVersionUID = 6769149268190207440L;

    private Integer id;

    private String jname;

    private Integer bnumber;

    private String createtime;

    private String author;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public Integer getBnumber() {
        return bnumber;
    }

    public void setBnumber(Integer bnumber) {
        this.bnumber = bnumber;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "JingTai{" +
                "id=" + id +
                ", jname='" + jname + '\'' +
                ", bnumber=" + bnumber +
                ", createtime='" + createtime + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
