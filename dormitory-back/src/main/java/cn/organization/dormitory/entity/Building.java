package cn.organization.dormitory.entity;

/**
 * Created by Allen on 2020/12/22.
 */
public class Building {

  private Integer buildingId;
  private String buildingName;
  private String memo; // 简介

  public Integer getBuildingId() {
    return buildingId;
  }

  public void setBuildingId(Integer buildingId) {
    this.buildingId = buildingId;
  }

  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }
}
