package cn.organization.dormitory.service.impl;

import cn.organization.dormitory.dao.BuildingMapper;
import cn.organization.dormitory.entity.Building;
import cn.organization.dormitory.entity.query.BuildingQueryBuilder;
import cn.organization.dormitory.entity.query.PageQueryResult;
import cn.organization.dormitory.service.BuildingService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Allen on 2020/12/22.
 */
@Service
public class BuildingServiceImpl implements BuildingService {

  @Autowired
  private BuildingMapper buildingMapper;

  @Override
  public PageQueryResult<Building> pageQueryBuildings(BuildingQueryBuilder queryBuilder) {
    int total = buildingMapper.countBuildings(queryBuilder);
    List<Building> buildings = buildingMapper.queryBuildings(queryBuilder);
    return new PageQueryResult<>(total, buildings);
  }

  @Override
  public int addBuilding(Building building) {
    return buildingMapper.addBuilding(building);
  }

  @Override
  public int deleteBuilding(int buildingId) {
    return buildingMapper.deleteBuilding(buildingId);
  }

  @Override
  public int updateBuilding(Building building) {
    return buildingMapper.updateBuilding(building);
  }
}
