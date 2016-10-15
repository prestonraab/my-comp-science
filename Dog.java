/**
 * This class assigns a dog a sound and a name.
 * The dog has a method called speak.
 * @Preston Raab
 * @October 11, 2016
 */
public class Dog extends Pet
{
    private String sound;
    private String name;
    public Dog(String s, String n)
    {
        super(s,n);
    }
    public Dog(String n)
    {
        super(n);
        this.sound = "bark";
    }
    public void speak()
    {
        super.speak();
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
