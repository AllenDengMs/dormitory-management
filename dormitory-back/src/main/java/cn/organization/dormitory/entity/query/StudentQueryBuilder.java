package cn.organization.dormitory.entity.query;

/**
 * Created by Allen on 2020/12/20.
 */
public class StudentQueryBuilder extends PageQueryBuilder {
  public Integer id;
  public String name;
  public String sex;
  public String building;
  public String roomId;
  public String phone;

  public Integer getId() {
    Object object = this.filterObject.get("id");
    if (object != null) {
      return new Integer(object.toString());
    }
    return null;
  }

  public String getName() {
    Object object = this.filterObject.get("name");
    if (object != null) {
      return object.toString();
    }
    return null;
  }

  public String getSex() {
    Object object = this.filterObject.get("sex");
    if (object != null) {
      return object.toString();
    }
    return null;
  }

  public String getBuilding() {
    Object object = this.filterObject.get("building");
    if (object != null) {
      return object.toString();
    }
    return null;
  }

  public String getRoomId() {
    Object object = this.filterObject.get("roomId");
    if (object != null) {
      return object.toString();
    }
    return null;
  }

  public String getPhone() {
    Object object = this.filterObject.get("phone");
    if (object != null) {
      return object.toString();
    }
    return null;
  }
}
