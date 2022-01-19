package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    Logger logger = LoggerFactory.getLogger("GulimallProductApplicationTests");

    @Autowired
    BrandService service;

    @Test
    public void contextLoads(){
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
//        service.save(brandEntity);
//        logger.info("保存成功");
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("花花");
//        service.updateById(brandEntity);

        List<BrandEntity> brand = service.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brand.forEach(item ->{
            System.out.println(brand);
        });

    }

}
