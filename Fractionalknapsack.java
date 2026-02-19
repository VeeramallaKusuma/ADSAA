import java.util.Arrays;
class Item{
	int weight,profit;
	double ratio;
	Item(int weight,int profit){
		this.weight=weight;
		this.profit=profit;
		this.ratio=(double)profit/weight;
	}
}
	 class Fractionalknapsack{
		public static double getMaxprofit(Item[] items,int m){
		Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));
		double maxprofit=0.0;
		System.out.println("items palced in the bag:");
		for(Item item:items){
		if(item.weight<=m){
			maxprofit=maxprofit+item.profit;
			m=m-item.weight;
		}
		else{
			double fraction=(double)m/item.weight;
			maxprofit=maxprofit+item.profit*fraction;
			break;
		}
		}
		return maxprofit;
		
	}
	public static void main(String[] args){
		Item[] items={
		new Item(10,60),
		new Item(20,100),
		new Item(30,120)
		};
		int m=50;
		double maxprofit=getMaxprofit(items,m);
		System.out.println("maximum profit is:"+maxprofit);
	}
}
