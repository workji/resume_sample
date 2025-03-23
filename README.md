# WEBシステムプロジェクト

このプロジェクトは、応募フォームと履歴書確認機能を持つWEBシステムです。Spring Bootを使用して開発されており、応募者が自分の情報を入力し、企業がその情報を確認できるように設計されています。

## 機能

- **応募フォーム**: 応募者はログインせずに情報を入力し、メール通知を受け取ります。入力内容の修正リンクも提供されます。
- **履歴書確認**: 企業はログイン後、自分の履歴書テンプレートをアップロードし、応募者の情報を確認・印刷できます。

## 技術スタック

- Spring Boot 3
- FreeMarker
- MyBatis
- Druid
- MySQL
- jQuery
- Bootstrap
- Maven
- Java 17

## プロジェクト構成

```
web-system-project
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── websystem
│   │   │               ├── WebSystemApplication.java
│   │   │               ├── controller
│   │   │               │   ├── ApplicantController.java
│   │   │               │   └── ResumeController.java
│   │   │               ├── service
│   │   │               │   ├── ApplicantService.java
│   │   │               │   └── ResumeService.java
│   │   │               ├── repository
│   │   │               │   ├── ApplicantRepository.java
│   │   │               │   └── ResumeRepository.java
│   │   │               └── model
│   │   │                   ├── Applicant.java
│   │   │                   └── Resume.java
│   │   ├── resources
│   │   │   ├── static
│   │   │   │   ├── css
│   │   │   │   │   └── styles.css
│   │   │   │   └── js
│   │   │   │       └── scripts.js
│   │   │   ├── templates
│   │   │   │   ├── applicant-form.ftl
│   │   │   │   └── resume-view.ftl
│   │   │   ├── application.properties
│   │   │   └── db
│   │   │       ├── schema.sql
│   │   │       └── data.sql
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── websystem
│                       └── WebSystemApplicationTests.java
├── pom.xml
└── README.md
```

## セットアップ

1. リポジトリをクローンします。
2. `pom.xml`に記載された依存関係をMavenでインストールします。
3. MySQLデータベースを設定し、`application.properties`に接続情報を記入します。
4. データベーススキーマを`schema.sql`を使用して作成し、初期データを`data.sql`で挿入します。
5. アプリケーションを起動します。

## 使用方法

- 応募者は、指定されたURLにアクセスして応募フォームに情報を入力します。
- 企業は、ログイン後に履歴書テンプレートをアップロードし、応募者の情報を確認できます。

このプロジェクトは、応募者と企業の双方にとって便利な機能を提供することを目的としています。