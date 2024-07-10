package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna eläintarhalle nimi:");
        String zooName = sc.nextLine();
        Zoo zoo = new Zoo();
        
        boolean exit = false;

        while(!exit) {
            System.out.println( "1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");
            
            if(sc.hasNext()){
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Mikä laji?");
                        String species = sc.nextLine();
                        System.out.println("Anna eläimen nimi:");
                        String name = sc.nextLine();
                        System.out.println("Anna eläimen ikä:");
                        String stringAge = sc.nextLine();
                        int age = Integer.parseInt(stringAge);

                        Animal animal = new Animal(species, name, age);
                        
                        zoo.AddAnimal(animal);
                        break;

                    case 2:
                        System.out.println(zooName + " pitää sisällään seuraavat eläimet:");
                        zoo.listAnimals();
                        break;

                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        String stringLaps = sc.nextLine();
                        int laps = Integer.parseInt(stringLaps);

                        zoo.runAnimals(laps);
                        break;

                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                        
                }
            }
        }
        sc.close();
    }
}
