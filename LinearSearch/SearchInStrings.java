public class SearchInStrings {
    public static void main(String[] args){
        String str = "Rankit";
        char target = 'n';
        System.out.println(search(str, target));
    

    }
    static boolean search(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;

            }
        }
        return false;

    }
    
}
