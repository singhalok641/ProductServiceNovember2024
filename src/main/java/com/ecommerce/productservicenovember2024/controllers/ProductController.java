package com.ecommerce.productservicenovember2024.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
}

/*
Product Service

1. create Product
2. get Product
3. update Product
4. delete Product

MySQL DB for this.


Client ----->     Product Service  ---->   Database (products: id, name, quantity, price) (Later)

We will use Fakestore API to code our Product Service

Implement Product Service which uses a 3rd party api behind the scenes

Client ----->     Product Service  ---->   FakeStore API (products: id, name, quantity, price)
                  (proxy service here)

Agenda:
How we are going to call third party apis from our product service

 */
