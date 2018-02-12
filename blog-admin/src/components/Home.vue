<template>
<div class="ddd">
    <z-header-nav></z-header-nav>
    <main class="container">
        <z-side-bar v-show="showSideBar"></z-side-bar>
        <div class="content">
            <div @click="showOrHideSideBar" class="show">|||</div>
            <div class="main-container">
                <router-view></router-view>
            </div>
            <div class="page-jump">>>></div>
            <footer class="z-footer">
                &copy; 纯天然手工打造
            </footer>
        </div>
    </main>
</div>
</template>
<script>
import zHeaderNav from './HeaderNav.vue'
import zSideBar from './SideBar.vue'
export default {
    data () {
        return {
            search: '',
            showSideBar: true
        }
    },
    components: {
        zHeaderNav,
        zSideBar
    },
    methods: {
        showOrHideSideBar () {
            this.showSideBar = !this.showSideBar
        }
    }
}
</script>
<style scoped>
.ddd {
    display: flex;
    width: 100%;
    height: 100%;
    flex-direction: column;
}
.container {
    flex: auto;
    display: flex;
    flex-direction: row;
}
.content {
    box-sizing: border-box;
    overflow-x: hidden;
    overflow-y: auto;
    flex: 2;
    display: flex;
    flex-direction: column;
}
.show {
    width: 50px;
    height: 50px;
    color: #ccc;
    flex: none;
    position: absolute;
}
.main-container {
    padding: 20px 200px;
    border-bottom: 1px solid #ddd;
    flex: auto;
}
.page-jump {
    flex: none
}
.z-footer {
    flex: none;
    text-align: center;
    margin: 20px 0;
}
</style>
