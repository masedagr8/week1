




import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("what is your name");
        String name =input.nextLine();
        System.out.println(name);



        System.out.println("Hello World");
        int age=25;
        double gpa=3.9;
        boolean isRaining= false;

        System.out.println(age+" | "+gpa+" | "+isRaining);

        String city="Columbus";
        System.out.println(city);
        System.out.println(city.toUpperCase());
        //float pi=3.1415926f;
        int dailyHigh[]={23,35,60,54,24};
        System.out.println(dailyHigh[0]);
        for(int i=0 ;i<5;i++ ){
            System.out.println(dailyHigh[i]);
        }
        int sum = 3+2;
        System.out.println(sum);
        double qoutient=10.0/4.0;
        System.out.println(qoutient);

        int i=1;
        System.out.println(i);
        i++;
        System.out.println(i);





    }

}
