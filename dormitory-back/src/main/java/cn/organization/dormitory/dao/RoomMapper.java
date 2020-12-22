package cn.organization.dormitory.dao;

import cn.organization.dormitory.entity.Room;
import cn.organization.dormitory.entity.query.RoomQueryBuilder;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Allen on 2020/12/20.
 */
@Mapper
public interface RoomMapper {

  public int addRoom(Room room);

  int deleteRoom(@Param("roomId") int roomId);

  int updateRoom(Room room);

  public int countRooms(RoomQueryBuilder queryBuilder);

  public List<Room> queryRooms(RoomQueryBuilder queryBuilder);
}
