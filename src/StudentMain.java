public class StudentMain {
    public static void main(String[] args) {
        Student<Integer, String> s1 = new Student<>();
        Student<Integer, String> s2 = new Student<>(12,"Vaibhav");

        Student<String,String> s3 = new Student<>();
        Integer rollNo = s2.getRollNo();
        String rollNo1 = s3.getRollNo();



        Student obj = new Student();
        int number1 = 1;



    }
}
