/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming_excercises_c11.prueba;

import programming_excercises_c11.ejercicios.BookArray;
import programming_excercises_c11.ejercicios.Bridge;
import programming_excercises_c11.ejercicios.Cuadrado;
import programming_excercises_c11.ejercicios.Cuadrado2;
import programming_excercises_c11.ejercicios.DomesticDivision;
import programming_excercises_c11.ejercicios.ElementsArray;
import programming_excercises_c11.ejercicios.Fiction;
import programming_excercises_c11.ejercicios.FullTime;
import programming_excercises_c11.ejercicios.GeometryArray;
import programming_excercises_c11.ejercicios.InternationalDivision;
import programming_excercises_c11.ejercicios.MetalElement;
import programming_excercises_c11.ejercicios.NoMetalElement;
import programming_excercises_c11.ejercicios.NonFiction;
import programming_excercises_c11.ejercicios.Novel;
import programming_excercises_c11.ejercicios.Novella;
import programming_excercises_c11.ejercicios.PartTime;
import programming_excercises_c11.ejercicios.ShortStory;
import programming_excercises_c11.ejercicios.StoryDemo;
import programming_excercises_c11.ejercicios.Triangulo;
import programming_excercises_c11.ejercicios.Triangulo2;
import programming_excercises_c11.ejercicios.UseGeometric2;
import java.lang.Iterable;
import java.math.MathContext;
import programming_excercises_c11.ejercicios.BusinessLoan;
import programming_excercises_c11.ejercicios.PersonalLoan;
import programming_excercises_c11.ejercicios.CreateLoans;
import programming_excercises_c11.ejercicios.Jupiterian;
import programming_excercises_c11.ejercicios.Martian;
import programming_excercises_c11.ejercicios.Poker;
import programming_excercises_c11.ejercicios.Actor;
import programming_excercises_c11.ejercicios.Chevy;
import programming_excercises_c11.ejercicios.Child;
import programming_excercises_c11.ejercicios.Ford;
import programming_excercises_c11.ejercicios.Health;
import programming_excercises_c11.ejercicios.House;
import programming_excercises_c11.ejercicios.IncomingPhoneCall;
import programming_excercises_c11.ejercicios.Leaf;
import programming_excercises_c11.ejercicios.Life;
import programming_excercises_c11.ejercicios.Musician;
import programming_excercises_c11.ejercicios.OutgoingPhoneCall;
import programming_excercises_c11.ejercicios.Page;
import programming_excercises_c11.ejercicios.Pancake;
import programming_excercises_c11.ejercicios.PhoneCallArray;
import programming_excercises_c11.ejercicios.School;
import programming_excercises_c11.ejercicios.SevenDaySubscriber;
import programming_excercises_c11.ejercicios.WeekdaySubscriber;
import programming_excercises_c11.ejercicios.WeekendSubscribers;

public class Main {
    public static void main(String [] args){
        System.out.println("Book, Fiction & NonFiction");
        Fiction fiction = new Fiction("Cronicas de una muerte anunciada",00.0);        
        System.out.println(fiction);
        NonFiction nofiction = new NonFiction("El titanic",00.0);
        System.out.println(nofiction);
        System.out.println("\n\t\tBookArray");
        BookArray lib = new BookArray();
        lib.add(new Fiction("Agua para chocolate",(double) 1));
        lib.add(new NonFiction("Sabor a mi",(double) 4));
        lib.imprimir();
        System.out.println("\nPhoneCall & IncomingPhoneCall");
        IncomingPhoneCall incPh=new IncomingPhoneCall("965323");
        System.out.println(incPh);
        OutgoingPhoneCall outP=new OutgoingPhoneCall("563627",5);
        System.out.println(outP);
        PhoneCallArray phones = new PhoneCallArray();
        phones.add(outP);
        phones.add(incPh);
        phones.imprimir();
        
        System.out.println("\nAuto, Ford, Chevy");
        Ford f= new Ford("Ford",80000);
        System.out.println(f);
        Chevy c=new Chevy("Cheby",1000000);
        System.out.println(c);
        
        System.out.println("\nDivision, InternationalDivision & DomesticDivision");
        InternationalDivision inter = new InternationalDivision("Division 1",3423,"Mexico","Español latino");
        inter.display();
        DomesticDivision dom = new DomesticDivision("Division 2",24563,"Oaxakanda");
        dom.display();
        System.out.println("\nElement, MetalElement & NoMetalElement");
        MetalElement metal1= new MetalElement("Hierro","Fe",26,55.865f);
        MetalElement metal2= new MetalElement("Calcio","Ca",20,40.078f);
        NoMetalElement nometal=new NoMetalElement("Hidrogeno","H",1,1.00797f);
        NoMetalElement nometa2=new NoMetalElement("Helio","He",2,4.0026f);
        System.out.println(metal1);
        System.out.println(metal2);
        System.out.println(nometal);
        System.out.println(nometa2);
        System.out.println("\n\t\tElementsArray");
        ElementsArray arrayE= new ElementsArray();
        arrayE.add(metal1);
        arrayE.add(metal2);
        arrayE.add(nometal);
        arrayE.add(nometa2);
        arrayE.imprimir();
        
        System.out.println("\nNewspaperSubscriber, WeekdaySubscriber, WeekendSubscriber & SevenDaySubscriber");
        SevenDaySubscriber sevenD=new SevenDaySubscriber("Pepe");
        System.out.println(sevenD);
        WeekdaySubscriber weekS=new WeekdaySubscriber("Jack");
        System.out.println(weekS);
        WeekendSubscribers weekSs=new WeekendSubscribers("Chente");
        System.out.println(weekSs);
        
        System.out.println("\nStory, Novel, Novella, ShortStory && StoryDemo");
        Novel n1=new Novel("El cien pies humano","El Karimnot",500);
        Novella nl1=new Novella("Sol","Augusto",69);
        ShortStory sh1=new ShortStory("EL bueno, el malo y el feo","Francisco",20);
        //sin las reglas
        Novel n2=new Novel("50 sombras2","Karimnot",50);
        Novella nl2=new Novella("El cien pies humano","El Karimnot",500);
        ShortStory sh2=new ShortStory("EL bueno, el malo y el feo","Francisco",20);
        StoryDemo sd = new StoryDemo();
        sd.add(n1);
        sd.add(n2);
        sd.add(nl1);
        sd.add(nl2);
        sd.add(sh1);
        sd.add(sh2);
        sd.imprimir();
        
        System.out.println("\nTurner, Leaf, Page, Pancake");
        Leaf leaf=new Leaf();
        leaf.turn();
        Page page=new Page();
        page.turn();
        Pancake pank=new Pancake();
        pank.turn();
        
        System.out.println("\nLife, Health & Insure");
        Health health=new Health("Vida");
        Life life=new Life("Salud");
        System.out.println(health);
        System.out.println(life);
        
        System.out.println("\nGeometicFigure, Cuadrado, Triangulo, GeometryArray");
        Cuadrado cua = new Cuadrado(5,5,"Cuadrado");
        Triangulo tri = new Triangulo(12,3,"Triangulo");
        GeometryArray geom=new GeometryArray();
        geom.add(tri);
        geom.add(cua);
        geom.imprimir();
        
        System.out.println("\nGeometricFigure2, Cuadrado2, Triangulo2, SidedObject &UseGeometric");
        Cuadrado2 cuad2=new Cuadrado2(9,10,"Cuadrado");
        Triangulo2 tria2 = new Triangulo2(1,4,"Triangulo");
        UseGeometric2 useG=new UseGeometric2();
        useG.add(tria2);
        useG.add(cuad2);
        useG.imprimir();
        
        System.out.println("\n\t\tPlayer, Child, Actor & Musician");
        Child ch=new Child();
        ch.play();
        Musician m=new Musician();
        m.play();;
        Actor a=new Actor();
        a.play();
        
        System.out.println("\n\t\t Student, FullTime & PartTime");
        FullTime full=new FullTime("Victor",true);
        PartTime part = new PartTime("Manuel",true);
        System.out.println(full);
        System.out.println(part);
        
        System.out.println("\nBuilding, Horse & School");
        House ho=new House(1000,"Moderna",10,343);
        System.out.println(ho);
        School sc=new School(21,"Fecha debajo de un cementerio",10,"Karimnot");
        System.out.println(sc);
        
        System.out.println("\nLoan, LoanConstants, BusinessLoan, PersonalLoan & CreateLoans");
        BusinessLoan busin = new BusinessLoan(1,"Tino",5900,1);
        BusinessLoan busin2 = new BusinessLoan(2,"Barenkakas",1108,2);
        PersonalLoan per1=new PersonalLoan(3,"Héctor",1000,3);
        PersonalLoan per2=new PersonalLoan(4,"Suarez",24000,4);
        CreateLoans arreglo=new CreateLoans();
        arreglo.add(busin);
        arreglo.add(busin2);
        arreglo.add(per1);
        arreglo.add(per2);
        arreglo.imprimir();
        
        System.out.println("\nMartian");
        Martian marciano=new Martian();
        System.out.println(marciano);
        Jupiterian jupiter = new Jupiterian();
        System.out.println(jupiter);
        
        System.out.println("\nPoker");
        Poker poker = new Poker();
        Bridge bridge=new Bridge();
        System.out.println(poker.displayDescription());
        System.out.println(bridge.displayDescription());
    }
}
