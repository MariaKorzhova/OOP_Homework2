    // Создание класса OrdinaryClient, наследника абстрактного класса Actor
public class OrdinaryClient extends Actor {
    // Конструктор класса OrdinaryClient
    public OrdinaryClient(String name)
    {
        super(name);
    }
    // Метод для вызова имени экземпляра
    @Override
    public String getName() {        
        return super.name;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    // Метод, который устанавливает значение переменной isMakeOrder, равное входящей переменной makeOrder
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }
    // Получение данных экземпляра класса
    @Override
    public Actor getActor() {
        return this;
    }

    
}
