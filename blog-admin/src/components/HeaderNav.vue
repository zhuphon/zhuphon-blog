<template>
    <header class="top-nav-container">
        <nav class="top-nav">
            <div class="nav-logo">
                <img src="../assets/logo.png" class="logo" alt="">
                <span class="brand">ZhuPhon</span>
            </div>
            <ul class="nav-link-container">
                <li class="nav-link-item" v-for="tab in tabs" :key="tab.name" @click="tabClick(tab.route)">
                    {{tab.name}}
                </li>
            </ul>
        </nav>
    </header>
</template>
<style>
.top-nav-container {
    flex: 1;
    max-height: 60px;
    padding: 0 50px;
    background: #fff;
    box-shadow: 0 0 4px rgba(0, 0, 0, 0.25);
}
.top-nav {
    display: flex;
}
.nav-logo {
    flex: 2;
    display: inline-block;
    padding: 10px 0;
    cursor: pointer;
}

.logo {
    margin-right: 6px;
    width: 40px;
    height: 40px;
    vertical-align: middle;
}
.brand {
    font-size: 1.5em;
    display: inline-block;
    color: #2c3e50;
    font-family: 'Dosis', 'Source Sans Pro', 'Helvetica Neue', Arial, sans-serif;
    font-weight: 500;
    vertical-align: middle;
}
.nav-link-container {
    flex: 1;
    display: inline-flex;
    list-style-type: none;
}
.nav-link-item {
    flex: auto;
    margin: 0.6em;
    cursor: pointer;
}
</style>
<script>
export default{
    data () {
        return {
            tabs: [
                {
                    name: 'Tab1',
                    route: '/tab1'
                },
                {
                    name: 'Tab2',
                    route: '/tab2'
                }
            ]
        }
    },
    methods: {
        tabClick (route) {
            this.$router.push(route)
        }
    }
}
</script>
