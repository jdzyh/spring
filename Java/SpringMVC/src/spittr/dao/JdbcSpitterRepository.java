package spittr.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.JdbcOperations;

import spittr.bean.Spitter;
import spittr.data.SpitterRepository;

public class JdbcSpitterRepository implements SpitterRepository {
	private static final String SQL_SELECT = "select * from sec_user";
	private static final String INSERT_SELECT = "insert into sec_user(username, password) values(:username, :password)";
	
	private JdbcOperations jdbcOperations;
	
	public JdbcSpitterRepository(JdbcOperations jdbcOperations){
		this.jdbcOperations = jdbcOperations;
	}
	
	public void addObject(String username, String password){
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("username", username);
		paramMap.put("password", password);
		jdbcOperations.update(INSERT_SELECT, paramMap);
	}
	
	public String selectFieldFromDatasource(){
		String retVal="";
		
		String table_name="";
		String id="";
		
//Only For Jre1.8
//		jdbcOperations.queryForObject(SQL_SELECT, this::mapObject, table_name, id);
//		
		return retVal;
	}
//Only For Jre1.8
//	private String mapObject(ResultSet rs, int row) throws SQLException{
//		return rs.getString("id");
//	}
	
	
	
	@Override
	public Spitter save(Spitter unsaved) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Spitter findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
