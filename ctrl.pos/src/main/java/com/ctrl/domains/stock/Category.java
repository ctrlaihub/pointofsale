package com.ctrl.domains.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.ctrl.domains.StringPrefixedSequenceIdGenerator;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cat_seq")
	@GenericGenerator(name = "cat_seq", strategy = "com.ctrl.domains.StringPrefixedSequenceIdGenerator", parameters = {
			// @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value =
			// "50"),
			/*@Parameter(name = "sequenceName", value = "categorySequence"),*/
			@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "CAT_"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	private String id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private boolean active;

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