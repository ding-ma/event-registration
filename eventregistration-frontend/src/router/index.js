import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import HelloV2 from '@/components/HelloV2'
import EventRegistration from '@/components/EventRegistration'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Hello',
      component: Hello
    },
    {
      path: '/app',
      name: 'EventRegistration',
      component: EventRegistration
    },
    {
      path: '/test',
      name: 'Hello',
      component: HelloV2
    }
  ]
})
