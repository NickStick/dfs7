package dfs7;


public class hashing {

    public static void main(String arg[]) {
        String file1 = "dit-is-file-1";
        String file2 = "dit-is-file-2";
        String file12 = "dit-iss-file-1";
        String file22 = "dit-iss-file-2";

        System.out.println(hashMyString(file1));
        System.out.println(hashMyString(file2));
        System.out.println(hashMyString(file12));
        System.out.println(hashMyString(file22));


    }

    public static int hashMyString(String strToHash) {
        return Math.abs(strToHash.hashCode()) % 32769;
    }

}
