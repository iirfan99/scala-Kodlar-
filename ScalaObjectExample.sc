

  abstract class Pet () {
    val greeting: String
    val behavior : String
    var age: Int

    def sayHello() { println(greeting) }
    def sayBehavior() {println(behavior)}
    override def toString = s"I say $greeting, and I'm $age , I like to  $behavior"
  }
  abstract class Animal {
    val greeting = "Hello"                // provide an initial value
    def sayHello { println(greeting) }
    def run
    val behavior =  "sleep "
    def sayBehavior ={println(behavior)}

  }

  class Dog (name: String) extends Pet () {
    val greeting = "Woof"
    val behavior = "eat"
    var age = 15
  }

  class Cat (name: String) extends Pet () {
    val greeting = "Meow"
    val behavior = "sleep"
    var age = 11
  }
      val dog = new Dog("alex")
      val cat = new Cat("can")
      dog.sayHello()
      cat.sayHello()
      println(dog)
      println(cat)

      cat.age = 10
      println(cat)