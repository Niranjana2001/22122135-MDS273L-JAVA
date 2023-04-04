import java.util.*;
import java.io.*;
public class lab6 {
    static int[] vowelcount (String word){
        int a=0;int e=0;int i=0;int o=0;int u=0;
        int[] vowelcount=new int[5];
        String w=word.toLowerCase();
        for (int k=0;k<w.length();k++){
            switch(w.charAt(k)){
                case 'a':
                a+=1;
                break;
                case 'e':
                e+=1;
                break;
                case 'i':
                i+=1;
                break;
                case 'o':
                o+=1;
                break;
                case 'u':
                u+=1;
                break;
            }
            vowelcount[0]=a;
            vowelcount[1]=e;
            vowelcount[2]=i;
            vowelcount[3]=o;
            vowelcount[4]=u;
        }
        return vowelcount;
        
    }
    static int[] digitcount(String word){
        int zero=0;int one=0;int two=0;int three=0;int four=0;int five=0;int six=0;int seven=0;int eight=0;int nine=0;
        int[] digitcount=new int[10];
        for(int i=0;i<word.length();i++){
            switch(word.charAt(i)){
                case '0':
                zero+=1;
                break;
                case '1':
                one+=1;
                break;
                case '2':
                two+=1;
                break;
                case '3':
                three+=1;
                break;
                case '4':
                four+=1;
                break;
                case '5':
                five+=1;
                break;
                case '6':
                six+=1;
                break;
                case '7':
                seven+=1;
                break;
                case '8':
                eight+=1;
                break;
                case '9':
                nine+=1;
                break;
            }
            digitcount[0]=zero;
            digitcount[1]=one;
            digitcount[2]=two;
            digitcount[3]=three;
            digitcount[4]=four;
            digitcount[5]=five;
            digitcount[6]=six;
            digitcount[7]=seven;
            digitcount[8]=eight;
            digitcount[9]=nine;  
        }
        return digitcount;
    }
    static void repeatedwords(String[] words) {
        int[] countofwords = new int[words.length];
        String[] repeat = new String[5];
        int[] maxcount = new int[5];
        
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(words[i])) {
                    count++;
                }
            }
            countofwords[i] = count;
        }
    
        for (int k = 0; k < 5; k++) {
            int highest = -1;
            String repeatedword = null;
            for (int i = 0; i < countofwords.length; i++) {
                if (countofwords[i] > highest) {
                    highest = countofwords[i];
                    repeatedword = words[i];
                }
            }
            maxcount[k] = highest;
            repeat[k] = repeatedword;
           
            
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(repeatedword)) {
                    countofwords[i] = -1;
                }
            }
            
        }
    
        System.out.println(Arrays.toString(maxcount));
        System.out.println(Arrays.toString(repeat));
    }
    
    static void leastrepeatedwords(String[] words) {
        int[] countofwords = new int[words.length];
        String[] repeat = new String[5];
        int[] mincount = new int[5];
        
    
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(words[i])) {
                    count++;
                }
            }
            countofwords[i] = count;
        }
    
        
        for (int l = 0; l < 5; l++) {
            int lowest = Integer.MAX_VALUE;
            String repeatedword = null;
            for (int i = 0; i < countofwords.length; i++) {
                if (countofwords[i] < lowest && countofwords[i] >= 0) {
                    lowest = countofwords[i];
                    repeatedword = words[i];
                }
            }
            mincount[l] = lowest;
            repeat[l] = repeatedword;
            
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(repeatedword) && countofwords[i] == lowest) {
                    countofwords[i] = Integer.MAX_VALUE;
                }
            }
        }
    
        System.out.println(Arrays.toString(mincount));
        System.out.println(Arrays.toString(repeat));
    }
    static void repeatedCharacters(String[] words) {
        int[] countOfChars = new int[128]; 
        char[] repeat = new char[5];
        int[] maxCount = new int[5];
        
        
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                countOfChars[word.charAt(i)]++;
            }
        }
        
        
        for (int k = 0; k < 5; k++) {
            int highest = -1;
            char repeatedChar = ' ';
            for (int i = 0; i < countOfChars.length; i++) {
                if (countOfChars[i] > highest) {
                    highest = countOfChars[i];
                    repeatedChar = (char) i;
                }
            }
            maxCount[k] = highest;
            repeat[k] = repeatedChar;
           
            
            countOfChars[repeatedChar] = -1;
        }
        
        System.out.println(Arrays.toString(maxCount));
        System.out.println(Arrays.toString(repeat));
    }
    static void leastRepeatedCharacters(String[] words) {
        int[] countOfChars = new int[128]; 
        char[] repeat = new char[5];
        int[] minCount = new int[5];
        Arrays.fill(minCount, Integer.MAX_VALUE);
        
        
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                countOfChars[word.charAt(i)]++;
            }
        }
        
        
        for (int k = 0; k < 5; k++) {
            int lowest = Integer.MAX_VALUE;
            char repeatedChar = ' ';
            for (int i = 0; i < countOfChars.length; i++) {
                if (countOfChars[i] > 0 && countOfChars[i] < lowest) {
                    lowest = countOfChars[i];
                    repeatedChar = (char) i;
                }
            }
            minCount[k] = lowest;
            repeat[k] = repeatedChar;
            
            
            countOfChars[repeatedChar] = -1;
        }
        
        System.out.println(Arrays.toString(minCount));
        System.out.println(Arrays.toString(repeat));
    }
    
    
    public static void main(String [] args){
        String line;
        String character;
        int[] totalvowelcount=new int[5];
        int[] totaldigitcount=new int[10];
        String[] words=new String[]{};
        try{
            File file=new File("C:/Users/niran/Downloads/text.txt");
            Scanner read=new Scanner(file);
            while(read.hasNextLine()){
                character=read.nextLine();
                
                int[] v=vowelcount(character);
                for (int i=0;i<v.length;i++){
                    totalvowelcount[i]+=v[i];
                }
                int[] d=digitcount(character);
                for (int i=0;i<v.length;i++){
                    totaldigitcount[i]+=d[i];
                }
                words=character.split("[^a-zA-Z]+");
            
                // System.out.println(Arrays.toString(words));
                

            };
            
           
               
            System.out.println("Digits:\n0:"+totaldigitcount[0]+"\n1:"+totaldigitcount[1]+"\n2:"+totaldigitcount[2]+"\n3:"+totaldigitcount[3]+"\n4:"+totaldigitcount[4]+"\n5:"+totaldigitcount[5]+"\n6:"+totaldigitcount[6]+"\n7:"+totaldigitcount[7]+"\n8:"+totaldigitcount[8]+"\n9:"+totaldigitcount[9]); 
            System.out.println("Vowels:\na:"+totalvowelcount[0]+"\ne:"+totalvowelcount[1]+"\ni:"+totalvowelcount[2]+"\no:"+totalvowelcount[3]+"\nu:"+totalvowelcount[4]); 
            System.out.println("Top 5 repeated words : ");
            repeatedwords(words);
            System.out.println("Least 5 repeated words : ");
            leastrepeatedwords(words);
            System.out.println("Top 5 repeated characters : ");
            repeatedCharacters(words);
            System.out.println("Least 5 repeated characters : ");
            leastRepeatedCharacters(words);
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }
}
    

