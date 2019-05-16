package com.zp.model.person;

public class PersonBean {

    private Integer id;
    private String personName;
    private String personInfo;
    private String resumeIntegrity;
    private Integer approvalStatus;
    private Integer publics;
    private String createTime;
    private String refreshTime;
    private String  gaoji;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(String personInfo) {
        this.personInfo = personInfo;
    }

    public String getResumeIntegrity() {
        return resumeIntegrity;
    }

    public void setResumeIntegrity(String resumeIntegrity) {
        this.resumeIntegrity = resumeIntegrity;
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Integer getPublics() {
        return publics;
    }

    public void setPublics(Integer publics) {
        this.publics = publics;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getRefreshTime() {
        return refreshTime;
    }

    public void setRefreshTime(String refreshTime) {
        this.refreshTime = refreshTime;
    }

    public String getGaoji() {
        return gaoji;
    }

    public void setGaoji(String gaoji) {
        this.gaoji = gaoji;
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "id=" + id +
                ", personName='" + personName + '\'' +
                ", personInfo='" + personInfo + '\'' +
                ", resumeIntegrity='" + resumeIntegrity + '\'' +
                ", approvalStatus=" + approvalStatus +
                ", publics=" + publics +
                ", createTime='" + createTime + '\'' +
                ", refreshTime='" + refreshTime + '\'' +
                ", gaoji='" + gaoji + '\'' +
                '}';
    }

}
