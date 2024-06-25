package com.entity.vo;

import com.entity.YingyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 影院信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-25 11:13:48
 */
public class YingyuanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
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
