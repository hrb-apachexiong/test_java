package Serializable;

// --------------------- Change Logs----------------------
// <p>@author bjhexiong Initial Created at 2017-07-18<p>
// -------------------------------------------------------
public class TestThirdMu {
    public static void main(String[] args) {
        print();
        boolean r = getBoolean();
        int d = r? 1:print();
        System.out.println(d);

    }

    public static boolean getBoolean(){
        if(false){
            return false;
        }
        return true;
    }

    public static int print(){
        System.out.println("#1");
        return 2;
    }
}
