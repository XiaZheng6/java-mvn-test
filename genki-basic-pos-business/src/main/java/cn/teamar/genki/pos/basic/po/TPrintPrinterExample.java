package cn.teamar.genki.pos.basic.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TPrintPrinterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPrintPrinterExample() {
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

        public Criteria andPrinterNameIsNull() {
            addCriterion("printer_name is null");
            return (Criteria) this;
        }

        public Criteria andPrinterNameIsNotNull() {
            addCriterion("printer_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrinterNameEqualTo(String value) {
            addCriterion("printer_name =", value, "printerName");
            return (Criteria) this;
        }

        public Criteria andPrinterNameNotEqualTo(String value) {
            addCriterion("printer_name <>", value, "printerName");
            return (Criteria) this;
        }

        public Criteria andPrinterNameGreaterThan(String value) {
            addCriterion("printer_name >", value, "printerName");
            return (Criteria) this;
        }

        public Criteria andPrinterNameGreaterThanOrEqualTo(String value) {
            addCriterion("printer_name >=", value, "printerName");
            return (Criteria) this;
        }

        public Criteria andPrinterNameLessThan(String value) {
            addCriterion("printer_name <", value, "printerName");
            return (Criteria) this;
        }

        public Criteria andPrinterNameLessThanOrEqualTo(String value) {
            addCriterion("printer_name <=", value, "printerName");
            return (Criteria) this;
        }

        public Criteria andPrinterNameLike(String value) {
            addCriterion("printer_name like", value, "printerName");
            return (Criteria) this;
        }

        public Criteria andPrinterNameNotLike(String value) {
            addCriterion("printer_name not like", value, "printerName");
            return (Criteria) this;
        }

        public Criteria andPrinterNameIn(List<String> values) {
            addCriterion("printer_name in", values, "printerName");
            return (Criteria) this;
        }

        public Criteria andPrinterNameNotIn(List<String> values) {
            addCriterion("printer_name not in", values, "printerName");
            return (Criteria) this;
        }

        public Criteria andPrinterNameBetween(String value1, String value2) {
            addCriterion("printer_name between", value1, value2, "printerName");
            return (Criteria) this;
        }

        public Criteria andPrinterNameNotBetween(String value1, String value2) {
            addCriterion("printer_name not between", value1, value2, "printerName");
            return (Criteria) this;
        }

        public Criteria andPrinterTypeIsNull() {
            addCriterion("printer_type is null");
            return (Criteria) this;
        }

        public Criteria andPrinterTypeIsNotNull() {
            addCriterion("printer_type is not null");
            return (Criteria) this;
        }

        public Criteria andPrinterTypeEqualTo(Byte value) {
            addCriterion("printer_type =", value, "printerType");
            return (Criteria) this;
        }

        public Criteria andPrinterTypeNotEqualTo(Byte value) {
            addCriterion("printer_type <>", value, "printerType");
            return (Criteria) this;
        }

        public Criteria andPrinterTypeGreaterThan(Byte value) {
            addCriterion("printer_type >", value, "printerType");
            return (Criteria) this;
        }

        public Criteria andPrinterTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("printer_type >=", value, "printerType");
            return (Criteria) this;
        }

        public Criteria andPrinterTypeLessThan(Byte value) {
            addCriterion("printer_type <", value, "printerType");
            return (Criteria) this;
        }

        public Criteria andPrinterTypeLessThanOrEqualTo(Byte value) {
            addCriterion("printer_type <=", value, "printerType");
            return (Criteria) this;
        }

        public Criteria andPrinterTypeIn(List<Byte> values) {
            addCriterion("printer_type in", values, "printerType");
            return (Criteria) this;
        }

        public Criteria andPrinterTypeNotIn(List<Byte> values) {
            addCriterion("printer_type not in", values, "printerType");
            return (Criteria) this;
        }

        public Criteria andPrinterTypeBetween(Byte value1, Byte value2) {
            addCriterion("printer_type between", value1, value2, "printerType");
            return (Criteria) this;
        }

        public Criteria andPrinterTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("printer_type not between", value1, value2, "printerType");
            return (Criteria) this;
        }

        public Criteria andPrinterCategoryIsNull() {
            addCriterion("printer_category is null");
            return (Criteria) this;
        }

        public Criteria andPrinterCategoryIsNotNull() {
            addCriterion("printer_category is not null");
            return (Criteria) this;
        }

        public Criteria andPrinterCategoryEqualTo(Byte value) {
            addCriterion("printer_category =", value, "printerCategory");
            return (Criteria) this;
        }

        public Criteria andPrinterCategoryNotEqualTo(Byte value) {
            addCriterion("printer_category <>", value, "printerCategory");
            return (Criteria) this;
        }

        public Criteria andPrinterCategoryGreaterThan(Byte value) {
            addCriterion("printer_category >", value, "printerCategory");
            return (Criteria) this;
        }

        public Criteria andPrinterCategoryGreaterThanOrEqualTo(Byte value) {
            addCriterion("printer_category >=", value, "printerCategory");
            return (Criteria) this;
        }

        public Criteria andPrinterCategoryLessThan(Byte value) {
            addCriterion("printer_category <", value, "printerCategory");
            return (Criteria) this;
        }

        public Criteria andPrinterCategoryLessThanOrEqualTo(Byte value) {
            addCriterion("printer_category <=", value, "printerCategory");
            return (Criteria) this;
        }

        public Criteria andPrinterCategoryIn(List<Byte> values) {
            addCriterion("printer_category in", values, "printerCategory");
            return (Criteria) this;
        }

        public Criteria andPrinterCategoryNotIn(List<Byte> values) {
            addCriterion("printer_category not in", values, "printerCategory");
            return (Criteria) this;
        }

        public Criteria andPrinterCategoryBetween(Byte value1, Byte value2) {
            addCriterion("printer_category between", value1, value2, "printerCategory");
            return (Criteria) this;
        }

        public Criteria andPrinterCategoryNotBetween(Byte value1, Byte value2) {
            addCriterion("printer_category not between", value1, value2, "printerCategory");
            return (Criteria) this;
        }

        public Criteria andPrinterIpIsNull() {
            addCriterion("printer_ip is null");
            return (Criteria) this;
        }

        public Criteria andPrinterIpIsNotNull() {
            addCriterion("printer_ip is not null");
            return (Criteria) this;
        }

        public Criteria andPrinterIpEqualTo(String value) {
            addCriterion("printer_ip =", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpNotEqualTo(String value) {
            addCriterion("printer_ip <>", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpGreaterThan(String value) {
            addCriterion("printer_ip >", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpGreaterThanOrEqualTo(String value) {
            addCriterion("printer_ip >=", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpLessThan(String value) {
            addCriterion("printer_ip <", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpLessThanOrEqualTo(String value) {
            addCriterion("printer_ip <=", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpLike(String value) {
            addCriterion("printer_ip like", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpNotLike(String value) {
            addCriterion("printer_ip not like", value, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpIn(List<String> values) {
            addCriterion("printer_ip in", values, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpNotIn(List<String> values) {
            addCriterion("printer_ip not in", values, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpBetween(String value1, String value2) {
            addCriterion("printer_ip between", value1, value2, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterIpNotBetween(String value1, String value2) {
            addCriterion("printer_ip not between", value1, value2, "printerIp");
            return (Criteria) this;
        }

        public Criteria andPrinterSnIsNull() {
            addCriterion("printer_sn is null");
            return (Criteria) this;
        }

        public Criteria andPrinterSnIsNotNull() {
            addCriterion("printer_sn is not null");
            return (Criteria) this;
        }

        public Criteria andPrinterSnEqualTo(String value) {
            addCriterion("printer_sn =", value, "printerSn");
            return (Criteria) this;
        }

        public Criteria andPrinterSnNotEqualTo(String value) {
            addCriterion("printer_sn <>", value, "printerSn");
            return (Criteria) this;
        }

        public Criteria andPrinterSnGreaterThan(String value) {
            addCriterion("printer_sn >", value, "printerSn");
            return (Criteria) this;
        }

        public Criteria andPrinterSnGreaterThanOrEqualTo(String value) {
            addCriterion("printer_sn >=", value, "printerSn");
            return (Criteria) this;
        }

        public Criteria andPrinterSnLessThan(String value) {
            addCriterion("printer_sn <", value, "printerSn");
            return (Criteria) this;
        }

        public Criteria andPrinterSnLessThanOrEqualTo(String value) {
            addCriterion("printer_sn <=", value, "printerSn");
            return (Criteria) this;
        }

        public Criteria andPrinterSnLike(String value) {
            addCriterion("printer_sn like", value, "printerSn");
            return (Criteria) this;
        }

        public Criteria andPrinterSnNotLike(String value) {
            addCriterion("printer_sn not like", value, "printerSn");
            return (Criteria) this;
        }

        public Criteria andPrinterSnIn(List<String> values) {
            addCriterion("printer_sn in", values, "printerSn");
            return (Criteria) this;
        }

        public Criteria andPrinterSnNotIn(List<String> values) {
            addCriterion("printer_sn not in", values, "printerSn");
            return (Criteria) this;
        }

        public Criteria andPrinterSnBetween(String value1, String value2) {
            addCriterion("printer_sn between", value1, value2, "printerSn");
            return (Criteria) this;
        }

        public Criteria andPrinterSnNotBetween(String value1, String value2) {
            addCriterion("printer_sn not between", value1, value2, "printerSn");
            return (Criteria) this;
        }

        public Criteria andPrinterPortIsNull() {
            addCriterion("printer_port is null");
            return (Criteria) this;
        }

        public Criteria andPrinterPortIsNotNull() {
            addCriterion("printer_port is not null");
            return (Criteria) this;
        }

        public Criteria andPrinterPortEqualTo(Integer value) {
            addCriterion("printer_port =", value, "printerPort");
            return (Criteria) this;
        }

        public Criteria andPrinterPortNotEqualTo(Integer value) {
            addCriterion("printer_port <>", value, "printerPort");
            return (Criteria) this;
        }

        public Criteria andPrinterPortGreaterThan(Integer value) {
            addCriterion("printer_port >", value, "printerPort");
            return (Criteria) this;
        }

        public Criteria andPrinterPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("printer_port >=", value, "printerPort");
            return (Criteria) this;
        }

        public Criteria andPrinterPortLessThan(Integer value) {
            addCriterion("printer_port <", value, "printerPort");
            return (Criteria) this;
        }

        public Criteria andPrinterPortLessThanOrEqualTo(Integer value) {
            addCriterion("printer_port <=", value, "printerPort");
            return (Criteria) this;
        }

        public Criteria andPrinterPortIn(List<Integer> values) {
            addCriterion("printer_port in", values, "printerPort");
            return (Criteria) this;
        }

        public Criteria andPrinterPortNotIn(List<Integer> values) {
            addCriterion("printer_port not in", values, "printerPort");
            return (Criteria) this;
        }

        public Criteria andPrinterPortBetween(Integer value1, Integer value2) {
            addCriterion("printer_port between", value1, value2, "printerPort");
            return (Criteria) this;
        }

        public Criteria andPrinterPortNotBetween(Integer value1, Integer value2) {
            addCriterion("printer_port not between", value1, value2, "printerPort");
            return (Criteria) this;
        }

        public Criteria andPrintWidthIsNull() {
            addCriterion("print_width is null");
            return (Criteria) this;
        }

        public Criteria andPrintWidthIsNotNull() {
            addCriterion("print_width is not null");
            return (Criteria) this;
        }

        public Criteria andPrintWidthEqualTo(Byte value) {
            addCriterion("print_width =", value, "printWidth");
            return (Criteria) this;
        }

        public Criteria andPrintWidthNotEqualTo(Byte value) {
            addCriterion("print_width <>", value, "printWidth");
            return (Criteria) this;
        }

        public Criteria andPrintWidthGreaterThan(Byte value) {
            addCriterion("print_width >", value, "printWidth");
            return (Criteria) this;
        }

        public Criteria andPrintWidthGreaterThanOrEqualTo(Byte value) {
            addCriterion("print_width >=", value, "printWidth");
            return (Criteria) this;
        }

        public Criteria andPrintWidthLessThan(Byte value) {
            addCriterion("print_width <", value, "printWidth");
            return (Criteria) this;
        }

        public Criteria andPrintWidthLessThanOrEqualTo(Byte value) {
            addCriterion("print_width <=", value, "printWidth");
            return (Criteria) this;
        }

        public Criteria andPrintWidthIn(List<Byte> values) {
            addCriterion("print_width in", values, "printWidth");
            return (Criteria) this;
        }

        public Criteria andPrintWidthNotIn(List<Byte> values) {
            addCriterion("print_width not in", values, "printWidth");
            return (Criteria) this;
        }

        public Criteria andPrintWidthBetween(Byte value1, Byte value2) {
            addCriterion("print_width between", value1, value2, "printWidth");
            return (Criteria) this;
        }

        public Criteria andPrintWidthNotBetween(Byte value1, Byte value2) {
            addCriterion("print_width not between", value1, value2, "printWidth");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeIsNull() {
            addCriterion("leak_proof_code is null");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeIsNotNull() {
            addCriterion("leak_proof_code is not null");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeEqualTo(String value) {
            addCriterion("leak_proof_code =", value, "leakProofCode");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeNotEqualTo(String value) {
            addCriterion("leak_proof_code <>", value, "leakProofCode");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeGreaterThan(String value) {
            addCriterion("leak_proof_code >", value, "leakProofCode");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeGreaterThanOrEqualTo(String value) {
            addCriterion("leak_proof_code >=", value, "leakProofCode");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeLessThan(String value) {
            addCriterion("leak_proof_code <", value, "leakProofCode");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeLessThanOrEqualTo(String value) {
            addCriterion("leak_proof_code <=", value, "leakProofCode");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeLike(String value) {
            addCriterion("leak_proof_code like", value, "leakProofCode");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeNotLike(String value) {
            addCriterion("leak_proof_code not like", value, "leakProofCode");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeIn(List<String> values) {
            addCriterion("leak_proof_code in", values, "leakProofCode");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeNotIn(List<String> values) {
            addCriterion("leak_proof_code not in", values, "leakProofCode");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeBetween(String value1, String value2) {
            addCriterion("leak_proof_code between", value1, value2, "leakProofCode");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeNotBetween(String value1, String value2) {
            addCriterion("leak_proof_code not between", value1, value2, "leakProofCode");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeStateIsNull() {
            addCriterion("leak_proof_code_state is null");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeStateIsNotNull() {
            addCriterion("leak_proof_code_state is not null");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeStateEqualTo(Byte value) {
            addCriterion("leak_proof_code_state =", value, "leakProofCodeState");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeStateNotEqualTo(Byte value) {
            addCriterion("leak_proof_code_state <>", value, "leakProofCodeState");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeStateGreaterThan(Byte value) {
            addCriterion("leak_proof_code_state >", value, "leakProofCodeState");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("leak_proof_code_state >=", value, "leakProofCodeState");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeStateLessThan(Byte value) {
            addCriterion("leak_proof_code_state <", value, "leakProofCodeState");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeStateLessThanOrEqualTo(Byte value) {
            addCriterion("leak_proof_code_state <=", value, "leakProofCodeState");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeStateIn(List<Byte> values) {
            addCriterion("leak_proof_code_state in", values, "leakProofCodeState");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeStateNotIn(List<Byte> values) {
            addCriterion("leak_proof_code_state not in", values, "leakProofCodeState");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeStateBetween(Byte value1, Byte value2) {
            addCriterion("leak_proof_code_state between", value1, value2, "leakProofCodeState");
            return (Criteria) this;
        }

        public Criteria andLeakProofCodeStateNotBetween(Byte value1, Byte value2) {
            addCriterion("leak_proof_code_state not between", value1, value2, "leakProofCodeState");
            return (Criteria) this;
        }

        public Criteria andResetruleIsNull() {
            addCriterion("resetRule is null");
            return (Criteria) this;
        }

        public Criteria andResetruleIsNotNull() {
            addCriterion("resetRule is not null");
            return (Criteria) this;
        }

        public Criteria andResetruleEqualTo(String value) {
            addCriterion("resetRule =", value, "resetrule");
            return (Criteria) this;
        }

        public Criteria andResetruleNotEqualTo(String value) {
            addCriterion("resetRule <>", value, "resetrule");
            return (Criteria) this;
        }

        public Criteria andResetruleGreaterThan(String value) {
            addCriterion("resetRule >", value, "resetrule");
            return (Criteria) this;
        }

        public Criteria andResetruleGreaterThanOrEqualTo(String value) {
            addCriterion("resetRule >=", value, "resetrule");
            return (Criteria) this;
        }

        public Criteria andResetruleLessThan(String value) {
            addCriterion("resetRule <", value, "resetrule");
            return (Criteria) this;
        }

        public Criteria andResetruleLessThanOrEqualTo(String value) {
            addCriterion("resetRule <=", value, "resetrule");
            return (Criteria) this;
        }

        public Criteria andResetruleLike(String value) {
            addCriterion("resetRule like", value, "resetrule");
            return (Criteria) this;
        }

        public Criteria andResetruleNotLike(String value) {
            addCriterion("resetRule not like", value, "resetrule");
            return (Criteria) this;
        }

        public Criteria andResetruleIn(List<String> values) {
            addCriterion("resetRule in", values, "resetrule");
            return (Criteria) this;
        }

        public Criteria andResetruleNotIn(List<String> values) {
            addCriterion("resetRule not in", values, "resetrule");
            return (Criteria) this;
        }

        public Criteria andResetruleBetween(String value1, String value2) {
            addCriterion("resetRule between", value1, value2, "resetrule");
            return (Criteria) this;
        }

        public Criteria andResetruleNotBetween(String value1, String value2) {
            addCriterion("resetRule not between", value1, value2, "resetrule");
            return (Criteria) this;
        }

        public Criteria andCashboxStatusIsNull() {
            addCriterion("cashbox_status is null");
            return (Criteria) this;
        }

        public Criteria andCashboxStatusIsNotNull() {
            addCriterion("cashbox_status is not null");
            return (Criteria) this;
        }

        public Criteria andCashboxStatusEqualTo(Byte value) {
            addCriterion("cashbox_status =", value, "cashboxStatus");
            return (Criteria) this;
        }

        public Criteria andCashboxStatusNotEqualTo(Byte value) {
            addCriterion("cashbox_status <>", value, "cashboxStatus");
            return (Criteria) this;
        }

        public Criteria andCashboxStatusGreaterThan(Byte value) {
            addCriterion("cashbox_status >", value, "cashboxStatus");
            return (Criteria) this;
        }

        public Criteria andCashboxStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("cashbox_status >=", value, "cashboxStatus");
            return (Criteria) this;
        }

        public Criteria andCashboxStatusLessThan(Byte value) {
            addCriterion("cashbox_status <", value, "cashboxStatus");
            return (Criteria) this;
        }

        public Criteria andCashboxStatusLessThanOrEqualTo(Byte value) {
            addCriterion("cashbox_status <=", value, "cashboxStatus");
            return (Criteria) this;
        }

        public Criteria andCashboxStatusIn(List<Byte> values) {
            addCriterion("cashbox_status in", values, "cashboxStatus");
            return (Criteria) this;
        }

        public Criteria andCashboxStatusNotIn(List<Byte> values) {
            addCriterion("cashbox_status not in", values, "cashboxStatus");
            return (Criteria) this;
        }

        public Criteria andCashboxStatusBetween(Byte value1, Byte value2) {
            addCriterion("cashbox_status between", value1, value2, "cashboxStatus");
            return (Criteria) this;
        }

        public Criteria andCashboxStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("cashbox_status not between", value1, value2, "cashboxStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityShowTypeIsNull() {
            addCriterion("commodity_show_type is null");
            return (Criteria) this;
        }

        public Criteria andCommodityShowTypeIsNotNull() {
            addCriterion("commodity_show_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityShowTypeEqualTo(String value) {
            addCriterion("commodity_show_type =", value, "commodityShowType");
            return (Criteria) this;
        }

        public Criteria andCommodityShowTypeNotEqualTo(String value) {
            addCriterion("commodity_show_type <>", value, "commodityShowType");
            return (Criteria) this;
        }

        public Criteria andCommodityShowTypeGreaterThan(String value) {
            addCriterion("commodity_show_type >", value, "commodityShowType");
            return (Criteria) this;
        }

        public Criteria andCommodityShowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_show_type >=", value, "commodityShowType");
            return (Criteria) this;
        }

        public Criteria andCommodityShowTypeLessThan(String value) {
            addCriterion("commodity_show_type <", value, "commodityShowType");
            return (Criteria) this;
        }

        public Criteria andCommodityShowTypeLessThanOrEqualTo(String value) {
            addCriterion("commodity_show_type <=", value, "commodityShowType");
            return (Criteria) this;
        }

        public Criteria andCommodityShowTypeLike(String value) {
            addCriterion("commodity_show_type like", value, "commodityShowType");
            return (Criteria) this;
        }

        public Criteria andCommodityShowTypeNotLike(String value) {
            addCriterion("commodity_show_type not like", value, "commodityShowType");
            return (Criteria) this;
        }

        public Criteria andCommodityShowTypeIn(List<String> values) {
            addCriterion("commodity_show_type in", values, "commodityShowType");
            return (Criteria) this;
        }

        public Criteria andCommodityShowTypeNotIn(List<String> values) {
            addCriterion("commodity_show_type not in", values, "commodityShowType");
            return (Criteria) this;
        }

        public Criteria andCommodityShowTypeBetween(String value1, String value2) {
            addCriterion("commodity_show_type between", value1, value2, "commodityShowType");
            return (Criteria) this;
        }

        public Criteria andCommodityShowTypeNotBetween(String value1, String value2) {
            addCriterion("commodity_show_type not between", value1, value2, "commodityShowType");
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

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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