package org.ecom.mall.modules.product.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.ecom.mall.modules.product.domain.Product;
import org.ecom.mall.modules.product.dto.ProductDetailVO;
import org.ecom.mall.modules.product.dto.ProductSearchRequest;
import org.ecom.mall.modules.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /** 商品搜索/列表（分页+筛选+排序） */
    @GetMapping("/search")
    public IPage<Product> search(ProductSearchRequest request) {
        return productService.searchPage(request);
    }

    /** 商品详情（含详情信息+分享信息） */
    @GetMapping("/{id}/detail")
    public ProductDetailVO detail(@PathVariable Long id) {
        return productService.getDetail(id);
    }

    /** 新增 */
    @PostMapping("/add")
    public String add(@RequestBody Product product) {
        productService.save(product);
        return "新增成功";
    }

    /** 修改 */
    @PutMapping("/update")
    public String update(@RequestBody Product product) {
        productService.updateById(product);
        return "更新成功";
    }

    /** 删除 */
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        productService.removeById(id);
        return "删除成功";
    }
}
