package Abstracta;

public class Perro extends Animal{
    public Perro(String name){
        Super.setname(name);

    }
    public String TipoAnimal(){
        return"El animal es un perro. se llma "+super.getname();
    }
}
