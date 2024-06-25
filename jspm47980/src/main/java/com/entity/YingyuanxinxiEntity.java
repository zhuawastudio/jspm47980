package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 影院信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-25 11:13:48
 */
@TableName("yingyuanxinxi")
public class YingyuanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YingyuanxinxiEntity() {
		
	}
	
	public YingyuanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 影院名称
	 */
					
	private String yingyuanmingcheng;
	
	/**
	 * 影院图片
	 */
					
	private String yingyuantupian;
	
	/**
	 * 影院地址
	 */
					
	private String yingyuandizhi;
	
	/**
	 * 影院规模
	 */
					
	private String yingyuanguimo;
	
	/**
	 * 容纳人数
	 */
					
	private Integer rongnarenshu;
	
	/**
	 * 影院详情
	 */
					
	private String yingyuanxiangqing;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：影院名称
	 */
	public void setYingyuanmingcheng(String yingyuanmingcheng) {
		this.yingyuanmingcheng = yingyuanmingcheng;
	}
	/**
	 * 获取：影院名称
	 */
	public String getYingyuanmingcheng() {
		return yingyuanmingcheng;
	}
	/**
	 * 设置：影院图片
	 */
	public void setYingyuantupian(String yingyuantupian) {
		this.yingyuantupian = yingyuantupian;
	}
	/**
	 * 获取：影院图片
	 */
	public String getYingyuantupian() {
		return yingyuantupian;
	}
	/**
	 * 设置：影院地址
	 */
	public void setYingyuandizhi(String yingyuandizhi) {
		this.yingyuandizhi = yingyuandizhi;
	}
	/**
	 * 获取：影院地址
	 */
	public String getYingyuandizhi() {
		return yingyuandizhi;
	}
	/**
	 * 设置：影院规模
	 */
	public void setYingyuanguimo(String yingyuanguimo) {
		this.yingyuanguimo = yingyuanguimo;
	}
	/**
	 * 获取：影院规模
	 */
	public String getYingyuanguimo() {
		return yingyuanguimo;
	}
	/**
	 * 设置：容纳人数
	 */
	public void setRongnarenshu(Integer rongnarenshu) {
		this.rongnarenshu = rongnarenshu;
	}
	/**
	 * 获取：容纳人数
	 */
	public Integer getRongnarenshu() {
		return rongnarenshu;
	}
	/**
	 * 设置：影院详情
	 */
	public void setYingyuanxiangqing(String yingyuanxiangqing) {
		this.yingyuanxiangqing = yingyuanxiangqing;
	}
	/**
	 * 获取：影院详情
	 */
	public String getYingyuanxiangqing() {
		return yingyuanxiangqing;
	}
	/**
	 * 设置：发布日期
	 */
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}

}
