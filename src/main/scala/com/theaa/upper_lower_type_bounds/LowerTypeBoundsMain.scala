package com.theaa.upper_lower_type_bounds

object LowerTypeBoundsMain extends App {

  val parking = new Parking[Vehicle](new Vehicle)

}

class Parking[A >: Bicycle](val plaza: A) {}

trait Thing
class Vehicle extends Thing
class Car extends Vehicle
class Jeep extends Car
class Coupe extends Car
class Motorcycle extends Vehicle
class Bicycle extends Vehicle
class Tricycle extends Bicycle
