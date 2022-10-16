package com.dao;
import com.dao.LinkMysl;
import com.entity.Student;
import com.util.JDBCutil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ImplStudent implements LinkMysl {
	@Override
	public Student findByUsername(String username) {
		Connection connection = JDBCutil.getConnection();
		// select * from readerinfo where 读者号 = '10800';
		String sql = "select * from readerinfo where 姓名 ='" +username+"'";
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
			if(resultSet.next()){
				String reader_id = resultSet.getString(1);
         username = resultSet.getString(2);
				String password = resultSet.getString(3);
				String reader_telephone = resultSet.getString(4);
				String reader_type = resultSet.getString(5);
			return new Student(reader_id,username,password,reader_telephone,reader_type);
			}
		} catch (SQLException e) {
	e.printStackTrace();
		} finally {
			JDBCutil.release(connection, statement, resultSet);
		}
		return null;
	}

}
