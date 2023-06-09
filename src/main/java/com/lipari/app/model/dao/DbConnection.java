package com.lipari.app.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lipari.app.utils.DatabaseConfigBean;

@Component
public class DbConnection {

	
	private final DatabaseConfigBean configBean;

	@Autowired	
	public DbConnection(DatabaseConfigBean configBean) {

		this.configBean = configBean;
	}

	public Connection openConnection() throws SQLException {
		return DriverManager.getConnection(configBean.getDatabaseUrl(), configBean.getDatabaseUsername(),
				configBean.getDatabasePassword());

	}

}
