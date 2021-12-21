public class VillageLibrary extends LibraryInfo {

    @Override
    public Library visitLibrary(LibraryTypes types) {

        Library library = null;

        switch (types) {
            case COMMON:
                library = new VillageCommon();
                break;
            case COMICS:
                library = new VillageComics();
                break;
            case SCIENTIFIC:
                library = new VillageScientific();
                break;
        }
        return library;
    }

}
