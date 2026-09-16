public class Main {

    public static void main(String[] args) {
        byte box1 = 1; // 1
        short box2 = 4; // 2
        int box3 = 4; // 4
        long box4 = 8; // 8
        char box5 = 'a'; // 2
        boolean box6 = true; // 1
        float box7 = 44.4f; // 4
        double box8 = 88.8; // 8

        box3 = box1;

        System.out.println(box3);

        box3 = (int)box4;

        System.out.println(box3);
    }

}
