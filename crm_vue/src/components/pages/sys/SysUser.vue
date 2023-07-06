<template>
  <div>
    <el-card class="box-card">
      <div class="mod-role">
        <el-form :inline="true" :model="dataForm" class="demo-form-inline">
          <el-form-item>
            <el-input
              v-model="dataForm.userName"
              clearable
              placeholder="用户名"
            ></el-input>
          </el-form-item>
          <el-form-item>
            <el-button @click="getDataList">查询</el-button>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @click="openDialog()">新增</el-button>
          </el-form-item>
        </el-form>
        <el-table :data="dataList" border style="width: 100%">
          <el-table-column type="selection" width="55"> </el-table-column>
          <el-table-column prop="userId" label="ID" width="150">
          </el-table-column>
          <el-table-column prop="username" label="用户名" width="180">
          </el-table-column>
          <el-table-column prop="email" label="邮箱" width="280">
          </el-table-column>
          <el-table-column prop="mobile" label="电话" width="280">
          </el-table-column>
          <el-table-column prop="status" label="状态" width="280">
            <template slot-scope="scope">
                <span>{{ scope.row.status==1?'正常':'禁用' }}</span>
            </template>
          </el-table-column>
          <el-table-column prop="createTime" label="创建时间" width="180">
          </el-table-column>
          <el-table-column label="操作">
            <template slot-scope="scope" width="180">
              <el-button
                size="mini"
                type="primary"
                @click="handleEdit(scope.$index, scope.row)"
                >编辑</el-button
              >
              <el-button
                size="mini"
                type="danger"
                @click="handleDelete(scope.$index, scope.row)"
                >禁用</el-button
              >
            </template>
          </el-table-column>
        </el-table>
        <el-pagination
          @size-change="sizeChangeHandle"
          @current-change="currentChangeHandle"
          :current-page="pageIndex"
          :page-sizes="[5, 10, 20, 50, 100]"
          :page-size="pageSize"
          :total="totalPage"
          layout="total, sizes, prev, pager, next, jumper"
          style="margin-top: 30px"
        >
        </el-pagination>
      </div>
    </el-card>
  </div>
</template>
<script>
export default {
  name: "sysUser",
  data() {
    return {
      dataForm: {
        userName: "",
      },
      dataList: [],
      pageIndex: 1,
      pageSize: 5,
      totalPage: 0,
      dataListLoading: false,
    };
  },
  methods: {
    sizeChangeHandle(val) {
      this.pageSize = val;
      this.pageIndex = 1;
      this.getDataList();
    },
    currentChangeHandle(val) {
      this.pageIndex = val;
      this.getDataList();
    },
    getDataList() {
      if (this.dataListLoading) {
        return;
      }
      this.dataListLoading = true;
      // 声明params 查询的参数
      const params = {
        params: {
          pageIndex: this.pageIndex,
          pageSize: this.pageSize,
          username: this.dataForm.userName,
        },
      };
      this.$http.get("/sys/sysUser/list", params).then((res) => {
        this.dataList = res.data.data.list;
        this.totalPage = res.data.data.totalCount;
        this.dataListLoading = false;
      });
    },
  },mounted(){
    this.getDataList();
  }
};
</script>