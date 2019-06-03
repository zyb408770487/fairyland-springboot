package com.fairyland.mgr.test;

public enum TableEnum {
	
	THC_USER("用户表","thc_user"),
	THC_VIPUSER("会员用户表","thc_user_vip"),
	THC_CUSTOMER("客户表","thc_customer"),
	THC_USER_CAR("车辆表","thc_user_car");
	
	private final String key;
	private final String value;
	
	private TableEnum(String key, String value) {
		this.key = key;
		this.value = value;
	}
	public String getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
}
