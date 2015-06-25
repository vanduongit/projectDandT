DELETE FROM `category` WHERE 1;
INSERT INTO `category`(`ID`, `TAG`, `NAME`, `CONTENT`, `LEVEL`, `PRIORITY`, `INDEX`, `IMAGE`, `TITLE`,
 `DESCRIPTION`, `KEYWORD`, `ACTIVE`, `ORD`, `LANG`, `IMAGE2`) VALUES (1,'ban chay','Sản phẩm bán chạy',
 'Danh sách những sản phẩm bán chạy nhất',0, 1,1,'','Sản phẩm bán chạy','Danh sách những sản phẩm bán chạy nhất','ban chay',1, 1,
 '','bestsell.png'),
 (2,'san pham moi','Sản phẩm mới',
 'Danh sách những sản phẩm mới',0, 1,1,'','Sản phẩm mới','Danh sách những sản phẩm mới nhất','moi, new',1, 1,
 '','newbadge.png'),
 (3,'giam gia','Sản phẩm sale',
 'Danh sách những sản phẩm giảm giá',0, 1,1,'','Sản phẩm sale','Danh sách những sản phẩm sale','sale',1, 1,
 '','sale.png'),
 (4,'cao cap','Sản phẩm cao cấp',
 'Danh sách những sản phẩm cao cấp',0, 1,1,'','Sản phẩm cao cấp','Danh sách những sản phẩm cao cấp','cao cấp',1, 1,
 '','');
 