import java.util.List;
// Создание интерфейса iReturnOrder, который заключает в себе действия по возврату товара при наличии дефекта или потому что товар не подошёл, приём товара и возврат денег клиенту.
public interface iReturnOrder {
    void ReturnOrder(List<iActorBehaviour> actors);
}
