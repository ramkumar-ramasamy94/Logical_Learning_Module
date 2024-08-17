//// Using Scala, find the maximum profit when buying and selling a stock on the same day or on the previous day.
object Buying_Selling_Stock_Profit {
	def main(args: Array[String]): Unit = {
	println("Hello, World!")
	
	///var prices = Array(1,4,5)
	
	/// {1, 3, 5, 7, 9}
	
	///var prices = Array(1, 3, 5, 7, 9)
	
	var prices = Array(100, 180, 260, 310, 40, 535, 695)
	
	///(3, 4, 1, 5)
	
	
	var max_profit = 0
	
	for(i<-1 until prices.length){
	  
	  if(prices(i)>prices(i-1)){
	    max_profit += prices(i) - prices(i - 1)
	    println(max_profit)
	  }
	  
	}
	
	println("Max Profit:"+max_profit)
	
	}
}
