package pl.jkanclerz.voucherstore.productcatalog;

import java.util.List;
import java.util.Optional;

public class JDBCProductStorage implements ProductStorage {
    public JDBCProductStorage(String s) {

    }

    @Override
    public void save(Product newProduct) {

    }

    @Override
    public Optional<Product> getById(String productId) {
        return Optional.empty();
    }

    @Override
    public List<Product> allPublishedProducts() {
        return null;
    }
}
