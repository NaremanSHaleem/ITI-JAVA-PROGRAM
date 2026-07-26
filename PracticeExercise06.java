public class PracticeExercise06 {
    public static void main(String[] args) {
        Validator validator = new Validator();

        try{
//            validator.checkName("");
//            validator.checkSalary(50000);
            validator.chekAge(12);
        }catch (MyException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("FINISHED");
        }
    }
}
