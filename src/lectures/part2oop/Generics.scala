package lectures.part2oop

object Generics extends App {

  class MyList[A] {

  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]


  //generic methods
/*
  object MyList {
     def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]*/

  //variance problem

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes, List[Cat] extends List[Animal] = COVARIANCE

  class CovariantList[+A]

  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  // 2. no = INVARIANCE

  class InvariantList[A]

  val invariantList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. Hell, no! = CONTRAVARIANCE

  class Trainer[-A]

  val trainer: Trainer[Cat] = new Trainer[Animal]

  //bounded types
  class Cage[A <: Animal] (animal: A)
  class Car

  val cage = new Cage(new Dog)
  val bigCage = new Cage(new Animal)




}
