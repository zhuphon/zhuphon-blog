<template>
    <div id="editor">
        <mavon-editor :ishljs="true" @save="saveArticle"></mavon-editor>
    </div>
</template>
<script>
// Local Registration
import { mavonEditor } from 'mavon-editor'
import 'mavon-editor/dist/css/index.css'
export default {
    name: 'editor',
    components: {
        mavonEditor
        // or 'mavon-editor': mavonEditor
    },
    methods: {
        saveArticle (value, render) {
            console.log(value)
            console.log(render)
        }
    }
}
</script>
<style>
#editor {
    margin: auto;
    width: 80%;
    height: 100%;
}
</style>
