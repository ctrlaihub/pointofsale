package com.ctrl.domains.stock;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.ctrl.domains.StringPrefixedSequenceIdGenerator2;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cat_seq")
	@GenericGenerator(name = "cat_seq", strategy = "com.ctrl.domains.StringPrefixedSequenceIdGenerator2", parameters = {
			@Parameter(name = StringPrefixedSequenceIdGenerator2.VALUE_PREFIX_PARAMETER, value = "CAT_"),
			@Parameter(name = StringPrefixedSequenceIdGenerator2.INCREMENT_PARAMETER, value = "5"),
			@Parameter(name = StringPrefixedSequenceIdGenerator2.INITIAL_VALUE, value = "CAT_1")
			})
	private String id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private boolean active;

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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", active=" + active + "]";
	}
}