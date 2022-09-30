package shapes {

abstract class Shape() { 
    def draw(): Unit {
        
    }
}

class Point(val x: Double, val y: Double) {
override def toString() = "Point(" + x + "," + y + ")" 
}

class Circle(val center: Point, val radius: Double) extends Shape { def draw() = println("Circle.draw: " + this)
override def toString() = "Circle(" + center + "," + radius + ")"
}
class Rectangle(
    val lowerLeft: Point,
    val height: Double,
     val width: Double) 
     extends Shape {
        def draw() = println("Rectangle.draw: " + this) 
        override def toString() = "Rectangle(" + this.lowerLeft + "," + this.height + "," + this.width + ")"
    }
    class Triangle(val point1: Point, val point2: Point, val point3: Point) 
    extends Shape {
        def draw() = println("Triangle.draw: " + this.draw())
         override def toString() =   "Triangle(" + this.point1 + "," + this.point2 + "," + this.point3 + ")"
 }


val circle = new Circle(new Point(0,0), 10)
val rect = new Rectangle(new Point(1,1), 6, 7)
val triangle = new Triangle(new Point(1,1), new Point(2,2), new Point(3,3))
//System.out.println("Circle" + cirfcle.draw(), "triangoe" + triangle.draw(), "rectangle + " + rectangle.draw())
// circle.toString()
// rect.toString()
// triangle.toString()
}