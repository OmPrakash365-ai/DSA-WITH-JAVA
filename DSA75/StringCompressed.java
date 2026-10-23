package DSA75;

public class StringCompressed {
    public static int CompressedString(char[] chars){
        int read = 0;
        int write = 0;

        while(read < chars.length){
            char currChar = chars[read];
            int count = 0;

            while(read < chars.length && currChar == chars[read]){
                read++;
                count++;
            }

            chars[write] = currChar;
            write++;

            if(count > 1){
                String countString = String.valueOf(count);

                for(char c : countString.toCharArray()){
                    chars[write] = c;
                    write++;
                }
            }
        }
        return write;
    }
    public static void main(String args[]){
        char[] ch = {'a','a','b','b','c','c','c'}; 

        int result = CompressedString(ch);
        System.out.println(result);

        for(int i=0;i<result;i++){
            System.out.print(ch[i]);
        }
        System.out.println();

    }
    
}
