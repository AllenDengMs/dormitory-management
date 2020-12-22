package cn.organization.dormitory.entity;

/**
 * 学生缺勤记录
 * Created by Allen on 2020/12/22.
 */
public class StudentAbsence {

  private Integer studentAbsenceId;
  private Integer studentId;
  private Integer buildingId;
  private Integer roomId;
  private Long time; // 缺勤时间，时间戳
  private String memo;

  // 冗余字段，方便前端显示数据
  private String timeFormat; // 将缺勤时间格式化

  public String getTimeFormat() {
    return timeFormat;
  }

  public void setTimeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
  }

  public Integer getStudentAbsenceId() {
    return studentAbsenceId;
  }

  public void setStudentAbsenceId(Integer studentAbsenceId) {
    this.studentAbsenceId = studentAbsenceId;
  }

  public Integer getStudentId() {
    return studentId;
  }

  public void setStudentId(Integer studentId) {
    this.studentId = studentId;
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

  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }
}