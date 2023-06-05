public class use_of_string {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("babu");
        System.out.println(str);

        // chsar at index 1
        System.out.println(str.charAt(1)); 
        System.out.println(str.charAt(3));

        // this is use to replace the words at any index.
        str.setCharAt(0, 'B');
        str.setCharAt(1, 'A');
        str.setCharAt(2, 'B');
        str.setCharAt(3, 'U');
        System.out.println(str);

        // this function is use to  insert a word at any index.
        str.insert(0,'K');
        System.out.println(str);

        // this function is use to delete the words.
        str.delete(2, 5);
        System.out.println(str);

        // this is use to append the word at last of the string.
        str.append('A');
        str.append('B');
        str.append('U');
        System.out.println(str);
        System.out.println(str.length());
        str.delete(0, 1);
        str.reverse();
        System.out.println(str);
        System.out.println();

        // for loop to reverse the a string.
        for(int i=0; i<str.length()/2; i++){
            int front = i;
            int back = str.length()-1-i;

            char frontchar = str.charAt(front);
            char backchar = str.charAt(back);

            str.setCharAt(front, backchar);
            str.setCharAt(back , frontchar);
        }
        System.out.println(str);
    }
}
