package java8.interfacechanges;

public class Driver {
    public static void main(String[] args) {
        InterfaceChanges object = new InterfaceChanges.Implementor();
        System.out.println(object.newFeature_defaultMethod());
        System.out.println(InterfaceChanges.newfeature_staticMethod());
    }
}
