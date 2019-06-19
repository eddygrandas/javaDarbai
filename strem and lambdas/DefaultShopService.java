import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.util.stream.Collectors.toList;

public class DefaultShopService implements ShopService {

    private List<Shop> shops = ShopRepository.getShops();

    @Override
    public ShopView getAllShops() {
        return shops.stream().map(shop ->new ShopView(shop.getId(), shop.getName())).collect(toList());
    }

    @Override
    public ShopView getShopById(int shopId, Supplier<ShopView> defaultValue) {
        Optional<ShopView> shopView = shops.stream()
                .filter(shop -> shopId == shop.getId())
                .map(shop ->
                        new ShopView(shop.getId(), shop.getName()))
                .findFirst();

        if (shopView.isPresent()) {
            return shopView.get();
        } else {
            return defaultValue.get();
        }
    }

    @Override
    public List<Employee> getShopsEmployees(int shopId) {
        return shops.stream().flatMap(shop -> shop.getEmployees().stream()).collect(toList());
    }

    @Override
    public List<Employee> getAllEmployees() {
        return shops.stream().flatMap(shop -> shop.getEmployees().stream()).collect(toList());
    }

    @Override
    public List<Employee> getEmployeesWithSalaryBetween(int low, int max) {
        return shops.stream().flatMap(shop -> shop.getEmployees().stream().filter());
    }

    @Override
    public List<Item> getItemsByType(Item.ItemType type) {
        return shops.stream().flatMap(shop -> shop.getMerchandise().stream()).filter(item -> type.equals(item.getType().collect(toList())));
    }

    @Override
    public Item getCheapestItem() {
        return null;
    }

    @Override
    public Item getMostExpensiveItem() {
        return null;
    }

    @Override
    public Map<Item.ItemType, List<Item>> getItemsGroupedByType() {
        return null;
    }

    @Override
    public Item findItemBy(Predicate<Item> condition) {
        return null;
    }

    @Override
    public int getAllItemsPrice() {
        return 0;
    }

    @Override
    public int totalPayToEmployees(int shopId) {
        return 0;
    }
}
