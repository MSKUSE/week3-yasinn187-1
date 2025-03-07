public class findPrimes {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        for i in range(0,args[0]);
            boolean isPrime = true;
            for(int j = 2; j<i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
            
                }
            }if(isPrime){
                System.out.println(i);
            }
    }
    
}
