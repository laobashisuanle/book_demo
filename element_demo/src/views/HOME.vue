<script setup>

</script>

<template>
  <div>
  <el-table
      :data="tableData"
      border
      style="width: 600px">
    <el-table-column
        prop="id"
        label="序号"
        width="120">
    </el-table-column>
    <el-table-column
        prop="name"
        label="书名"
        width="120">
    </el-table-column>
    <el-table-column
        prop="price"
        label="价格"
        width="120">
    </el-table-column>



    <el-table-column
        fixed="right"
        label="操作"
        width="200">
      <template slot-scope="scope">
        <el-button type="success" size="small" @click="handleEdit(scope.row)">编辑</el-button>
        <el-button type="primary"  @click="handleClick(scope.row)" size="small">删除</el-button>
      </template>
    </el-table-column>
  </el-table>
  <el-button type="success" @click="onAdd">添加</el-button>
  </div>
</template>

<style scoped>

</style>
<script>


export default {
  name:'HOME',
  created() {
    let _this = this
    axios.get('http://localhost:8081/book').then(function (resp) {
      console.log(resp.data)
      _this.tableData = resp.data
    })
  },
  methods: {
    onAdd(){
      this.$router.push('/add')
    },
    handleEdit(row){
      this.$router.push('/edit?id='+row.id)
    },
    handleClick(row) {
      let _this=this
      this.$confirm('此操作将永久删除《' + row.name + '》, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        axios.delete('http://localhost:8081/book/' + row.id).then(function (resp) {
          if (resp.data) {
            _this.$alert('《' + row.name + '》已被删除', '结果', {
              confirmButtonText: '确定',
              callback: action => {
                location.reload()
              }
            });
          }
        });
      }).catch(() => {

      });
    }
    },
  data() {
      return {
        tableData: ''
      }
    }
  }

</script>