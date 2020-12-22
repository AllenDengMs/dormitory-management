package cn.organization.dormitory.dao;

import cn.organization.dormitory.entity.Building;
import cn.organization.dormitory.entity.query.BuildingQueryBuilder;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Allen on 2020/12/20.
 */
@Mapper
public interface BuildingMapper {

  public int addBuilding(Building building);

  int deleteBuilding(@Param("buildingId") int buildingId);

  int updateBuilding(Building building);

  public int countBuildings(BuildingQueryBuilder queryBuilder);

  public List<Building> queryBuildings(BuildingQueryBuilder queryBuilder);
}
