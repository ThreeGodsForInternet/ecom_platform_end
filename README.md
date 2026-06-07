# mall — 综合网上购物商城

## 项目简介

一个综合性的 B2C 网上购物商城，涵盖商品浏览、会员管理、促销活动、在线支付、物流配送等核心电商功能。

## 技术栈

| 类别 | 技术 | 版本 |
|------|------|------|
| 基础框架 | Spring Boot | 3.3.1 |
| JDK | Java | 17 |
| ORM | MyBatis-Plus | 3.5.11 |
| 数据库 | MySQL | 8.0.33 |
| 数据库版本管理 | Flyway | — |
| 工具库 | Lombok | — |
| 热部署 | spring-boot-devtools | — |

## 项目结构

```
mall
├── src/main/java/org/ecom/mall/
│   ├── MallApplication.java              # 应用入口
│   └── modules/
│       ├── user/                          # 用户模块
│       │   ├── controller/UserController.java
│       │   ├── service/UserService.java
│       │   ├── service/impl/UserServiceImpl.java
│       │   ├── mapper/UserMapper.java
│       │   └── domain/User.java
│       └── product/                       # 商品模块
│           ├── controller/ProductController.java
│           ├── service/ProductService.java
│           ├── service/impl/ProductServiceImpl.java
│           ├── mapper/ProductMapper.java
│           └── domain/Product.java
└── src/main/resources/
    ├── application.yml                    # 应用配置
    ├── db/migration/                      # Flyway 数据库迁移脚本
    └── 产品需求.md                         # 产品需求文档
```

## 功能模块

### 已实现

| 模块 | 功能 | API |
|------|------|-----|
| 用户 (user) | 查询用户列表 | `GET /user/list` |
| 用户 (user) | 新增用户 | `POST /user/add` |
| 商品 (product) | 查询商品列表 | `GET /product/list` |
| 商品 (product) | 按ID查商品 | `GET /product/{id}` |
| 商品 (product) | 新增商品 | `POST /product/add` |
| 商品 (product) | 修改商品 | `PUT /product/update` |
| 商品 (product) | 删除商品 | `DELETE /product/delete/{id}` |

### 规划中

根据产品需求文档，后续将实现以下模块：

- **买家系统** — 会员注册/登录、会员信息、等级、积分、优惠券、收货地址、浏览记录、订单记录、评论晒单、站内信、礼品卡、第三方店铺
- **商品模块** — 商品搜索与筛选、分类列表、商品详情、最新/特卖/热卖排行、推荐算法
- **促销模块** — 团购、秒杀/限时抢购、组合套餐、满赠活动
- **支付模块** — 平台余额、礼品卡、第三方支付（银联/支付宝/财付通）、货到付款
- **配送方式** — 自营物流、第三方物流（圆通/顺丰/EMS等）、门店自提
- **会员专区** — 会员专属抢购
- **积分商城** — 积分兑换乐券与礼品
- **推广游戏** — 摇一摇、刮刮卡、砸金蛋等抽奖活动
- **附加功能** — 在线充值、比价、客服、推送通知、二维码扫描

## 数据库

- 数据库名：`ecom_mail`
- Flyway 管理数据库版本，迁移脚本位于 `resources/db/migration/`

### 核心表

| 表名 | 说明 |
|------|------|
| user | 用户表（用户名、手机、邮箱、密码、昵称、头像、状态等） |
| product | 商品表（名称、副标题、主图、售价、市场价、库存、销量、排序、热卖/新品/特卖标记等） |

## 快速开始

### 环境要求

- JDK 17+
- MySQL 8.0+
- Maven 3.6+

### 启动步骤

1. 克隆项目并导入 IDE
2. 创建数据库 `ecom_mail`（已存在可跳过）
3. 修改 `application.yml` 中的数据库连接信息
4. 运行 `MallApplication.main()` 启动项目
5. 访问 `http://localhost:8080`

### 配置说明

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/ecom_mail   # 数据库地址
    username: root                                 # 数据库用户名
    password: 你的密码                               # 数据库密码
  flyway:
    baseline-on-migrate: true                      # 已有数据库时自动基线
```