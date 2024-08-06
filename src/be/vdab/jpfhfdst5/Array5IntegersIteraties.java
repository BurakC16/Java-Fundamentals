package be.vdab.jpfhfdst5;

public class Array5IntegersIteraties {
    public static void main(String[] args) {
        var getallen = new int[5];
        var som = 0;
        for (var i = 0; i < getallen.length; i++) {
            getallen[i] = (int)(Math.random()*100) + 1;
            som = som + getallen[i];
        }
        var gemiddelde = (float) som/getallen.length;
        for (var i = 0; i < getallen.length; i++) {
            System.out.println(getallen[i]);
        }
        System.out.println("Som = " + som);
        System.out.println("Gemiddelde = " + gemiddelde);
    }
}
