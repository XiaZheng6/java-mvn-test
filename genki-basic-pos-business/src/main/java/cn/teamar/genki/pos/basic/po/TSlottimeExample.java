package cn.teamar.genki.pos.basic.po;

import java.util.ArrayList;
import java.util.List;

public class TSlottimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSlottimeExample() {
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

        public Criteria andGIdIsNull() {
            addCriterion("g_id is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("g_id is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(Long value) {
            addCriterion("g_id =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(Long value) {
            addCriterion("g_id <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(Long value) {
            addCriterion("g_id >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(Long value) {
            addCriterion("g_id >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(Long value) {
            addCriterion("g_id <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(Long value) {
            addCriterion("g_id <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<Long> values) {
            addCriterion("g_id in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<Long> values) {
            addCriterion("g_id not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(Long value1, Long value2) {
            addCriterion("g_id between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(Long value1, Long value2) {
            addCriterion("g_id not between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andBIdIsNull() {
            addCriterion("b_id is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("b_id is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(Long value) {
            addCriterion("b_id =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(Long value) {
            addCriterion("b_id <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(Long value) {
            addCriterion("b_id >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(Long value) {
            addCriterion("b_id >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(Long value) {
            addCriterion("b_id <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(Long value) {
            addCriterion("b_id <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<Long> values) {
            addCriterion("b_id in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<Long> values) {
            addCriterion("b_id not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(Long value1, Long value2) {
            addCriterion("b_id between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(Long value1, Long value2) {
            addCriterion("b_id not between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Long value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Long value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Long value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Long value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Long value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Long value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Long> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Long> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Long value1, Long value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Long value1, Long value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSlotTimeIsNull() {
            addCriterion("slot_time is null");
            return (Criteria) this;
        }

        public Criteria andSlotTimeIsNotNull() {
            addCriterion("slot_time is not null");
            return (Criteria) this;
        }

        public Criteria andSlotTimeEqualTo(String value) {
            addCriterion("slot_time =", value, "slotTime");
            return (Criteria) this;
        }

        public Criteria andSlotTimeNotEqualTo(String value) {
            addCriterion("slot_time <>", value, "slotTime");
            return (Criteria) this;
        }

        public Criteria andSlotTimeGreaterThan(String value) {
            addCriterion("slot_time >", value, "slotTime");
            return (Criteria) this;
        }

        public Criteria andSlotTimeGreaterThanOrEqualTo(String value) {
            addCriterion("slot_time >=", value, "slotTime");
            return (Criteria) this;
        }

        public Criteria andSlotTimeLessThan(String value) {
            addCriterion("slot_time <", value, "slotTime");
            return (Criteria) this;
        }

        public Criteria andSlotTimeLessThanOrEqualTo(String value) {
            addCriterion("slot_time <=", value, "slotTime");
            return (Criteria) this;
        }

        public Criteria andSlotTimeLike(String value) {
            addCriterion("slot_time like", value, "slotTime");
            return (Criteria) this;
        }

        public Criteria andSlotTimeNotLike(String value) {
            addCriterion("slot_time not like", value, "slotTime");
            return (Criteria) this;
        }

        public Criteria andSlotTimeIn(List<String> values) {
            addCriterion("slot_time in", values, "slotTime");
            return (Criteria) this;
        }

        public Criteria andSlotTimeNotIn(List<String> values) {
            addCriterion("slot_time not in", values, "slotTime");
            return (Criteria) this;
        }

        public Criteria andSlotTimeBetween(String value1, String value2) {
            addCriterion("slot_time between", value1, value2, "slotTime");
            return (Criteria) this;
        }

        public Criteria andSlotTimeNotBetween(String value1, String value2) {
            addCriterion("slot_time not between", value1, value2, "slotTime");
            return (Criteria) this;
        }

        public Criteria andSlotStartIsNull() {
            addCriterion("slot_start is null");
            return (Criteria) this;
        }

        public Criteria andSlotStartIsNotNull() {
            addCriterion("slot_start is not null");
            return (Criteria) this;
        }

        public Criteria andSlotStartEqualTo(String value) {
            addCriterion("slot_start =", value, "slotStart");
            return (Criteria) this;
        }

        public Criteria andSlotStartNotEqualTo(String value) {
            addCriterion("slot_start <>", value, "slotStart");
            return (Criteria) this;
        }

        public Criteria andSlotStartGreaterThan(String value) {
            addCriterion("slot_start >", value, "slotStart");
            return (Criteria) this;
        }

        public Criteria andSlotStartGreaterThanOrEqualTo(String value) {
            addCriterion("slot_start >=", value, "slotStart");
            return (Criteria) this;
        }

        public Criteria andSlotStartLessThan(String value) {
            addCriterion("slot_start <", value, "slotStart");
            return (Criteria) this;
        }

        public Criteria andSlotStartLessThanOrEqualTo(String value) {
            addCriterion("slot_start <=", value, "slotStart");
            return (Criteria) this;
        }

        public Criteria andSlotStartLike(String value) {
            addCriterion("slot_start like", value, "slotStart");
            return (Criteria) this;
        }

        public Criteria andSlotStartNotLike(String value) {
            addCriterion("slot_start not like", value, "slotStart");
            return (Criteria) this;
        }

        public Criteria andSlotStartIn(List<String> values) {
            addCriterion("slot_start in", values, "slotStart");
            return (Criteria) this;
        }

        public Criteria andSlotStartNotIn(List<String> values) {
            addCriterion("slot_start not in", values, "slotStart");
            return (Criteria) this;
        }

        public Criteria andSlotStartBetween(String value1, String value2) {
            addCriterion("slot_start between", value1, value2, "slotStart");
            return (Criteria) this;
        }

        public Criteria andSlotStartNotBetween(String value1, String value2) {
            addCriterion("slot_start not between", value1, value2, "slotStart");
            return (Criteria) this;
        }

        public Criteria andSlotEndIsNull() {
            addCriterion("slot_end is null");
            return (Criteria) this;
        }

        public Criteria andSlotEndIsNotNull() {
            addCriterion("slot_end is not null");
            return (Criteria) this;
        }

        public Criteria andSlotEndEqualTo(String value) {
            addCriterion("slot_end =", value, "slotEnd");
            return (Criteria) this;
        }

        public Criteria andSlotEndNotEqualTo(String value) {
            addCriterion("slot_end <>", value, "slotEnd");
            return (Criteria) this;
        }

        public Criteria andSlotEndGreaterThan(String value) {
            addCriterion("slot_end >", value, "slotEnd");
            return (Criteria) this;
        }

        public Criteria andSlotEndGreaterThanOrEqualTo(String value) {
            addCriterion("slot_end >=", value, "slotEnd");
            return (Criteria) this;
        }

        public Criteria andSlotEndLessThan(String value) {
            addCriterion("slot_end <", value, "slotEnd");
            return (Criteria) this;
        }

        public Criteria andSlotEndLessThanOrEqualTo(String value) {
            addCriterion("slot_end <=", value, "slotEnd");
            return (Criteria) this;
        }

        public Criteria andSlotEndLike(String value) {
            addCriterion("slot_end like", value, "slotEnd");
            return (Criteria) this;
        }

        public Criteria andSlotEndNotLike(String value) {
            addCriterion("slot_end not like", value, "slotEnd");
            return (Criteria) this;
        }

        public Criteria andSlotEndIn(List<String> values) {
            addCriterion("slot_end in", values, "slotEnd");
            return (Criteria) this;
        }

        public Criteria andSlotEndNotIn(List<String> values) {
            addCriterion("slot_end not in", values, "slotEnd");
            return (Criteria) this;
        }

        public Criteria andSlotEndBetween(String value1, String value2) {
            addCriterion("slot_end between", value1, value2, "slotEnd");
            return (Criteria) this;
        }

        public Criteria andSlotEndNotBetween(String value1, String value2) {
            addCriterion("slot_end not between", value1, value2, "slotEnd");
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