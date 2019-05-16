/**
 * Copyright (C), 2015-2019,金科教育
 * FileName: YeMian
 * Author:  张成元
 * Date:     2019/5/15 22:11
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 张成元           修改时间           版本号              描述
 */
package com.zp.model.yemianguanli;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author 张成元
 * @create 2019/5/15
 * @since 1.0.0
 */
public class YeMian implements Serializable {

    private static final long serialVersionUID = 7584999013686455289L;

    private Integer id;

    private Integer systemclass;

    private Integer pagetype;

    private String alias;

    private String pname;

    private String module;

    private String controller;

    private String action;

    private String rewrite;

    private  Integer url;

    private Integer caching;

    private  String tag;

    private  String title;

    private  String description;

    private  String keywords;

    private  String variate;

    private  String type;

    private String urlnames;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSystemclass() {
        return systemclass;
    }

    public void setSystemclass(Integer systemclass) {
        this.systemclass = systemclass;
    }

    public Integer getPagetype() {
        return pagetype;
    }

    public void setPagetype(Integer pagetype) {
        this.pagetype = pagetype;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getRewrite() {
        return rewrite;
    }

    public void setRewrite(String rewrite) {
        this.rewrite = rewrite;
    }

    public Integer getUrl() {
        return url;
    }

    public void setUrl(Integer url) {
        this.url = url;
    }

    public Integer getCaching() {
        return caching;
    }

    public void setCaching(Integer caching) {
        this.caching = caching;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getVariate() {
        return variate;
    }

    public void setVariate(String variate) {
        this.variate = variate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrlnames() {
        return urlnames;
    }

    public void setUrlnames(String urlnames) {
        this.urlnames = urlnames;
    }

    @Override
    public String toString() {
        return "YeMian{" +
                "id=" + id +
                ", systemclass=" + systemclass +
                ", pagetype=" + pagetype +
                ", alias='" + alias + '\'' +
                ", pname='" + pname + '\'' +
                ", module='" + module + '\'' +
                ", controller='" + controller + '\'' +
                ", action='" + action + '\'' +
                ", rewrite='" + rewrite + '\'' +
                ", url=" + url +
                ", caching=" + caching +
                ", tag='" + tag + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", keywords='" + keywords + '\'' +
                ", variate='" + variate + '\'' +
                ", type='" + type + '\'' +
                ", urlnames='" + urlnames + '\'' +
                '}';
    }
}
