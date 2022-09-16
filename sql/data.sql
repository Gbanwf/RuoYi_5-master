-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单信息', '2000', '1', '/orderinfo/dd', 'C', '0', 'orderinfo:dd:view', '#', 'admin', sysdate(), '', null, '订单信息菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单信息查询', @parentId, '1',  '#',  'F', '0', 'orderinfo:dd:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单信息新增', @parentId, '2',  '#',  'F', '0', 'orderinfo:dd:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单信息修改', @parentId, '3',  '#',  'F', '0', 'orderinfo:dd:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单信息删除', @parentId, '4',  '#',  'F', '0', 'orderinfo:dd:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单信息导出', @parentId, '5',  '#',  'F', '0', 'orderinfo:dd:export',       '#', 'admin', sysdate(), '', null, '');


-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035320565', '2007', '1', '/carfirst/firstcar', 'C', '0', 'carfirst:firstcar:view', '#', 'admin', sysdate(), '', null, '司机1035320565菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035320565查询', @parentId, '1',  '#',  'F', '0', 'carfirst:firstcar:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035320565新增', @parentId, '2',  '#',  'F', '0', 'carfirst:firstcar:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035320565修改', @parentId, '3',  '#',  'F', '0', 'carfirst:firstcar:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035320565删除', @parentId, '4',  '#',  'F', '0', 'carfirst:firstcar:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035320565导出', @parentId, '5',  '#',  'F', '0', 'carfirst:firstcar:export',       '#', 'admin', sysdate(), '', null, '');


-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035332126', '2007', '1', '/carsecond/secondcar', 'C', '0', 'carsecond:secondcar:view', '#', 'admin', sysdate(), '', null, '司机1035332126菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035332126查询', @parentId, '1',  '#',  'F', '0', 'carsecond:secondcar:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035332126新增', @parentId, '2',  '#',  'F', '0', 'carsecond:secondcar:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035332126修改', @parentId, '3',  '#',  'F', '0', 'carsecond:secondcar:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035332126删除', @parentId, '4',  '#',  'F', '0', 'carsecond:secondcar:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035332126导出', @parentId, '5',  '#',  'F', '0', 'carsecond:secondcar:export',       '#', 'admin', sysdate(), '', null, '');


-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035312053', '2007', '1', '/carthird/thirdcar', 'C', '0', 'carthird:thirdcar:view', '#', 'admin', sysdate(), '', null, '司机1035312053菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035312053查询', @parentId, '1',  '#',  'F', '0', 'carthird:thirdcar:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035312053新增', @parentId, '2',  '#',  'F', '0', 'carthird:thirdcar:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035312053修改', @parentId, '3',  '#',  'F', '0', 'carthird:thirdcar:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035312053删除', @parentId, '4',  '#',  'F', '0', 'carthird:thirdcar:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('司机1035312053导出', @parentId, '5',  '#',  'F', '0', 'carthird:thirdcar:export',       '#', 'admin', sysdate(), '', null, '');
