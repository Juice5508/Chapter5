package Chapter5;

public class Buzz {

    public static void baffle(String blimp) {
        System.out.println(blimp);
        zippo("ping", -5); //ping
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) { //2
            System.out.println(quince + " zoop");
        } else {
            System.out.println("ik");
            baffle(quince);
            System.out.println("boo-wa-ha-ha");
        }
    }

    public static void main(String[] args) {
        zippo("rattle", 13); //1
    }

}
//ik
//rattle
//ping zoop
//boo-wa-ha-ha
