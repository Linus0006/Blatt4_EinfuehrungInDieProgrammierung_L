package h2;

public class H2_main {
    static void main(String[] args) {

        //variables:

        boolean x = true;
        boolean y = true;
        boolean a = true;
        boolean b = true;
        boolean c = true;

        int input = 11; //kann nur folgende Werte annehmen: 0, 1, 10, 11

        boolean E3 = (x =! y);

        if (input == 10 || input ==11){
            x = true;
        }
        else {
            x = false;
        }
        if (input == 11 || input == 1){
            y = true;
        }
        else {
            y = false;
        }
        if (x && y){
            a = true;
        }
        else{
            a = false;
        }
        if (x || E3){
            b = true;
        }
        else{
            b = false;
        }
        if ((!x && !y) || x && !y){
            c = true;
        }
        else{
            c = false;
        }

        System.out.println("a: "+a+ " b: "+b+" c: "+c+" x: "+x+" y:"+y+" Input: "+input);
    }
}
