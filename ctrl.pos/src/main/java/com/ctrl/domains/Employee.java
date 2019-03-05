package com.ctrl.domains;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Employee {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Column(updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	@GenericGenerator(name = "emp_seq", strategy = "com.ctrl.domains.StringPrefixedSequenceIdGenerator2", parameters = {
			@Parameter(name = StringPrefixedSequenceIdGenerator2.VALUE_PREFIX_PARAMETER, value = "EMP_"),
			@Parameter(name = StringPrefixedSequenceIdGenerator2.INCREMENT_PARAMETER, value = "2"),
			@Parameter(name = StringPrefixedSequenceIdGenerator2.INITIAL_VALUE, value = "EMP_1")
			})
	private String id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private boolean active;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@ElementCollection(targetClass = Authority.class, fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
//    @Column(name = "authority")
	private Set<Authority> authority;
		
	@Column(name="created_at", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date createdAt;

	@PrePersist
	protected void onCreate() {
	    createdAt = new Date();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Set<Authority> getAuthority() {
		return authority;
	}
	public void setAuthority(Set<Authority> authority) {
		this.authority = authority;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", active="
				+ active + ", address=" + address + ", authority=" + authority + "]";
	}
}