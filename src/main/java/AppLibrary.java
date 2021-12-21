public class AppLibrary {

    public static void main(String[] args) {

        CityLibrary cityLibrary = new CityLibrary();
        cityLibrary.infoAboutLibrary(LibraryTypes.SCIENTIFIC);

        VillageLibrary villageLibrary = new VillageLibrary();
        villageLibrary.infoAboutLibrary(LibraryTypes.SCIENTIFIC);

    }
}
