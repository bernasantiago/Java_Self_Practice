package m14_selection_statements_part1;

public class Task2 {

    public static void main(String[] args) {

        // only one of them is executed. First true one

        int a=7;
        int b=2;
        int c=5;

        if ( a<10){
            b=1;
        }else if (a>10){
            c=1;
        } else {
            b=0;
            c=0;
        }
        System.out.println(b);
        System.out.println(c);
    }


}
