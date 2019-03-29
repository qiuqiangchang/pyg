package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.common.pojo.PageResult;
import com.pinyougou.pojo.Brand;
import com.pinyougou.service.BrandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public PageResult findByPage(Integer page,Integer rows){
        return brandService.findByPage(null,page,rows);
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
}
