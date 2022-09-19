case class point(var x: Int, var y: Int) {
    def add(a:point) = new point(this.x + a.x, this.y + a.y)

    def move(x:Int, y:Int):Unit = {
        this.x = this.x + x
        this.y = this.y + y
    }

    def distance(a:point) : Double = {
        var dx:Int = this.x - a.x
        var dy:Int = this.y - a.y
        var dist: Int = dx*dx + dy*dy
        scala.math.sqrt(dist)
    }

    def invert() :Unit = {
        var tmp = this.x
        this.x = this.y
        this.y = tmp
    }

}

object point extends App {

    var a = point(1,4)
    var b = point(3,8)
    
    println(a.add(b))

    a.move(x = 2, y = 4)
    println(a)
    
    var c = a.distance(b)
    println(c)

    a.invert()
    println(a)
}