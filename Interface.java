
interface Vechicle
{
    public void Start();
    public void Stop();
}
interface Electric
{
    void Charge battery();
}
class Electric Vechicle implements Vechicle,Electric{
    public void Start()
    {
        System.out.println("Car is Starting");
    }
    public void Stop()
    {
        System.out.println("Car is Stopping");
    }
 public void Charge battery()
 {
    System.out.println("Car is Charging");
 }   
}
class CarMain
{
    public static void main(String[] args)
    Car C=new Car();
    C.Start();
    C.Stop();
    C.Charge();
}
