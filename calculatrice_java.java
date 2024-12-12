import java.util.Scanner;
public class Calculatrice {

    private double number1;
    private double number2;

    public void entrenumbers(){

            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez le premier nombre: ");
            this.number1 = scanner.nextDouble();
            System.out.print("Entrez le deuxième nombre: ");
            this.number2 = scanner.nextDouble();
                            }

    // l'addition
    public void addition() {
        this.entrenumbers();
        System.out.println("la soustraction est :"+ (this.number1 + this.number2));
     }

    // soustraction
    public  void soustraction() {
        this.entrenumbers();
        System.out.println("la soustraction est :"+ (this.number1 - this.number2));
    }

    // multiplication
    public  void multiplication() {
            this.entrenumbers();
            System.out.println("la multiplication est :"+ (this.number1 * this.number2));
        }

    //division
        public void division() {
            this.entrenumbers();
            if (this.number2 == 0) {
                System.out.println("Erreur: Division par zéro.");
            } else {
                 System.out.println("la division: "+(this.number1 / this.number2));
            }
        }

    // la puissance
        public void puissance() {
            this.entrenumbers();
            System.out.println( "la puissance est : "+ Math.pow(this.number1, this.number2));
        }

    // racine carree
        public void  racineCarree() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez le nombre  ");
            this.number1 = scanner.nextDouble();
            if (this.number1 < 0) {
                System.out.println("Erreur: Racine carrée d'un nombre négatif.");
            }
            else {
              System.out.println(Math.sqrt(this.number1));
            }
        }
    // factorielle
        public void factorielle() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez le nombre: ");
            this.number1 = scanner.nextDouble();

            if (this.number1< 0) {
                System.out.println("Erreur: Factorielle d'un nombre négatif.");
            }
            else {
                long result = 1;
                for (int i = 1; i <= this.number1; i++) {
                    result *= i;
                }
                System.out.println("factorielle égale:"+result);
                 }
        }

    //  le menu
    public  void afficherMenu() {
        System.out.println("\n--- Calculatrice ---");
        System.out.println("Choisissez une opération:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Soustraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Puissance");
        System.out.println("6. Racine carrée");
        System.out.println("7. Factorielle");
        System.out.println("8. Quitter");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calc=new Calculatrice();

        boolean continuer = true;

        while (continuer) {
            calc.afficherMenu();
            System.out.print("Entrez votre choix (1-8): ");
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    calc.addition();
                    break;
                case 2:
                   calc.soustraction();
                    break;
                case 3:
                   calc.multiplication();
                    break;
                case 4:
                    calc.division();
                    break;
                case 5:
                   calc.puissance();
                    break;
                case 6:
                    calc.racineCarree();
                    break;
                case 7:
                    calc.factorielle();
                    break;
                case 8:
                    System.out.println("Merci d'avoir utilisé la calculatrice !");
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide. Essayez encore.");
                    break;
            }
        }

    }

}

