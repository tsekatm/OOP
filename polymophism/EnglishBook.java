package OOP.polymophism;

public class EnglishBook extends Book{
    public static void main(String[] args) {
        Object target = null;
        EnglishBook englishBook = new EnglishBook();
        target = englishBook;
        target = (Object) englishBook;
    }
    
}
