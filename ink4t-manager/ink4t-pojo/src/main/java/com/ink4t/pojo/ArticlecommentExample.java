package com.ink4t.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticlecommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticlecommentExample() {
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

        public Criteria andAcidIsNull() {
            addCriterion("acid is null");
            return (Criteria) this;
        }

        public Criteria andAcidIsNotNull() {
            addCriterion("acid is not null");
            return (Criteria) this;
        }

        public Criteria andAcidEqualTo(Integer value) {
            addCriterion("acid =", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidNotEqualTo(Integer value) {
            addCriterion("acid <>", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidGreaterThan(Integer value) {
            addCriterion("acid >", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("acid >=", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidLessThan(Integer value) {
            addCriterion("acid <", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidLessThanOrEqualTo(Integer value) {
            addCriterion("acid <=", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidIn(List<Integer> values) {
            addCriterion("acid in", values, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidNotIn(List<Integer> values) {
            addCriterion("acid not in", values, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidBetween(Integer value1, Integer value2) {
            addCriterion("acid between", value1, value2, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidNotBetween(Integer value1, Integer value2) {
            addCriterion("acid not between", value1, value2, "acid");
            return (Criteria) this;
        }

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAcaidIsNull() {
            addCriterion("acaid is null");
            return (Criteria) this;
        }

        public Criteria andAcaidIsNotNull() {
            addCriterion("acaid is not null");
            return (Criteria) this;
        }

        public Criteria andAcaidEqualTo(Integer value) {
            addCriterion("acaid =", value, "acaid");
            return (Criteria) this;
        }

        public Criteria andAcaidNotEqualTo(Integer value) {
            addCriterion("acaid <>", value, "acaid");
            return (Criteria) this;
        }

        public Criteria andAcaidGreaterThan(Integer value) {
            addCriterion("acaid >", value, "acaid");
            return (Criteria) this;
        }

        public Criteria andAcaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("acaid >=", value, "acaid");
            return (Criteria) this;
        }

        public Criteria andAcaidLessThan(Integer value) {
            addCriterion("acaid <", value, "acaid");
            return (Criteria) this;
        }

        public Criteria andAcaidLessThanOrEqualTo(Integer value) {
            addCriterion("acaid <=", value, "acaid");
            return (Criteria) this;
        }

        public Criteria andAcaidIn(List<Integer> values) {
            addCriterion("acaid in", values, "acaid");
            return (Criteria) this;
        }

        public Criteria andAcaidNotIn(List<Integer> values) {
            addCriterion("acaid not in", values, "acaid");
            return (Criteria) this;
        }

        public Criteria andAcaidBetween(Integer value1, Integer value2) {
            addCriterion("acaid between", value1, value2, "acaid");
            return (Criteria) this;
        }

        public Criteria andAcaidNotBetween(Integer value1, Integer value2) {
            addCriterion("acaid not between", value1, value2, "acaid");
            return (Criteria) this;
        }

        public Criteria andAcnameIsNull() {
            addCriterion("acname is null");
            return (Criteria) this;
        }

        public Criteria andAcnameIsNotNull() {
            addCriterion("acname is not null");
            return (Criteria) this;
        }

        public Criteria andAcnameEqualTo(String value) {
            addCriterion("acname =", value, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameNotEqualTo(String value) {
            addCriterion("acname <>", value, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameGreaterThan(String value) {
            addCriterion("acname >", value, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameGreaterThanOrEqualTo(String value) {
            addCriterion("acname >=", value, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameLessThan(String value) {
            addCriterion("acname <", value, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameLessThanOrEqualTo(String value) {
            addCriterion("acname <=", value, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameLike(String value) {
            addCriterion("acname like", value, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameNotLike(String value) {
            addCriterion("acname not like", value, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameIn(List<String> values) {
            addCriterion("acname in", values, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameNotIn(List<String> values) {
            addCriterion("acname not in", values, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameBetween(String value1, String value2) {
            addCriterion("acname between", value1, value2, "acname");
            return (Criteria) this;
        }

        public Criteria andAcnameNotBetween(String value1, String value2) {
            addCriterion("acname not between", value1, value2, "acname");
            return (Criteria) this;
        }

        public Criteria andAcemailIsNull() {
            addCriterion("acemail is null");
            return (Criteria) this;
        }

        public Criteria andAcemailIsNotNull() {
            addCriterion("acemail is not null");
            return (Criteria) this;
        }

        public Criteria andAcemailEqualTo(String value) {
            addCriterion("acemail =", value, "acemail");
            return (Criteria) this;
        }

        public Criteria andAcemailNotEqualTo(String value) {
            addCriterion("acemail <>", value, "acemail");
            return (Criteria) this;
        }

        public Criteria andAcemailGreaterThan(String value) {
            addCriterion("acemail >", value, "acemail");
            return (Criteria) this;
        }

        public Criteria andAcemailGreaterThanOrEqualTo(String value) {
            addCriterion("acemail >=", value, "acemail");
            return (Criteria) this;
        }

        public Criteria andAcemailLessThan(String value) {
            addCriterion("acemail <", value, "acemail");
            return (Criteria) this;
        }

        public Criteria andAcemailLessThanOrEqualTo(String value) {
            addCriterion("acemail <=", value, "acemail");
            return (Criteria) this;
        }

        public Criteria andAcemailLike(String value) {
            addCriterion("acemail like", value, "acemail");
            return (Criteria) this;
        }

        public Criteria andAcemailNotLike(String value) {
            addCriterion("acemail not like", value, "acemail");
            return (Criteria) this;
        }

        public Criteria andAcemailIn(List<String> values) {
            addCriterion("acemail in", values, "acemail");
            return (Criteria) this;
        }

        public Criteria andAcemailNotIn(List<String> values) {
            addCriterion("acemail not in", values, "acemail");
            return (Criteria) this;
        }

        public Criteria andAcemailBetween(String value1, String value2) {
            addCriterion("acemail between", value1, value2, "acemail");
            return (Criteria) this;
        }

        public Criteria andAcemailNotBetween(String value1, String value2) {
            addCriterion("acemail not between", value1, value2, "acemail");
            return (Criteria) this;
        }

        public Criteria andAccontextIsNull() {
            addCriterion("accontext is null");
            return (Criteria) this;
        }

        public Criteria andAccontextIsNotNull() {
            addCriterion("accontext is not null");
            return (Criteria) this;
        }

        public Criteria andAccontextEqualTo(String value) {
            addCriterion("accontext =", value, "accontext");
            return (Criteria) this;
        }

        public Criteria andAccontextNotEqualTo(String value) {
            addCriterion("accontext <>", value, "accontext");
            return (Criteria) this;
        }

        public Criteria andAccontextGreaterThan(String value) {
            addCriterion("accontext >", value, "accontext");
            return (Criteria) this;
        }

        public Criteria andAccontextGreaterThanOrEqualTo(String value) {
            addCriterion("accontext >=", value, "accontext");
            return (Criteria) this;
        }

        public Criteria andAccontextLessThan(String value) {
            addCriterion("accontext <", value, "accontext");
            return (Criteria) this;
        }

        public Criteria andAccontextLessThanOrEqualTo(String value) {
            addCriterion("accontext <=", value, "accontext");
            return (Criteria) this;
        }

        public Criteria andAccontextLike(String value) {
            addCriterion("accontext like", value, "accontext");
            return (Criteria) this;
        }

        public Criteria andAccontextNotLike(String value) {
            addCriterion("accontext not like", value, "accontext");
            return (Criteria) this;
        }

        public Criteria andAccontextIn(List<String> values) {
            addCriterion("accontext in", values, "accontext");
            return (Criteria) this;
        }

        public Criteria andAccontextNotIn(List<String> values) {
            addCriterion("accontext not in", values, "accontext");
            return (Criteria) this;
        }

        public Criteria andAccontextBetween(String value1, String value2) {
            addCriterion("accontext between", value1, value2, "accontext");
            return (Criteria) this;
        }

        public Criteria andAccontextNotBetween(String value1, String value2) {
            addCriterion("accontext not between", value1, value2, "accontext");
            return (Criteria) this;
        }

        public Criteria andAcdateIsNull() {
            addCriterion("acdate is null");
            return (Criteria) this;
        }

        public Criteria andAcdateIsNotNull() {
            addCriterion("acdate is not null");
            return (Criteria) this;
        }

        public Criteria andAcdateEqualTo(Date value) {
            addCriterion("acdate =", value, "acdate");
            return (Criteria) this;
        }

        public Criteria andAcdateNotEqualTo(Date value) {
            addCriterion("acdate <>", value, "acdate");
            return (Criteria) this;
        }

        public Criteria andAcdateGreaterThan(Date value) {
            addCriterion("acdate >", value, "acdate");
            return (Criteria) this;
        }

        public Criteria andAcdateGreaterThanOrEqualTo(Date value) {
            addCriterion("acdate >=", value, "acdate");
            return (Criteria) this;
        }

        public Criteria andAcdateLessThan(Date value) {
            addCriterion("acdate <", value, "acdate");
            return (Criteria) this;
        }

        public Criteria andAcdateLessThanOrEqualTo(Date value) {
            addCriterion("acdate <=", value, "acdate");
            return (Criteria) this;
        }

        public Criteria andAcdateIn(List<Date> values) {
            addCriterion("acdate in", values, "acdate");
            return (Criteria) this;
        }

        public Criteria andAcdateNotIn(List<Date> values) {
            addCriterion("acdate not in", values, "acdate");
            return (Criteria) this;
        }

        public Criteria andAcdateBetween(Date value1, Date value2) {
            addCriterion("acdate between", value1, value2, "acdate");
            return (Criteria) this;
        }

        public Criteria andAcdateNotBetween(Date value1, Date value2) {
            addCriterion("acdate not between", value1, value2, "acdate");
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