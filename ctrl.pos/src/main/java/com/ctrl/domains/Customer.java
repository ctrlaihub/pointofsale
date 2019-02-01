package com.ctrl.domains;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq")
	@GenericGenerator(name = "book_seq", strategy = "com.ctrl.domains.StringPrefixedSequenceIdGenerator", parameters = {
			// @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value =
			// "50"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "CUST_"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	private String id;

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	 * "XyzIdGenerator")
	 * 
	 * @GenericGenerator(name = "XyzIdGenerator", strategy =
	 * "com.ctrl.domains.CustomerIdGenerator")
	 * 
	 * @Column(name = "id", unique = true, nullable = false) private String id;
	 */
	@Column(nullable = false)
	private String custName;

	@Column(nullable = false)
	private long custMobileNo;

	@Column(unique = true, nullable = false)
	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	private CustAddress address;

	@Column(nullable = false)
	private String custType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/*
	 * public long getId() { return id; }
	 * 
	 * public void setId(long id) { this.id = id; }
	 */
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getCustMobileNo() {
		return custMobileNo;
	}

	public void setCustMobileNo(long custMobileNo) {
		this.custMobileNo = custMobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CustAddress getAddress() {
		return address;
	}

	public void setAddress(CustAddress address) {
		this.address = address;
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}
}