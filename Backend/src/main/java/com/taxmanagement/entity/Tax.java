package com.taxmanagement.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Tax {

	private Long taxFormId;

	private String formType;

	private Date filingDate;

	private BigDecimal totalTaxAmount;

	private int userId;

	public Tax() {
		super();
	}

	public Tax(Long taxFormId, String formType, Date filingDate, BigDecimal totalTaxAmount, int userId) {
		super();
		this.taxFormId = taxFormId;
		this.formType = formType;
		this.filingDate = filingDate;
		this.totalTaxAmount = totalTaxAmount;
		this.userId = userId;
	}

	public Long getTaxFormId() {
		return taxFormId;
	}

	public void setTaxFormId(Long taxFormId) {
		this.taxFormId = taxFormId;
	}

	public String getFormType() {
		return formType;
	}

	public void setFormType(String formType) {
		this.formType = formType;
	}

	public Date getFilingDate() {
		return filingDate;
	}

	public void setFilingDate(Date filingDate) {
		this.filingDate = filingDate;
	}

	public BigDecimal getTotalTaxAmount() {
		return totalTaxAmount;
	}

	public void setTotalTaxAmount(BigDecimal totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Tax [taxFormId=" + taxFormId + ", formType=" + formType + ", filingDate=" + filingDate
				+ ", totalTaxAmount=" + totalTaxAmount + ", userId=" + userId + "]";
	}
}
