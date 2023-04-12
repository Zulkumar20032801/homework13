import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Class clas = new Class(5,"parrot",new int []{1,2,3,3,4,5,6,7,7,8});
        Class clas1=new Class();
        clas1.setArray(new int[]{1, 2, 3, 3, 4, 5, 6, 7, 7, 8});

        System.out.println(clas.getNumber());
        System.out.println(clas.getWord());


        for (int i = 0; i < clas1.getArray().length; i++) {
            System.out.print(clas1.getArray()[i]+" " );
        }
        





    }
}