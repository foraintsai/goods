package com.goods.admin.admin.service;

import java.sql.SQLException;

import com.goods.admin.admin.dao.AdminDao;
import com.goods.admin.admin.entity.Admin;

public class AdminService {
	private AdminDao adminDao = new AdminDao();
	
	/**
	 * µÇÂ¼¹¦ÄÜ
	 * @param admin
	 * @return
	 */
	public Admin login(Admin admin) {
		try {
			return adminDao.find(admin.getAdminname(), admin.getAdminpwd());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
