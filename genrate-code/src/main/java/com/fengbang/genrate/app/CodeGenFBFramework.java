package com.fengbang.genrate.app;

import com.fengbang.genrate.code.rapid_framework.generator.GeneratorFacade;
import com.fengbang.genrate.code.rapid_framework.generator.GeneratorProperties;

import java.io.File;

public class CodeGenFBFramework {

    public static void main(String[] args) {
    	
    	String PROJ_NAME = "fb-framework";
        String PROJ_DIR = "D:\\fb-workspace1\\fb-app-generator";

        GeneratorProperties.PROPERTIES_FILE_NAMES = new String[]{"generator-" + PROJ_NAME + ".properties", "generator-" + PROJ_NAME + ".xml"};
        GeneratorProperties.reload();
//        String PROJ_NAME = "fb-app-generator";
//        String PROJ_DIR = "D:\\fb-workspace1\\fb-app-generator";
//
//        GeneratorProperties.PROPERTIES_FILE_NAMES = new String[]{"generator-" + PROJ_NAME + ".properties", "generator-" + PROJ_NAME + ".xml"};
//        GeneratorProperties.reload();

        GeneratorFacade g = new GeneratorFacade();
        g.initOutRoot(PROJ_DIR + File.separator + "target/" + PROJ_NAME);
        g.initTemplateRoot(PROJ_DIR + File.separator + "template/" + PROJ_NAME);

        try {
        	g.generateByTable("COMM_RESPONSE_CODE_MAP");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
