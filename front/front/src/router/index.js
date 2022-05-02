import { createRouter, createWebHistory } from 'vue-router'
import WelcomePage from '@/views/welcome'
import AdminPage from '@/views/login/AdminPage'
import LoginTest from '@/views/login/main'
import SampleChats from '@/views/samplechats'
const routes = [

    {
        path: '/welcome',
        component: WelcomePage,
    },

    {
        path: '/login',
        component: AdminPage,
        children: [
          { path: '', component: () => import('@/views/login/Login'), name: 'Login' },
          { path: '', component: () => import('@/views/login/Register'), name: 'Register' },
        ]
    },

    {
        path: '/login-test',
        component: LoginTest
    },

    {
        path: '/sample',
        components: SampleChats,

    },

];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;