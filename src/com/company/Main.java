import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class BMICalculator {

    public static void main(String[] args) throws IOException{
        float heightHilary, weightHilary, bmiHilary;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("THIS PROGRAM CALCULATES YOUR BMI");
        System.out.println("Enter your height in cm and press Enter: ");
        heightHilary = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight and press Enter");
        weightHilary = Float.parseFloat(br.readLine());

        bmiHilary = (float) (weightHilary/(Math.pow(heightHilary, 2)));
        System.out.printf("Your BMI is: " + "%2.2f, \n", bmiHilary);

        if( bmiHilary<16) {
            System.out.printf("Starvation");
        } else if ((bmiHilary >= 16)&&(bmiHilary <16.99 )){
            System.out.printf("emaciation");
        } else if ((bmiHilary >= 17)&&(bmiHilary <18.49 )){
            System.out.printf("underweight");
        }else if ((bmiHilary >= 18.50)&&(bmiHilary <22.99 )){
            System.out.printf("normal, low range");
        }else if ((bmiHilary >= 23)&&(bmiHilary <24.99 )){
            System.out.printf("normal, high range");
        }else if ((bmiHilary >= 25)&&(bmiHilary <27.49 )){
            System.out.printf("overweight, low");
        }else if ((bmiHilary >= 27.50)&&(bmiHilary <29.99 )){
            System.out.printf("overweight, high range");
        }else if ((bmiHilary >= 30)&&(bmiHilary <34.9 )){
            System.out.printf("1st degree obesity");
        }else if ((bmiHilary >= 35)&&(bmiHilary <39.9 )){
            System.out.printf("2nd Degree obesity");
        }else if ((bmiHilary >= 40)){
            System.out.printf("3rd Degree obesity");
        }


    }
}