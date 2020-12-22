package cn.organization.dormitory.entity.query;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Allen on 2020/12/20.
 */
public class Result {

  public int status;
  public String message;

  public static Result of(int status) {
    Result result = new Result();
    result.setStatus(status);
    if (status > 1) {
      result.setMessage("success");
    } else {
      result.setMessage("fail");
    }
    return result;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
