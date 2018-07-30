package com.liuxun.transfer.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrCheckeventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrCheckeventExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andEquiptIdIsNull() {
            addCriterion("EQUIPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEquiptIdIsNotNull() {
            addCriterion("EQUIPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEquiptIdEqualTo(String value) {
            addCriterion("EQUIPT_ID =", value, "equiptId");
            return (Criteria) this;
        }

        public Criteria andEquiptIdNotEqualTo(String value) {
            addCriterion("EQUIPT_ID <>", value, "equiptId");
            return (Criteria) this;
        }

        public Criteria andEquiptIdGreaterThan(String value) {
            addCriterion("EQUIPT_ID >", value, "equiptId");
            return (Criteria) this;
        }

        public Criteria andEquiptIdGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPT_ID >=", value, "equiptId");
            return (Criteria) this;
        }

        public Criteria andEquiptIdLessThan(String value) {
            addCriterion("EQUIPT_ID <", value, "equiptId");
            return (Criteria) this;
        }

        public Criteria andEquiptIdLessThanOrEqualTo(String value) {
            addCriterion("EQUIPT_ID <=", value, "equiptId");
            return (Criteria) this;
        }

        public Criteria andEquiptIdLike(String value) {
            addCriterion("EQUIPT_ID like", value, "equiptId");
            return (Criteria) this;
        }

        public Criteria andEquiptIdNotLike(String value) {
            addCriterion("EQUIPT_ID not like", value, "equiptId");
            return (Criteria) this;
        }

        public Criteria andEquiptIdIn(List<String> values) {
            addCriterion("EQUIPT_ID in", values, "equiptId");
            return (Criteria) this;
        }

        public Criteria andEquiptIdNotIn(List<String> values) {
            addCriterion("EQUIPT_ID not in", values, "equiptId");
            return (Criteria) this;
        }

        public Criteria andEquiptIdBetween(String value1, String value2) {
            addCriterion("EQUIPT_ID between", value1, value2, "equiptId");
            return (Criteria) this;
        }

        public Criteria andEquiptIdNotBetween(String value1, String value2) {
            addCriterion("EQUIPT_ID not between", value1, value2, "equiptId");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdIsNull() {
            addCriterion("CHECKPOINT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdIsNotNull() {
            addCriterion("CHECKPOINT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdEqualTo(String value) {
            addCriterion("CHECKPOINT_ID =", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdNotEqualTo(String value) {
            addCriterion("CHECKPOINT_ID <>", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdGreaterThan(String value) {
            addCriterion("CHECKPOINT_ID >", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKPOINT_ID >=", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdLessThan(String value) {
            addCriterion("CHECKPOINT_ID <", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdLessThanOrEqualTo(String value) {
            addCriterion("CHECKPOINT_ID <=", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdLike(String value) {
            addCriterion("CHECKPOINT_ID like", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdNotLike(String value) {
            addCriterion("CHECKPOINT_ID not like", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdIn(List<String> values) {
            addCriterion("CHECKPOINT_ID in", values, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdNotIn(List<String> values) {
            addCriterion("CHECKPOINT_ID not in", values, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdBetween(String value1, String value2) {
            addCriterion("CHECKPOINT_ID between", value1, value2, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdNotBetween(String value1, String value2) {
            addCriterion("CHECKPOINT_ID not between", value1, value2, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIsNull() {
            addCriterion("CHECK_USER is null");
            return (Criteria) this;
        }

        public Criteria andCheckUserIsNotNull() {
            addCriterion("CHECK_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCheckUserEqualTo(String value) {
            addCriterion("CHECK_USER =", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserNotEqualTo(String value) {
            addCriterion("CHECK_USER <>", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserGreaterThan(String value) {
            addCriterion("CHECK_USER >", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_USER >=", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserLessThan(String value) {
            addCriterion("CHECK_USER <", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserLessThanOrEqualTo(String value) {
            addCriterion("CHECK_USER <=", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserLike(String value) {
            addCriterion("CHECK_USER like", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserNotLike(String value) {
            addCriterion("CHECK_USER not like", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserIn(List<String> values) {
            addCriterion("CHECK_USER in", values, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserNotIn(List<String> values) {
            addCriterion("CHECK_USER not in", values, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserBetween(String value1, String value2) {
            addCriterion("CHECK_USER between", value1, value2, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserNotBetween(String value1, String value2) {
            addCriterion("CHECK_USER not between", value1, value2, "checkUser");
            return (Criteria) this;
        }

        public Criteria andAddresIsNull() {
            addCriterion("ADDRES is null");
            return (Criteria) this;
        }

        public Criteria andAddresIsNotNull() {
            addCriterion("ADDRES is not null");
            return (Criteria) this;
        }

        public Criteria andAddresEqualTo(String value) {
            addCriterion("ADDRES =", value, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresNotEqualTo(String value) {
            addCriterion("ADDRES <>", value, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresGreaterThan(String value) {
            addCriterion("ADDRES >", value, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRES >=", value, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresLessThan(String value) {
            addCriterion("ADDRES <", value, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresLessThanOrEqualTo(String value) {
            addCriterion("ADDRES <=", value, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresLike(String value) {
            addCriterion("ADDRES like", value, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresNotLike(String value) {
            addCriterion("ADDRES not like", value, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresIn(List<String> values) {
            addCriterion("ADDRES in", values, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresNotIn(List<String> values) {
            addCriterion("ADDRES not in", values, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresBetween(String value1, String value2) {
            addCriterion("ADDRES between", value1, value2, "addres");
            return (Criteria) this;
        }

        public Criteria andAddresNotBetween(String value1, String value2) {
            addCriterion("ADDRES not between", value1, value2, "addres");
            return (Criteria) this;
        }

        public Criteria andPcddxIsNull() {
            addCriterion("PCDDX is null");
            return (Criteria) this;
        }

        public Criteria andPcddxIsNotNull() {
            addCriterion("PCDDX is not null");
            return (Criteria) this;
        }

        public Criteria andPcddxEqualTo(BigDecimal value) {
            addCriterion("PCDDX =", value, "pcddx");
            return (Criteria) this;
        }

        public Criteria andPcddxNotEqualTo(BigDecimal value) {
            addCriterion("PCDDX <>", value, "pcddx");
            return (Criteria) this;
        }

        public Criteria andPcddxGreaterThan(BigDecimal value) {
            addCriterion("PCDDX >", value, "pcddx");
            return (Criteria) this;
        }

        public Criteria andPcddxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PCDDX >=", value, "pcddx");
            return (Criteria) this;
        }

        public Criteria andPcddxLessThan(BigDecimal value) {
            addCriterion("PCDDX <", value, "pcddx");
            return (Criteria) this;
        }

        public Criteria andPcddxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PCDDX <=", value, "pcddx");
            return (Criteria) this;
        }

        public Criteria andPcddxIn(List<BigDecimal> values) {
            addCriterion("PCDDX in", values, "pcddx");
            return (Criteria) this;
        }

        public Criteria andPcddxNotIn(List<BigDecimal> values) {
            addCriterion("PCDDX not in", values, "pcddx");
            return (Criteria) this;
        }

        public Criteria andPcddxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCDDX between", value1, value2, "pcddx");
            return (Criteria) this;
        }

        public Criteria andPcddxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCDDX not between", value1, value2, "pcddx");
            return (Criteria) this;
        }

        public Criteria andPcddyIsNull() {
            addCriterion("PCDDY is null");
            return (Criteria) this;
        }

        public Criteria andPcddyIsNotNull() {
            addCriterion("PCDDY is not null");
            return (Criteria) this;
        }

        public Criteria andPcddyEqualTo(BigDecimal value) {
            addCriterion("PCDDY =", value, "pcddy");
            return (Criteria) this;
        }

        public Criteria andPcddyNotEqualTo(BigDecimal value) {
            addCriterion("PCDDY <>", value, "pcddy");
            return (Criteria) this;
        }

        public Criteria andPcddyGreaterThan(BigDecimal value) {
            addCriterion("PCDDY >", value, "pcddy");
            return (Criteria) this;
        }

        public Criteria andPcddyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PCDDY >=", value, "pcddy");
            return (Criteria) this;
        }

        public Criteria andPcddyLessThan(BigDecimal value) {
            addCriterion("PCDDY <", value, "pcddy");
            return (Criteria) this;
        }

        public Criteria andPcddyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PCDDY <=", value, "pcddy");
            return (Criteria) this;
        }

        public Criteria andPcddyIn(List<BigDecimal> values) {
            addCriterion("PCDDY in", values, "pcddy");
            return (Criteria) this;
        }

        public Criteria andPcddyNotIn(List<BigDecimal> values) {
            addCriterion("PCDDY not in", values, "pcddy");
            return (Criteria) this;
        }

        public Criteria andPcddyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCDDY between", value1, value2, "pcddy");
            return (Criteria) this;
        }

        public Criteria andPcddyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCDDY not between", value1, value2, "pcddy");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCheckModelIsNull() {
            addCriterion("CHECK_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andCheckModelIsNotNull() {
            addCriterion("CHECK_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andCheckModelEqualTo(String value) {
            addCriterion("CHECK_MODEL =", value, "checkModel");
            return (Criteria) this;
        }

        public Criteria andCheckModelNotEqualTo(String value) {
            addCriterion("CHECK_MODEL <>", value, "checkModel");
            return (Criteria) this;
        }

        public Criteria andCheckModelGreaterThan(String value) {
            addCriterion("CHECK_MODEL >", value, "checkModel");
            return (Criteria) this;
        }

        public Criteria andCheckModelGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_MODEL >=", value, "checkModel");
            return (Criteria) this;
        }

        public Criteria andCheckModelLessThan(String value) {
            addCriterion("CHECK_MODEL <", value, "checkModel");
            return (Criteria) this;
        }

        public Criteria andCheckModelLessThanOrEqualTo(String value) {
            addCriterion("CHECK_MODEL <=", value, "checkModel");
            return (Criteria) this;
        }

        public Criteria andCheckModelLike(String value) {
            addCriterion("CHECK_MODEL like", value, "checkModel");
            return (Criteria) this;
        }

        public Criteria andCheckModelNotLike(String value) {
            addCriterion("CHECK_MODEL not like", value, "checkModel");
            return (Criteria) this;
        }

        public Criteria andCheckModelIn(List<String> values) {
            addCriterion("CHECK_MODEL in", values, "checkModel");
            return (Criteria) this;
        }

        public Criteria andCheckModelNotIn(List<String> values) {
            addCriterion("CHECK_MODEL not in", values, "checkModel");
            return (Criteria) this;
        }

        public Criteria andCheckModelBetween(String value1, String value2) {
            addCriterion("CHECK_MODEL between", value1, value2, "checkModel");
            return (Criteria) this;
        }

        public Criteria andCheckModelNotBetween(String value1, String value2) {
            addCriterion("CHECK_MODEL not between", value1, value2, "checkModel");
            return (Criteria) this;
        }
    }

    /**
     */
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