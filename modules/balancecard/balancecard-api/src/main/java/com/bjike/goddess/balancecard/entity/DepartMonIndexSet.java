package com.bjike.goddess.balancecard.entity;

import com.bjike.goddess.balancecard.enums.SeparateStatus;
import com.bjike.goddess.balancecard.enums.SeperateComeStatus;
import com.bjike.goddess.common.api.entity.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;


/**
 * 部门月度指标设置
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-05-19 09:33 ]
 * @Description: [ 部门月度指标设置 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "balancecard_departmonindexset")
public class DepartMonIndexSet extends BaseEntity {

    /**
     * 指标名称
     */
    @Column(name = "indexName", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '指标名称'")
    private String indexName;

    /**
     * 年份
     */
    @Column(name = "year", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '年份'")
    private String year;

    /**
     * 月份
     */
    @Column(name = "month", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '月份'")
    private String month;

    /**
     * 指标类型
     */
    @Column(name = "indexType",  columnDefinition = "VARCHAR(255)   COMMENT '指标类型'")
    private String indexType;

    /**
     * 维度
     */
    @Column(name = "dimension",  columnDefinition = "VARCHAR(255)   COMMENT '维度'")
    private String dimension;

    /**
     * 总指标权重
     */
    @Column(name = "describtion", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '总指标权重'")
    private Double describtion;

    /**
     * 责任部门
     */
    @Column(name = "department", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '责任部门'")
    private String department;

    /**
     * 部门年度指标权重
     */
    @Column(name = "departYearWeight", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '部门年度指标权重'")
    private Double departYearWeight;

    /**
     * 部门年度对赌值
     */
    @Column(name = "departYearWager", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '部门年度对赌值'")
    private Double departYearWager;

    /**
     * 权重
     */
    @Column(name = "weight", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '权重'")
    private Double weight;

    /**
     * 本月目标值
     */
    @Column(name = "target", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '本月目标值'")
    private Double target;

    /**
     * 对赌值
     */
    @Column(name = "wager", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '对赌值'")
    private Double wager;

    /**
     * 完成值
     */
    @Column(name = "complete", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '完成值'")
    private Double complete;

    /**
     * 考核方式
     */
    @Column(name = "examWay",  columnDefinition = "VARCHAR(255)   COMMENT '考核方式'")
    private String examWay;

    /**
     * 是否达标
     */
    @Column(name = "whetherStandar", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '是否达标'")
    private String whetherStandar;

    /**
     * 达成率
     */
    @Column(name = "standardRate", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '达成率'")
    private Double standardRate;

    /**
     * 考核得分
     */
    @Column(name = "examScore", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '考核得分'")
    private Double examScore;

    /**
     * 填报人员
     */
    @Column(name = "writePerson", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '填报人员'")
    private String writePerson;

    /**
     * 考核部门
     */
    @Column(name = "examDepart",   columnDefinition = "VARCHAR(255)   COMMENT '考核部门'")
    private String examDepart;

    /**
     * 数据来源
     */
    @Column(name = "dataOrigin",   columnDefinition = "VARCHAR(255)   COMMENT '数据来源'")
    private String dataOrigin;

    /**
     * 考核周期
     */
    @Column(name = "examDuring",  columnDefinition = "VARCHAR(255)   COMMENT '考核周期'")
    private String examDuring;

    /**
     * 部门月度指标添加人
     */
    @Column(name = "yearPersion",   columnDefinition = "VARCHAR(255)   COMMENT '部门月度指标添加人'")
    private String yearPersion;

    /**
     * 部门月度指标添加时间
     */
    @Column(name = "yearIndexTime",   columnDefinition = "DATE   COMMENT '部门月度指标添加时间'")
    private LocalDate yearIndexTime;

    /**
     * 岗位分解状态
     */
    @Column(name = "separateStatus", nullable = false, columnDefinition = "INT(2)   COMMENT '岗位分解状态'")
    private SeparateStatus separateStatus;

    /**
     * 是否由分解得来状态
     */
    @Column(name = "seperateComeStatus", nullable = false, columnDefinition = "INT(2)    COMMENT '是否由分解得来状态'")
    private SeperateComeStatus seperateComeStatus;

    /**
     * 部门年度指标设置id
     */
    @Column(name = "departYearIndexSetId",   columnDefinition = "VARCHAR(255)   COMMENT '部门年度指标设置id'")
    private String departYearIndexSetId;




    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Double getDescribtion() {
        return describtion;
    }

    public void setDescribtion(Double describtion) {
        this.describtion = describtion;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getDepartYearWeight() {
        return departYearWeight;
    }

    public void setDepartYearWeight(Double departYearWeight) {
        this.departYearWeight = departYearWeight;
    }

    public Double getDepartYearWager() {
        return departYearWager;
    }

    public void setDepartYearWager(Double departYearWager) {
        this.departYearWager = departYearWager;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getTarget() {
        return target;
    }

    public void setTarget(Double target) {
        this.target = target;
    }

    public Double getWager() {
        return wager;
    }

    public void setWager(Double wager) {
        this.wager = wager;
    }

    public Double getComplete() {
        return complete;
    }

    public void setComplete(Double complete) {
        this.complete = complete;
    }

    public String getExamWay() {
        return examWay;
    }

    public void setExamWay(String examWay) {
        this.examWay = examWay;
    }

    public String getWhetherStandar() {
        return whetherStandar;
    }

    public void setWhetherStandar(String whetherStandar) {
        this.whetherStandar = whetherStandar;
    }

    public Double getStandardRate() {
        return standardRate;
    }

    public void setStandardRate(Double standardRate) {
        this.standardRate = standardRate;
    }

    public Double getExamScore() {
        return examScore;
    }

    public void setExamScore(Double examScore) {
        this.examScore = examScore;
    }

    public String getWritePerson() {
        return writePerson;
    }

    public void setWritePerson(String writePerson) {
        this.writePerson = writePerson;
    }

    public String getExamDepart() {
        return examDepart;
    }

    public void setExamDepart(String examDepart) {
        this.examDepart = examDepart;
    }

    public String getDataOrigin() {
        return dataOrigin;
    }

    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    public String getExamDuring() {
        return examDuring;
    }

    public void setExamDuring(String examDuring) {
        this.examDuring = examDuring;
    }

    public String getYearPersion() {
        return yearPersion;
    }

    public void setYearPersion(String yearPersion) {
        this.yearPersion = yearPersion;
    }

    public LocalDate getYearIndexTime() {
        return yearIndexTime;
    }

    public void setYearIndexTime(LocalDate yearIndexTime) {
        this.yearIndexTime = yearIndexTime;
    }

    public SeparateStatus getSeparateStatus() {
        return separateStatus;
    }

    public void setSeparateStatus(SeparateStatus separateStatus) {
        this.separateStatus = separateStatus;
    }

    public SeperateComeStatus getSeperateComeStatus() {
        return seperateComeStatus;
    }

    public void setSeperateComeStatus(SeperateComeStatus seperateComeStatus) {
        this.seperateComeStatus = seperateComeStatus;
    }

    public String getDepartYearIndexSetId() {
        return departYearIndexSetId;
    }

    public void setDepartYearIndexSetId(String departYearIndexSetId) {
        this.departYearIndexSetId = departYearIndexSetId;
    }



}