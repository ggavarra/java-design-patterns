package org.gg.dp.singleton;

//
// https://dzone.com/articles/java-singletons-using-enum
enum EnumSingleton {

    INSTANCE;
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}