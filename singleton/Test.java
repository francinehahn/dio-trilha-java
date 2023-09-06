//Padrão de projeto singleton

public class Test {
    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstancia();
        System.out.println("Singleton Lazy: " + singletonLazy);
        System.out.println("New Singleton Lazy: " + SingletonLazy.getInstancia());

        SingletonEager singletonEager = SingletonEager.getInstancia();
        System.out.println("Singleton Eager: " + singletonEager);
        System.out.println("New Singleton Eager: " + SingletonEager.getInstancia());

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println("Singleton Lazy Holder: " + singletonLazyHolder);
        System.out.println("New Singleton Lazy Holder: " + SingletonLazyHolder.getInstancia());
    }
}
