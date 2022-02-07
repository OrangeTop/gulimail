package com.atguigu.gulimall.product;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
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

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    Logger logger = LoggerFactory.getLogger("GulimallProductApplicationTests");

    @Autowired
    BrandService service;

//    @Autowired
//    OSSClient ossClient;

    @Test
    public void testUpload() throws FileNotFoundException {
        
//        // 填写文件名。文件名包含路径，不包含Bucket名称。例如exampledir/exampleobject.txt。
//        String objectName = "C:\\Users\\75173\\Pictures\\Camera Roll\\bluesky.png";
//
//        // 创建OSSClient实例。
//        String endpoint = "oss-cn-beijing.aliyuncs.com";
//        String accessId = "LTAI5t8jYT3Frk9npajTcDoQ";
//
//        String secretId = "y5ghrIX7FMhXWRktExhl8OKjAAVogP";
//
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessId, secretId);
//
//        String content = "Hello OSS";
//        String bucket = "gulimall-ora";
////        ossClient.putObject(bucket, objectName, new ByteArrayInputStream(content.getBytes()));
////
////        // 关闭OSSClient。
////        ossClient.shutdown();
//        InputStream inputStream = new FileInputStream(objectName);
//        ossClient.putObject(bucket,"aa.jpg",inputStream);
//        ossClient.shutdown();
    }

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
