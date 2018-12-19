package io.zeebe.hazelcast.protocol;

public abstract class BaseRecord {

  private long key;
  private long timestamp;
  private String intent;

  public long getKey() {
    return key;
  }

  public void setKey(long key) {
    this.key = key;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

public String getIntent(){return intent;}

public void setIntent(String intent){this.intent = intent;}
}
