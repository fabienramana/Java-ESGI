class main{

    public static void main(String args[]){
        if(args.length == 1){
            System.out.println(args[0]);
            if(args[0] == "1"){
            //    if(args[0].equals("1")){
                    System.out.println("0");
              //  }
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
 