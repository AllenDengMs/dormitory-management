package cn.organization.dormitory.service.impl;

import cn.organization.dormitory.dao.RoomMapper;
import cn.organization.dormitory.entity.Room;
import cn.organization.dormitory.entity.query.PageQueryResult;
import cn.organization.dormitory.entity.query.RoomQueryBuilder;
import cn.organization.dormitory.service.RoomService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Allen on 2020/12/22.
 */
@Service
public class RoomServiceImpl implements RoomService {

  @Autowired
  private RoomMapper roomMapper;

  @Override
  public PageQueryResult<Room> pageQueryRooms(RoomQueryBuilder queryBuilder) {
    int total = roomMapper.countRooms(queryBuilder);
    List<Room> rooms = roomMapper.queryRooms(queryBuilder);
    return new PageQueryResult<>(total, rooms);
  }

  @Override
  public int addRoom(Room room) {
    return roomMapper.addRoom(room);
  }

  @Override
  public int deleteRoom(int roomId) {
    return roomMapper.deleteRoom(roomId);
  }

  @Override
  public int updateRoom(Room room) {
    return roomMapper.updateRoom(room);
  }
}
