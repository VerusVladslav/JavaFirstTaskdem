import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
      // FirstTask();
      //  SecondTask();
       // ThirdTask();
       // FourthTask();
   // FifthTask();
        //SixthTask();
      //  SeventhTask();

    //    EighthTask();
       // NinethTask();
     //  TenthTask();
       // eleventh();
       // twelfth();
    }

    private static void eleventh() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input lenght");
        int lenght=scan.nextInt();
        System.out.println("Input char");
        char elem=scan.next().charAt(0);
        System.out.println("\nPress to horizontal 1\nPress to vertical 2");
            switch (scan.nextInt()){
                case 1:{
                    for (int i=0;i<lenght;i++)
                    {
                        System.out.print(elem);
                    }
                }
                break;
                case 2:{
                    for (int i=0;i<lenght;i++)
                    {
                        System.out.println(elem);
                    }
                }
                break;

                default:
                    System.out.println("Error");
            }
    }

    private static void twelfth() {
        Integer[] array = new Integer[12];
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 10) - 5);
            System.out.print(array[i]+"\t");
        }
        System.out.println("\nPress to sort 1\nPress to reverse sort 2");
        switch (scan.nextInt()){
            case 1:Arrays.sort(array);


                break;
            case 2: Arrays.sort(array, Collections.reverseOrder());

                break;
            default:
                System.out.println("Error");
        }
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]+"\t");
        }
    }

    public static int[] add_element(int n, int myarray[], int ele)
    {
        int i;

        int newArray[] = new int[n + 1];

        for (i = 0; i <myarray.length;  i++)
        newArray[i] = myarray[i];


        newArray[n] = ele;

        return newArray;
    }
    private static void TenthTask() {
        int[] array = new int[12];

        int []positivearray=new int[0];
        int []negativearray=new int[0];
        int []evenarray=new int[0];
        int []oddarray=new int[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 10) - 5);
            System.out.println(array[i]);
            if(array[i]<0){

                negativearray=add_element(negativearray.length,negativearray,array[i]);
            }
            else if (array[i]>0) {

                positivearray=add_element(positivearray.length,positivearray,array[i]);

            }
            if(array[i]%2==0) {

                evenarray=add_element(evenarray.length,evenarray,array[i]);

            }
            else if(array[i]%2!=0) {
                oddarray=add_element(oddarray.length,oddarray,array[i]);

            }
        }
        System.out.println();
    for (int i=0;i<negativearray.length;i++){
        System.out.println(negativearray[i]);
    }


    }

    private static void NinethTask() {
        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 10) - 5);
            System.out.println(array[i]);
        }
        Arrays.sort(array);
        System.out.println();
        int positivecount=0;
        int negavecount=0;
        int nullcount=0;
        for (int i = 0; i < array.length; i++) {

           if(array[i]<0){
               negavecount++;
           }
           else if (array[i]==0) {
               nullcount++;
           }
           else {
               positivecount++;
           }
        }
        System.out.println("Min element = "+ array[0]);
        System.out.println("Max element = "+ array[array.length-1]);
        System.out.println("Count positive elements = "+ positivecount);
        System.out.println("Count negative elements = "+ negavecount);
        System.out.println("Count nulls  = "+ nullcount);

        //  int[]sortedarray= Arrays.sort(array, Collections.reverseOrder());
    }

    private static void EighthTask() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input first number");
        int firstnum=scan.nextInt();
        System.out.println("Input second number");
        int secondnum=scan.nextInt();
        for(int i=firstnum;i<=secondnum;i++){
            for (int y=1;y<=10;y++){
                System.out.print(i+" * "+y+" ="+i*y+"\t");
            }
            System.out.println();
        }
    }

    private static void SeventhTask() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input first number");
        int firstnum=scan.nextInt();
        System.out.println("Input second number");
        int secondnum=scan.nextInt();
        if(firstnum>secondnum){

            for (int i=secondnum;i<=firstnum;i++)
            {

                if(i%2!=0){
                    System.out.println(i);
                }
            }
        }
        else if(firstnum<secondnum) {

            for (int i=firstnum;i<=secondnum;i++) {
                if(i%2!=0){
                    System.out.println(i);
                }
            }
        }


    }

    private static void SixthTask() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input meters");
        Long meters=scan.nextLong();
        double miles = meters*0.000621371192;
        double yards = meters*1.0936133;
        double inch = meters*39.3700787;

        System.out.println("Miles "+miles+"\nYards "+yards+"\nInch "+inch);

    }

    private static void FifthTask() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input number of month");
       switch (scan.nextInt()){
           case 12:
           case 1:
           case 2:
               System.out.println("Winter");
               break;
           case 3:
           case 4:
           case 5:
               System.out.println("Spring");

               break;
           case 6:
           case 7:
           case 8:
               System.out.println("Summer");

               break;
           case 9:
           case 10:
           case 11:
               System.out.println("Autmn");

               break;
           default:
               System.out.println("Error");

       }
    }

    private static void FourthTask() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input number ");
        Long number=scan.nextLong();
        Long firstdigit=number/100000;
        Long Lastdigit=number%10;
        Long seconddigit=(number%100000-number%10000)/10000;
        Long fifthdigit=(number%100-Lastdigit)/10;
        Long thirddigit=(number%10000-number%1000)/1000;
        Long fourthdigit=(number%1000-number%100)/100;

        Long newnum=Lastdigit*100000+fifthdigit*10000+thirddigit*1000+fourthdigit*100+seconddigit*10+firstdigit;
        System.out.println(newnum);
    }

    private static void ThirdTask() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input first digit ");
        int firstdigit=scan.nextInt();
        System.out.println("Input second digit ");
        int seconddigit=scan.nextInt();
        System.out.println("Input third digit ");
        int thirddigit=scan.nextInt();
        int number = firstdigit*100+seconddigit*10+thirddigit;
        System.out.println(number);
    }

    private static void SecondTask() {
        System.out.println("Input number ");
        Scanner number=new Scanner(System.in);
        int num=number.nextInt();
        System.out.println("Input precent ");
        float precent=number.nextFloat();
        System.out.println((precent/100)*num+"%");
    }

    private static void FirstTask() {
        System.out.println("\"Your time is limited,\n\t so" +
                "don’t waste it\n\t\t living someone else’s life\"\n\t\t\t Steve Jobs");
    }
}
