package test.dao;

import test.model.AboutDto;

public interface AboutDtoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AboutDto record);

    int insertSelective(AboutDto record);

    AboutDto selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AboutDto record);

    int updateByPrimaryKey(AboutDto record);
}