public class Start {
    public static void main(String...args){
        String mySurname = "Calenda";
        String answer = mySurname.contains("ni") ? "contains" : "doesn't contain";
        System.out.println("Your surname " + answer + " the sequence f letter 'ni'.");
    }
}
