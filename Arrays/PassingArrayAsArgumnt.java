package Arrays;

public class PassingArrayAsArgumnt {
    public static void update(int mark[], int nonchangeable) {
        nonchangeable = 10;
        for(int i=0;i<mark.length;i++) {
            mark[i]=mark[i]+1;
        }
        System.out.println("NonchnageAble value in update function: "+nonchangeable);
    }
    public static void main(String args[]) {
        int marks[] = {98,97,96};
        int nonchangeable = 5;
        update(marks,nonchangeable);
        System.out.println("Nonchangeable value in main function: "+nonchangeable);

        for(int i=0;i<marks.length;i++) {
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}
