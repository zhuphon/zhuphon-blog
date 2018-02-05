import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import ArticleList from '@/components/article/ArticleList'
import ArticleItem from '@/components/article/ArticleItem'
import Me from '@/components/me/Me'

Vue.use(Router)

const router = new Router({
    routes: [
        {
            path: '/',
            redirect: '/home'
        },
        {
            path: '/home',
            component: Home,
            children: [
                {
                    path: '/',
                    component: ArticleList
                },
                {
                    path: '/tags',
                    component: ArticleList
                },
                {
                    path: '/articles',
                    name: 'articles',
                    component: ArticleList
                },
                {
                    path: '/me',
                    name: 'me',
                    component: Me
                },
                {
                    path: '/articleItem/:id',
                    component: ArticleItem,
                    props: true,
                    meta: {
                        requiresAuth: true
                    }
                }
            ]
        }
    ]
})

router.beforeEach((to, from, next) => {
    if (to.matched.some(record => record.meta.requiresAuth)) {
        // this route requires auth, check if logged in
        // if not, redirect to login page.
        if (to.params.id === false) {
            next({
                path: '/login',
                query: { redirect: to.fullPath }
            })
        } else {
            next()
        }
    } else {
        next() // 确保一定要调用 next()
    }
})

router.afterEach((to, from, next) => {
    document.title = to.name
})
export default router
