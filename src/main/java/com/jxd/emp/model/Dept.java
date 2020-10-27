package com.jxd.emp.model;

/**
 * @ClassName Dept
 * @Description TODO
 * @Author Deng ShenYi
 * @Date 2020/10/23
 * @Version 1.0
 */
public class Dept {
    private int deptno;
    private String dname;
    private String loc;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
