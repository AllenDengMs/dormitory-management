package cn.organization.dormitory.service;


import cn.organization.dormitory.entity.Room;
import cn.organization.dormitory.entity.query.PageQueryResult;
import cn.organization.dormitory.entity.query.RoomQueryBuilder;

/**
 * Created by Allen on 2020/12/20.
 */
public interface RoomService {

  PageQueryResult<Room> pageQueryRooms(RoomQueryBuilder queryBuilder);

  int addRoom(Room room);

  int deleteRoom(int id);

  int updateRoom(Room room);
}
