package hackerRankEvent.quesStringsVowels;
/*You are given a string containing only the alphabet. You need to make all vovel i.e. a, e, i, o, u
uppercase and consonants which is all the alphabet except vovel lowercase.*/
public class StringVowel {
    public static void main(String[] args) {
        String str = "HELLOWORLD";
        str = str.toLowerCase(); // helloworld = hEllOwOrld
        String newStr="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){

                newStr = newStr + str.toUpperCase().charAt(i);
            }
            else
                newStr = newStr + str.charAt(i);
        }
        System.out.println(newStr);

    }
}
