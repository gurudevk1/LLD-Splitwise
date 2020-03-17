package com.guru.splitwiseApp;

public enum SplitStrategy {
	SPILT_EQUALLY(1),
	SPILT_UNEQUALLY(2),
	SPILT_BYSHARE(3);
	
	private int id;
	private String splitStrategy;

	private SplitStrategy(int id){
		this.setId(id);
		if(id==1) {
			setSplitStrategy("Split Equally");
		}else if(id==2){
			setSplitStrategy("Split UN-Equally");
		}else {
			setSplitStrategy("Split By-Share");
		}
	}
	public static SplitStrategy getSplitStrategyById(int id) {
		SplitStrategy obj;
		if(id==1) {
			obj=SplitStrategy.SPILT_EQUALLY;
		}else if(id==2){
			obj=SplitStrategy.SPILT_UNEQUALLY;
		}else {
			obj=SplitStrategy.SPILT_BYSHARE;
		}
		return obj;
		
	}

	public String getSplitStrategy() {
		return splitStrategy;
	}

	public void setSplitStrategy(String splitStrategy) {
		this.splitStrategy = splitStrategy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
