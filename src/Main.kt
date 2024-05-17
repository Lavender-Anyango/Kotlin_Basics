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