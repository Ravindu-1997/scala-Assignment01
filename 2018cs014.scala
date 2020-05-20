package FunctionalProgramming

object Index18000142 {
  
  def main(args:Array[String])
  {
    var showtemp = temp()
    println("Fahrenheit - : "+showtemp)
    
    var showvol = vol()
    println("volume of Sphere : "+showvol)
    
    var showprice = bookprice()
    println("wholesale cost : Rs."+showprice)
  }
  
  def temp():Double=
  {
    var c=35
    var f = (c*1.8)+32
    return f
  }
  
  def vol():Double=
  {
    var r = 5
    val pi = (22.0/7.0)
    var volu = (4.0/3.0)*pi*r*r*r
    return volu
  }
  
  def bookprice():Double=
  {
    var numberofbooks=60
    
    if(numberofbooks<=50)
    {
      var total = (((24.95*60)/100))*numberofbooks + 3
      return total
    }
    else
    {
      var addition = numberofbooks-50
      var total = ((((24.95*60)/100))*50 + 3) + (((24.95*60)/100)+0.75)*addition
      return total
    }
  }
  
}