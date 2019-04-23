package com.example.solicitude.pojo;

public class Trend {
    private long id;
    //用户id
    private long userId;
    //动态ID
    private String activeId;
    //用户姓名
    private String givenName;
    //动态发生时间
    private String changeTime;
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

    public String getActiveId() {
        return activeId;
    }

    public void setActiveId(String activeId) {
        this.activeId = activeId == null ? null : activeId.trim();
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

    public String getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(String changeTime) {
        this.changeTime = changeTime == null ? null : changeTime.trim();
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName == null ? null : givenName.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}