package study.web.shop.dao;

import java.util.List;

import study.web.shop.vo.Shop;

public interface ShopDao {
    public List<Shop> list(Shop shop);
    public void insert(Shop shop);
    public Shop select(String shopNo);
    public void update(Shop shop);
    public void delete(String shopNo);
}
