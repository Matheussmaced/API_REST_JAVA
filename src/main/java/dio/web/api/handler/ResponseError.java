package dio.web.api.handler;

import java.util.Date;

public class ResponseError {
  private Date timestamp = new Date();
  private String status = "error";
  private int statusCode = 400;
  private String error;

  public Date getTimestamp() {
    return timestamp;
  }

  public String getStatus() {
    return status;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public String getError() {
    return error;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }

  public void setError(String error) {
    this.error = error;
  }

}
