package com.structural.adapter;

public class NewDomainSubscriptionDocument {

  private String id;
  private String name;
  private Long revision;

  private String subscriptionId;

  public NewDomainSubscriptionDocument(String id, String name, Long revision,
      String subscriptionId) {
    this.id = id;
    this.name = name;
    this.revision = revision;
    this.subscriptionId = subscriptionId;
  }

  public String getId() {
    return id;
  }
  
  public String getName() {
    return name;
  }

  public Long getRevision() {
    return revision;
  }

  public String getSubscriptionId() {
    return subscriptionId;
  }

  @Override
  public String toString() {
    return "NewDomainSubscriptionDocument{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", revision=" + revision +
        ", subscriptionId='" + subscriptionId + '\'' +
        '}';
  }
}
