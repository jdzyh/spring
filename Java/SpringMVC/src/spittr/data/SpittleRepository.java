package spittr.data;

import java.util.List;

import spittr.bean.Spittle;

public interface SpittleRepository {
	/**
	 * 
	 * @param max ID属性的最大值
	 * @param count 返回的对象数量
	 * @return
	 */
	List<Spittle> findSpittles(long max, int count);
}
