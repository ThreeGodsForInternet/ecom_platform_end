-- =============================================
-- V4: 模拟数据种子脚本
-- 所有用户密码均为: 123456
-- =============================================

-- ----------------------------
-- 1. 用户 (user)
-- ----------------------------
INSERT IGNORE INTO user (id, username, phone, email, password, role, nickname, avatar, status, is_anonymous, create_time, update_time, is_delete) VALUES
(1, 'admin',     '13800000001', 'admin@mall.com',     '$2a$10$EixZaYVK1fsbw1ZfbX3OXePaWxn96p36PQm4sEPhMNPfFhpYN76u.', 'ROLE_ADMIN', '超级管理员',  'https://api.dicebear.com/9.x/avataaars/svg?seed=admin',     0, 0, NOW(), NOW(), 0),
(2, 'zhangsan',  '13800000002', 'zhangsan@mall.com',  '$2a$10$EixZaYVK1fsbw1ZfbX3OXePaWxn96p36PQm4sEPhMNPfFhpYN76u.', 'ROLE_USER',  '张三',       'https://api.dicebear.com/9.x/avataaars/svg?seed=zhangsan',  0, 0, NOW(), NOW(), 0),
(3, 'lisi',      '13800000003', 'lisi@mall.com',      '$2a$10$EixZaYVK1fsbw1ZfbX3OXePaWxn96p36PQm4sEPhMNPfFhpYN76u.', 'ROLE_USER',  '李四',       'https://api.dicebear.com/9.x/avataaars/svg?seed=lisi',      0, 0, NOW(), NOW(), 0),
(4, 'wangwu',    '13800000004', 'wangwu@mall.com',    '$2a$10$EixZaYVK1fsbw1ZfbX3OXePaWxn96p36PQm4sEPhMNPfFhpYN76u.', 'ROLE_USER',  '王五',       'https://api.dicebear.com/9.x/avataaars/svg?seed=wangwu',    0, 0, NOW(), NOW(), 0),
(5, 'zhaoliu',   '13800000005', 'zhaoliu@mall.com',   '$2a$10$EixZaYVK1fsbw1ZfbX3OXePaWxn96p36PQm4sEPhMNPfFhpYN76u.', 'ROLE_USER',  '赵六',       'https://api.dicebear.com/9.x/avataaars/svg?seed=zhaoliu',   0, 0, NOW(), NOW(), 0);

-- ----------------------------
-- 2. 商品分类 (product_category)
-- ----------------------------
INSERT IGNORE INTO product_category (id, name, parent_id, sort, status) VALUES
(1,  '电子数码',  0,  1, 0),
(2,  '服装鞋帽',  0,  2, 0),
(3,  '食品饮料',  0,  3, 0),
(4,  '家居生活',  0,  4, 0),
(11, '手机',     1,  1, 0),
(12, '电脑',     1,  2, 0),
(13, '平板',     1,  3, 0),
(21, '男装',     2,  1, 0),
(22, '女装',     2,  2, 0),
(31, '零食',     3,  1, 0),
(32, '饮料',     3,  2, 0),
(41, '厨具',     4,  1, 0),
(42, '灯具',     4,  2, 0);

-- ----------------------------
-- 3. 商品 (product)
-- ----------------------------
INSERT IGNORE INTO product (id, category_id, name, subtitle, image, price, market_price, stock, sales, sort, is_hot, is_new, is_sale, status) VALUES
(101, 11, 'iPhone 15',             'A16芯片 | 4800万像素 | 灵动岛',                      'https://picsum.photos/seed/iphone15/400/400',   5999.00,  6999.00,  200, 1580, 1, 1, 0, 0, 0),
(102, 11, '华为 Mate 60 Pro',      '麒麟9000S | 卫星通话 | 昆仑玻璃',                    'https://picsum.photos/seed/mate60/400/400',     6999.00,  7999.00,  150, 960,  2, 1, 0, 0, 0),
(103, 11, '小米 14',               '骁龙8 Gen3 | 徕卡光学 | 90W快充',                    'https://picsum.photos/seed/xiaomi14/400/400',    3999.00,  4299.00,  300, 2100, 3, 1, 1, 0, 0),
(104, 12, 'MacBook Pro 14',        'M3芯片 | Liquid Retina XDR | 18小时续航',             'https://picsum.photos/seed/macbook/400/400',     14999.00, 16999.00, 80,  450,  4, 0, 1, 0, 0),
(105, 12, 'ThinkPad X1 Carbon',    'i7-1365U | 14英寸2.8K | 商务旗舰',                    'https://picsum.photos/seed/thinkpad/400/400',    9999.00,  10999.00, 60,  320,  5, 0, 0, 0, 0),
(106, 13, 'iPad Air',              'M1芯片 | 10.9英寸 | 支持妙控键盘',                    'https://picsum.photos/seed/ipad/400/400',        4799.00,  5499.00,  120, 780,  6, 0, 1, 1, 0),
(107, 21, '男士休闲夹克',          '春秋薄款 | 防风防水 | 百搭立领',                      'https://picsum.photos/seed/jacket/400/400',      299.00,   599.00,   500, 3200, 7, 0, 0, 1, 0),
(108, 22, '法式复古连衣裙',        'V领收腰 | 碎花印花 | 春季新款',                       'https://picsum.photos/seed/dress/400/400',       399.00,   699.00,   350, 1800, 8, 0, 0, 0, 0),
(109, 31, '三只松鼠坚果大礼包',    '每日坚果 | 混合装1488g | 年货礼盒',                   'https://picsum.photos/seed/nuts/400/400',        89.00,    139.00,   1000,5600, 9, 1, 0, 1, 0),
(110, 32, '元气森林无糖气泡水',    '白桃味 | 0糖0脂0卡 | 480ml×12瓶',                     'https://picsum.photos/seed/soda/400/400',        59.90,    79.90,    800, 4300, 10,0, 0, 0, 0),
(111, 41, '苏泊尔不粘炒锅',        '32cm | 电磁炉燃气通用 | 少油烟',                      'https://picsum.photos/seed/wok/400/400',         199.00,   399.00,   400, 2100, 11,0, 0, 1, 0),
(112, 42, '北欧简约落地灯',        'LED护眼 | 三档调光 | 客厅卧室',                       'https://picsum.photos/seed/lamp/400/400',        259.00,   459.00,   250, 980,  12,0, 1, 0, 0);

-- ----------------------------
-- 4. 商品详情 (product_detail)
-- ----------------------------
INSERT IGNORE INTO product_detail (id, product_id, content, brand, origin, city) VALUES
(1,  101, '<h3>iPhone 15</h3><p>全新 A16 仿生芯片，4800 万像素主摄，灵动岛交互体验，USB-C 接口。</p><img src="https://picsum.photos/seed/iphone15_detail/600/400"/>',                   'Apple',   '美国',     '深圳'),
(2,  102, '<h3>华为 Mate 60 Pro</h3><p>搭载麒麟 9000S 芯片，支持卫星通话，第二代昆仑玻璃，超可靠玄武架构。</p>',                                                            '华为',    '中国',     '深圳'),
(3,  103, '<h3>小米 14</h3><p>骁龙 8 Gen 3 移动平台，徕卡光学 Summilux 镜头，90W 小米澎湃有线秒充。</p>',                                                                     '小米',    '中国',     '北京'),
(4,  104, '<h3>MacBook Pro 14</h3><p>M3 芯片，Liquid Retina XDR 显示屏，18 小时电池续航，极致性能。</p>',                                                                      'Apple',   '美国',     '上海'),
(5,  105, '<h3>ThinkPad X1 Carbon</h3><p>第 13 代英特尔酷睿 i7 处理器，14 英寸 2.8K OLED 屏，轻至 1.12kg。</p>',                                                           '联想',    '中国',     '北京'),
(6,  106, '<h3>iPad Air</h3><p>M1 芯片驱动，10.9 英寸 Liquid Retina 显示屏，支持 Apple Pencil 和妙控键盘。</p>',                                                            'Apple',   '美国',     '上海'),
(7,  107, '<h3>男士休闲夹克</h3><p>春秋薄款，防风防水面料，立领设计，百搭休闲。</p>',                                                                                        '海澜之家','中国',     '杭州'),
(8,  108, '<h3>法式复古连衣裙</h3><p>V领收腰设计，碎花印花，春季新款，优雅气质。</p>',                                                                                       'UR',      '中国',     '广州'),
(9,  109, '<h3>三只松鼠坚果大礼包</h3><p>每日坚果混合装 1488g，含核桃、腰果、巴旦木等 8 种坚果，年货礼盒装。</p>',                                                          '三只松鼠','中国',     '芜湖'),
(10, 110, '<h3>元气森林无糖气泡水</h3><p>白桃味，0糖0脂0卡，480ml×12 瓶整箱装，夏日必备。</p>',                                                                              '元气森林','中国',     '上海'),
(11, 111, '<h3>苏泊尔不粘炒锅</h3><p>32cm 大口径，电磁炉燃气通用，不粘涂层少油烟，易清洗。</p>',                                                                            '苏泊尔',  '中国',     '杭州'),
(12, 112, '<h3>北欧简约落地灯</h3><p>LED 护眼光源，三档调光调色，简约设计，客厅卧室两用。</p>',                                                                            '欧普照明','中国',     '中山');

-- ----------------------------
-- 5. 优惠券 (coupon)
-- ----------------------------
INSERT IGNORE INTO coupon (id, name, type, condition_amount, discount_amount, start_time, end_time, status, create_time) VALUES
(1, '新用户满100减15',    1, 100.00,  15.00,  '2026-01-01 00:00:00', '2026-12-31 23:59:59', 0, NOW()),
(2, '数码品类满1000减50', 1, 1000.00, 50.00,  '2026-06-01 00:00:00', '2026-06-30 23:59:59', 0, NOW()),
(3, '全场9折券',          2, 0.00,    0.90,   '2026-06-01 00:00:00', '2026-06-30 23:59:59', 0, NOW()),
(4, '夏日大促满200减30',  1, 200.00,  30.00,  '2026-06-10 00:00:00', '2026-07-10 23:59:59', 0, NOW()),
(5, '新人首单8折',        2, 0.00,    0.80,   '2026-01-01 00:00:00', '2026-12-31 23:59:59', 0, NOW());

-- ----------------------------
-- 6. 用户地址 (user_address)
-- ----------------------------
INSERT IGNORE INTO user_address (id, user_id, receiver_name, receiver_phone, province, city, area, address, is_default, create_time, update_time, is_delete) VALUES
(1, 2, '张三',   '13800000002', '广东省', '深圳市', '南山区', '科技园路1号创新大厦A栋1201',              1, NOW(), NOW(), 0),
(2, 2, '张三',   '13800000002', '湖北省', '武汉市', '洪山区', '珞喻路1037号华中科技大学',                 0, NOW(), NOW(), 0),
(3, 3, '李四',   '13800000003', '北京市', '北京市', '朝阳区', '望京街道阜通东大街6号院3号楼1802',         1, NOW(), NOW(), 0),
(4, 4, '王五',   '13800000004', '上海市', '上海市', '浦东新区', '张江高科技园区博云路2号浦软大厦501',      1, NOW(), NOW(), 0),
(5, 5, '赵六',   '13800000005', '浙江省', '杭州市', '西湖区', '文三路478号华星时代广场A座1201',           1, NOW(), NOW(), 0);

-- ----------------------------
-- 7. 订单 (`order`)
-- ----------------------------
INSERT IGNORE INTO `order` (id, order_no, user_id, address_id, order_amount, pay_amount, pay_type, pay_time, delivery_type, status, create_time) VALUES
(1, '20260610142000001', 2, 1, 6298.00,   6298.00,   1, '2026-06-10 14:30:00', 1, 3, '2026-06-10 14:20:00'),
(2, '20260611093000002', 3, 3, 1199.00,   1199.00,   2, '2026-06-11 09:35:00', 2, 2, '2026-06-11 09:30:00'),
(3, '20260611104500003', 4, 4, 14999.00,  14949.00,  1, '2026-06-11 10:50:00', 1, 1, '2026-06-11 10:45:00'),
(4, '20260611120000004', 5, 5, 358.90,    328.90,    3, NULL,                  1, 0, '2026-06-11 12:00:00'),
(5, '20260611153000005', 2, 2, 89.00,     89.00,     1, '2026-06-11 15:32:00', 2, 4, '2026-06-11 15:30:00');

-- ----------------------------
-- 8. 订单项 (order_item)
-- ----------------------------
INSERT IGNORE INTO order_item (id, order_id, product_id, product_name, price, num, total_price) VALUES
(1, 1, 101, 'iPhone 15',              5999.00, 1, 5999.00),
(2, 1, 107, '男士休闲夹克',            299.00,  1, 299.00),
(3, 2, 109, '三只松鼠坚果大礼包',      89.00,   1, 89.00),
(4, 2, 110, '元气森林无糖气泡水',      59.90,   1, 59.90),
(5, 2, 111, '苏泊尔不粘炒锅',          199.00,  1, 199.00),
(6, 2, 112, '北欧简约落地灯',          259.00,  1, 259.00),
(7, 2, 107, '男士休闲夹克',            299.00,  2, 598.00),
(8, 3, 104, 'MacBook Pro 14',         14999.00,1, 14999.00),
(9, 4, 108, '法式复古连衣裙',          399.00,  1, 399.00),
(10,4, 110, '元气森林无糖气泡水',      59.90,   1, 59.90),
(11,5, 109, '三只松鼠坚果大礼包',      89.00,   1, 89.00);