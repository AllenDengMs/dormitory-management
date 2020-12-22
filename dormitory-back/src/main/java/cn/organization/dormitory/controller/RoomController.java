package cn.organization.dormitory.controller;

import cn.organization.dormitory.entity.Room;
import cn.organization.dormitory.entity.query.PageQueryResult;
import cn.organization.dormitory.entity.query.Result;
import cn.organization.dormitory.entity.query.RoomQueryBuilder;
import cn.organization.dormitory.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Allen on 2020/12/22.
 */
@RequestMapping("/rooms")
@RestController
public class RoomController {

  @Autowired
  private RoomService roomService;

  @GetMapping
  public PageQueryResult<Room> pageQueryRooms(RoomQueryBuilder queryBuilder) {
    return roomService.pageQueryRooms(queryBuilder);
  }

  @PostMapping("/add")
  public Result addRoom(Room room) {
    return Result.of(roomService.addRoom(room));
  }

  @PostMapping("/update")
  public Result updateRoom(Room room) {
    return Result.of(roomService.updateRoom(room));
  }

  @GetMapping("/delete/{id}")
  public Result delete(@PathVariable int id) {
    return Result.of(roomService.deleteRoom(id));
  }


}