public class Calculate {

public String workerOne(){
    System.out.println("I am worker ,I have been called ");
    return workerFour();
}
public String workerFour(){
    System.out.println("I am worker four (Davis) and I want to buy beans");
    return buyBeans();
}

    private String buyBeans() {
        System.out.println("I an");
        return workerOne();

    }
private String bossMethod(){
    return workerOne();


}
}
