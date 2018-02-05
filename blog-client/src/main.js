// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import router from './router'
// axios
import axios from 'axios'
// components
import App from './App'
Vue.config.productionTip = false

Vue.prototype.$axios = axios.create({
    baseURL: '/api'
})
/* eslint-disable no-new */
new Vue({
    el: '#app',
    router,
    components: { App },
    template: '<App/>'
})
