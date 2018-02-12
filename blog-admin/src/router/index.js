import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/components/Login'
import Home from '@/components/Home'
import ArticleList from '@/components/ArticleList'
import Editor from '@/components/Editor'

Vue.use(Router)

export default new Router({
    routes: [
        {
            path: '/',
            name: 'login',
            component: Login
        },
        {
            path: '/home',
            name: 'home',
            component: Home,
            children: [
                {
                    path: '/',
                    component: ArticleList
                },
                {
                    path: '/articleList',
                    name: 'articlesList',
                    component: ArticleList
                },
                {
                    path: '/editor',
                    name: 'editor',
                    component: Editor
                }
            ]
        }
    ]
})
