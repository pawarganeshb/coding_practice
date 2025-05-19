package strings;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String str = "engineering";
        int[] processed = new int[256];

        for(char ch :str.toCharArray()){
            processed[ch]++;
        }

        for(int i = 0; i < processed.length; i++){
            if(processed[i] > 1){
                System.out.println((char)i+":"+processed[i]);
            }
        }
    }
}
