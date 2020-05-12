package model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @author djin
 *    Emp实体类
 * @date 2020-05-11 15:35:04
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class EmpEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
      //
	  private Integer empno;
      //
	  private String ename;
      //
	  private String job;
      //
	  private Integer mgr;
      //
      @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss" ,timezone = "GMT+8")
	  private Date hiredate;
      //
	  private BigDecimal sal;
      //
	  private BigDecimal comm;
      //
	  private Integer deptno;

	  /**
	   * 设置：
	   */
	  public void setEmpno(Integer empno) {
		  this.empno = empno;
	  }
	  /**
	   * 获取：
	   */
	  public Integer getEmpno() {
	   	  return empno;
	  }
	  /**
	   * 设置：
	   */
	  public void setEname(String ename) {
		  this.ename = ename;
	  }
	  /**
	   * 获取：
	   */
	  public String getEname() {
	   	  return ename;
	  }
	  /**
	   * 设置：
	   */
	  public void setJob(String job) {
		  this.job = job;
	  }
	  /**
	   * 获取：
	   */
	  public String getJob() {
	   	  return job;
	  }
	  /**
	   * 设置：
	   */
	  public void setMgr(Integer mgr) {
		  this.mgr = mgr;
	  }
	  /**
	   * 获取：
	   */
	  public Integer getMgr() {
	   	  return mgr;
	  }
	  /**
	   * 设置：
	   */
	  public void setHiredate(Date hiredate) {
		  this.hiredate = hiredate;
	  }
	  /**
	   * 获取：
	   */
	  public Date getHiredate() {
	   	  return hiredate;
	  }
	  /**
	   * 设置：
	   */
	  public void setSal(BigDecimal sal) {
		  this.sal = sal;
	  }
	  /**
	   * 获取：
	   */
	  public BigDecimal getSal() {
	   	  return sal;
	  }
	  /**
	   * 设置：
	   */
	  public void setComm(BigDecimal comm) {
		  this.comm = comm;
	  }
	  /**
	   * 获取：
	   */
	  public BigDecimal getComm() {
	   	  return comm;
	  }
	  /**
	   * 设置：
	   */
	  public void setDeptno(Integer deptno) {
		  this.deptno = deptno;
	  }
	  /**
	   * 获取：
	   */
	  public Integer getDeptno() {
	   	  return deptno;
	  }

	 
	  @Override
	  public String toString() {
		  return  ReflectionToStringBuilder.toString(this);
	  }

}
