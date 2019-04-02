package com.pinyougou.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import com.pinyougou.pojo.ItemCat;

import java.io.Serializable;
import java.util.List;

/**
 * ItemCatMapper 数据访问接口
 * @date 2019-03-29 16:08:26
 * @version 1.0
 */
public interface ItemCatMapper extends Mapper<ItemCat>{


    /** 根据父级 id 查询商品分类*/
    @Select("select * from tb_item_cat where parent_id = #{parentId}")
    List<ItemCat> findItemCatByParentId(Long parentId);

    /** 批量删除*/
    void deleteAll(@Param("ids") Serializable[] ids);
}