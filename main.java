class main{

    public static void main(String args[]){
        
        if(args.length == 1){
            int number = 0;
            
            try{
                number = Integer.parseInt(args[0], 2);
            }
            catch(NumberFormatException e){
                System.out.println("L'argument donné n'est pas une nombre !");
            }
            System.out.println(number);
        }
        else if(args.length == 0){
            System.out.println("Pas d'arguments !");
        }
        else{
            System.out.println("Trop d'arguments !");
        }
    }
}
 