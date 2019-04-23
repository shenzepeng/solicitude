package com.example.solicitude.pojo;

import java.util.ArrayList;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneIsNull() {
            addCriterion("blanck_space_one is null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneIsNotNull() {
            addCriterion("blanck_space_one is not null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneEqualTo(String value) {
            addCriterion("blanck_space_one =", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneNotEqualTo(String value) {
            addCriterion("blanck_space_one <>", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneGreaterThan(String value) {
            addCriterion("blanck_space_one >", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneGreaterThanOrEqualTo(String value) {
            addCriterion("blanck_space_one >=", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneLessThan(String value) {
            addCriterion("blanck_space_one <", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneLessThanOrEqualTo(String value) {
            addCriterion("blanck_space_one <=", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneLike(String value) {
            addCriterion("blanck_space_one like", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneNotLike(String value) {
            addCriterion("blanck_space_one not like", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneIn(List<String> values) {
            addCriterion("blanck_space_one in", values, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneNotIn(List<String> values) {
            addCriterion("blanck_space_one not in", values, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneBetween(String value1, String value2) {
            addCriterion("blanck_space_one between", value1, value2, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneNotBetween(String value1, String value2) {
            addCriterion("blanck_space_one not between", value1, value2, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeIsNull() {
            addCriterion("blanck_space_three is null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeIsNotNull() {
            addCriterion("blanck_space_three is not null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeEqualTo(String value) {
            addCriterion("blanck_space_three =", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeNotEqualTo(String value) {
            addCriterion("blanck_space_three <>", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeGreaterThan(String value) {
            addCriterion("blanck_space_three >", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeGreaterThanOrEqualTo(String value) {
            addCriterion("blanck_space_three >=", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeLessThan(String value) {
            addCriterion("blanck_space_three <", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeLessThanOrEqualTo(String value) {
            addCriterion("blanck_space_three <=", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeLike(String value) {
            addCriterion("blanck_space_three like", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeNotLike(String value) {
            addCriterion("blanck_space_three not like", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeIn(List<String> values) {
            addCriterion("blanck_space_three in", values, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeNotIn(List<String> values) {
            addCriterion("blanck_space_three not in", values, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeBetween(String value1, String value2) {
            addCriterion("blanck_space_three between", value1, value2, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeNotBetween(String value1, String value2) {
            addCriterion("blanck_space_three not between", value1, value2, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoIsNull() {
            addCriterion("blanck_space_two is null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoIsNotNull() {
            addCriterion("blanck_space_two is not null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoEqualTo(String value) {
            addCriterion("blanck_space_two =", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoNotEqualTo(String value) {
            addCriterion("blanck_space_two <>", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoGreaterThan(String value) {
            addCriterion("blanck_space_two >", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoGreaterThanOrEqualTo(String value) {
            addCriterion("blanck_space_two >=", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoLessThan(String value) {
            addCriterion("blanck_space_two <", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoLessThanOrEqualTo(String value) {
            addCriterion("blanck_space_two <=", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoLike(String value) {
            addCriterion("blanck_space_two like", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoNotLike(String value) {
            addCriterion("blanck_space_two not like", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoIn(List<String> values) {
            addCriterion("blanck_space_two in", values, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoNotIn(List<String> values) {
            addCriterion("blanck_space_two not in", values, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoBetween(String value1, String value2) {
            addCriterion("blanck_space_two between", value1, value2, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoNotBetween(String value1, String value2) {
            addCriterion("blanck_space_two not between", value1, value2, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressIsNull() {
            addCriterion("department_address is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressIsNotNull() {
            addCriterion("department_address is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressEqualTo(String value) {
            addCriterion("department_address =", value, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressNotEqualTo(String value) {
            addCriterion("department_address <>", value, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressGreaterThan(String value) {
            addCriterion("department_address >", value, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("department_address >=", value, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressLessThan(String value) {
            addCriterion("department_address <", value, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressLessThanOrEqualTo(String value) {
            addCriterion("department_address <=", value, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressLike(String value) {
            addCriterion("department_address like", value, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressNotLike(String value) {
            addCriterion("department_address not like", value, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressIn(List<String> values) {
            addCriterion("department_address in", values, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressNotIn(List<String> values) {
            addCriterion("department_address not in", values, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressBetween(String value1, String value2) {
            addCriterion("department_address between", value1, value2, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAddressNotBetween(String value1, String value2) {
            addCriterion("department_address not between", value1, value2, "departmentAddress");
            return (Criteria) this;
        }

        public Criteria andDepartmentAptitudeIsNull() {
            addCriterion("department_aptitude is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentAptitudeIsNotNull() {
            addCriterion("department_aptitude is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentAptitudeEqualTo(String value) {
            addCriterion("department_aptitude =", value, "departmentAptitude");
            return (Criteria) this;
        }

        public Criteria andDepartmentAptitudeNotEqualTo(String value) {
            addCriterion("department_aptitude <>", value, "departmentAptitude");
            return (Criteria) this;
        }

        public Criteria andDepartmentAptitudeGreaterThan(String value) {
            addCriterion("department_aptitude >", value, "departmentAptitude");
            return (Criteria) this;
        }

        public Criteria andDepartmentAptitudeGreaterThanOrEqualTo(String value) {
            addCriterion("department_aptitude >=", value, "departmentAptitude");
            return (Criteria) this;
        }

        public Criteria andDepartmentAptitudeLessThan(String value) {
            addCriterion("department_aptitude <", value, "departmentAptitude");
            return (Criteria) this;
        }

        public Criteria andDepartmentAptitudeLessThanOrEqualTo(String value) {
            addCriterion("department_aptitude <=", value, "departmentAptitude");
            return (Criteria) this;
        }

        public Criteria andDepartmentAptitudeLike(String value) {
            addCriterion("department_aptitude like", value, "departmentAptitude");
            return (Criteria) this;
        }

        public Criteria andDepartmentAptitudeNotLike(String value) {
            addCriterion("department_aptitude not like", value, "departmentAptitude");
            return (Criteria) this;
        }

        public Criteria andDepartmentAptitudeIn(List<String> values) {
            addCriterion("department_aptitude in", values, "departmentAptitude");
            return (Criteria) this;
        }

        public Criteria andDepartmentAptitudeNotIn(List<String> values) {
            addCriterion("department_aptitude not in", values, "departmentAptitude");
            return (Criteria) this;
        }

        public Criteria andDepartmentAptitudeBetween(String value1, String value2) {
            addCriterion("department_aptitude between", value1, value2, "departmentAptitude");
            return (Criteria) this;
        }

        public Criteria andDepartmentAptitudeNotBetween(String value1, String value2) {
            addCriterion("department_aptitude not between", value1, value2, "departmentAptitude");
            return (Criteria) this;
        }

        public Criteria andDepartmentCognitionIsNull() {
            addCriterion("department_cognition is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCognitionIsNotNull() {
            addCriterion("department_cognition is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCognitionEqualTo(String value) {
            addCriterion("department_cognition =", value, "departmentCognition");
            return (Criteria) this;
        }

        public Criteria andDepartmentCognitionNotEqualTo(String value) {
            addCriterion("department_cognition <>", value, "departmentCognition");
            return (Criteria) this;
        }

        public Criteria andDepartmentCognitionGreaterThan(String value) {
            addCriterion("department_cognition >", value, "departmentCognition");
            return (Criteria) this;
        }

        public Criteria andDepartmentCognitionGreaterThanOrEqualTo(String value) {
            addCriterion("department_cognition >=", value, "departmentCognition");
            return (Criteria) this;
        }

        public Criteria andDepartmentCognitionLessThan(String value) {
            addCriterion("department_cognition <", value, "departmentCognition");
            return (Criteria) this;
        }

        public Criteria andDepartmentCognitionLessThanOrEqualTo(String value) {
            addCriterion("department_cognition <=", value, "departmentCognition");
            return (Criteria) this;
        }

        public Criteria andDepartmentCognitionLike(String value) {
            addCriterion("department_cognition like", value, "departmentCognition");
            return (Criteria) this;
        }

        public Criteria andDepartmentCognitionNotLike(String value) {
            addCriterion("department_cognition not like", value, "departmentCognition");
            return (Criteria) this;
        }

        public Criteria andDepartmentCognitionIn(List<String> values) {
            addCriterion("department_cognition in", values, "departmentCognition");
            return (Criteria) this;
        }

        public Criteria andDepartmentCognitionNotIn(List<String> values) {
            addCriterion("department_cognition not in", values, "departmentCognition");
            return (Criteria) this;
        }

        public Criteria andDepartmentCognitionBetween(String value1, String value2) {
            addCriterion("department_cognition between", value1, value2, "departmentCognition");
            return (Criteria) this;
        }

        public Criteria andDepartmentCognitionNotBetween(String value1, String value2) {
            addCriterion("department_cognition not between", value1, value2, "departmentCognition");
            return (Criteria) this;
        }

        public Criteria andDepartmentIfoIsNull() {
            addCriterion("department_ifo is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIfoIsNotNull() {
            addCriterion("department_ifo is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIfoEqualTo(String value) {
            addCriterion("department_ifo =", value, "departmentIfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentIfoNotEqualTo(String value) {
            addCriterion("department_ifo <>", value, "departmentIfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentIfoGreaterThan(String value) {
            addCriterion("department_ifo >", value, "departmentIfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentIfoGreaterThanOrEqualTo(String value) {
            addCriterion("department_ifo >=", value, "departmentIfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentIfoLessThan(String value) {
            addCriterion("department_ifo <", value, "departmentIfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentIfoLessThanOrEqualTo(String value) {
            addCriterion("department_ifo <=", value, "departmentIfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentIfoLike(String value) {
            addCriterion("department_ifo like", value, "departmentIfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentIfoNotLike(String value) {
            addCriterion("department_ifo not like", value, "departmentIfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentIfoIn(List<String> values) {
            addCriterion("department_ifo in", values, "departmentIfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentIfoNotIn(List<String> values) {
            addCriterion("department_ifo not in", values, "departmentIfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentIfoBetween(String value1, String value2) {
            addCriterion("department_ifo between", value1, value2, "departmentIfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentIfoNotBetween(String value1, String value2) {
            addCriterion("department_ifo not between", value1, value2, "departmentIfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department_name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNumberIsNull() {
            addCriterion("department_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNumberIsNotNull() {
            addCriterion("department_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNumberEqualTo(String value) {
            addCriterion("department_phone_number =", value, "departmentPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNumberNotEqualTo(String value) {
            addCriterion("department_phone_number <>", value, "departmentPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNumberGreaterThan(String value) {
            addCriterion("department_phone_number >", value, "departmentPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("department_phone_number >=", value, "departmentPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNumberLessThan(String value) {
            addCriterion("department_phone_number <", value, "departmentPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("department_phone_number <=", value, "departmentPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNumberLike(String value) {
            addCriterion("department_phone_number like", value, "departmentPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNumberNotLike(String value) {
            addCriterion("department_phone_number not like", value, "departmentPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNumberIn(List<String> values) {
            addCriterion("department_phone_number in", values, "departmentPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNumberNotIn(List<String> values) {
            addCriterion("department_phone_number not in", values, "departmentPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNumberBetween(String value1, String value2) {
            addCriterion("department_phone_number between", value1, value2, "departmentPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andDepartmentPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("department_phone_number not between", value1, value2, "departmentPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}