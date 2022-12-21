package project_Training_day1;
@FunctionalInterface
interface circle {
    double calculate(int x);
}
 
class functionalInterface {
    public static void main(String args[])
    {
        int a = 5;
 
        
        circle s = (int x) -> 3.14 * x* x;
 
        double ans = s.calculate(a);
        System.out.println(ans);
    }
}
