package Examples;

public class DivideEvenly {

    public static void main(String[] args){

        int count = 0;

        while (count < 10){
            if (count % 2 == 1)
                System.out.print(count);
            count++;
        }
        System.out.println("_____________");
        while (count > 0){
            if (count % 2 == 0) {
                System.out.print(count);
            }
            count--;
        }
        System.out.println("_____________");
        do {
            if (count % 2 == 0)
                System.out.print(count);
            count++;
        }while (count < 10);
        System.out.println("_____________");
        do {
            if (count % 2 == 0)
                System.out.print(count);
            count--;
        }while (count > 0);
    }

}
