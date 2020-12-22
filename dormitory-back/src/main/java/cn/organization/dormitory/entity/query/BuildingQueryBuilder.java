package cn.organization.dormitory.entity.query;

/**
 * Created by Allen on 2020/12/22.
 */
public class BuildingQueryBuilder extends PageQueryBuilder {

  private String buildingName;
  private String memo;

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
