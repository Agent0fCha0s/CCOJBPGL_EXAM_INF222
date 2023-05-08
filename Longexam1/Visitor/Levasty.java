public class Levasty implements Tourist {

    static int credit = 300;

    public void visit() {
        if (credit - 0 < 0) {
            System.out.println("You have insufficient credits to transport to this location");
        } else {
            System.out.println("I'm enjoying my stay");
            credit -= 0;
        }
        credit();
    }

    @Override //Batangas trip
    public void visit(Batangas batangas) {
        if (credit - batangas.transport() < 0) {
            System.out.println("You have insufficient credits to transport to Batangas");
        } else {
            System.out.println("You have enough credits to go to Batangas");
            System.out.println("I am now enjoying the resort here in Batangas");
            credit -= batangas.transport();
        }
        credit();
    }
    @Override //Boracay trip
    public void visit(Boracay boracay) {
        if (credit - boracay.transport() < 0) {
            System.out.println("You have insufficient credits to transport to Boracay");
        } else {
            System.out.println("You have enough credits to go to Boracay");
            System.out.println("I am now enjoying the resort here in Boracay");
            credit -= boracay.transport();
        }
        credit();
    }
    @Override // Bulacan trip
    public void visit(Bulacan bulacan) {
        if (credit - bulacan.transport() < 0) {
            System.out.println("You have insufficient credits to transport to Bulacan");
        } else {
            System.out.println("You have enough credits to go to Bulacan");
            System.out.println("I am now enjoying my Airbnb here in Bulacan");
            credit -= bulacan.transport();
        }
        credit();
    }
    @Override // Laguna trip
    public void visit(Laguna laguna) {
        if (credit - laguna.transport() < 0) {
            System.out.println("You have insufficient credits to transport to Laguna");
        } else {
            System.out.println("You have enough credits to go to Laguna");
            System.out.println("I am now enjoying my Airbnb here in Laguna");
            credit -= laguna.transport();
        }
        credit();
    }
    @Override //Tagaytay trip
    public void visit(Tagaytay tagaytay) {
        if (credit - tagaytay.transport() < 0) {
            System.out.println("You have insufficient credits to transport to Tagaytay"); 
        } else {
            System.out.println("You have enough credits to go to Tagaytay");
             System.out.println("I am now enjoying my stay here in Tagaytay");
            credit -= tagaytay.transport();
        }
        credit();
    }
    public void credit() {
        System.out.println("My remaining Credits Now is: " + credit);
    }
}
