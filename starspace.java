
public class starspace {

    public static void main(String[] args) {
        int stars = 7;
        int spaces = 0;

        for (int i = stars; i >= 1; i -= 2) {

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces++;
        }
        spaces -= 2;

        for (int i = 3; i <= stars; i += 2) {
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
        }
    }
}
