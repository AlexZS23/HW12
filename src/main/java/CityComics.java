public class CityComics extends Library{

    @Override
    public void libraryCard() {
        super.libraryCard();
        System.out.println("Магазин комиксов свободен для посещения.");
    }

    @Override
    public void bookRange() {
        super.bookRange();
        System.out.println("В наличии различные комиксы и фан-атрибуты.");
    }

    @Override
    public void newSupply() {
        super.newSupply();
        System.out.println("Обновление комиксов происходит еженедельно.");
    }
}
