public class findMinimum {
   public static void main(String[] args) {
        int score1 = Integer.parseInt(args[0]);
        int score2 = Integer.parseInt(args[1]);
        int score3 = Integer.parseInt(args[2]);
        if (args[0] != 0 and args[1] != 0 and args[2] != 0);{
            if (args[1]<args[0]<args[2]);{
                System.out.println("minimum number is: ", args[1]);
            }
            else if (args[0]<args[1]<args[2]) or (args[0]<args[2]<args[1]);{
                System.out.println("minimum number is:",args[0]);
            }
            else if (args[2]<args[1]<args[0]) or (args[2]<args[0]<args[1]);
                System.out.println("minimum number is:", args[2]);
                



        }

   } 
}
