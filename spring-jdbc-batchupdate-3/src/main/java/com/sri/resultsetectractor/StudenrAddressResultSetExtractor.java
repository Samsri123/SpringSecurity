package com.sri.resultsetectractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudenrAddressResultSetExtractor implements ResultSetExtractor<Map<String, List<String>>> {

	@Override
	public Map<String, List<String>> extractData(ResultSet rs) throws SQLException, DataAccessException {

		Map<String, List<String>> studentTable = new HashMap<>();
		while (rs.next()) {

			String name = rs.getString("name");
			String address = rs.getString("address");

			List<String> studentNameList = studentTable.get(address);

			if (studentNameList == null) {

				ArrayList<String> newStudentList = new ArrayList<>();
				newStudentList.add(name);

				studentTable.put(address, newStudentList);

			} else {

				studentNameList.add(name);
			}
		}
		return studentTable;
	}

}
