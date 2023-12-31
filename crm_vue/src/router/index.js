import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/common/Home.vue'

import CustomerList from '@/components/pages/customer/CustomerList.vue'
import CommonCustomer from '@/components/pages/customer/CommonCustomer.vue'
import AllOrder from '@/components/pages/order/AllOrder.vue'
import MyOrder from '@/components/pages/order/MyOrder.vue'
import FirstPage from '@/components/pages/FirstPage.vue'
import Login from '@/components/common/Login.vue'
import SysUser from '@/components/pages/sys/SysUser.vue'
import SysRole from '@/components/pages/sys/SysRole.vue'
import SysMenu from '@/components/pages/sys/SysMenu.vue'
import SysLog from '@/components/pages/sys/SysLog.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',// 主路由
      component: Home,
      redirect:'FirstPage',
      children: [ // 嵌套的子路由
      {
        path: '/FirstPage',
        name: 'firstPage',
        component: FirstPage
      },
        {
          path: '/CustomerList',
          name: 'customerList',
          component: CustomerList
        }, {
          path: '/CommonCustomer',
          name: 'commonCustomer',
          component: CommonCustomer
        }, {
          path: '/AllOrder',
          name: 'allOrder',
          component: AllOrder
        }, {
          path: '/MyOrder',
          name: 'myOrder',
          component: MyOrder
        }, {
          path: '/SysUser',
          name: 'sysUser',
          component: SysUser
        }, {
          path: '/SysRole',
          name: 'sysRole',
          component: SysRole
        }, {
          path: '/SysMenu',
          name: 'sysMenu',
          component: SysMenu
        }, {
          path: '/SysLog',
          name: 'sysLog',
          component: SysLog
        }

      ]
    },{
      path: '/Login',
      name: 'login',// 主路由
      component: Login,
    }
  ]
})
