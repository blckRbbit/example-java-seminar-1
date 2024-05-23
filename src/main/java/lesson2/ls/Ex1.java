package lesson2.ls;

public class Ex1 {


    public static void main(String[] args) {

    }

    private static void foo(String[] arr) {

        int count = 0;

//        FileReader reader = null;
        try {
//            reader = new FileReader("vlkahgo");
            for (String elem: arr) {
                count+= Integer.parseInt(elem);
            }
        } catch (NumberFormatException e) {
            count = -1;
            System.out.println("Error");
        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
        finally {
            System.out.println("Finally block");
//            try {
//                reader.close();
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
        System.out.println(count);
    }


    private static boolean palyndrom(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.reverse().toString().equals(s)) return true;
        else return false;
    }
}
