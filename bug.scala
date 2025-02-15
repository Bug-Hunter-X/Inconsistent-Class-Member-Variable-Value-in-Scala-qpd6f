```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val obj = new MyClass(5)
    println(obj.myMethod(10)) //expect 15
    println(obj.x) //expect 5

    val obj2 = new MyClass(5)
    println(obj2.myMethod(10)) //expect 15
    println(obj2.x) //expect 5
  }
}
```