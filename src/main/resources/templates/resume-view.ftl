<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>履歴書確認</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <div class="container">
        <h1>履歴書確認</h1>
        <div class="resume">
            <h2>${resume.name} 様の履歴書</h2>
            <p><strong>メールアドレス:</strong> ${resume.email}</p>
            <p><strong>経歴:</strong> ${resume.experience}</p>
            <p><strong>スキル:</strong> ${resume.skills}</p>
            <p><strong>自己PR:</strong> ${resume.selfIntroduction}</p>
        </div>
        <div class="actions">
            <button onclick="window.print()">印刷する</button>
            <a href="/applicant-form?applicantId=${resume.id}">情報を修正する</a>
        </div>
    </div>
    <script src="/js/scripts.js"></script>
</body>
</html>