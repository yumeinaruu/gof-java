package facade;

public class Main {
    public static void main(String[] args) {
        SteamFacade steamFacade = new SteamFacade();
        steamFacade.startCsApp();
        steamFacade.finishCsApp();
        steamFacade.startPubgApp();
    }
}
