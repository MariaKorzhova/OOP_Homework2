    // Создание класса PromotionClient, наследника абстрактного класса Actor
public class PromotionClient extends Actor{
    public String PromotionName;
    public static int ClientPromotionNimber;
    // Конструктор класса PromotionClient
    public PromotionClient(String name,String PromotionName, int ClientPromotionNimber){
        super(name);
        this.PromotionName = PromotionName;
        this.ClientPromotionNimber = ClientPromotionNimber;
    }
    // Метод для вызова имени экземпляра
    @Override
    public String getName() {
        return super.name;
    }
    // Получение данных экземпляра класса
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
