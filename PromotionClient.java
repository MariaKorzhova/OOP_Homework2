public class PromotionClient extends Actor{
    public String PromotionName;
    public static int ClientPromotionNimber;

    public PromotionClient(String name,String PromotionName, int ClientPromotionNimber){
        super(name);
        this.PromotionName = PromotionName;
        this.ClientPromotionNimber = ClientPromotionNimber;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
        
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder; 
        
    }







}
