package cn.teamar.genki.pos.basic.po;

import java.util.ArrayList;
import java.util.List;

public class FoodCommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodCommodityExample() {
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

        public Criteria andCommodityEnglishnameIsNull() {
            addCriterion("commodity_englishName is null");
            return (Criteria) this;
        }

        public Criteria andCommodityEnglishnameIsNotNull() {
            addCriterion("commodity_englishName is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityEnglishnameEqualTo(String value) {
            addCriterion("commodity_englishName =", value, "commodityEnglishname");
            return (Criteria) this;
        }

        public Criteria andCommodityEnglishnameNotEqualTo(String value) {
            addCriterion("commodity_englishName <>", value, "commodityEnglishname");
            return (Criteria) this;
        }

        public Criteria andCommodityEnglishnameGreaterThan(String value) {
            addCriterion("commodity_englishName >", value, "commodityEnglishname");
            return (Criteria) this;
        }

        public Criteria andCommodityEnglishnameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_englishName >=", value, "commodityEnglishname");
            return (Criteria) this;
        }

        public Criteria andCommodityEnglishnameLessThan(String value) {
            addCriterion("commodity_englishName <", value, "commodityEnglishname");
            return (Criteria) this;
        }

        public Criteria andCommodityEnglishnameLessThanOrEqualTo(String value) {
            addCriterion("commodity_englishName <=", value, "commodityEnglishname");
            return (Criteria) this;
        }

        public Criteria andCommodityEnglishnameLike(String value) {
            addCriterion("commodity_englishName like", value, "commodityEnglishname");
            return (Criteria) this;
        }

        public Criteria andCommodityEnglishnameNotLike(String value) {
            addCriterion("commodity_englishName not like", value, "commodityEnglishname");
            return (Criteria) this;
        }

        public Criteria andCommodityEnglishnameIn(List<String> values) {
            addCriterion("commodity_englishName in", values, "commodityEnglishname");
            return (Criteria) this;
        }

        public Criteria andCommodityEnglishnameNotIn(List<String> values) {
            addCriterion("commodity_englishName not in", values, "commodityEnglishname");
            return (Criteria) this;
        }

        public Criteria andCommodityEnglishnameBetween(String value1, String value2) {
            addCriterion("commodity_englishName between", value1, value2, "commodityEnglishname");
            return (Criteria) this;
        }

        public Criteria andCommodityEnglishnameNotBetween(String value1, String value2) {
            addCriterion("commodity_englishName not between", value1, value2, "commodityEnglishname");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("unit_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(Long value) {
            addCriterion("unit_id =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(Long value) {
            addCriterion("unit_id <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(Long value) {
            addCriterion("unit_id >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(Long value) {
            addCriterion("unit_id >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(Long value) {
            addCriterion("unit_id <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(Long value) {
            addCriterion("unit_id <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<Long> values) {
            addCriterion("unit_id in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<Long> values) {
            addCriterion("unit_id not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(Long value1, Long value2) {
            addCriterion("unit_id between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(Long value1, Long value2) {
            addCriterion("unit_id not between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andQuickCodeIsNull() {
            addCriterion("quick_code is null");
            return (Criteria) this;
        }

        public Criteria andQuickCodeIsNotNull() {
            addCriterion("quick_code is not null");
            return (Criteria) this;
        }

        public Criteria andQuickCodeEqualTo(String value) {
            addCriterion("quick_code =", value, "quickCode");
            return (Criteria) this;
        }

        public Criteria andQuickCodeNotEqualTo(String value) {
            addCriterion("quick_code <>", value, "quickCode");
            return (Criteria) this;
        }

        public Criteria andQuickCodeGreaterThan(String value) {
            addCriterion("quick_code >", value, "quickCode");
            return (Criteria) this;
        }

        public Criteria andQuickCodeGreaterThanOrEqualTo(String value) {
            addCriterion("quick_code >=", value, "quickCode");
            return (Criteria) this;
        }

        public Criteria andQuickCodeLessThan(String value) {
            addCriterion("quick_code <", value, "quickCode");
            return (Criteria) this;
        }

        public Criteria andQuickCodeLessThanOrEqualTo(String value) {
            addCriterion("quick_code <=", value, "quickCode");
            return (Criteria) this;
        }

        public Criteria andQuickCodeLike(String value) {
            addCriterion("quick_code like", value, "quickCode");
            return (Criteria) this;
        }

        public Criteria andQuickCodeNotLike(String value) {
            addCriterion("quick_code not like", value, "quickCode");
            return (Criteria) this;
        }

        public Criteria andQuickCodeIn(List<String> values) {
            addCriterion("quick_code in", values, "quickCode");
            return (Criteria) this;
        }

        public Criteria andQuickCodeNotIn(List<String> values) {
            addCriterion("quick_code not in", values, "quickCode");
            return (Criteria) this;
        }

        public Criteria andQuickCodeBetween(String value1, String value2) {
            addCriterion("quick_code between", value1, value2, "quickCode");
            return (Criteria) this;
        }

        public Criteria andQuickCodeNotBetween(String value1, String value2) {
            addCriterion("quick_code not between", value1, value2, "quickCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeIsNull() {
            addCriterion("sort_code is null");
            return (Criteria) this;
        }

        public Criteria andSortCodeIsNotNull() {
            addCriterion("sort_code is not null");
            return (Criteria) this;
        }

        public Criteria andSortCodeEqualTo(Byte value) {
            addCriterion("sort_code =", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeNotEqualTo(Byte value) {
            addCriterion("sort_code <>", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeGreaterThan(Byte value) {
            addCriterion("sort_code >", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("sort_code >=", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeLessThan(Byte value) {
            addCriterion("sort_code <", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeLessThanOrEqualTo(Byte value) {
            addCriterion("sort_code <=", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeIn(List<Byte> values) {
            addCriterion("sort_code in", values, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeNotIn(List<Byte> values) {
            addCriterion("sort_code not in", values, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeBetween(Byte value1, Byte value2) {
            addCriterion("sort_code between", value1, value2, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeNotBetween(Byte value1, Byte value2) {
            addCriterion("sort_code not between", value1, value2, "sortCode");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Long value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Long value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Long value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Long value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Long> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Long> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Long value1, Long value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNull() {
            addCriterion("dep_id is null");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNotNull() {
            addCriterion("dep_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepIdEqualTo(Long value) {
            addCriterion("dep_id =", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotEqualTo(Long value) {
            addCriterion("dep_id <>", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThan(Long value) {
            addCriterion("dep_id >", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dep_id >=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThan(Long value) {
            addCriterion("dep_id <", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThanOrEqualTo(Long value) {
            addCriterion("dep_id <=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdIn(List<Long> values) {
            addCriterion("dep_id in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotIn(List<Long> values) {
            addCriterion("dep_id not in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdBetween(Long value1, Long value2) {
            addCriterion("dep_id between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotBetween(Long value1, Long value2) {
            addCriterion("dep_id not between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andImgTagIdIsNull() {
            addCriterion("img_tag_id is null");
            return (Criteria) this;
        }

        public Criteria andImgTagIdIsNotNull() {
            addCriterion("img_tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgTagIdEqualTo(Long value) {
            addCriterion("img_tag_id =", value, "imgTagId");
            return (Criteria) this;
        }

        public Criteria andImgTagIdNotEqualTo(Long value) {
            addCriterion("img_tag_id <>", value, "imgTagId");
            return (Criteria) this;
        }

        public Criteria andImgTagIdGreaterThan(Long value) {
            addCriterion("img_tag_id >", value, "imgTagId");
            return (Criteria) this;
        }

        public Criteria andImgTagIdGreaterThanOrEqualTo(Long value) {
            addCriterion("img_tag_id >=", value, "imgTagId");
            return (Criteria) this;
        }

        public Criteria andImgTagIdLessThan(Long value) {
            addCriterion("img_tag_id <", value, "imgTagId");
            return (Criteria) this;
        }

        public Criteria andImgTagIdLessThanOrEqualTo(Long value) {
            addCriterion("img_tag_id <=", value, "imgTagId");
            return (Criteria) this;
        }

        public Criteria andImgTagIdIn(List<Long> values) {
            addCriterion("img_tag_id in", values, "imgTagId");
            return (Criteria) this;
        }

        public Criteria andImgTagIdNotIn(List<Long> values) {
            addCriterion("img_tag_id not in", values, "imgTagId");
            return (Criteria) this;
        }

        public Criteria andImgTagIdBetween(Long value1, Long value2) {
            addCriterion("img_tag_id between", value1, value2, "imgTagId");
            return (Criteria) this;
        }

        public Criteria andImgTagIdNotBetween(Long value1, Long value2) {
            addCriterion("img_tag_id not between", value1, value2, "imgTagId");
            return (Criteria) this;
        }

        public Criteria andTxtTagIsNull() {
            addCriterion("txt_tag is null");
            return (Criteria) this;
        }

        public Criteria andTxtTagIsNotNull() {
            addCriterion("txt_tag is not null");
            return (Criteria) this;
        }

        public Criteria andTxtTagEqualTo(String value) {
            addCriterion("txt_tag =", value, "txtTag");
            return (Criteria) this;
        }

        public Criteria andTxtTagNotEqualTo(String value) {
            addCriterion("txt_tag <>", value, "txtTag");
            return (Criteria) this;
        }

        public Criteria andTxtTagGreaterThan(String value) {
            addCriterion("txt_tag >", value, "txtTag");
            return (Criteria) this;
        }

        public Criteria andTxtTagGreaterThanOrEqualTo(String value) {
            addCriterion("txt_tag >=", value, "txtTag");
            return (Criteria) this;
        }

        public Criteria andTxtTagLessThan(String value) {
            addCriterion("txt_tag <", value, "txtTag");
            return (Criteria) this;
        }

        public Criteria andTxtTagLessThanOrEqualTo(String value) {
            addCriterion("txt_tag <=", value, "txtTag");
            return (Criteria) this;
        }

        public Criteria andTxtTagLike(String value) {
            addCriterion("txt_tag like", value, "txtTag");
            return (Criteria) this;
        }

        public Criteria andTxtTagNotLike(String value) {
            addCriterion("txt_tag not like", value, "txtTag");
            return (Criteria) this;
        }

        public Criteria andTxtTagIn(List<String> values) {
            addCriterion("txt_tag in", values, "txtTag");
            return (Criteria) this;
        }

        public Criteria andTxtTagNotIn(List<String> values) {
            addCriterion("txt_tag not in", values, "txtTag");
            return (Criteria) this;
        }

        public Criteria andTxtTagBetween(String value1, String value2) {
            addCriterion("txt_tag between", value1, value2, "txtTag");
            return (Criteria) this;
        }

        public Criteria andTxtTagNotBetween(String value1, String value2) {
            addCriterion("txt_tag not between", value1, value2, "txtTag");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagIsNull() {
            addCriterion("analysis_tag is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagIsNotNull() {
            addCriterion("analysis_tag is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagEqualTo(String value) {
            addCriterion("analysis_tag =", value, "analysisTag");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagNotEqualTo(String value) {
            addCriterion("analysis_tag <>", value, "analysisTag");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagGreaterThan(String value) {
            addCriterion("analysis_tag >", value, "analysisTag");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagGreaterThanOrEqualTo(String value) {
            addCriterion("analysis_tag >=", value, "analysisTag");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagLessThan(String value) {
            addCriterion("analysis_tag <", value, "analysisTag");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagLessThanOrEqualTo(String value) {
            addCriterion("analysis_tag <=", value, "analysisTag");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagLike(String value) {
            addCriterion("analysis_tag like", value, "analysisTag");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagNotLike(String value) {
            addCriterion("analysis_tag not like", value, "analysisTag");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagIn(List<String> values) {
            addCriterion("analysis_tag in", values, "analysisTag");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagNotIn(List<String> values) {
            addCriterion("analysis_tag not in", values, "analysisTag");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagBetween(String value1, String value2) {
            addCriterion("analysis_tag between", value1, value2, "analysisTag");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagNotBetween(String value1, String value2) {
            addCriterion("analysis_tag not between", value1, value2, "analysisTag");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
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

        public Criteria andTxtTagIdIsNull() {
            addCriterion("txt_tag_id is null");
            return (Criteria) this;
        }

        public Criteria andTxtTagIdIsNotNull() {
            addCriterion("txt_tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andTxtTagIdEqualTo(Long value) {
            addCriterion("txt_tag_id =", value, "txtTagId");
            return (Criteria) this;
        }

        public Criteria andTxtTagIdNotEqualTo(Long value) {
            addCriterion("txt_tag_id <>", value, "txtTagId");
            return (Criteria) this;
        }

        public Criteria andTxtTagIdGreaterThan(Long value) {
            addCriterion("txt_tag_id >", value, "txtTagId");
            return (Criteria) this;
        }

        public Criteria andTxtTagIdGreaterThanOrEqualTo(Long value) {
            addCriterion("txt_tag_id >=", value, "txtTagId");
            return (Criteria) this;
        }

        public Criteria andTxtTagIdLessThan(Long value) {
            addCriterion("txt_tag_id <", value, "txtTagId");
            return (Criteria) this;
        }

        public Criteria andTxtTagIdLessThanOrEqualTo(Long value) {
            addCriterion("txt_tag_id <=", value, "txtTagId");
            return (Criteria) this;
        }

        public Criteria andTxtTagIdIn(List<Long> values) {
            addCriterion("txt_tag_id in", values, "txtTagId");
            return (Criteria) this;
        }

        public Criteria andTxtTagIdNotIn(List<Long> values) {
            addCriterion("txt_tag_id not in", values, "txtTagId");
            return (Criteria) this;
        }

        public Criteria andTxtTagIdBetween(Long value1, Long value2) {
            addCriterion("txt_tag_id between", value1, value2, "txtTagId");
            return (Criteria) this;
        }

        public Criteria andTxtTagIdNotBetween(Long value1, Long value2) {
            addCriterion("txt_tag_id not between", value1, value2, "txtTagId");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagIdIsNull() {
            addCriterion("analysis_tag_id is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagIdIsNotNull() {
            addCriterion("analysis_tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagIdEqualTo(Long value) {
            addCriterion("analysis_tag_id =", value, "analysisTagId");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagIdNotEqualTo(Long value) {
            addCriterion("analysis_tag_id <>", value, "analysisTagId");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagIdGreaterThan(Long value) {
            addCriterion("analysis_tag_id >", value, "analysisTagId");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagIdGreaterThanOrEqualTo(Long value) {
            addCriterion("analysis_tag_id >=", value, "analysisTagId");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagIdLessThan(Long value) {
            addCriterion("analysis_tag_id <", value, "analysisTagId");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagIdLessThanOrEqualTo(Long value) {
            addCriterion("analysis_tag_id <=", value, "analysisTagId");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagIdIn(List<Long> values) {
            addCriterion("analysis_tag_id in", values, "analysisTagId");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagIdNotIn(List<Long> values) {
            addCriterion("analysis_tag_id not in", values, "analysisTagId");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagIdBetween(Long value1, Long value2) {
            addCriterion("analysis_tag_id between", value1, value2, "analysisTagId");
            return (Criteria) this;
        }

        public Criteria andAnalysisTagIdNotBetween(Long value1, Long value2) {
            addCriterion("analysis_tag_id not between", value1, value2, "analysisTagId");
            return (Criteria) this;
        }

        public Criteria andImgTagTextIsNull() {
            addCriterion("img_tag_text is null");
            return (Criteria) this;
        }

        public Criteria andImgTagTextIsNotNull() {
            addCriterion("img_tag_text is not null");
            return (Criteria) this;
        }

        public Criteria andImgTagTextEqualTo(String value) {
            addCriterion("img_tag_text =", value, "imgTagText");
            return (Criteria) this;
        }

        public Criteria andImgTagTextNotEqualTo(String value) {
            addCriterion("img_tag_text <>", value, "imgTagText");
            return (Criteria) this;
        }

        public Criteria andImgTagTextGreaterThan(String value) {
            addCriterion("img_tag_text >", value, "imgTagText");
            return (Criteria) this;
        }

        public Criteria andImgTagTextGreaterThanOrEqualTo(String value) {
            addCriterion("img_tag_text >=", value, "imgTagText");
            return (Criteria) this;
        }

        public Criteria andImgTagTextLessThan(String value) {
            addCriterion("img_tag_text <", value, "imgTagText");
            return (Criteria) this;
        }

        public Criteria andImgTagTextLessThanOrEqualTo(String value) {
            addCriterion("img_tag_text <=", value, "imgTagText");
            return (Criteria) this;
        }

        public Criteria andImgTagTextLike(String value) {
            addCriterion("img_tag_text like", value, "imgTagText");
            return (Criteria) this;
        }

        public Criteria andImgTagTextNotLike(String value) {
            addCriterion("img_tag_text not like", value, "imgTagText");
            return (Criteria) this;
        }

        public Criteria andImgTagTextIn(List<String> values) {
            addCriterion("img_tag_text in", values, "imgTagText");
            return (Criteria) this;
        }

        public Criteria andImgTagTextNotIn(List<String> values) {
            addCriterion("img_tag_text not in", values, "imgTagText");
            return (Criteria) this;
        }

        public Criteria andImgTagTextBetween(String value1, String value2) {
            addCriterion("img_tag_text between", value1, value2, "imgTagText");
            return (Criteria) this;
        }

        public Criteria andImgTagTextNotBetween(String value1, String value2) {
            addCriterion("img_tag_text not between", value1, value2, "imgTagText");
            return (Criteria) this;
        }

        public Criteria andPackagePriceIsNull() {
            addCriterion("package_price is null");
            return (Criteria) this;
        }

        public Criteria andPackagePriceIsNotNull() {
            addCriterion("package_price is not null");
            return (Criteria) this;
        }

        public Criteria andPackagePriceEqualTo(Long value) {
            addCriterion("package_price =", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceNotEqualTo(Long value) {
            addCriterion("package_price <>", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceGreaterThan(Long value) {
            addCriterion("package_price >", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("package_price >=", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceLessThan(Long value) {
            addCriterion("package_price <", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceLessThanOrEqualTo(Long value) {
            addCriterion("package_price <=", value, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceIn(List<Long> values) {
            addCriterion("package_price in", values, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceNotIn(List<Long> values) {
            addCriterion("package_price not in", values, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceBetween(Long value1, Long value2) {
            addCriterion("package_price between", value1, value2, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andPackagePriceNotBetween(Long value1, Long value2) {
            addCriterion("package_price not between", value1, value2, "packagePrice");
            return (Criteria) this;
        }

        public Criteria andIsComboIsNull() {
            addCriterion("is_combo is null");
            return (Criteria) this;
        }

        public Criteria andIsComboIsNotNull() {
            addCriterion("is_combo is not null");
            return (Criteria) this;
        }

        public Criteria andIsComboEqualTo(Byte value) {
            addCriterion("is_combo =", value, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboNotEqualTo(Byte value) {
            addCriterion("is_combo <>", value, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboGreaterThan(Byte value) {
            addCriterion("is_combo >", value, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_combo >=", value, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboLessThan(Byte value) {
            addCriterion("is_combo <", value, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboLessThanOrEqualTo(Byte value) {
            addCriterion("is_combo <=", value, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboIn(List<Byte> values) {
            addCriterion("is_combo in", values, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboNotIn(List<Byte> values) {
            addCriterion("is_combo not in", values, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboBetween(Byte value1, Byte value2) {
            addCriterion("is_combo between", value1, value2, "isCombo");
            return (Criteria) this;
        }

        public Criteria andIsComboNotBetween(Byte value1, Byte value2) {
            addCriterion("is_combo not between", value1, value2, "isCombo");
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

        public Criteria andAllocationplanIsNull() {
            addCriterion("allocationPlan is null");
            return (Criteria) this;
        }

        public Criteria andAllocationplanIsNotNull() {
            addCriterion("allocationPlan is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationplanEqualTo(String value) {
            addCriterion("allocationPlan =", value, "allocationplan");
            return (Criteria) this;
        }

        public Criteria andAllocationplanNotEqualTo(String value) {
            addCriterion("allocationPlan <>", value, "allocationplan");
            return (Criteria) this;
        }

        public Criteria andAllocationplanGreaterThan(String value) {
            addCriterion("allocationPlan >", value, "allocationplan");
            return (Criteria) this;
        }

        public Criteria andAllocationplanGreaterThanOrEqualTo(String value) {
            addCriterion("allocationPlan >=", value, "allocationplan");
            return (Criteria) this;
        }

        public Criteria andAllocationplanLessThan(String value) {
            addCriterion("allocationPlan <", value, "allocationplan");
            return (Criteria) this;
        }

        public Criteria andAllocationplanLessThanOrEqualTo(String value) {
            addCriterion("allocationPlan <=", value, "allocationplan");
            return (Criteria) this;
        }

        public Criteria andAllocationplanLike(String value) {
            addCriterion("allocationPlan like", value, "allocationplan");
            return (Criteria) this;
        }

        public Criteria andAllocationplanNotLike(String value) {
            addCriterion("allocationPlan not like", value, "allocationplan");
            return (Criteria) this;
        }

        public Criteria andAllocationplanIn(List<String> values) {
            addCriterion("allocationPlan in", values, "allocationplan");
            return (Criteria) this;
        }

        public Criteria andAllocationplanNotIn(List<String> values) {
            addCriterion("allocationPlan not in", values, "allocationplan");
            return (Criteria) this;
        }

        public Criteria andAllocationplanBetween(String value1, String value2) {
            addCriterion("allocationPlan between", value1, value2, "allocationplan");
            return (Criteria) this;
        }

        public Criteria andAllocationplanNotBetween(String value1, String value2) {
            addCriterion("allocationPlan not between", value1, value2, "allocationplan");
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