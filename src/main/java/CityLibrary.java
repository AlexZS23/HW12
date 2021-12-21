public class CityLibrary extends LibraryInfo {

    @Override
    public Library visitLibrary(LibraryTypes types) {

        Library library = null;

        switch (types) {
            case COMMON:
                library = new CityCommon();
                break;
            case COMICS:
                library = new CityComics();
                break;
            case SCIENTIFIC:
                library = new CityScientific();
                break;
        }
        return library;
    }
}
