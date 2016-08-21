// This function will be used while invoking "Summation" to compute
 // The area under the curve.
 def f(coefficients:List[Int],powers:List[Int],x:Double):Double =
   {
      (coefficients zip (for (i <- (0 to powers.length-1).toList) yield Math.pow(x,powers(i)))).map({case(x,y) => x*y}).sum
   }

  // This function will be used while invoking "Summation" to compute 
  // The Volume of revolution of the curve around the X-Axis
  // The 'Area' referred to here is the area of the circle obtained
  // By rotating the point on the curve (x,f(x)) around the X-Axis
  def area(coefficients:List[Int],powers:List[Int],x:Double):Double = 
   {
      Math.pow(f(coefficients,powers,x),2)*Math.PI
   }

   // This is the part where the series is summed up
   // This function is invoked once with func = f to compute the area         // under the curve
    // Then it is invoked again with func = area to compute the volume 
    // of revolution of the curve
   def summation(func:(List[Int],List[Int],Double)=>Double,upperLimit:Int,lowerLimit:Int,coefficients:List[Int],powers:List[Int]):Double =
   {
      //go from lower to higher w/ step 0.001
	//alturas
      ((lowerLimit.toDouble to upperLimit.toDouble by 0.001).toList.map(x => f(coefficients,powers,x)) zip (lowerLimit.toDouble to upperLimit.toDouble by 0.001).toList.map(x => f(coefficients,powers,x)).drop(1)).map({ case (a, b) => 0.001*(f(coefficients,powers,a) + f(coefficients,powers,b))/2.0 }).sum


		
	
   } 


// The Input-Output functions will be handled by us. You only need to concentrate your effort on the function bodies above.

