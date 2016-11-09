package entropycalculator;
import java.util.Scanner;

/**
 * The Main class starts the client
 * @author jon
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double dub1 = 0, dub2 = 0;
		System.out.println("Enter first number");
		dub1 = in.nextDouble();
		System.out.println("Next Number");
		dub2 = in.nextDouble();
		System.out.println("Entropy is " + calcEntropy(dub1, dub2));
	}
	public static double calcEntropy(double dub1, double dub2){
		double entropy = 0;
        if (dub1 == 0 || dub2 == 0){
        }else{
        	//this calculation is -plog2(p) - nlog2(n)
            entropy = -1.0 * ((double)dub1/(dub1+dub2))*(Math.log((double)dub1/(dub1+dub2))/Math.log(2.0)) - ((double)dub2/(dub1+dub2))*(Math.log(((double)dub2/(dub1+dub2)))/Math.log(2.0));
        }
        //if either p or n is 0 the entropy calculation will result in NaN, but in practice the value in this case should be 0        
        return entropy;
    }

}
