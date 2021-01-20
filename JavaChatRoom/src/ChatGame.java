public class ChatGame {
    int count;

    public ChatGame(){
        count = 1;
    }
    public boolean checkNumber(int i){
        if(i == count){
            count++;
            return true;
        }
        return false;

    }
    public static boolean isNumeric(String str) { 
        try {  
          Integer.parseInt(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }

}
