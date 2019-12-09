package com.qm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarnlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarnlistExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNodeipIsNull() {
            addCriterion("nodeIp is null");
            return (Criteria) this;
        }

        public Criteria andNodeipIsNotNull() {
            addCriterion("nodeIp is not null");
            return (Criteria) this;
        }

        public Criteria andNodeipEqualTo(String value) {
            addCriterion("nodeIp =", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipNotEqualTo(String value) {
            addCriterion("nodeIp <>", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipGreaterThan(String value) {
            addCriterion("nodeIp >", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipGreaterThanOrEqualTo(String value) {
            addCriterion("nodeIp >=", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipLessThan(String value) {
            addCriterion("nodeIp <", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipLessThanOrEqualTo(String value) {
            addCriterion("nodeIp <=", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipLike(String value) {
            addCriterion("nodeIp like", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipNotLike(String value) {
            addCriterion("nodeIp not like", value, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipIn(List<String> values) {
            addCriterion("nodeIp in", values, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipNotIn(List<String> values) {
            addCriterion("nodeIp not in", values, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipBetween(String value1, String value2) {
            addCriterion("nodeIp between", value1, value2, "nodeip");
            return (Criteria) this;
        }

        public Criteria andNodeipNotBetween(String value1, String value2) {
            addCriterion("nodeIp not between", value1, value2, "nodeip");
            return (Criteria) this;
        }

        public Criteria andWarnleaveIsNull() {
            addCriterion("warnleave is null");
            return (Criteria) this;
        }

        public Criteria andWarnleaveIsNotNull() {
            addCriterion("warnleave is not null");
            return (Criteria) this;
        }

        public Criteria andWarnleaveEqualTo(Byte value) {
            addCriterion("warnleave =", value, "warnleave");
            return (Criteria) this;
        }

        public Criteria andWarnleaveNotEqualTo(Byte value) {
            addCriterion("warnleave <>", value, "warnleave");
            return (Criteria) this;
        }

        public Criteria andWarnleaveGreaterThan(Byte value) {
            addCriterion("warnleave >", value, "warnleave");
            return (Criteria) this;
        }

        public Criteria andWarnleaveGreaterThanOrEqualTo(Byte value) {
            addCriterion("warnleave >=", value, "warnleave");
            return (Criteria) this;
        }

        public Criteria andWarnleaveLessThan(Byte value) {
            addCriterion("warnleave <", value, "warnleave");
            return (Criteria) this;
        }

        public Criteria andWarnleaveLessThanOrEqualTo(Byte value) {
            addCriterion("warnleave <=", value, "warnleave");
            return (Criteria) this;
        }

        public Criteria andWarnleaveIn(List<Byte> values) {
            addCriterion("warnleave in", values, "warnleave");
            return (Criteria) this;
        }

        public Criteria andWarnleaveNotIn(List<Byte> values) {
            addCriterion("warnleave not in", values, "warnleave");
            return (Criteria) this;
        }

        public Criteria andWarnleaveBetween(Byte value1, Byte value2) {
            addCriterion("warnleave between", value1, value2, "warnleave");
            return (Criteria) this;
        }

        public Criteria andWarnleaveNotBetween(Byte value1, Byte value2) {
            addCriterion("warnleave not between", value1, value2, "warnleave");
            return (Criteria) this;
        }

        public Criteria andFromguyIsNull() {
            addCriterion("fromguy is null");
            return (Criteria) this;
        }

        public Criteria andFromguyIsNotNull() {
            addCriterion("fromguy is not null");
            return (Criteria) this;
        }

        public Criteria andFromguyEqualTo(String value) {
            addCriterion("fromguy =", value, "fromguy");
            return (Criteria) this;
        }

        public Criteria andFromguyNotEqualTo(String value) {
            addCriterion("fromguy <>", value, "fromguy");
            return (Criteria) this;
        }

        public Criteria andFromguyGreaterThan(String value) {
            addCriterion("fromguy >", value, "fromguy");
            return (Criteria) this;
        }

        public Criteria andFromguyGreaterThanOrEqualTo(String value) {
            addCriterion("fromguy >=", value, "fromguy");
            return (Criteria) this;
        }

        public Criteria andFromguyLessThan(String value) {
            addCriterion("fromguy <", value, "fromguy");
            return (Criteria) this;
        }

        public Criteria andFromguyLessThanOrEqualTo(String value) {
            addCriterion("fromguy <=", value, "fromguy");
            return (Criteria) this;
        }

        public Criteria andFromguyLike(String value) {
            addCriterion("fromguy like", value, "fromguy");
            return (Criteria) this;
        }

        public Criteria andFromguyNotLike(String value) {
            addCriterion("fromguy not like", value, "fromguy");
            return (Criteria) this;
        }

        public Criteria andFromguyIn(List<String> values) {
            addCriterion("fromguy in", values, "fromguy");
            return (Criteria) this;
        }

        public Criteria andFromguyNotIn(List<String> values) {
            addCriterion("fromguy not in", values, "fromguy");
            return (Criteria) this;
        }

        public Criteria andFromguyBetween(String value1, String value2) {
            addCriterion("fromguy between", value1, value2, "fromguy");
            return (Criteria) this;
        }

        public Criteria andFromguyNotBetween(String value1, String value2) {
            addCriterion("fromguy not between", value1, value2, "fromguy");
            return (Criteria) this;
        }

        public Criteria andWarncontentIsNull() {
            addCriterion("warncontent is null");
            return (Criteria) this;
        }

        public Criteria andWarncontentIsNotNull() {
            addCriterion("warncontent is not null");
            return (Criteria) this;
        }

        public Criteria andWarncontentEqualTo(String value) {
            addCriterion("warncontent =", value, "warncontent");
            return (Criteria) this;
        }

        public Criteria andWarncontentNotEqualTo(String value) {
            addCriterion("warncontent <>", value, "warncontent");
            return (Criteria) this;
        }

        public Criteria andWarncontentGreaterThan(String value) {
            addCriterion("warncontent >", value, "warncontent");
            return (Criteria) this;
        }

        public Criteria andWarncontentGreaterThanOrEqualTo(String value) {
            addCriterion("warncontent >=", value, "warncontent");
            return (Criteria) this;
        }

        public Criteria andWarncontentLessThan(String value) {
            addCriterion("warncontent <", value, "warncontent");
            return (Criteria) this;
        }

        public Criteria andWarncontentLessThanOrEqualTo(String value) {
            addCriterion("warncontent <=", value, "warncontent");
            return (Criteria) this;
        }

        public Criteria andWarncontentLike(String value) {
            addCriterion("warncontent like", value, "warncontent");
            return (Criteria) this;
        }

        public Criteria andWarncontentNotLike(String value) {
            addCriterion("warncontent not like", value, "warncontent");
            return (Criteria) this;
        }

        public Criteria andWarncontentIn(List<String> values) {
            addCriterion("warncontent in", values, "warncontent");
            return (Criteria) this;
        }

        public Criteria andWarncontentNotIn(List<String> values) {
            addCriterion("warncontent not in", values, "warncontent");
            return (Criteria) this;
        }

        public Criteria andWarncontentBetween(String value1, String value2) {
            addCriterion("warncontent between", value1, value2, "warncontent");
            return (Criteria) this;
        }

        public Criteria andWarncontentNotBetween(String value1, String value2) {
            addCriterion("warncontent not between", value1, value2, "warncontent");
            return (Criteria) this;
        }

        public Criteria andAviliablevalueIsNull() {
            addCriterion("aviliablevalue is null");
            return (Criteria) this;
        }

        public Criteria andAviliablevalueIsNotNull() {
            addCriterion("aviliablevalue is not null");
            return (Criteria) this;
        }

        public Criteria andAviliablevalueEqualTo(String value) {
            addCriterion("aviliablevalue =", value, "aviliablevalue");
            return (Criteria) this;
        }

        public Criteria andAviliablevalueNotEqualTo(String value) {
            addCriterion("aviliablevalue <>", value, "aviliablevalue");
            return (Criteria) this;
        }

        public Criteria andAviliablevalueGreaterThan(String value) {
            addCriterion("aviliablevalue >", value, "aviliablevalue");
            return (Criteria) this;
        }

        public Criteria andAviliablevalueGreaterThanOrEqualTo(String value) {
            addCriterion("aviliablevalue >=", value, "aviliablevalue");
            return (Criteria) this;
        }

        public Criteria andAviliablevalueLessThan(String value) {
            addCriterion("aviliablevalue <", value, "aviliablevalue");
            return (Criteria) this;
        }

        public Criteria andAviliablevalueLessThanOrEqualTo(String value) {
            addCriterion("aviliablevalue <=", value, "aviliablevalue");
            return (Criteria) this;
        }

        public Criteria andAviliablevalueLike(String value) {
            addCriterion("aviliablevalue like", value, "aviliablevalue");
            return (Criteria) this;
        }

        public Criteria andAviliablevalueNotLike(String value) {
            addCriterion("aviliablevalue not like", value, "aviliablevalue");
            return (Criteria) this;
        }

        public Criteria andAviliablevalueIn(List<String> values) {
            addCriterion("aviliablevalue in", values, "aviliablevalue");
            return (Criteria) this;
        }

        public Criteria andAviliablevalueNotIn(List<String> values) {
            addCriterion("aviliablevalue not in", values, "aviliablevalue");
            return (Criteria) this;
        }

        public Criteria andAviliablevalueBetween(String value1, String value2) {
            addCriterion("aviliablevalue between", value1, value2, "aviliablevalue");
            return (Criteria) this;
        }

        public Criteria andAviliablevalueNotBetween(String value1, String value2) {
            addCriterion("aviliablevalue not between", value1, value2, "aviliablevalue");
            return (Criteria) this;
        }

        public Criteria andWarnvalueIsNull() {
            addCriterion("warnvalue is null");
            return (Criteria) this;
        }

        public Criteria andWarnvalueIsNotNull() {
            addCriterion("warnvalue is not null");
            return (Criteria) this;
        }

        public Criteria andWarnvalueEqualTo(String value) {
            addCriterion("warnvalue =", value, "warnvalue");
            return (Criteria) this;
        }

        public Criteria andWarnvalueNotEqualTo(String value) {
            addCriterion("warnvalue <>", value, "warnvalue");
            return (Criteria) this;
        }

        public Criteria andWarnvalueGreaterThan(String value) {
            addCriterion("warnvalue >", value, "warnvalue");
            return (Criteria) this;
        }

        public Criteria andWarnvalueGreaterThanOrEqualTo(String value) {
            addCriterion("warnvalue >=", value, "warnvalue");
            return (Criteria) this;
        }

        public Criteria andWarnvalueLessThan(String value) {
            addCriterion("warnvalue <", value, "warnvalue");
            return (Criteria) this;
        }

        public Criteria andWarnvalueLessThanOrEqualTo(String value) {
            addCriterion("warnvalue <=", value, "warnvalue");
            return (Criteria) this;
        }

        public Criteria andWarnvalueLike(String value) {
            addCriterion("warnvalue like", value, "warnvalue");
            return (Criteria) this;
        }

        public Criteria andWarnvalueNotLike(String value) {
            addCriterion("warnvalue not like", value, "warnvalue");
            return (Criteria) this;
        }

        public Criteria andWarnvalueIn(List<String> values) {
            addCriterion("warnvalue in", values, "warnvalue");
            return (Criteria) this;
        }

        public Criteria andWarnvalueNotIn(List<String> values) {
            addCriterion("warnvalue not in", values, "warnvalue");
            return (Criteria) this;
        }

        public Criteria andWarnvalueBetween(String value1, String value2) {
            addCriterion("warnvalue between", value1, value2, "warnvalue");
            return (Criteria) this;
        }

        public Criteria andWarnvalueNotBetween(String value1, String value2) {
            addCriterion("warnvalue not between", value1, value2, "warnvalue");
            return (Criteria) this;
        }

        public Criteria andWarntimeIsNull() {
            addCriterion("warntime is null");
            return (Criteria) this;
        }

        public Criteria andWarntimeIsNotNull() {
            addCriterion("warntime is not null");
            return (Criteria) this;
        }

        public Criteria andWarntimeEqualTo(Date value) {
            addCriterion("warntime =", value, "warntime");
            return (Criteria) this;
        }

        public Criteria andWarntimeNotEqualTo(Date value) {
            addCriterion("warntime <>", value, "warntime");
            return (Criteria) this;
        }

        public Criteria andWarntimeGreaterThan(Date value) {
            addCriterion("warntime >", value, "warntime");
            return (Criteria) this;
        }

        public Criteria andWarntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("warntime >=", value, "warntime");
            return (Criteria) this;
        }

        public Criteria andWarntimeLessThan(Date value) {
            addCriterion("warntime <", value, "warntime");
            return (Criteria) this;
        }

        public Criteria andWarntimeLessThanOrEqualTo(Date value) {
            addCriterion("warntime <=", value, "warntime");
            return (Criteria) this;
        }

        public Criteria andWarntimeIn(List<Date> values) {
            addCriterion("warntime in", values, "warntime");
            return (Criteria) this;
        }

        public Criteria andWarntimeNotIn(List<Date> values) {
            addCriterion("warntime not in", values, "warntime");
            return (Criteria) this;
        }

        public Criteria andWarntimeBetween(Date value1, Date value2) {
            addCriterion("warntime between", value1, value2, "warntime");
            return (Criteria) this;
        }

        public Criteria andWarntimeNotBetween(Date value1, Date value2) {
            addCriterion("warntime not between", value1, value2, "warntime");
            return (Criteria) this;
        }

        public Criteria andDealwithIsNull() {
            addCriterion("dealwith is null");
            return (Criteria) this;
        }

        public Criteria andDealwithIsNotNull() {
            addCriterion("dealwith is not null");
            return (Criteria) this;
        }

        public Criteria andDealwithEqualTo(Byte value) {
            addCriterion("dealwith =", value, "dealwith");
            return (Criteria) this;
        }

        public Criteria andDealwithNotEqualTo(Byte value) {
            addCriterion("dealwith <>", value, "dealwith");
            return (Criteria) this;
        }

        public Criteria andDealwithGreaterThan(Byte value) {
            addCriterion("dealwith >", value, "dealwith");
            return (Criteria) this;
        }

        public Criteria andDealwithGreaterThanOrEqualTo(Byte value) {
            addCriterion("dealwith >=", value, "dealwith");
            return (Criteria) this;
        }

        public Criteria andDealwithLessThan(Byte value) {
            addCriterion("dealwith <", value, "dealwith");
            return (Criteria) this;
        }

        public Criteria andDealwithLessThanOrEqualTo(Byte value) {
            addCriterion("dealwith <=", value, "dealwith");
            return (Criteria) this;
        }

        public Criteria andDealwithIn(List<Byte> values) {
            addCriterion("dealwith in", values, "dealwith");
            return (Criteria) this;
        }

        public Criteria andDealwithNotIn(List<Byte> values) {
            addCriterion("dealwith not in", values, "dealwith");
            return (Criteria) this;
        }

        public Criteria andDealwithBetween(Byte value1, Byte value2) {
            addCriterion("dealwith between", value1, value2, "dealwith");
            return (Criteria) this;
        }

        public Criteria andDealwithNotBetween(Byte value1, Byte value2) {
            addCriterion("dealwith not between", value1, value2, "dealwith");
            return (Criteria) this;
        }

        public Criteria andDesIsNull() {
            addCriterion("des is null");
            return (Criteria) this;
        }

        public Criteria andDesIsNotNull() {
            addCriterion("des is not null");
            return (Criteria) this;
        }

        public Criteria andDesEqualTo(String value) {
            addCriterion("des =", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotEqualTo(String value) {
            addCriterion("des <>", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThan(String value) {
            addCriterion("des >", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesGreaterThanOrEqualTo(String value) {
            addCriterion("des >=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThan(String value) {
            addCriterion("des <", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLessThanOrEqualTo(String value) {
            addCriterion("des <=", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesLike(String value) {
            addCriterion("des like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotLike(String value) {
            addCriterion("des not like", value, "des");
            return (Criteria) this;
        }

        public Criteria andDesIn(List<String> values) {
            addCriterion("des in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotIn(List<String> values) {
            addCriterion("des not in", values, "des");
            return (Criteria) this;
        }

        public Criteria andDesBetween(String value1, String value2) {
            addCriterion("des between", value1, value2, "des");
            return (Criteria) this;
        }

        public Criteria andDesNotBetween(String value1, String value2) {
            addCriterion("des not between", value1, value2, "des");
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