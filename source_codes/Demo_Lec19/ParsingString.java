public class ParsingString{
    public static void main(String [] args){
        String str = "This line composed of a few words!";
        String [] words = str.split(" ");
        for (int i = 0; i < words.length; i++)
            System.out.print(words[i] + ", ");
        char [] chars = str.toCharArray();
        System.out.println();
        for (int i = 0; i < chars.length; i++)
            System.out.print(chars[i]+ ", ");
        System.out.println();    
    }
}