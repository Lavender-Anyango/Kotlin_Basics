//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  var name = "Lavender123"
    println(name.first())
    println(name.get(3))
  for (char in name){
    println(char)
  }

  var sentence = "Lavender is a good name"
  var array = sentence.split(" ")
  println(array)

  if(name.all{it.isLetter()}){
    println("It is a name")
  }
  else{
    println("Names only contain letters")
  }
}

fun bingo() {
  for (num in 1..1000) {
    if (num % 6 == 0 && num % 8 == 0) {
      println("bingo")
    } else if (num % 8 == 0) {
      println(num)
    } else if (num % 6 == 0) {
      println(num)
    }
  }
}

fun numberOfWorkers(hours:Array<Int>, target:Int): Int{
  var sum = 0
  for (hour in hours){
    if (hour >=target){
      sum ++
    }

  }
  return sum
}

//fun getLargest(arr:Array<String>): Int {
//    var large = arr[0].length
//    for (sentence in arr) {
//        var new = sentence.split(" ")
//        if (new.size > large) {
//            large = new.size
//
//        }
//
//    }
//    return large
//}

class Area(){
  fun add(a: Int, b: Int){
    println(a + b)
  }
}

fun createArray2(words: Array<String>){
  println(words.contentToString())
}

fun cities(word: Array<String>){
  for (i in word){
    var newWord =  i.capitalize()
  }
}

fun sum(numbers: Array<Int>){
  println(numbers[1] + numbers[4])
}

fun names(vararg args: String){
  var names = args
  println(names.contentToString())
}





fun printCapitalizedFirstLetters(words: Array<String>) {

  words.forEach { word ->
    val capitalizedWord = word.replaceFirstChar(Char::titlecaseChar)
    println(capitalizedWord)
  }
}

//fun age(year: Int){
//    var current= 22
//    if (year == 2022){
//        println("you are $current")
//    }else{
//        println(++current)
//
//    }



fun age(myString: String) {
  println(myString.split(" "))
}

fun africanCities(cities: Array<String>){
  cities.forEach{ city ->
    println(city.capitalize())
  }
}


// ARRAYS
// It has fixed size of elements
// It occupies contiguous memory
// It only knows where the first element it


fun findSingleElement(nums: Array<Int>): Int {
  var xorResult = 0
  for (num in nums) {
    xorResult = xorResult xor num
  }
  return xorResult
}


val fruit = "Avocado"
//    println(fruit.first())
//    println(fruit.indexOf("0"))
// println(fruit.lastIndexOf("o"))
//    println(fruit[4])

// val city = "Kigali"
// val city2 = "Kiseka"
//
// println(city.uppercase())
// println(city.lowercase())


val emptyString = ""
val blankString = " "


// println(emptyString.isEmpty())
// println(blankString.isEmpty())
// println(emptyString.isBlank())
// println(blankString.isBlank())

//

// val sentence = "Jane is the minister of finance"
// println(sentence.replace("i", "v"))
//
// var phoneNumber = "07595972442"
// if (phoneNumber.startsWith("07")) {
//  var slice = phoneNumber.substring(1)
//  phoneNumber = "+254$slice"
//  println(phoneNumber)
//
// }
//
//var word = "A small bird perched on the rear window"
// println(word.split(" ,"))

// print("Enter number: ")
// var inputString = readLine()
// println(inputString)

// var myString = "akirachix"
// println()
//
// adaLab("KC", 28)
// stringLength("Joy")
// thatMe("kc")

// thatMe("ven")
// printString("Akirachix")
//area(20)
//println(isEven(3))
//println(extractString("ApplePie"))
//}

//fun adaLab(name:String, age:Int) :String{
// var fullSentence = "Hi my name is $name and I am $age years old"
// println(fullSentence)
// return fullSentence
//}
//
//fun stringLength(word:String):Int{
// var text = word.length
// println(text)
// return (text)
//
//}
//
//
//fun thatMe(word:String) {
// if (word == "Nancy"){
//  println("That's me")
// }
// else{
//  println("I dont know you")
// }
//}
//fun printString(){
// var word = "akirachix"
//
// println(word[0] + word[1].toString() + word[2].toString())
//}
//
//fun interestingThings(){
// val things = arrayOf("Kotlin", "Python", "JavaScript")
// println(things.size)
//}


//fun printString(word:String){
// var text = word[0] + ""+ word[2] + "" +word[3]
// println(text)

// var a = word[0]
// var b = word[2]
// var c = word[3]
//
// var result = "$a$b$c"
// println(result)
//}

fun area(radius:Int){
  var b = radius * radius
  var result = 3.142 * b
  println(result)
}

//fun isEven(num: Int): Boolean {
// if (num % 2 == 0) {
//  return true
// } else {
//
//   return false
// }
//}

fun extractString(str: String): String{
  var newString = (str.slice(1..5))
// println(str.slice(20 downTo 1))
  return newString
}

fun isEven(num:Int): Boolean{
  var newNum = num%2 == 0
  return newNum
}
