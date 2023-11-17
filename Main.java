import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        /* Kullanıcıdan alınan değerler ile Vücut Kitle İndeksi hesaplaması yapacağız. */ 
        
        /* Vücut Kitle İndeksi: Kilo / Boy(m) * Boy(m)

            VKİ 18.5'un altındaysa -> Zayıf

            VKİ 18.5 ile 25 arasındaysa -> İdeal Kilo

            VKİ 25 ile 30 arasındaysa -> Fazla Kilolu

            VKİ 30'un üstündeyse -> Obez */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your weight here: ");
       
        int weight = scanner.nextInt();
        
        System.out.println("Enter your height in centimeters (Example: 1,75): ");
        
        int height = scanner.nextInt();
        
        double BMI = (weight /(height * height));
        
        if(BMI < 18.5){
        
            System.out.println("Your weight is below normal. You should gain weight.");
        
        }
        
        else if(18.5 <= BMI && BMI < 25){
        
            System.out.println("Congratulations! Your weight is normal.");
            
        }
        
        else if(25 <= BMI && BMI < 30){
        
            System.out.println("You weigh more than you should. You should lose weight.");
            
        }
        
        else{
        
            System.out.println("Warning! Your weight is much higher than it should be. You need to lose weight.");
            
        }
        
    }
}