package cn.teamar.genki.pos.basic.po;

import java.util.ArrayList;
import java.util.List;

public class FoodExCommodityComboExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodExCommodityComboExample() {
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
        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
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

        public Criteria andCommodityIdIsNull() {
            addCriterion("commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(Long value) {
            addCriterion("commodity_id =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(Long value) {
            addCriterion("commodity_id <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(Long value) {
            addCriterion("commodity_id >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("commodity_id >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(Long value) {
            addCriterion("commodity_id <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(Long value) {
            addCriterion("commodity_id <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<Long> values) {
            addCriterion("commodity_id in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<Long> values) {
            addCriterion("commodity_id not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(Long value1, Long value2) {
            addCriterion("commodity_id between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(Long value1, Long value2) {
            addCriterion("commodity_id not between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNull() {
            addCriterion("commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("commodity_name =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("commodity_name <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("commodity_name >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_name >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("commodity_name <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("commodity_name <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("commodity_name like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("commodity_name not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("commodity_name in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("commodity_name not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("commodity_name between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("commodity_name not between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andSpecTextIsNull() {
            addCriterion("spec_text is null");
            return (Criteria) this;
        }

        public Criteria andSpecTextIsNotNull() {
            addCriterion("spec_text is not null");
            return (Criteria) this;
        }

        public Criteria andSpecTextEqualTo(String value) {
            addCriterion("spec_text =", value, "specText");
            return (Criteria) this;
        }

        public Criteria andSpecTextNotEqualTo(String value) {
            addCriterion("spec_text <>", value, "specText");
            return (Criteria) this;
        }

        public Criteria andSpecTextGreaterThan(String value) {
            addCriterion("spec_text >", value, "specText");
            return (Criteria) this;
        }

        public Criteria andSpecTextGreaterThanOrEqualTo(String value) {
            addCriterion("spec_text >=", value, "specText");
            return (Criteria) this;
        }

        public Criteria andSpecTextLessThan(String value) {
            addCriterion("spec_text <", value, "specText");
            return (Criteria) this;
        }

        public Criteria andSpecTextLessThanOrEqualTo(String value) {
            addCriterion("spec_text <=", value, "specText");
            return (Criteria) this;
        }

        public Criteria andSpecTextLike(String value) {
            addCriterion("spec_text like", value, "specText");
            return (Criteria) this;
        }

        public Criteria andSpecTextNotLike(String value) {
            addCriterion("spec_text not like", value, "specText");
            return (Criteria) this;
        }

        public Criteria andSpecTextIn(List<String> values) {
            addCriterion("spec_text in", values, "specText");
            return (Criteria) this;
        }

        public Criteria andSpecTextNotIn(List<String> values) {
            addCriterion("spec_text not in", values, "specText");
            return (Criteria) this;
        }

        public Criteria andSpecTextBetween(String value1, String value2) {
            addCriterion("spec_text between", value1, value2, "specText");
            return (Criteria) this;
        }

        public Criteria andSpecTextNotBetween(String value1, String value2) {
            addCriterion("spec_text not between", value1, value2, "specText");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCommodityQtyIsNull() {
            addCriterion("commodity_qty is null");
            return (Criteria) this;
        }

        public Criteria andCommodityQtyIsNotNull() {
            addCriterion("commodity_qty is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityQtyEqualTo(Long value) {
            addCriterion("commodity_qty =", value, "commodityQty");
            return (Criteria) this;
        }

        public Criteria andCommodityQtyNotEqualTo(Long value) {
            addCriterion("commodity_qty <>", value, "commodityQty");
            return (Criteria) this;
        }

        public Criteria andCommodityQtyGreaterThan(Long value) {
            addCriterion("commodity_qty >", value, "commodityQty");
            return (Criteria) this;
        }

        public Criteria andCommodityQtyGreaterThanOrEqualTo(Long value) {
            addCriterion("commodity_qty >=", value, "commodityQty");
            return (Criteria) this;
        }

        public Criteria andCommodityQtyLessThan(Long value) {
            addCriterion("commodity_qty <", value, "commodityQty");
            return (Criteria) this;
        }

        public Criteria andCommodityQtyLessThanOrEqualTo(Long value) {
            addCriterion("commodity_qty <=", value, "commodityQty");
            return (Criteria) this;
        }

        public Criteria andCommodityQtyIn(List<Long> values) {
            addCriterion("commodity_qty in", values, "commodityQty");
            return (Criteria) this;
        }

        public Criteria andCommodityQtyNotIn(List<Long> values) {
            addCriterion("commodity_qty not in", values, "commodityQty");
            return (Criteria) this;
        }

        public Criteria andCommodityQtyBetween(Long value1, Long value2) {
            addCriterion("commodity_qty between", value1, value2, "commodityQty");
            return (Criteria) this;
        }

        public Criteria andCommodityQtyNotBetween(Long value1, Long value2) {
            addCriterion("commodity_qty not between", value1, value2, "commodityQty");
            return (Criteria) this;
        }

        public Criteria andSetmenuCountIsNull() {
            addCriterion("setMenu_count is null");
            return (Criteria) this;
        }

        public Criteria andSetmenuCountIsNotNull() {
            addCriterion("setMenu_count is not null");
            return (Criteria) this;
        }

        public Criteria andSetmenuCountEqualTo(Long value) {
            addCriterion("setMenu_count =", value, "setmenuCount");
            return (Criteria) this;
        }

        public Criteria andSetmenuCountNotEqualTo(Long value) {
            addCriterion("setMenu_count <>", value, "setmenuCount");
            return (Criteria) this;
        }

        public Criteria andSetmenuCountGreaterThan(Long value) {
            addCriterion("setMenu_count >", value, "setmenuCount");
            return (Criteria) this;
        }

        public Criteria andSetmenuCountGreaterThanOrEqualTo(Long value) {
            addCriterion("setMenu_count >=", value, "setmenuCount");
            return (Criteria) this;
        }

        public Criteria andSetmenuCountLessThan(Long value) {
            addCriterion("setMenu_count <", value, "setmenuCount");
            return (Criteria) this;
        }

        public Criteria andSetmenuCountLessThanOrEqualTo(Long value) {
            addCriterion("setMenu_count <=", value, "setmenuCount");
            return (Criteria) this;
        }

        public Criteria andSetmenuCountIn(List<Long> values) {
            addCriterion("setMenu_count in", values, "setmenuCount");
            return (Criteria) this;
        }

        public Criteria andSetmenuCountNotIn(List<Long> values) {
            addCriterion("setMenu_count not in", values, "setmenuCount");
            return (Criteria) this;
        }

        public Criteria andSetmenuCountBetween(Long value1, Long value2) {
            addCriterion("setMenu_count between", value1, value2, "setmenuCount");
            return (Criteria) this;
        }

        public Criteria andSetmenuCountNotBetween(Long value1, Long value2) {
            addCriterion("setMenu_count not between", value1, value2, "setmenuCount");
            return (Criteria) this;
        }

        public Criteria andSetmenuSelectIsNull() {
            addCriterion("setMenu_select is null");
            return (Criteria) this;
        }

        public Criteria andSetmenuSelectIsNotNull() {
            addCriterion("setMenu_select is not null");
            return (Criteria) this;
        }

        public Criteria andSetmenuSelectEqualTo(Long value) {
            addCriterion("setMenu_select =", value, "setmenuSelect");
            return (Criteria) this;
        }

        public Criteria andSetmenuSelectNotEqualTo(Long value) {
            addCriterion("setMenu_select <>", value, "setmenuSelect");
            return (Criteria) this;
        }

        public Criteria andSetmenuSelectGreaterThan(Long value) {
            addCriterion("setMenu_select >", value, "setmenuSelect");
            return (Criteria) this;
        }

        public Criteria andSetmenuSelectGreaterThanOrEqualTo(Long value) {
            addCriterion("setMenu_select >=", value, "setmenuSelect");
            return (Criteria) this;
        }

        public Criteria andSetmenuSelectLessThan(Long value) {
            addCriterion("setMenu_select <", value, "setmenuSelect");
            return (Criteria) this;
        }

        public Criteria andSetmenuSelectLessThanOrEqualTo(Long value) {
            addCriterion("setMenu_select <=", value, "setmenuSelect");
            return (Criteria) this;
        }

        public Criteria andSetmenuSelectIn(List<Long> values) {
            addCriterion("setMenu_select in", values, "setmenuSelect");
            return (Criteria) this;
        }

        public Criteria andSetmenuSelectNotIn(List<Long> values) {
            addCriterion("setMenu_select not in", values, "setmenuSelect");
            return (Criteria) this;
        }

        public Criteria andSetmenuSelectBetween(Long value1, Long value2) {
            addCriterion("setMenu_select between", value1, value2, "setmenuSelect");
            return (Criteria) this;
        }

        public Criteria andSetmenuSelectNotBetween(Long value1, Long value2) {
            addCriterion("setMenu_select not between", value1, value2, "setmenuSelect");
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