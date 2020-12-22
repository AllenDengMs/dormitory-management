package cn.organization.dormitory.entity.query;

/**
 * Created by Allen on 2020/12/22.
 */
public class RoomQueryBuilder extends PageQueryBuilder {

  private String roomName;
  private String memo;
  private Integer buildingId;

  public Integer getBuildingId() {
    return buildingId;
  }

  public void setBuildingId(Integer buildingId) {
    this.buildingId = buildingId;
  }

  public String getRoomName() {
    return roomName;
  }

  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }
}
