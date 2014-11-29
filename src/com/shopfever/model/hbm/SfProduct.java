package com.shopfever.model.hbm;

// Generated Sep 7, 2014 11:54:10 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * SfProduct generated by hbm2java
 */
@Entity
@Table(name = "sf_product", catalog = "shop_fever", uniqueConstraints = @UniqueConstraint(columnNames = "product_code"))
public class SfProduct implements java.io.Serializable {

	private Integer productId;
	private String productCode;
	private String name;
	private String category;
	private int stock;
	private Date addedDate;
	private Date createdDt;
	private Integer createdBy;
	private Date updatedDt;
	private Integer updatedBy;
	private Set<SfProductImages> sfProductImageses = new HashSet<SfProductImages>(
			0);
	private Set<SfOrderItem> sfOrderItems = new HashSet<SfOrderItem>(0);

	public SfProduct() {
	}

	public SfProduct(String name, String category, int stock) {
		this.name = name;
		this.category = category;
		this.stock = stock;
	}

	public SfProduct(String productCode, String name, String category,
			int stock, Date addedDate, Date createdDt, Integer createdBy,
			Date updatedDt, Integer updatedBy,
			Set<SfProductImages> sfProductImageses,
			Set<SfOrderItem> sfOrderItems) {
		this.productCode = productCode;
		this.name = name;
		this.category = category;
		this.stock = stock;
		this.addedDate = addedDate;
		this.createdDt = createdDt;
		this.createdBy = createdBy;
		this.updatedDt = updatedDt;
		this.updatedBy = updatedBy;
		this.sfProductImageses = sfProductImageses;
		this.sfOrderItems = sfOrderItems;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "product_id", unique = true, nullable = false)
	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Column(name = "product_code", unique = true, length = 45)
	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "category", nullable = false, length = 45)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "stock", nullable = false)
	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "added_date", length = 0)
	public Date getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created_dt", length = 0)
	public Date getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	@Column(name = "created_by")
	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "updated_dt", length = 0)
	public Date getUpdatedDt() {
		return this.updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

	@Column(name = "updated_by")
	public Integer getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sfProduct")
	public Set<SfProductImages> getSfProductImageses() {
		return this.sfProductImageses;
	}

	public void setSfProductImageses(Set<SfProductImages> sfProductImageses) {
		this.sfProductImageses = sfProductImageses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sfProduct")
	public Set<SfOrderItem> getSfOrderItems() {
		return this.sfOrderItems;
	}

	public void setSfOrderItems(Set<SfOrderItem> sfOrderItems) {
		this.sfOrderItems = sfOrderItems;
	}

}
