public class CityCommon extends Library {

    @Override
    public void libraryCard() {
        super.libraryCard();
        System.out.println("Данная библиотека требует наличия абонемента.");
    }

    @Override
    public void bookRange() {
        super.bookRange();
        System.out.println("Ассортимент книг: художественная литература.");
    }

    @Override
    public void newSupply() {
        super.newSupply();
        System.out.println("Поступления новых книг: один раз в месяц.");
    }
}
