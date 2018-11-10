package com.cg.mobilebilling.beans;
import java.util.Map;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="customerID")
	@SequenceGenerator(name="customerID", sequenceName="sequence3", initialValue=1, allocationSize=0)
	private int customerID;
	
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	@NotEmpty
	private String emailID;
	@NotEmpty
	private String dateOfBirth;
	
	@Embedded
	private Address billingAddress;
	
	@OneToMany(mappedBy="customer")
	private Map<Long, PostpaidAccount> postpaidAccounts;

	public Customer() {}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Map<Long, PostpaidAccount> getPostpaidAccounts() {
		return postpaidAccounts;
	}

	public void setPostpaidAccounts(Map<Long, PostpaidAccount> postpaidAccounts) {
		this.postpaidAccounts = postpaidAccounts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((billingAddress == null) ? 0 : billingAddress.hashCode());
		result = prime * result + customerID;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((emailID == null) ? 0 : emailID.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((postpaidAccounts == null) ? 0 : postpaidAccounts.hashCode());
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
		Customer other = (Customer) obj;
		if (billingAddress == null) {
			if (other.billingAddress != null)
				return false;
		} else if (!billingAddress.equals(other.billingAddress))
			return false;
		if (customerID != other.customerID)
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (emailID == null) {
			if (other.emailID != null)
				return false;
		} else if (!emailID.equals(other.emailID))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (postpaidAccounts == null) {
			if (other.postpaidAccounts != null)
				return false;
		} else if (!postpaidAccounts.equals(other.postpaidAccounts))
			return false;
		return true;
	}
}