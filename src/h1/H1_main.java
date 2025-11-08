package h1;

public class H1_main {
    static void main(String[] args) {

        //variables:

        int zone = 5;
        double price = 22;

        //switch:

        switch(zone) {

            case(1):
                price = 2;
                break;
            case(2):
                price = 2.35;
                break;
            case(3):
                price = 2.85;
                break;
            case(4):
                price =2.85;
                break;
            case(5):
                price = 3.55;
                break;
            default:
                price =4;
                break;

        }
        System.out.println("Price: "+price+"€");
    }
}
