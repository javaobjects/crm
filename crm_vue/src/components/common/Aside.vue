<template>
  <div class="asideContianer">
    <el-menu
      default-active="1-4-1"
      class="el-menu-vertical-demo"
      @open="handleOpen"
      @close="handleClose"
      :collapse="isCollapse"
      background-color="rgb(50, 65, 87)"
      text-color="#fff"
      active-text-color="#ffd04b"
    >
      <h3>{{isCollapse?'婉舒':'婉舒CRM系统'}}</h3>
      <!--没有二级菜单-->
      <el-menu-item
        v-for="item in noChildren"
        :key="item.name"
        :index="item.name"
        @click="clickMenu(item)"
      >
        <i :class="`el-icon-${item.icon}`"></i>
        <span slot="title">{{ item.label }}</span>
      </el-menu-item>
      <!--有二级菜单-->
      <el-submenu
        v-for="item in hasChildren"
        :key="item.name"
        :index="item.name"
      >
        <template slot="title">
          <i :class="`el-icon-${item.icon}`"></i>
          <span slot="title">{{ item.label }}</span>
        </template>

        <el-menu-item-group
          v-for="subItem in item.children"
          :key="subItem.name"
          
        >
          <el-menu-item :index="subItem.name" @click="clickMenu(subItem)">{{ subItem.label }}</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
    </el-menu>
  </div>
</template>
<style lang="less" scoped>
.el-menu {
  height: 100vh;
  border-right: none;
  h3 {
    color: #fff;
    text-align: center;
    line-height: 48px;
    font-size: 22px;
    font-weight: 400;
    padding: 0 20px;
  }
}
</style>

<script>
export default {
  name: "Aside",
  data() {
    return {
      //isCollapse: false,
      menuData: [
        {
          path: "/",
          name: "main",
          label: "首页",
          icon: "s-home",
          url: "Home/Home",
        },
        {
          label: "系统管理",
          icon: "user",
          name: "system",
          children: [
            {
              path: "/SysUser",
              name: "sysUser",
              label: "用户管理",
              icon: "setting",
              url: "sys/sysUser",
            },
            {
              path: "/SysRole",
              name: "sysRole",
              label: "角色管理",
              icon: "setting",
              url: "sys/sysRole",
            },
            {
              path: "/SysMenu",
              name: "sysMenu",
              label: "菜单管理",
              icon: "setting",
              url: "sys/sysMenu",
            },
            {
              path: "/SysLog",
              name: "sysLog",
              label: "系统日志",
              icon: "setting",
              url: "sys/sysLog",
            }
          ],
        },
        {
          label: "客户管理",
          icon: "user",
          name: "customer",
          children: [
            {
              path: "/CustomerList",
              name: "customerList",
              label: "客户列表",
              icon: "setting",
              url: "customer/customerList",
            },
            {
              path: "/CommonCustomer",
              name: "commonCustomer",
              label: "公海客户",
              icon: "setting",
              url: "customer/CommonCustomer",
            },
          ],
        },
        {
          label: "订单管理",
          icon: "s-order",
          name: "order",
          children: [
            {
              path: "/AllOrder",
              name: "allOrder",
              label: "全部订单",
              icon: "setting",
              url: "order/allOrder",
            },
            {
              path: "/MyOrder",
              name: "myOrder",
              label: "我的订单",
              icon: "setting",
              url: "order/myOrder",
            },
          ],
        },
      ],
    };
  },
  methods: {
    handleOpen(key, keyPath) {
      
    },
    handleClose(key, keyPath) {
      
    },clickMenu(item){
        // 如果需要更新的路由和当前路由不一致就更新
        if(this.$route.path != item.path && !(this.$route.path === '/FirstPage' && item.path === '/')){
          this.$router.push(item.path)
        }
        // 触发面包屑数据的更新
        this.$store.commit('menuChange',item)
    }
  },
  computed: {
    hasChildren() {
      // 过滤获取所有的有二级菜单的数据
      return this.menuData.filter((item) => item.children);
    },
    noChildren() {
      // 过滤所有只有一级菜单的数据
      return this.menuData.filter((item) => !item.children);
    },isCollapse(){
      return this.$store.state.tab.isCollapse
    }
  },
};
</script>