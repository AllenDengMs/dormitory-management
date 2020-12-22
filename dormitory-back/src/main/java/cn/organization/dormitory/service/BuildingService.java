package cn.organization.dormitory.service;

import cn.organization.dormitory.entity.Building;
import cn.organization.dormitory.entity.query.PageQueryResult;
import cn.organization.dormitory.entity.query.BuildingQueryBuilder;

/**
 * Created by Allen on 2020/12/20.
 */
public interface BuildingService {

  PageQueryResult<Building> pageQueryBuildings(BuildingQueryBuilder queryBuilder);

  int addBuilding(Building building);

  int deleteBuilding(int buildingId);

  int updateBuilding(Building building);
}