public class BookListUser {
    public static Book findNewest(ReadingList r1){

        Book newest = null;

        int year = 0;

        for (Book b: r1.getBooks()) {
            if (year < b.getYear()){
                year = b.getYear();
                newest = b;
            }
        }

        return newest;
    }

    public static void main(String[] args) {
        Book b1 = new Book("a","a",1);
        Book b2 = new Book("b","a",2);
        Book b3 = new Book("c","a",3);

        ReadingList rlist = new ReadingList("A",new Book[]{b1,b2,b3});
        System.out.println(rlist);
        Book newest = findNewest(rlist);
        System.out.println(newest);
    }
}
