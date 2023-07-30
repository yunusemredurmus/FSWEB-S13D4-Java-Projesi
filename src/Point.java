public class Point {

    int x ;
    int y ;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private  int getX() {
        return x;
    }

    private int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public double distance(){
        return Math.sqrt(Math.pow((0 - this.x), 2) + Math.pow((0 - this.y), 2));
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow((p.getX() - this.x), 2) + Math.pow((p.getY() - this.y), 2));
    }

    public double distance(int a, int b){
        return Math.sqrt(Math.pow((a - this.x), 2) + Math.pow((b - this.y), 2));
    }

}

