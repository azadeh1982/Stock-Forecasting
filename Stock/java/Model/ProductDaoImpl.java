package Model;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class ProductDaoImpl implements ProductDao{

HashMap<Integer, String> hmap = new HashMap<Integer, String >();
hmap.put(12, "Este Lauder Moisturizer");
hmap.put(15, "Este Lauder Moisturizer");
hmap.put(16, "Este Lauder Moisturizer");
hmap.put(14, "Este Lauder Moisturizer");
hmap.put(50, "Este Lauder Moisturizer");

}

