public class CityScientific extends Library{

    @Override
    public void libraryCard() {
        super.libraryCard();
        System.out.println("Научная библиотека требует наличия членской карточки.");
    }

    @Override
    public void newSupply() {
        super.newSupply();
        System.out.println("Поступление научной литературы происходит ежемесячно.");
    }

    @Override
    public void bookRange() {
        super.bookRange();
        System.out.println("В ассортименте только научная, узкопрофильная литература.");
    }
}
