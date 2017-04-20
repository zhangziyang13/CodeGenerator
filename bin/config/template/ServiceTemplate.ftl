package ${bussPackage}.${entityPackage}.service;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${bussPackage}.${entityPackage}.dao.${className}Dao;
import com.xjtlu.service.BaseService;

@Service("$!{lowerName}Service")
public class ${className}Service<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(${className}Service.class);
	

	

	@Autowired
    private ${className}Dao<T> dao;

		
	public ${className}Dao<T> getDao() {
		return dao;
	}

}
