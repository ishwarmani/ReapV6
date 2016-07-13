package com.ttnd.reap.model;

public enum Badge {

	GOLD(30), SiLVER(20), BRONZE(10);

	private Integer value;

	private Badge(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
