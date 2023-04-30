import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println("Here i calculate the roman integers: ");
        RomanToInteger roint = new RomanToInteger();
        String romanValue = "IV";
        System.out.println(roint.romanToInt(romanValue));
        
    }
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>(); //Hier wird eine Map erstellt und die Werte werden dann gemappt
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int res = 0;
        for(int i = 0; i < s.length()-1; i++){//Gehe durch alle Chars im Array 
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) res -= map.get(s.charAt(i));//Wenn z.B erste stelle kleiner ist als zweite Stelle im String dann mach 0-1 = -1
            else res += map.get(s.charAt(i));                                               
        }
        return res + map.get(s.charAt(s.length()-1));                                   //Nimm das V und mache -1+5 = 4  also ist res = 4 und das wird zurückgegeben
    }
}
