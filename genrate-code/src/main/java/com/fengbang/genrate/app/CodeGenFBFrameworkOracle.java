/*
 * Copyright (c) 2017. Feng Bang Leasing(Shang Hai)Co.,Ltd.
 * Project : fb_framework
 * FileName : CodeGenFBFrameworkOracle.java
 * Date : 17-8-15 涓嬪崍1:22
 * Author : luxin
 */

package com.fengbang.genrate.app;

import com.fengbang.genrate.code.rapid_framework.generator.GeneratorFacade;
import com.fengbang.genrate.code.rapid_framework.generator.GeneratorProperties;
import com.fengbang.genrate.code.rapid_framework.generator.util.ClassHelper;
import com.fengbang.genrate.code.rapid_framework.generator.util.FileHelper;
import com.fengbang.genrate.code.rapid_framework.generator.util.IOHelper;
import com.fengbang.genrate.code.util.TFMakeName;
import tk.mybatis.mapper.entity.Example;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Enumeration;

public class CodeGenFBFrameworkOracle {

    public static void main(String[] args) throws Exception {
//        File directory = new File("");// 参数为空
//        //获得项目根路径
//        String courseFile = directory.getCanonicalPath();
//        //当前类
//        File f2 = new File(CodeGenFBFrameworkOracle.class.getResource("").getPath());
//        String path = f2.getPath();
//        String[] bins = path.split("bin");
//        String PROJ_NAME = "fb-framework";
//        String PROJ_DIR = "C:\\Users\\qianh\\Desktop\\fb-microservice-biz";
//
//        GeneratorProperties.PROPERTIES_FILE_NAMES = new String[]{"generator-" + PROJ_NAME + ".properties", "generator-" + PROJ_NAME + ".xml"};
//        GeneratorProperties.reload();
//
//        GeneratorFacade g = new GeneratorFacade();
//        g.initOutRoot(PROJ_DIR + File.separator);
//        g.initTemplateRoot(bins[0] + File.separator + "template2/");
//        try {
//            g.generateByTable("zazh01");
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

//        Enumeration<URL> urls = FileHelper.class.getClassLoader()
//                .getResources("/");
//        CodeGenFBFrameworkOracle codeGenFBFrameworkOracle=new CodeGenFBFrameworkOracle();
//        URL urls = FileHelper.class.getClassLoader().getResource("ArrayHelper.class");
//        Enumeration<URL> urls = CodeGenFBFrameworkOracle.class.getClassLoader()
//                .getResources("");
//        boolean notFound = true;
//        while (urls.hasMoreElements()) {
//            notFound = false;
//            URL url = urls.nextElement();
//            InputStream input = url.openStream();
//            input.close();
//        }
//        Enumeration urls = ClassHelper.getDefaultClassLoader().getResources("generator-fb-framework.xml");
//        while (urls.hasMoreElements()) {
//            System.out.println("12");
//        }

//        run("D:\\xiangmu\\FBZL\\fb-dashboard", "zazh01");


    }

    public static void run(String PROJ_DIR, String tableNames, String type, String db) throws Exception {
        File file = new File(PROJ_DIR);
        if (!file.exists()) {
            throw new Exception("文件不存在，请输入正确的项目路径！");
        }
        File directory = new File("");// 参数为空
        //获得项目根路径
        String courseFile = directory.getCanonicalPath();
        //当前类
        File f2 = new File(CodeGenFBFrameworkOracle.class.getResource("").getPath());
        String path = f2.getPath();
        String[] bins = path.split("bin");
        String PROJ_NAME = "fb-framework";
        //读取xml文件
        //根据所选的配置文件读取对应的配置文件
        if ("mysql".equals(db)) {
            GeneratorProperties.PROPERTIES_FILE_NAMES = new String[]{"generator-" + PROJ_NAME + ".properties", "generator-" + PROJ_NAME + "-mysql.xml"};
        } else if ("oracle".equals(db)) {
            GeneratorProperties.PROPERTIES_FILE_NAMES = new String[]{"generator-" + PROJ_NAME + ".properties", "generator-" + PROJ_NAME + "-oracle.xml"};
        }
        GeneratorProperties.reload();
        GeneratorFacade g = new GeneratorFacade();
        g.initOutRoot(PROJ_DIR + File.separator);
        File file1 = new File("/");
        file1.getPath();
        String path1 = Example.class.getResource("/").getPath();
        // TODO: 2018/2/13 有问题
        //根据所选的读取对应的模板
        if ("融资租赁主系统".equals(type)) {
            g.initTemplateRoot(path1 + "template-biz/");
        } else if ("数据管理平台".equals(type)) {
            g.initTemplateRoot(path1 + "template-dashboard/");
        }
        try {
            String[] tables = tableNames.split(",");
            for (int i = 0; i < tables.length; i++) {
                g.generateByTable(db,tables[i]);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
