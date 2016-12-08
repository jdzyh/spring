package spittr.data;

import spittr.bean.Spitter;

public interface SpitterRepository {
	/**
	 * 
	 * @param unsaved
	 * @return saved
	 */
	public Spitter save(Spitter unsaved);
	
	public Spitter findByUserName(String username);
}
