public class Method
{
    public void publicMethod()
    {
        String name="hello world";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Method obj=new Method();
        obj.publicMethod();
    }
}
