package org.ecom.mall.modules.productcategory.controller;

import org.ecom.mall.modules.productcategory.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.ecom.mall.modules.productcategory.domain.ProductCategory;

/**
 * 分类Controller
 */
@RestController
@RequestMapping("/product-category")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public List<ProductCategory> list() {
        return productCategoryService.list();
    }

    @PostMapping("/add")
    public String add(@RequestBody ProductCategory productCategory) {
        productCategoryService.save(productCategory);
        return "新增成功";
    }

    @PutMapping("/update")
    public String update(@RequestBody ProductCategory productCategory) {
        productCategoryService.updateById(productCategory);
        return "修改成功";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        productCategoryService.removeById(id);
        return "删除成功";
    }
}