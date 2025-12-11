public class TestBook {

    static void main(String[] args) {
        Book b1 = new Book();
        System.out.println(b1.getId());
        Book b2 = new Book();
        System.out.println(b2.getId());
        System.out.println(Book.getId());
        Book.setId(67);
        System.out.println(Book.getId());
    }
}


class Book{

    private String title;
    private static int id = 7;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Book.id = id;
    }



}