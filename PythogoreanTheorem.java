package pythagoreantheorem;

import java.util.Scanner;

/**
 *
 * @author 19guptat
 */
public class PythagoreanTheorem {

    
    public static void main(String[] args) {
        /* 
            Author: TGuptaNYC
            Date: 10/2/2016
            Title: PythagoreanTheorem
            Description: 2 side lengths
            Output: ouputs hypotonuse
        */
        
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        System.out.println(PythagoreanTheorem(x, y));
        
        // output as expected
        
    }
    
    public static double PythagoreanTheorem(double sidelength01, double sidelength02) {
        double hypo;
        double sidelength01squared = Math.pow(sidelength01, 2);
        double sidelength02squared = Math.pow(sidelength02, 2);
        hypo = Math.sqrt(sidelength01squared + sidelength02squared);
        return hypo;
    }
    
}
