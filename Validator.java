public class Validator {
    public void chekAge(int age) throws MyException{
        if(age<18){
            throw new MyException("YOU ARE UNDERAGE!");
        }
    }

    public void checkSalary(double salary) throws MyException{
        if(salary<100_000){
            throw new MyException("YOU ARE POOR!");
        }
    }

    public void checkName(String name) throws MyException{
        if(name.isEmpty()){
            throw new MyException("YOUR NAME IS EMPTY!");
        }
    }
}
