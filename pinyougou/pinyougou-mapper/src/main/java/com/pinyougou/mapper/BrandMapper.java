package com.pinyougou.mapper;

import tk.mybatis.mapper.common.Mapper;

import com.pinyougou.pojo.Brand;

import java.io.Serializable;
import java.util.List;

/**
 * BrandMapper 数据访问接口
 * @date 2019-03-29 16:08:26
 * @version 1.0
 */
public interface BrandMapper extends Mapper<Brand>{


    List<Brand> findAll(Brand brand);

    void deleteAll(Serializable[] ids);
}