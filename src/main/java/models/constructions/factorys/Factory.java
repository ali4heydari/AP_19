package models.constructions.factorys;

import models.products.Product;

public class Factory<I extends Product, O extends Product>  {
    I inputProduct;
    O outputProduct;
}
