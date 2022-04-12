<template>
  <div>
    {{this.data}}
  </div>
</template>

<script>
import axios from "axios"

export default {
  name: "main",
  components: {

  },
  data() {
    return {
      data: null
    }
  },
  
  methods: {
    get() {
      axios.get(`/whoami`)
      .then((res) => {
        this.data = res.data.whoami;
      })
      .catch(() => {
        this.data = "failed to login.";
      })
      
    },
  },

  mounted() {
    this.get();
  },

}
</script>