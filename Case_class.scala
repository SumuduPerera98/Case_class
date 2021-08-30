import math.{sqrt,pow}
object CaseClass {

  case class Point(x:Int,y:Int)
  {

    //Addition of two points
    def +(that:Point)=Point(this.x+that.x,that.y+this.y)

    //moving pointers
    def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)

    //distance between two points
    def distance(a: Point): Double =
    sqrt(pow(x - a.x, 2) + pow(y - a.y, 2))

    //inverse of point
    def invert()=Point(this.y,this.x)
  }



def main(args: Array[String]): Unit = {
  val p1=new Point(1,4)
  val p2=new Point(5,3)
  val p3=new Point(4,7)
  println("Point P1="+p1);
  println("Point P2="+p2);
  println("Point P3="+p3);

//Question 1 addition of two points
  val x=p1+p2
  println( "Addition of two points p1 and p2 = "+ x)

//Question 2 move x and y coordinates of P1 with 1
  println("After moving x coordinate by 1 and y coordinate by 2 in point P1 = "+ p1.move(1,2))

//Question 3 distance of two points

  println("Distance between P2 and P3 = "+ p2.distance(p3))

//Question 4 after switching the  x and y coordinates
  println("After switching x and y coordinates of P2 " + p2.invert())
}
}
