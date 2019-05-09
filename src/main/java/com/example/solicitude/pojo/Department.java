package com.example.solicitude.pojo;
//18189117476
public class Department {
    private long id;
    //用户id
    private long userId;
    //机构名称
    private String departmentName;
    //机构地址
    private String departmentAddress;
    //服务详情
    private String departmentIfo;
    //服务详情
    private String departmentAptitude;
    //手机号
    private String departmentPhoneNumber;
    //机构是否已认证
    private String departmentCognition;
    //机构头像
    private String imgUrl;
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

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress == null ? null : departmentAddress.trim();
    }

    public String getDepartmentAptitude() {
        return departmentAptitude;
    }

    public void setDepartmentAptitude(String departmentAptitude) {
        this.departmentAptitude = departmentAptitude == null ? null : departmentAptitude.trim();
    }

    public String getDepartmentCognition() {
        return departmentCognition;
    }

    public void setDepartmentCognition(String departmentCognition) {
        this.departmentCognition = departmentCognition == null ? null : departmentCognition.trim();
    }

    public String getDepartmentIfo() {
        return departmentIfo;
    }

    public void setDepartmentIfo(String departmentIfo) {
        this.departmentIfo = departmentIfo == null ? null : departmentIfo.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDepartmentPhoneNumber() {
        return departmentPhoneNumber;
    }

    public void setDepartmentPhoneNumber(String departmentPhoneNumber) {
        this.departmentPhoneNumber = departmentPhoneNumber == null ? null : departmentPhoneNumber.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", userId=" + userId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departmentIfo='" + departmentIfo + '\'' +
                ", departmentAptitude='" + departmentAptitude + '\'' +
                ", departmentPhoneNumber='" + departmentPhoneNumber + '\'' +
                ", departmentCognition='" + departmentCognition + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", blanckSpaceOne='" + blanckSpaceOne + '\'' +
                ", blanckSpaceTwo='" + blanckSpaceTwo + '\'' +
                ", blanckSpaceThree='" + blanckSpaceThree + '\'' +
                '}';
    }
}