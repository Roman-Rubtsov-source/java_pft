public class Main {

    public static void main(String[] args) {
//        System.out.printf("Its a \\n",'\f');
//        System.out.println("Hello, suckers2!");
        do_smthing(new String[]{"Gr123", "Gr456", "Gr789"});

    }

    public static void do_smthing(String[] strs) {
        String str;
        for (String str2 : strs) {
            System.out.println("item=" + str2);
        }

    }
}



