package com.AppInmobiliaria.entities;

import java.util.Date;

import com.AppInmobiliaria.enums.Months;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RentPayments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date paidDate;
	private Double amount;
	private short feeNumber;
	private boolean isPaid;
	private short year;
	@Enumerated(EnumType.ORDINAL)
	private Months month;
	
	public RentPayments() {}
	
	public RentPayments(Long id, Date paidDate, Double amount, short feeNumber, boolean isPaid, short year, Months month) {
		this.id = id;
		this.paidDate = paidDate;
		this.amount = amount;
		this.feeNumber = feeNumber;
		this.isPaid = isPaid;
		this.year = year;
		this.month = month;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public boolean isPaid() {
		return isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public Months getMonth() {
		return month;
	}
	public void setMonth(Months month) {
		this.month = month;
	}
	public Long getId() {
		return id;
	}

	public short getFeeNumber() {
		return feeNumber;
	}

	public void setFeeNumber(short feeNumber) {
		this.feeNumber = feeNumber;
	}
}
