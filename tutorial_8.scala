object tutorial_8 extends App {

    class Point(a: Int,b: Int){
        def x: Int = a;
        def y: Int = b;
    }

    var p1= Point(1,0);
    var p2 =Point(2,3);

    def add (p1: Point, p2: Point):Unit = {
        printf("\nAddition of p1 and p2: (%d , %d)",p1.x+p2.x, p1.y+p2.y);
        }
    
    def move(p1: Point, dx: Int, dy: Int ):Unit = {
        printf("\nMoved p1 from : (%d , %d) to : (%d , %d)",p1.x, p1.y, p1.x+dx, p1.y+dy);
    }

    def distance(p1: Point, p2: Point):Unit = {
        
            printf("\nDistance between p1 and p2 \n\talong X axis : %d \n\talong Y axis :  %d",(p1.x-p2.x).abs, (p1.y-p2.y).abs);
        }
    def invert(p1: Point):Unit = {
        var invy = p1.x;
        var invx = p1.y;
        printf("\nInverted Point p1: (%d , %d)",invx, invy);
    }
    
    printf("****Considered p1 : (%d , %d) and p2 : (%d , %d)****",p1.x, p1.y, p2.x, p2.y);
    add(p1,p2);
    move(p1,4,5);
    distance(p1,p2);
    invert(p1);
}