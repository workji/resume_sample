<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>応募フォーム</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
    <div class="container">
        <h1>応募フォーム</h1>
        <form action="/applicant-submit" method="post">
            <div class="form-group">
                <label for="name">名前:</label>
                <input type="text" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="email">メールアドレス:</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="message">メッセージ:</label>
                <textarea id="message" name="message" required></textarea>
            </div>
            <button type="submit">応募する</button>
        </form>
    </div>
    <script src="/js/scripts.js"></script>
</body>
</html>