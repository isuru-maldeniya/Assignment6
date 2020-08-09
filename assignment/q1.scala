case class Point(var xCodinate: Int, var y: Int) {
    //add function
    def add(a:Point) = new Point(this.x + a.x, this.y + a.y)
    //move function
    def move(x:Int, y:Int):Unit = {
        this.x = this.x + x
        this.y = this.y + y
    }
    //making distances
    def distance(a:Point) : Double = {
        var xDistance:Int = this.x - a.x
        var yDistance:Int = this.y - a.y
        var distance: Int = xDistance*xDistance + yDistance*yDistance
        scala.math.sqrt(distance)
    }
    //switching
    def invert() :Unit = {
        var prevX = this.x
        this.x = this.y
        this.y = prevX
    }

}

object Point extends App {

    var a = Point(1,2)
    var b = Point(4,10)
    var sum=a.add(b) 
    println(sum)
    a.move(x = 2, y = 4)
    println(a)
    println(a.distance(b))
    a.invert()
    println(a)
}