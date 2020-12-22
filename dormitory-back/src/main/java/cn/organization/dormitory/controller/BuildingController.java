package cn.organization.dormitory.controller;

import cn.organization.dormitory.entity.Building;
import cn.organization.dormitory.entity.query.BuildingQueryBuilder;
import cn.organization.dormitory.entity.query.PageQueryResult;
import cn.organization.dormitory.entity.query.Result;
import cn.organization.dormitory.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Allen on 2020/12/22.
 */
@RequestMapping("/buildings")
@RestController
public class BuildingController {

  @Autowired
  private BuildingService buildingService;

  @GetMapping
  public PageQueryResult<Building> pageQueryBuildings(BuildingQueryBuilder queryBuilder) {
    return buildingService.pageQueryBuildings(queryBuilder);
  }

  @PostMapping("/add")
  public Result addBuilding(Building building) {
    return Result.of(buildingService.addBuilding(building));
  }

  @PostMapping("/update")
  public Result updateBuilding(Building building) {
    return Result.of(buildingService.updateBuilding(building));
  }

  @GetMapping("/delete/{id}")
  public Result delete(@PathVariable int id) {
    return Result.of(buildingService.deleteBuilding(id));
  }
  
}
