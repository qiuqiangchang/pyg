package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.common.pojo.PageResult;
import com.pinyougou.pojo.Brand;
import com.pinyougou.service.BrandService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 *  品牌控制器
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference(timeout = 10000)
    private BrandService brandService;

    /** 分页查询*/
    @GetMapping("/findByPage")
    public PageResult findByPage(Brand brand ,Integer page,Integer rows){
        /** GET请求中文转码 */
        if (brand != null && StringUtils.isNoneBlank(brand.getName())) {
            try {
                brand.setName(new String(brand.getName()
                        .getBytes("ISO8859-1"), "UTF-8"));
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return brandService.findByPage(brand,page,rows);
    }

    /** 添加 */
    @PostMapping("/save")
    public boolean save(@RequestBody Brand brand){
        try {
            brandService.save(brand);
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    /** 修改 */
    @PostMapping("/update")
    public boolean update(@RequestBody Brand brand){
        try {
            brandService.update(brand);
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    /** 删除 */
    @GetMapping("/delete")
    public void delete(Long[] ids){
        try {
            brandService.deleteAll(ids);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /** 查询所有品牌 */
    @GetMapping("/findBrandList")
    public List<Map<String, Object>> findBrandList(){
        return brandService.findAllByIdAndName();
    }

}
