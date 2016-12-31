package spittr.data;

import java.util.ArrayList;
import java.util.List;

import spittr.bean.Spittle;

public class SpittleRepositoryImp implements SpittleRepository {
	private List<Spittle> spittles;
	
	public SpittleRepositoryImp(List<Spittle> spittles){
		this.spittles = spittles;
	}
	
	@Override
	public List<Spittle> findSpittles(long max, int count) {
		if(spittles.size() < count) return spittles;
		
		List<Spittle> retList = new ArrayList<Spittle>();
		for(Spittle spittle : spittles){
			if( spittle.getId()<max && retList.size()<count ) {
				retList.add(spittle);
			}else{
				break;
			}
		}
		return retList;
	}

	@Override
	public Spittle findOne(long id) {
		for(Spittle spittle : spittles){
			if(spittle.getId().equals(id)) return spittle;
		}
		return null;
	}
	
	

}
