public class VillageCommon extends Library {

    @Override
    public void libraryCard() {
        super.libraryCard();
        System.out.println("Библиотека требует записи в общем реестре посетителей.");
    }

    @Override
    public void bookRange() {
        super.bookRange();
        System.out.println("Содержит художественную, научную и детскую литературу. Ассортимент ограничен.");
    }
}
