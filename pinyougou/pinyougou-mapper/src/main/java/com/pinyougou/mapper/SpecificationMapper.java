package com.pinyougou.mapper;

import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import com.pinyougou.pojo.Specification;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * SpecificationMapper 数据访问接口
 * @date 2019-03-29 16:08:26
 * @version 1.0
 */
public interface SpecificationMapper extends Mapper<Specification>{


    List<Specification> findAll(Specification specification);

    void deleteAll(Serializable[] ids);

    @Select("select id, spec_name as text from tb_specification order by id asc")
    List<Map<String,Object>> findSpecList();
}