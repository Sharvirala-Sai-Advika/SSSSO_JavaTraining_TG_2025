public class Exercise3_Interest {
    public static void main(String[] args) {
        
        double principal = 10000;   
        double rate = 5;            
        double time = 3;            

       
        double simpleInterest = (principal * rate * time) / 100;

      
        double compoundAmount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = compoundAmount - principal;

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");

        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Compound Interest = " + compoundInterest);
    }
}
