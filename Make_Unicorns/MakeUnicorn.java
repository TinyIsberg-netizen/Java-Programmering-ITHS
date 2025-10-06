package Make_Unicorns;
public class MakeUnicorn {

    public static void main(String[] args) {
        Unicorn bengt = new Unicorn(5, "Blå", "Glad", true, true);
<<<<<<< HEAD:Make_Unicorns/MakeUnicorn.java
        Unicorn ilse = new Unicorn(4, "Gul", "Likgiltlig", false, true);
/*
        System.out.println("This is Bengt:");
        System.out.println(bengt.getAge());
        bengt.setAge(6);
        System.out.println(bengt.getAge());
*/
        
        System.out.println("Is this a unicorn");

        if (ilse.horn == true) {
            System.out.println("Ilse is a unicorn");
        }
        else {
            System.out.println("Ilse is an imposter! She is just a horse with a dream!");
=======
        Unicorn ilse = new Unicorn(4, "Gul", "Likgiltig", true, false);

        isThisAUnicorn(ilse);
        isThisAUnicorn(bengt);
    }

    static void isThisAUnicorn(Unicorn name) {
            System.out.println("Is this a unicorn? ");

        if (name.horn == true){
            System.out.println(name + " is a unicorn");
        }
        else{
            System.out.println(name + " is an imposter! It's just a horse with a dream!");
>>>>>>> e4ae8c770eff8545e69527e453e5c8400cdf2c0c:MakeUnicorns.java
        }
         
    
    }
}
