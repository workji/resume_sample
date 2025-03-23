<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resume List</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>
<div class="container">
    <h1>Resume List</h1>
    <ul>
        <#list resumes as resume>
            <li><a href="/resumes/${resume.id}">Resume ${resume.id}</a></li>
        </#list>
    </ul>
</div>
<script src="/js/scripts.js"></script>
</body>
</html>