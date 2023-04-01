/**
 * Recitation7 is a class for completing
 *  Reciation 7 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class Recitation7
{
    // define your constants after this comment
    private static String replicate(char ch, int ntimes){
        String str = "";
        for(int i = 0; i < ntimes; i++){
            str += ch;
        }
        return str;
    }


    public static String leftRightTriangle( int height)
    {
        String str = "";
        for(int row = 0; row < height; row++){
            str += replicate('*', row+1);
            str += "\n";
        }
        return str;
    }

    public static String rightRightTriangle(int height)
    {
        String str = "";
        for(int row = 0; row < height; row++){
            str += replicate(' ', height-(row+1));
            str += replicate('*', row+1);
            str += "\n";
        }
        return str;
    }

    public static String circle(int radius)
    {
        String str = "";
        int diameter = radius*2;
        for (int y = radius - 1; y > -radius; y--) {
          int x = (int)Math.sqrt(radius*radius - y*y);
          str += replicate(' ', radius - x) + replicate('*',2*x)+"\n";
            }
        return str;
        }
}
