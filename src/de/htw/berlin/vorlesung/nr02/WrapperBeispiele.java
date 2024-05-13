package de.htw.berlin.vorlesung.nr02;

public class WrapperBeispiele {

    public static void main(String[] args) {
        int i = 288;
        Integer iWrap = new Integer(i);
        Integer iWrap2 = Integer.valueOf(i);
        Integer iWrap3 = Integer.valueOf("288");
        Integer iWrap4 = Integer.parseInt("288");
        Integer iWrap5 = iWrap2;

        Integer x = 288;

        float f = 2;

        System.out.print("i == iWrap2: ");
        System.out.print("Vermutung false - Ergebnis ");
        System.out.println(i == iWrap2);

        System.out.println("--------------------");

        System.out.print("iWrap2 == iWrap3: ");
        System.out.print("Vermutung false - Ergebnis ");
        System.out.println(iWrap2 == iWrap3);

        System.out.println("--------------------");

        System.out.print("iWrap2.equals(iWrap3): ");
        System.out.print("Vermutung true - Ergebnis ");
        System.out.println(iWrap2.equals(iWrap3));
    }
}
