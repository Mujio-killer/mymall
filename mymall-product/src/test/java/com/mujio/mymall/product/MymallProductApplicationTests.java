package com.mujio.mymall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mujio.mymall.product.entity.BrandEntity;
import com.mujio.mymall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MymallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void testSave() {
        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setDescript("");
        brandService.save(brandEntity);

        System.out.println("保存测试");
    }

    @Test
    void testUpdate() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为");
        brandService.updateById(brandEntity);

        System.out.println("修改测试");
    }
    @Test
    void testQuery() {
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        list.forEach((el)->{
            System.out.println(el);
        });
        System.out.println("修改测试");
    }

}
