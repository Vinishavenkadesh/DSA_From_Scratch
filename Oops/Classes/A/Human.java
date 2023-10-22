package Classes.A;

class Human{
    
    int age;
    String name;
    int rollnum;
    static long population;

    public Human(int age, String name, int rollnum) {
        this.age = age;
        this.name = name;
        this.rollnum = rollnum;
        Human.population += 1;
    }

}