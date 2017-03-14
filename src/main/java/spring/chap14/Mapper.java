package spring.chap14;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Mapper implements RowMapper<Dto>{

	@Override
	public Dto mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Dto dto = new Dto();
		dto.setMemberId(rs.getString("memberId"));
		dto.setPassword(rs.getString("password"));
		dto.setName(rs.getString("name"));
		dto.setEmail(rs.getString("email"));
		
		return dto;
	}

	
	
	
	
}
