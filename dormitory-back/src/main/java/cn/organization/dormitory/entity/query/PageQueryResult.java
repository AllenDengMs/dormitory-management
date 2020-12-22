package cn.organization.dormitory.entity.query;

import java.util.Collections;
import java.util.List;

/**
 * Created by Allen on 2020/12/20.
 */
public class PageQueryResult<T> {

  public int total;
  public int totalNotFiltered; // 当前返回了多少条数据
  public List<T> rows;

  public PageQueryResult(int total, List<T> rows) {
    if (rows == null) {
      rows = Collections.emptyList();
    }
    this.total = total;
    this.totalNotFiltered = rows.size();
    this.rows = rows;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public int getTotalNotFiltered() {
    return totalNotFiltered;
  }

  public void setTotalNotFiltered(int totalNotFiltered) {
    this.totalNotFiltered = totalNotFiltered;
  }

  public List<T> getRows() {
    return rows;
  }

  public void setRows(List<T> rows) {
    this.rows = rows;
  }
}
