package cn.organization.dormitory.entity;

/**
 * Created by Allen on 2020/12/22.
 */
public class Room {

  private Integer roomId;
  private Integer buildingId = 0; // 外键
  private String roomName;
  private String memo; // 备注

  // 冗余字段，方便前端显示数据
  private String buildingName;

  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public Integer getBuildingId() {
    return buildingId;
  }

  public void setBuildingId(Integer buildingId) {
    this.buildingId = buildingId;
  }

  public Integer getRoomId() {
    return roomId;
  }

  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
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
