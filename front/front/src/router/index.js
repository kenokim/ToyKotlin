import { createRouter, createWebHistory } from 'vue-router'
import AdminPage from '@/views/login/AdminPage'
import LoginTest from '@/views/login/main'
const routes = [
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
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;