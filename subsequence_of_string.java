public class subsequence_of_string {

    public static void subsequence(String str, int idx, String newsString) {
        if(idx == str.length()){
            System.out.println(newsString);
            return;
        }
        char ch = str.charAt(idx);

        subsequence(str, idx+1 , newsString+ch);

        subsequence(str, idx+1 , newsString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequence(str, 0, "");
    }
}
