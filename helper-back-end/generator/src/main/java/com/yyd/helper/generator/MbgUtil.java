package com.yyd.helper.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.ITypeConvert;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.IColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class MbgUtil {

    private final static String url = "jdbc:mysql://localhost:3306/helper?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";

    private final static String username = "root";

    private final static String password = "wodeweilai2024YYD*";

    private final static String creator = "yyd";

    private final static String projectPath = "D://code//project//helper//helper-back-end//";

    private final static String packagePath = "com.yyd.helper";

    public static boolean mbg(String moduleName, String... tables){
        try {
            FastAutoGenerator.create(new DataSourceConfig.Builder(url,username,password))
                    //bug：3.5.3版本所有tinyint都被转成Byte, fileOverride()失效
                    .globalConfig(builder -> {
                        builder.author(creator) // 设置作者
                                .fileOverride() // 覆盖已生成文件
                                .enableSwagger() // 开启 swagger 模式
                                .outputDir(projectPath + moduleName + "//src//main//java"); // 指定输出目录
                    })
                    .packageConfig(builder -> {
                        builder.parent(packagePath) // 设置父包名
                                .moduleName(moduleName) // 设置父包模块名
                                .pathInfo(Collections.singletonMap(OutputFile.mapperXml, projectPath + moduleName + "//src//main//resources//mapper")); // 设置mapperXml生成路径
                    })
                    .strategyConfig(builder -> {
                        builder.addInclude(tables) // 设置需要生成的表名
                            .addTablePrefix("helper_") // 设置过滤表前缀
                            .mapperBuilder().
                                enableMapperAnnotation()
                            .entityBuilder()
                                .enableLombok()
                                .enableChainModel();

                    })
                    .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                    .execute();
        }catch (Exception e){
            System.out.println("代码生成失败");
            return false;
        }
        return true;
    }
}

