package org.gg.dp.singleton;


class EagerSingleton {

    private EagerSingleton() {
        System.out.println("Singleton instance created");
    }

    public static EagerSingleton getInstance() {
        return new EagerSingleton();

    }

}