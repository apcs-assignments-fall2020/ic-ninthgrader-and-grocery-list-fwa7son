public class NinthGrader {
    //private String firstName;
    //private String lastName;

    public Student(String firstName, String lastName){
        super(firstName, lastName, 2024);
    }
    public void doSomething(){
        System.out.println("I am working on a stats project");
    }
    public String toString(){
        return this.getfirstName()+ " " + this.getlastName() + "," + this.getClassyear + "(ninth grader)";
    }


}