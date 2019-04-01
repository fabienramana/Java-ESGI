class main{

    public static void main(String args[]){
        
        if(args.length == 1){
            int number = 0;
            
            try{
                number = Integer.parseInt(args[0]);
            }
            catch(NumberFormatException e){
                System.out.println("L'argument donné n'est pas une nombre !");
            }
            if(number >= 2){
                int half = 0;
                half = number/2;
                number = number%2;
                half = half%2;
                System.out.print(half);
                System.out.print(number);
                System.out.print("\n");
            }
            else{
                number = number%2;
                System.out.println(number);
            }
        }
        else if(args.length == 0){
            System.out.println("Pas d'arguments !");
        }
        else{
            System.out.println("Trop d'arguments !");
        }
    }
}
 