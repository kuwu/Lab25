package com.test.models;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "items", schema = "CoffeeShopDatabase", catalog = "")
public class ItemsEntity {
  private int itemId;
  private String name;
  private String descript;
  private String quanity;
  private BigInteger price;

  @Id
  @Column(name = "ItemID", nullable = false)
  public int getItemId() {
    return itemId;
  }

  public void setItemId(int itemId) {
    this.itemId = itemId;
  }

  @Basic
  @Column(name = "Name", nullable = false, length = 45)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Basic
  @Column(name = "Descript", nullable = false, length = 45)
  public String getDescript() {
    return descript;
  }

  public void setDescript(String descript) {
    this.descript = descript;
  }

  @Basic
  @Column(name = "Quanity", nullable = false, length = 45)
  public String getQuanity() {
    return quanity;
  }

  public void setQuanity(String quanity) {
    this.quanity = quanity;
  }

  @Basic
  @Column(name = "Price", nullable = false, precision = 0)
  public BigInteger getPrice() {
    return price;
  }

  public void setPrice(BigInteger price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ItemsEntity that = (ItemsEntity) o;

    if (itemId != that.itemId) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (descript != null ? !descript.equals(that.descript) : that.descript != null) return false;
    if (quanity != null ? !quanity.equals(that.quanity) : that.quanity != null) return false;
    if (price != null ? !price.equals(that.price) : that.price != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = itemId;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (descript != null ? descript.hashCode() : 0);
    result = 31 * result + (quanity != null ? quanity.hashCode() : 0);
    result = 31 * result + (price != null ? price.hashCode() : 0);
    return result;
  }
}
