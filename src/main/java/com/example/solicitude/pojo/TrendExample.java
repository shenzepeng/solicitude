package com.example.solicitude.pojo;

import java.util.ArrayList;
import java.util.List;

public class TrendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrendExample() {
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

        public Criteria andActiveIdIsNull() {
            addCriterion("active_id is null");
            return (Criteria) this;
        }

        public Criteria andActiveIdIsNotNull() {
            addCriterion("active_id is not null");
            return (Criteria) this;
        }

        public Criteria andActiveIdEqualTo(String value) {
            addCriterion("active_id =", value, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdNotEqualTo(String value) {
            addCriterion("active_id <>", value, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdGreaterThan(String value) {
            addCriterion("active_id >", value, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdGreaterThanOrEqualTo(String value) {
            addCriterion("active_id >=", value, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdLessThan(String value) {
            addCriterion("active_id <", value, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdLessThanOrEqualTo(String value) {
            addCriterion("active_id <=", value, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdLike(String value) {
            addCriterion("active_id like", value, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdNotLike(String value) {
            addCriterion("active_id not like", value, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdIn(List<String> values) {
            addCriterion("active_id in", values, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdNotIn(List<String> values) {
            addCriterion("active_id not in", values, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdBetween(String value1, String value2) {
            addCriterion("active_id between", value1, value2, "activeId");
            return (Criteria) this;
        }

        public Criteria andActiveIdNotBetween(String value1, String value2) {
            addCriterion("active_id not between", value1, value2, "activeId");
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

        public Criteria andChangeTimeIsNull() {
            addCriterion("change_time is null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNotNull() {
            addCriterion("change_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeEqualTo(String value) {
            addCriterion("change_time =", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotEqualTo(String value) {
            addCriterion("change_time <>", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThan(String value) {
            addCriterion("change_time >", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("change_time >=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThan(String value) {
            addCriterion("change_time <", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThanOrEqualTo(String value) {
            addCriterion("change_time <=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLike(String value) {
            addCriterion("change_time like", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotLike(String value) {
            addCriterion("change_time not like", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIn(List<String> values) {
            addCriterion("change_time in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotIn(List<String> values) {
            addCriterion("change_time not in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeBetween(String value1, String value2) {
            addCriterion("change_time between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotBetween(String value1, String value2) {
            addCriterion("change_time not between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andGivenNameIsNull() {
            addCriterion("given_name is null");
            return (Criteria) this;
        }

        public Criteria andGivenNameIsNotNull() {
            addCriterion("given_name is not null");
            return (Criteria) this;
        }

        public Criteria andGivenNameEqualTo(String value) {
            addCriterion("given_name =", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotEqualTo(String value) {
            addCriterion("given_name <>", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameGreaterThan(String value) {
            addCriterion("given_name >", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameGreaterThanOrEqualTo(String value) {
            addCriterion("given_name >=", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLessThan(String value) {
            addCriterion("given_name <", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLessThanOrEqualTo(String value) {
            addCriterion("given_name <=", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLike(String value) {
            addCriterion("given_name like", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotLike(String value) {
            addCriterion("given_name not like", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameIn(List<String> values) {
            addCriterion("given_name in", values, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotIn(List<String> values) {
            addCriterion("given_name not in", values, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameBetween(String value1, String value2) {
            addCriterion("given_name between", value1, value2, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotBetween(String value1, String value2) {
            addCriterion("given_name not between", value1, value2, "givenName");
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