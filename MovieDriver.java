import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		do {
		
			Movie movie = new Movie();
			
			System.out.print("Enter the title of the movie: \n");
			String title = scanner.nextLine();
			movie.setTitle(title);
			
			System.out.print("Enter the rating of the movie: \n");
			String rating = scanner.nextLine();
			movie.setRating(rating);
			
			System.out.print("Enter the number of tickets sold: \n");
			int ticketsSold = scanner.nextInt();
			movie.setSoldTickets(ticketsSold);
			
			System.out.println(movie.toString());
			
			scanner.nextLine(); 
			
			System.out.print("\nDo you want to enter another movie? (y/n): \n");
			String choice = scanner.nextLine();
			if (!choice.equalsIgnoreCase("y") || !choice.equalsIgnoreCase("Y")) {
				System.out.println("Goodbye");
				break;
			}
		}while (true); 
		scanner.close();
	}
}
