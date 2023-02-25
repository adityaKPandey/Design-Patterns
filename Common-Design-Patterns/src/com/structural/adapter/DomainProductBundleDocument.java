package com.structural.adapter;

public class DomainProductBundleDocument implements Document{

  private String id;
  private String name;
  private Long revision;

  private String productBundle;

  public DomainProductBundleDocument(String id, String name, Long revision,
      String productBundle) {
    this.id = id;
    this.name = name;
    this.revision = revision;
    this.productBundle = productBundle;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Long getRevision() {
    return revision;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRevision(Long revision) {
    this.revision = revision;
  }

  public String getProductBundle() {
    return productBundle;
  }

  public void setProductBundle(String productBundle) {
    this.productBundle = productBundle;
  }

  @Override
  public String toString() {
    return "DomainProductBundleDocument{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", revision=" + revision +
        ", productBundle='" + productBundle + '\'' +
        '}';
  }
}
