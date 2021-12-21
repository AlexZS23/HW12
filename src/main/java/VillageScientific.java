public class VillageScientific extends Library {

    @Override
    public void libraryCard() {
        super.libraryCard();
        System.out.println("Найти научную литературу можно в общей сельской библиотеке.");
    }

    @Override
    public void bookRange() {
        super.bookRange();
        System.out.println("Ассортимент ограничен.");
    }
}
