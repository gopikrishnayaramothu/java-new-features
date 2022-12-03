package java8.interfacechanges;

public interface InterfaceChanges {

    default String newFeature_defaultMethod(){
        return "It's a nee feature in java"+ newfeature_staticMethod();
    }

    static String newfeature_staticMethod() {
        return "It's a new feature in java 8 - static methods . You should have only one way to call me i.e Interfacename.myname :) ";
    }

    class Implementor implements InterfaceChanges {

        @Override
        public String newFeature_defaultMethod() {
            return "It's been called from implementor ";
        }
    }
}
