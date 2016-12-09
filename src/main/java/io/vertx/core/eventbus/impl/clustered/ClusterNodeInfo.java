package io.vertx.core.eventbus.impl.clustered;

import java.io.Serializable;

public class ClusterNodeInfo implements Serializable {
  public String nodeId;
  public String host;
  public int port;

  public ClusterNodeInfo() {
  }

  public ClusterNodeInfo(String nodeId, String host, int port) {
    this.nodeId = nodeId;
    this.host = host;
    this.port = port;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ClusterNodeInfo that = (ClusterNodeInfo) o;

    if (port != that.port) return false;
    if (nodeId != null ? !nodeId.equals(that.nodeId) : that.nodeId != null) return false;
    return host != null ? host.equals(that.host) : that.host == null;
  }

  @Override
  public int hashCode() {
    int result = nodeId != null ? nodeId.hashCode() : 0;
    result = 31 * result + (host != null ? host.hashCode() : 0);
    result = 31 * result + port;
    return result;
  }

  @Override
  public String toString() {
    return nodeId + ":" + host + ":" + port;
  }
}
