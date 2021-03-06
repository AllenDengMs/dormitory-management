package cn.organization.dormitory.entity.query;

import com.alibaba.fastjson.JSON;
import java.util.Collections;
import java.util.Map;

/**
 * Created by Allen on 2020/12/20.
 */
public abstract class PageQueryBuilder {

  public Integer offset = 0;
  public Integer limit = 10;

  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }
}
