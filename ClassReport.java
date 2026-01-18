public class ClassReport {
    public static void main(String[] args){
        int maths = 90;
        int physics = 60;
        int chemistry = 82;
        int total = maths + physics + chemistry;
        double percentage = total * 100 / 300 ;
        System.out.println("Total:" +total);
        System.out.println("Percentage:" +percentage);
        if(percentage >= 40){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
