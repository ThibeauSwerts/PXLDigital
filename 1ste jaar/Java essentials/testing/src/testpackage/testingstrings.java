package testpackage;

public class testingstrings
{
    public static void main(String[] args)
    {
        String naam1 = namesetter("thibeau");
        String naam2 = namesetter("swErTs");

        System.out.println(naam1);
        System.out.println(naam2);

        String initialen = naam1.charAt(0) + "." + naam2;
        System.out.println(initialen);

    }

    public static String namesetter(String name)
    {
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        return name;
    }
}
