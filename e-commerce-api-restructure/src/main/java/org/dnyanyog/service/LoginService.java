package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.common.DBUtils;
import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;

public class LoginService {
	public String login(LoginRequest loginBody) throws SQLException {
		String loginQuery = "select * from user where first_name='" + loginBody.user + "' and password='"
				+ loginBody.password + "'";
		ResultSet resultset = DBUtils.executeSelectQuery(loginQuery);
		if (resultset.next()) {
			return "Login Success";

		}
		return "Login Failed";

	}
}