package com.example.solicitude.pojo;

public class Elder {
    private long id;
    //入住人
    private long userId;
    //姓名
    private String givenName;
    //性别
    private String sex;
    //年龄
    private String age;
    //所在机构
    private String company;
    //入住日期
    private String startTime;
    //服务截止日期
    private String endTime;
    //多余字段
    private String blanckSpaceOne;
    private String blanckSpaceTwo;
    private String blanckSpaceThree;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getBlanckSpaceOne() {
        return blanckSpaceOne;
    }

    public void setBlanckSpaceOne(String blanckSpaceOne) {
        this.blanckSpaceOne = blanckSpaceOne == null ? null : blanckSpaceOne.trim();
    }

    public String getBlanckSpaceThree() {
        return blanckSpaceThree;
    }

    public void setBlanckSpaceThree(String blanckSpaceThree) {
        this.blanckSpaceThree = blanckSpaceThree == null ? null : blanckSpaceThree.trim();
    }

    public String getBlanckSpaceTwo() {
        return blanckSpaceTwo;
    }

    public void setBlanckSpaceTwo(String blanckSpaceTwo) {
        this.blanckSpaceTwo = blanckSpaceTwo == null ? null : blanckSpaceTwo.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName == null ? null : givenName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}