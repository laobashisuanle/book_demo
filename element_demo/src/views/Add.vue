<script setup>

</script>

<template>
  <div style="width: 500px">
    <el-form :model="form" :rules="rules" ref="form" label-width="100px" class="demo-ruleForm">
      <el-form-item  label="序号"  prop="id" >
        <el-input v-model.number="form.id" autocomplete="off" ></el-input>
      </el-form-item>
      <el-form-item label="书名" prop="name">
        <el-input v-model="form.name"  ></el-input>
      </el-form-item>
      <el-form-item  label="价格"  prop="price" >
        <el-input v-model.number="form.price" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item class="button">
        <el-button type="primary" @click="onSubmit('form')">添加</el-button>
        <el-button @click="disAdd">取消</el-button>
      </el-form-item>

    </el-form>
  </div>
</template>

<style scoped>
div{
  width: 500px;
  .button{
    text-align: center;
  }
}
</style>
<script>
export default {
  name:'Add',

  data() {
    return {
      form: {
        id: '',
        name: '',
        price: ''
      },
      rules: {

        id: [
          {required: true, message: '序号不能为空'},
          {type: 'number', message: '序号必须为数字值'}
        ],
        name: [
          {required: true, message: '请输入书名', trigger: 'blur'},
        ],
        price: [
          {required: true, message: '价格不能为空'},
          {type: 'number', message: '价格必须为数字值'}
        ]
      }
    }
  },
  methods:{
    disAdd(){
      this.$router.push('/home')
    },
    onSubmit(form) {
      let _this =this
      this.$refs[form].validate((valid) => {
        if (valid) {
          axios.post('http://localhost:8081/book',this.form).then(function (resp){
            if(resp.data){
              _this.$alert('《' + _this.form.name + '》的信息已成功添加', '结果', {
                confirmButtonText: '确定',
                callback: action => {
                  _this.$router.push('/home')
                }
              });
            }else{
              alert(resp.message)
            }
          })

        }
      });
    },
  }
}
</script>