package spittr.dao;

import org.springframework.jdbc.core.JdbcOperations;

import spittr.bean.Spitter;
import spittr.data.SpitterRepository;

public class JdbcSpitterRepository implements SpitterRepository {
	private static final String SQL_SELECT = "select * from ? where id=?";
	private static final String SQL_SELECT_2 = "";
	
	private JdbcOperations jdbcOperations;
	
	public JdbcSpitterRepository(JdbcOperations jdbcOperations){
		jdbcOperations = this.jdbcOperations;
	}
	
	public String selectFieldFromDatasource(){
		String retVal="";
		
		String table_name="";
		String id="";
		
//		//Only For Jre1.8
//		//jdbcOperations.queryForObject(SQL_SELECT, this::mapObject, table_name, id);
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
