/**
 * 
 */
package com.asl.entity;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author zubayer
 *
 */
@Data
@Entity
@Table(name = "product")
public class Product {

	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pid")
	private Long pid;

	@Column(name = "name")
	private String name;

	@Column(name = "rate")
	private BigDecimal rate;

	@Column(name = "unit")
	private String unit;
}
