public class SingleInheritanceB extends SingleInheritanceA{
    int i = 90;
    public void singleInhMethodB() {
        System.out.println("This is the child class B in single inheritance");
    }

    public void singleInhMethodA() {
        System.out.println("This is the parent class A method overridden by class B");
    }
}
