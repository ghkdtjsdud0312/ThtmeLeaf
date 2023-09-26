package com.kh.jdbc.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpVO {
    private int empNO;
    private String name;
    private String job;
    private int mgr;
    private Date date;
    private BigDecimal sal;
    private BigDecimal comm;
    private int deptNO;

    public EmpVO(int empNO, String name, String job, int mgr, Date date, BigDecimal sal, BigDecimal comm, int deptNo) {
    }

    public int getEmpNO() {
        return empNO;
    }

    public void setEmpNO(int empNO) {
        this.empNO = empNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public BigDecimal getComm() {
        return comm;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    public int getDeptNO() {
        return deptNO;
    }

    public void setDeptNO(int deptNO) {
        this.deptNO = deptNO;
    }
}