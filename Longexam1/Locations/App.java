public class App {
    public static void main(String[] args) {

        // Long exam 1
        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

        Locations batangas = new Batangas();

        Locations boracay = new Boracay();

        Locations bulacan = new Bulacan();

        Locations laguna = new Laguna();

        Locations tagaytay = new Tagaytay();


        Tourist levasty = new Levasty();

        batangas.accept(levasty);
        boracay.accept(levasty);
        bulacan.accept(levasty);
        laguna.accept(levasty);
        tagaytay.accept(levasty);
    }
}
