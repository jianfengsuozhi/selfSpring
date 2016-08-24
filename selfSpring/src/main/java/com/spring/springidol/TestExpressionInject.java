package com.spring.springidol;

public class TestExpressionInject {
	private Double a;
	private String str;
	private Boolean bool;
	private Saxophone saxophone;
	private String song;
	private String return1;
	private String return2;
	private Double PI;
	private Double random;
	
	public Double getPI() {
		return PI;
	}
	public void setPI(Double pI) {
		PI = pI;
	}
	public Double getRandom() {
		return random;
	}


	public void setRandom(Double random) {
		this.random = random;
	}


	public Double getA() {
		return a;
	}


	public void setA(Double a) {
		this.a = a;
	}


	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
	}


	public Boolean getBool() {
		return bool;
	}


	public void setBool(Boolean bool) {
		this.bool = bool;
	}


	public Saxophone getSaxophone() {
		return saxophone;
	}


	public void setSaxophone(Saxophone saxophone) {
		this.saxophone = saxophone;
	}


	public String getSong() {
		return song;
	}


	public void setSong(String song) {
		this.song = song;
	}


	public String getReturn1() {
		return return1;
	}


	public void setReturn1(String return1) {
		this.return1 = return1;
	}


	public String getReturn2() {
		return return2;
	}


	public void setReturn2(String return2) {
		this.return2 = return2;
	}


	@Override
	public String toString() {
		return "TestExpressionInject [a=" + a + ", str=" + str + ", bool="
				+ bool + ", saxophone=" + saxophone + ", song=" + song
				+ ", return1=" + return1 + ", return2=" + return2 + ", PI="
				+ PI + ", random=" + random + "]";
	}
}
