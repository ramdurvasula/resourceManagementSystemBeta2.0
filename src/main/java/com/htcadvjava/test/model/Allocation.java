package com.htcadvjava.test.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "allocation")
public class Allocation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Date toDate;
	private Integer amountPerday;
	
	@EmbeddedId
	private AllocationIdentity allocationIdentity;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allocationIdentity == null) ? 0 : allocationIdentity.hashCode());
		result = prime * result + ((amountPerday == null) ? 0 : amountPerday.hashCode());
		result = prime * result + ((toDate == null) ? 0 : toDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Allocation other = (Allocation) obj;
		if (allocationIdentity == null) {
			if (other.allocationIdentity != null)
				return false;
		} else if (!allocationIdentity.equals(other.allocationIdentity))
			return false;
		if (amountPerday == null) {
			if (other.amountPerday != null)
				return false;
		} else if (!amountPerday.equals(other.amountPerday))
			return false;
		if (toDate == null) {
			if (other.toDate != null)
				return false;
		} else if (!toDate.equals(other.toDate))
			return false;
		return true;
	}


	public Allocation(Date toDate, Integer amountPerday, AllocationIdentity allocationIdentity) {
		super();
		this.toDate = toDate;
		this.amountPerday = amountPerday;
		this.allocationIdentity = allocationIdentity;
	}

	@Override
	public String toString() {
		return "Allocation [toDate=" + toDate + ", amountPerday=" + amountPerday + ", allocationIdentity="
				+ allocationIdentity + "]";
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Integer getAmountPerday() {
		return amountPerday;
	}

	public void setAmountPerday(Integer amountPerday) {
		this.amountPerday = amountPerday;
	}

	public AllocationIdentity getAllocationIdentity() {
		return allocationIdentity;
	}

	public void setAllocationIdentity(AllocationIdentity allocationIdentity) {
		this.allocationIdentity = allocationIdentity;
	}

	
}
