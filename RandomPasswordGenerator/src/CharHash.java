import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;

public class CharHash {
    public static void main(String[] args) throws Exception {
        ArrayList<String> password = new ArrayList<String>();
        String pswd = "";
        
        Random rand = new Random();

        for(int i = 0; i < 12; i++){
            
            password.add(randomCharacterGenerator());
        }

        for(int j = 0; j < 3; j++){
            int num1 = rand.nextInt(0, 12);
            password.set(num1, randomIntegerGenerator());
        }

        for(int k = 0; k < 3; k++){
            int num2 = rand.nextInt(0, 12);
            password.set(num2, randomSymbolGenerator());
        }

        for (String i: password){
            pswd = pswd.concat(i);
        }

        System.out.println(pswd);

    }    

        



        

    

    public static String randomCharacterGenerator() {
        String character;
        int num;
        Random rand = new Random();
        
        HashMap<Integer, String> characterMap = new HashMap<Integer, String>();

        characterMap.put(1, "A");
        characterMap.put(2, "B");
        characterMap.put(3, "C");
        characterMap.put(4, "D");
        characterMap.put(5, "E");
        characterMap.put(6, "F");
        characterMap.put(7, "G");
        characterMap.put(8, "H");
        characterMap.put(9, "I");
        characterMap.put(10, "J");
        characterMap.put(11, "K");
        characterMap.put(12, "L");
        characterMap.put(13, "M");
        characterMap.put(14, "N");
        characterMap.put(15, "O");
        characterMap.put(16, "P");
        characterMap.put(17, "Q");
        characterMap.put(18, "R");
        characterMap.put(19, "S");
        characterMap.put(20, "T");
        characterMap.put(21, "U");
        characterMap.put(22, "V");
        characterMap.put(23, "W");
        characterMap.put(24, "X");
        characterMap.put(25, "Y");
        characterMap.put(26, "Z");
        
        num = rand.nextInt(1, 27);
        character = characterMap.get(num);
        
        return character;
        
    }

    
    public static String randomIntegerGenerator() {
        String num;
        int randNum;

        Random rand = new Random();
        
        HashMap<Integer, String> integerMap = new HashMap<Integer, String>();

        integerMap.put(1, "1");
        integerMap.put(2, "2");
        integerMap.put(3, "3");
        integerMap.put(4, "4");
        integerMap.put(5, "5");
        integerMap.put(6, "6");
        integerMap.put(7, "7");
        integerMap.put(8, "8");
        integerMap.put(9, "9");
        integerMap.put(10, "0");
        
        randNum = rand.nextInt(1, 11);
        num = integerMap.get(randNum);
        
        return num;
        
    }

    
    public static String randomSymbolGenerator() {
        String symbol;
        int num;

        Random rand = new Random();
        
        HashMap<Integer, String> symbolMap = new HashMap<Integer, String>();

        symbolMap.put(1, "_");
        symbolMap.put(2, "!");
        symbolMap.put(3, "@");
        symbolMap.put(4, "#");
        symbolMap.put(5, "$");
        symbolMap.put(6, "%");

        num = rand.nextInt(1, 7);
        symbol = symbolMap.get(num);
        
        return symbol;
        
    }
}
