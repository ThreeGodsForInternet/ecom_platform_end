package org.ecom.mall.modules.product.controller;

import org.ecom.mall.modules.product.domain.Product;
import org.ecom.mall.modules.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    // 查询所有
    @GetMapping("/list")
    public List<Product> list() {
        return productService.list();
    }

    // 根据id查询
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return productService.getById(id);
    }

    // 新增
    @PostMapping("/add")
    public String add(@RequestBody Product product) {
        productService.save(product);
        return "新增成功";
    }

    // 修改
    @PutMapping("/update")
    public String update(@RequestBody Product product) {
        productService.updateById(product);
        return "更新成功";
    }

    // 删除
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        productService.removeById(id);
        return "删除成功";
    }
}