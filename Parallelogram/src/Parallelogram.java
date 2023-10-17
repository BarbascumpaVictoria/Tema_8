public class Parallelogram {

    private int LENGTH;
    private double WIDTH;
    private int SIDELENGTH;
    private int PERIMETRU;
    private double ARIA;


    public int calculatePerimeter(int sidelength){
        SIDELENGTH = sidelength;
        PERIMETRU = 4 * SIDELENGTH;
        System.out.println("Perimetrul este:  ");
        return PERIMETRU;
    }
    public int calculatePerimeter(int length, int width){
        return PERIMETRU;
    }
   public  double calculateArea(int length, double width) {
       LENGTH = length;
       WIDTH = width;
       ARIA = LENGTH * WIDTH;
       System.out.println("Aria este:  ");
       return ARIA;
   }

//   public  int calculateArea(int sideLength) {
//   }

}
