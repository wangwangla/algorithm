package kw.java.string;

public class StringCompression {
    public int stringCompression(String str){
        char[] chars = str.toCharArray();
        String end = "";
        int count = 0;
        char old = chars[0];
        for (char aChar : chars) {
            if (aChar == old){
                count ++;
            }else {
                end += old+"";
                if (count>1) {
                    end = end + count+"";
                }
                old = aChar;
                count = 1;
            }
        }
        end =end + old;
        if (count > 1){
            end =end + count+"";
        }
        System.out.println(end.toString());
        return end.length();
    }

    public static void main(String[] args) {
        StringCompression compression = new StringCompression();
        String str = "abcccd";
        compression.stringCompression(str);
    }
}
