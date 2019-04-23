package com.example.solicitude.pojo;

public class User {
    private long id;
    //用户名
    private String username;
    //密码
    private String password;
    //昵称
    private String nickName;
    //头像
    private String imgUrl;
    //手机号
    private String telPhoneNumber;
    //用户类型
    private String type;
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTelPhoneNumber() {
        return telPhoneNumber;
    }

    public void setTelPhoneNumber(String telPhoneNumber) {
        this.telPhoneNumber = telPhoneNumber == null ? null : telPhoneNumber.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}