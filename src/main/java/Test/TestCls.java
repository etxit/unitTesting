package Test;

public class TestCls {

    // Right click TestCls > Go To > Test > Create new test

    static int Topla(int a, int b)
    {
        int netice = a + b;
        return netice;
    }

    static int Faktorial(int a)
    {
        int netice = 1;
        for (int i = 1; i <= a; i++)
        {
            netice *= i;
        }
        return netice;
    }

    static String tersAd(String ad)
    {
        String tersad = "ab";
        for(int i = ad.length()-1; i <= 0; i--)
        {
           tersad += ad.charAt(i);
        }
        return tersad;
    }
}
