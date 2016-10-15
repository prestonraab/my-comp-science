/**
 * This class assigns a sound and a name to a pet.
 * The pet has a method called speak.
 * @Preston Raab
 * @October 11, 2016
 */
public class Pet
{
    private String sound = "";
    private String name = "";
    public Pet(String s, String n)
    {
        sound = s;
        name = n;
    }
    public Pet(String n)
    {
        name = n;
    }
    public void speak()
    {
        System.out.print(name + " says " + sound);
    }
    public String getSound()
    {
        return sound;
    }
    public String getName()
    {
        return name;
    }
}


