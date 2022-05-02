<template>
<div>
  <span>Hello world!</span>
  <chatVM :chatVM = "sampleChatVM"/>
  <div v-if="showOn">
    <div v-for:="chat in chatVMList" :key="chat.id">
      <chatVM :chatVM="chat" />
    </div>
  </div>
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
        url: "...",
      },
      showOn:false,
    }
  },

  methods: {
    chatMessages() {
      axios.get(`/api/v1/messages`)
      .then((res) => {
        this.chatVMList = res.data
        console.log(res.data)
        this.showOn=true
      })
      .catch({

      })
    },
  },
  
  mounted() {
    this.chatMessages()
    console.log("Hello chats!")
  }
}
</script>