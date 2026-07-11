public class TestBook {

    public static void main(String[] args) {

        Author author = new Author("Robert C. Martin", "unclebob@example.com", 'M');

        Book book = new Book("Clean Code", author, 599.00, 25);

        System.out.println("Book Name      : " + book.getName());
        System.out.println("Price          : " + book.getPrice());
        System.out.println("Quantity       : " + book.getQtyInStock());

        System.out.println("\nAuthor Details");
        System.out.println("Name           : " + book.getAuthor().getName());
        System.out.println("Email          : " + book.getAuthor().getEmail());
        System.out.println("Gender         : " + book.getAuthor().getGender());

    }

}