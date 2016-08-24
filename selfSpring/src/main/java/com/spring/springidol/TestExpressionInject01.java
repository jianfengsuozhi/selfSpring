package com.spring.springidol;

public class TestExpressionInject01 {
	private Double sum;
	private String sumStr;
	private Double area;
	private Boolean equl;
	private Boolean and;
	private String sanSelect1;
	private String sanSelect2;
	private Boolean matches;
	
	public Boolean getMatches() {
		return matches;
	}
	public void setMatches(Boolean matches) {
		this.matches = matches;
	}
	public String getSanSelect1() {
		return sanSelect1;
	}
	public void setSanSelect1(String sanSelect1) {
		this.sanSelect1 = sanSelect1;
	}
	public Boolean getAnd() {
		return and;
	}
	public void setAnd(Boolean and) {
		this.and = and;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public Boolean getEqul() {
		return equl;
	}
	public void setEqul(Boolean equl) {
		this.equl = equl;
	}
	public Double getSum() {
		return sum;
	}
	public void setSum(Double sum) {
		this.sum = sum;
	}
	public String getSumStr() {
		return sumStr;
	}
	public void setSumStr(String sumStr) {
		this.sumStr = sumStr;
	}

	public String getSanSelect2() {
		return sanSelect2;
	}
	public void setSanSelect2(String sanSelect2) {
		this.sanSelect2 = sanSelect2;
	}
	@Override
	public String toString() {
		return "TestExpressionInject01 [sum=" + sum + ", sumStr=" + sumStr
				+ ", area=" + area + ", equl=" + equl + ", and=" + and
				+ ", sanSelect1=" + sanSelect1 + ", sanSelect2=" + sanSelect2
				+ ", matches=" + matches + "]";
	}
}
