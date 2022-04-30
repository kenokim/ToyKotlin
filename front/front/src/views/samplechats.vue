<template>
<div>
  <span>Hello Sample Messages</span>
  <chatVM :chatVM="sampleChatVM" />
</div>
</template>

<script>
import axios from "axios"
import chatVM from "@/components/ChatVM"

export default {
  components: {
    chatVM,
  },

  data() {
    return {
      chatVMList: null,
      sampleChatVM: {
        content: "Hello keno",
        URL: "..."
      }
    }
  },

  methods: {
    chatMessages() {
      axios.get(`/api/v1/messages`)
      .then((res) => {
        this.chatVMList = res.data
      })
    },
  }
}
</script>