<template>
  <div class="row bg-light">
    <div class="col-md-2">
      {{chatVM.id}}
    </div>
    <div class="col-md-2">
      {{chatVM.user}}
    </div>
    <div class="col-md-6">
      {{chatVM.content}}
    </div>
    <div class="col-md-2">
      {{chatVM.sent}}
    </div>
  </div>
</template>
<script>
export default {

  name: 'ChatVM',

  props: ['chatVM'],

}
</script>