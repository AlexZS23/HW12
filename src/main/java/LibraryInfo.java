public abstract class LibraryInfo {

    public Library infoAboutLibrary(LibraryTypes types){
        Library library = visitLibrary(types);

        System.out.println("Информация о библиотеке: ");
        library.libraryCard();
        library.bookRange();
        library.newSupply();
        System.out.println("");

        return library;
    }

    public abstract Library visitLibrary(LibraryTypes types);
}
