public class Main {
    public static void main(String[] args) {
        Double itemPrice;
        Double saleTax=0.05;
        Double finalPrice;
        System.out.println("What's your price?");
        itemPrice= 12.0;
        finalPrice= itemPrice - itemPrice * saleTax;
        System.out.println("Your total after tax is "+finalPrice);
    }
}