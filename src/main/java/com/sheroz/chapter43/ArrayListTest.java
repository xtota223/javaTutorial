package com.sheroz.chapter43;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {


  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();

    animals.add(new Animal("dog", "Hot dog ", 23));
    animals.add(new Animal("tigger", "sher ", 12));
    animals.add(new Animal("cat", "kissa", 8));
    animals.add(new Animal("dolphin", "alex", 4));
    animals.add(new Animal("bird", "kesha", 2));

    printArray(animals);
    animals.add(2, new Animal("bag", "bager", 1));
    printArray(animals);
    animals.remove(4);
    printArray(animals);
    animals.set(2, new Animal("bag", "bager 2 ", 1));
    printArray(animals);


    animals.add(animals.size(), new Animal("bag", "bager 3 ", 1));
    printArray(animals);

  }

  static void printArray(List lis) {
    for (Object obj: lis) {
      System.out.println(obj );
    }
    System.out.println("\n\n" );
  }


  static class Animal {
    private String type;
    private String name ;
    private Integer age;

    public Animal(String type, String name, Integer age) {
      this.type = type;
      this.name = name;
      this.age = age;
    }

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public Integer getAge() {
      return age;
    }

    public void setAge(Integer age) {
      this.age = age;
    }

    @Override
    public String toString() {
      return "Animal{" +
          "type='" + type + '\'' +
          ", name='" + name + '\'' +
          ", age=" + age +
          '}';
    }
  }

}
