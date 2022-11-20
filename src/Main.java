public class Main {
    public static void main(String[] args) {
        Cat murzik = new Cat( "Мурзик");
  //      murzik.age = 3 ;
 //       murzik.meow();
 //       System.out.println(murzik.getName());



        Cat begemot = new Cat("Бегемот", -5 );
 //       begemot.age = -5;
          begemot.setName(null);
        begemot.meow();

 //       System.out.println("У кота " + murzik.name + " " + murzik.getFriends().length + " друзей");

          murzik.addFriend(begemot);
          System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");

 //         murzik.friends[0].meow();

    }
}