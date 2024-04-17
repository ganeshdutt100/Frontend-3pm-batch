import java.util.Scanner;
class JavaClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int a = sc.nextInt();

        int count =0;
        for(int i = 2; i<a; i++){
            if(a % i == 0){
                count++;
                break;
            }
        }
        if(count ==0){
            System.out.println("this is a prime number");
        }
        else{
            System.out.println("this is a not prime number ");
        }

    }
}