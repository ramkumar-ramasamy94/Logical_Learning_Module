object HelloWorld {
	def main(args: Array[String]): Unit = {
	println("Hello, World!")
	var free_choco = scala.io.StdIn.readLine()
	
	println(free_choco)
	
	///var prices = Array(1,4,5)
	
	/// {1, 3, 5, 7, 9}
	
	///var prices = Array(1, 3, 5, 7, 9)
	
/*	var prices = Array(100, 180, 260, 310, 40, 535, 695)
	
	///(3, 4, 1, 5)
	
	
	var max_profit = 0
	
	for(i<-1 until prices.length){
	  
	  if(prices(i)>prices(i-1)){
	    max_profit += prices(i) - prices(i - 1)
	    println(max_profit)
	  }
	  
	}
	
	println("Max Profit:"+max_profit)
	*/
	
	var number_of_Chocolates = 6 
	var amount_he_has = 10
	var chocolates = Array("a","a","b","c","d","a")
	var distinct_choco = chocolates.toSet.toList /// Array to set conversions
	println(distinct_choco(0))
  var prices = Array(5,4,4,5,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1)
  
  // here free chocolate is a so the price is 10
  

  var price_choco = scala.collection.mutable.Map[String,String]()
  
  
  for(i <-0 to distinct_choco.size-1){
    println(i)
    price_choco += distinct_choco(i).toString -> prices(i).toString
     
  }
  
	println(price_choco)
	
	
	var total_cost = 0
	
	for(i <- 0 to chocolates.length-1){
	  if(free_choco==chocolates(i)){
	   //val d = c + ("AR" -> "banana")
	   price_choco = price_choco+(chocolates(i)->"0")
	  }
	}
	
	println(price_choco)
	
	
	
	}
}
