---
# https://vitepress.dev/reference/default-theme-home-page
layout: home

hero:
    name: "Spring AI Sample"
    text: "This is a sample project for Spring AI"
    tagline: My great project tagline
    actions:
        -   theme: brand
            text: 概念
            link: /1-ai-concepts
        -   theme: alt
            text: quickstart
            link: /2-quickstart

features:
    -   title: Feature A
        details: Lorem ipsum dolor sit amet, consectetur adipiscing elit
    -   title: Feature B
        details: Lorem ipsum dolor sit amet, consectetur adipiscing elit
    -   title: Feature C
        details: Lorem ipsum dolor sit amet, consectetur adipiscing elit
---

## spring-ai-sample

Spring AI 是一个用于 AI 工程的应用程序框架.其目标是将 Spring 生态系统设计原则（如可移植性和模块化设计）应用于 AI 领域，并将使用
`POJO 作为应用程序的 build block` 这一理念推广到 AI 领域旨在简化人工智能应用程序的开发，避免产生不必要的复杂性.在设计上
SpringAI 从 著名的 Python 项目（如 LangChain 和 LlamaIndex）中汲取灵感，但 Spring AI 并不是这些项目的直接移植.其设计理念
是 `下一波生成式 AI 应用程序将不仅适用于 Python 开发人员，而且将在许多编程语言中无处不在`

> [!TIP]
> Spring AI 的核心是解决 AI 集成的根本挑战：
>
> - EN: Connecting your enterprise Data and APIs with AI Models
> - CN: 将您企业中的 Data 和 APIs 与 AI 模型连接起来

Spring AI 主要提供以下特性:

- 支持主要 AI 模型提供商 ，例如 Anthropic、OpenAI、Microsoft、Amazon、Google 和 Ollama。支持的模型类型包括：
    - 聊天模型: Chat Completion
    - 嵌入模型: Embedding
    - 文生图: Text to Image
    - 音频转换: Audio Transcription
    - TTS: Text to Speech
    - Moderation
- 支持跨 AI 提供商对同步(synchronous)和流式(streaming) API 的支持。此外 Spring AI 还可以访问特定于模型的特征
- 支持主要的矢量数据库提供商 例如 Apache Cassandra、Azure Vector Search、Chroma、Milvus、MongoDB
  Atlas、Neo4j、Oracle、PostgreSQL/PGVector、PineCone、Qdrant、Redis 和 Weaviate
- 跨 Vector Store 提供商的可移植 API，包括一种新颖的类似 SQL 的元数据过滤器 API
- 用于数据工程的文档注入 ETL 框架
- ChatClient API - 用于与 AI 聊天模型通信的 Fluent API，惯用性类似于 WebClient 和 RestClient API
- Advisors API - 封装重复的生成式 AI 模式，转换发送到和传出语言模型 （LLM） 的数据，并提供跨各种模型和用例的可移植性
- 支持 Chat Conversation Memory 和 Retrieval Augmented Generation （RAG）
- 提供主要 AI 模型和向量存储提供商的 Spring Boot 自动配置和启动器 —— 使用 start.spring.io 选择所需的模型或向量存储
- Structured Outputs: Spring AI 支持将模型的响应结果结构化输出到应用程序中的 POJO
- Tools/Function Calling: Spring Ai 允许模型请求执行客户端工具和函数，从而根据需要访问必要的实时信息
- Observability: Spring AI 支持对 AI 相关操作信息可见
- AI Model Evaluation: Spring AI 可以帮助评估生成的内容并防止幻觉响应的实用程序

## version info

截止 `2025.5.18` Spring Ai 最新版本为 `1.0.0-SNAPSHOT` 此处我们采用 `1.0.0-RC1` 进行学习

- https://docs.spring.io/spring-ai/reference
- https://docs.spring.io/spring-ai/reference/1.0/index.html

下面是其他工具的版本信息:

- IntelliJ IDEA 2025.1.1.1 (Ultimate Edition)
- Gradle-8.13
- Spring Boot 3.4.5
- Spring AI 1.0.0-RC1
- Zulu-jdk 17.0.15.fx-zulu


