val name = "Babalakin"
val surname = " Oyeyemi"
val text = "peter,picks,peppers"
val height = 1.86
val nums = Array(1,2,3,4,5,6,7,8)
println(s"Hi my name is $name")
println(f"and I am $height%2.2fm tall")
println("escaping to \n new line")
println(raw"test \n line")

// String methods
println(name concat surname)
println(surname charAt 7)
println(surname endsWith "yemi")
println(surname indexOf "y")
println(surname.replace("e", "a"))
val array = text split ","
println(array.length)
println(nums.length)
println(name.substring(4,8))
println(surname.trim())

