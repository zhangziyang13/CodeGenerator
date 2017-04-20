package com.code;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import codeGenerate.def.CodeResourceUtil;
import codeGenerate.def.FtlDef;
import codeGenerate.factory.CodeGenerateFactory;
import codeGenerate.util.CreateBean;

public class CodeUtil {
	private static String url = CodeResourceUtil.URL;
	private static String username = CodeResourceUtil.USERNAME;
	private static String passWord = CodeResourceUtil.PASSWORD;
	
	public static void main(String[] args) {
		CreateBean createBean = new CreateBean();
		createBean.setMysqlInfo(url, username, passWord);
	
		try {
			List<String> tableNames = (ArrayList<String>) createBean.getTables();
			for (String tableName : tableNames) {// tableName表名
				String entityPackage = "lawservice";// 实体包
				String keyType = FtlDef.KEY_TYPE_02;// 主键生成方式 01:UUID 02:自增
				CodeGenerateFactory.codeGenerate(tableName, "", entityPackage, keyType, null, true);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
