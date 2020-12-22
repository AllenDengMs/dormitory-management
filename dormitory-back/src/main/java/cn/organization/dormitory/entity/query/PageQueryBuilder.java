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
  public String filter;
  public Map<String, Object> filterObject = Collections.EMPTY_MAP;

  public Map<String, Object> getFilterObject() {
    return filterObject;
  }

  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
    if (filter != null) {
      filterObject = JSON.parseObject(filter, Map.class);
    }
  }

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
