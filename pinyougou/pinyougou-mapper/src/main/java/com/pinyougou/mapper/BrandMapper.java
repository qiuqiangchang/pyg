package com.pinyougou.mapper;

import com.pinyougou.pojo.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 品牌 数据访问接口
 */
public interface BrandMapper {
    /** 查询全部品牌 */
    @Select("select * from tb_brand")
    List<Brand> findAll();
}
