<template>
  <div>
    <span> {{chatVM.content}} </span>
    <span> {{chatVM.URL}} </span>
  </div>
</template>
<script>
export default {

  name: 'ChatVM',

  props: ['chatVM'],

}
</script>