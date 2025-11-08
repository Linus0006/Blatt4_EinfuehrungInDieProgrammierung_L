package h3;

public class H3_main {
    static void main(String[] args) {
        float celsiusFloat = 14.2F;
        float fahrenheitFloat = 12;
        double celsiusDouble = 14.2;
        double fahrenheitDouble = 11;

        //nur double:

        fahrenheitDouble = celsiusDouble* 9/5 + 32;
        fahrenheitFloat = celsiusFloat* 9/5 + 32;

        System.out.println("Double: "+fahrenheitDouble+" Float: "+fahrenheitFloat);

    }
}
