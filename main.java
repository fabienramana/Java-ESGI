import java.util.ArrayList;

class main{

    public static void main(String args[]){
        
        if(args.length == 1){
            int number = 0;
            
            try{
                number = Integer.parseInt(args[0]);
                StringBuilder s = new StringBuilder();
                s.append("0B");
                ArrayList<Integer> newList = new ArrayList<Integer>();
                while(true){
                    newList.add(number%2);
                    number /= 2;
                    if(number == 0){
                        break;
                    }
                }
                for(int i=newList.size()-1;i>=0;i--){
                    s.append(newList.get(i));
                }
                System.out.println(s);
            }
            catch(NumberFormatException e){
                System.out.println("L'argument donné n'est pas une nombre !");
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
 