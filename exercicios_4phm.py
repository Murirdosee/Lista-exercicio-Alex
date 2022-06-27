public class exercicio_5 {
    
public static void main(String[] args) {
    for (int i = 2; i <= 123; i++){
        if (primo(i))
        System.out.println(i);
    }
}  

public static boolean primo(int x){
    
    for (int z = 2; z < x; z++) {
        if (x % z == 0)
        return false;
    }
    return true;
 }
}