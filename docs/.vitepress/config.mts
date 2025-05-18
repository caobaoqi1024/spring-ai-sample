import {defineConfig} from 'vitepress'
import {
    GitChangelog,
    GitChangelogMarkdownSection,
} from '@nolebase/vitepress-plugin-git-changelog/vite'
// https://vitepress.dev/reference/site-config
export default defineConfig({
    vite: {
        plugins: [
            GitChangelog({
                // Fill in your repository URL here
                repoURL: () => 'https://github.com/caobaoqi1024/spring-ai-sample',
            }),
            GitChangelogMarkdownSection(),
        ],
    },
    title: "Spring AI Sample",
    lang: 'zh-CN',
    description: "This is a sample project for Spring AI",
    base: '/spring-ai-sample/',
    markdown: {
        toc: {level: [2, 4]},
    },
    themeConfig: {
        head: [["link", {rel: "icon", href: "/spring-ai-sample/favicon.ico"}]],
        logo: '/logo.svg',
        // https://vitepress.dev/reference/default-theme-config
        nav: [
            {
                text: 'AI 相关概念',
                link: '/1-ai-concepts'
            },
            {
                text: 'how-to',
                link: '/how-to'
            },
        ],
        footer: {
            message: 'Released under the MIT License.',
            copyright: 'Copyright © 2015-present Caobaoqi1024'
        },
        sidebar: [
            {
                text: 'AI 相关概念',
                link: '/1-ai-concepts'
            },
            {
                text: '快速开始',
                link: '/2-quickstart'
            },
            {
                text: 'how-to',
                link: '/how-to'
            },

        ],

        socialLinks: [
            {icon: 'github', link: 'https://github.com/caobaoqi1024/spring-ai-sample'}
        ]
    }
})
