package org.ecom.mall.modules.productcategory.controller;

import org.ecom.mall.modules.productcategory.domain.ProductCategory;
import org.ecom.mall.modules.productcategory.dto.ProductCategoryVO;
import org.ecom.mall.modules.productcategory.service.ProductCategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-category")
public class ProductCategoryController {

    private final ProductCategoryService productCategoryService;

    public ProductCategoryController(ProductCategoryService productCategoryService) {
        this.productCategoryService = productCategoryService;
    }

    /** 分类树 */
    @GetMapping("/tree")
    public List<ProductCategoryVO> tree() {
        return productCategoryService.getTree();
    }

    /** 分类列表（平铺） */
    @GetMapping("/list")
    public List<ProductCategory> list() {
        return productCategoryService.list();
    }

    /** 新增 */
    @PostMapping("/add")
    public String add(@RequestBody ProductCategory productCategory) {
        productCategoryService.save(productCategory);
        return "新增成功";
    }

    /** 修改 */
    @PutMapping("/update")
    public String update(@RequestBody ProductCategory productCategory) {
        productCategoryService.updateById(productCategory);
        return "修改成功";
    }

    /** 删除 */
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        productCategoryService.removeById(id);
        return "删除成功";
    }
}
