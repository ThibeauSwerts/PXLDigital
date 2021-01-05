package be.pxl.h7.oef2;

public class KaartApp
{
    public static void main(String[] args)
    {
        Kaart[] kaartspel = new Kaart[52];

        int i=0;
        for (Soort soort: Soort.values())
        {
            for (Waarde waarde : Waarde.values())
            {
                kaartspel[i] = new Kaart(soort, waarde);
                i++;
            }
        }
    }
}
