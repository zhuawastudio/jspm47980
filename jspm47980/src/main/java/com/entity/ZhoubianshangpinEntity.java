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
 * 周边商品
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-25 11:13:48
 */
@TableName("zhoubianshangpin")
public class ZhoubianshangpinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhoubianshangpinEntity() {
		
	}
	
	public ZhoubianshangpinEntity(T t) {
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
	 * 周边名称
	 */
					
	private String zhoubianmingcheng;
	
	/**
	 * 周边分类
	 */
					
	private String zhoubianfenlei;
	
	/**
	 * 周边图片
	 */
					
	private String zhoubiantupian;
	
	/**
	 * 规格
	 */
					
	private String guige;
	
	/**
	 * 简介
	 */
					
	private String jianjie;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	/**
	 * 生产地
	 */
					
	private String shengchandi;
	
	/**
	 * 品牌
	 */
					
	private String pinpai;
	
	/**
	 * 原材料
	 */
					
	private String yuancailiao;
	
	/**
	 * 上架日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shangjiariqi;
	
	/**
	 * 单限
	 */
					
	private Integer onelimittimes;
	
	/**
	 * 库存
	 */
					
	private Integer alllimittimes;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	
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
	 * 设置：周边名称
	 */
	public void setZhoubianmingcheng(String zhoubianmingcheng) {
		this.zhoubianmingcheng = zhoubianmingcheng;
	}
	/**
	 * 获取：周边名称
	 */
	public String getZhoubianmingcheng() {
		return zhoubianmingcheng;
	}
	/**
	 * 设置：周边分类
	 */
	public void setZhoubianfenlei(String zhoubianfenlei) {
		this.zhoubianfenlei = zhoubianfenlei;
	}
	/**
	 * 获取：周边分类
	 */
	public String getZhoubianfenlei() {
		return zhoubianfenlei;
	}
	/**
	 * 设置：周边图片
	 */
	public void setZhoubiantupian(String zhoubiantupian) {
		this.zhoubiantupian = zhoubiantupian;
	}
	/**
	 * 获取：周边图片
	 */
	public String getZhoubiantupian() {
		return zhoubiantupian;
	}
	/**
	 * 设置：规格
	 */
	public void setGuige(String guige) {
		this.guige = guige;
	}
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
	/**
	 * 设置：简介
	 */
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
	/**
	 * 设置：生产地
	 */
	public void setShengchandi(String shengchandi) {
		this.shengchandi = shengchandi;
	}
	/**
	 * 获取：生产地
	 */
	public String getShengchandi() {
		return shengchandi;
	}
	/**
	 * 设置：品牌
	 */
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
	/**
	 * 设置：原材料
	 */
	public void setYuancailiao(String yuancailiao) {
		this.yuancailiao = yuancailiao;
	}
	/**
	 * 获取：原材料
	 */
	public String getYuancailiao() {
		return yuancailiao;
	}
	/**
	 * 设置：上架日期
	 */
	public void setShangjiariqi(Date shangjiariqi) {
		this.shangjiariqi = shangjiariqi;
	}
	/**
	 * 获取：上架日期
	 */
	public Date getShangjiariqi() {
		return shangjiariqi;
	}
	/**
	 * 设置：单限
	 */
	public void setOnelimittimes(Integer onelimittimes) {
		this.onelimittimes = onelimittimes;
	}
	/**
	 * 获取：单限
	 */
	public Integer getOnelimittimes() {
		return onelimittimes;
	}
	/**
	 * 设置：库存
	 */
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	/**
	 * 获取：库存
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}

}
