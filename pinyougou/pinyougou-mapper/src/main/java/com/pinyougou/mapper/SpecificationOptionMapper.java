package com.pinyougou.mapper;

import com.pinyougou.pojo.Specification;
import tk.mybatis.mapper.common.Mapper;

import com.pinyougou.pojo.SpecificationOption;

import java.io.Serializable;

/**
 * SpecificationOptionMapper 数据访问接口
 * @date 2019-03-29 16:08:26
 * @version 1.0
 */
public interface SpecificationOptionMapper extends Mapper<SpecificationOption>{


    void save(Specification specification);

    void deleteAll(Serializable[] ids);
}