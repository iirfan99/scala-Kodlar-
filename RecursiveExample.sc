def fun(a:Int, b:Int) : Int = {
  if (b==0) 
    1
  else a*fun(a,b-1)
}
println(fun(2,3))
println(fun(2,6))
println(fun(4,2))