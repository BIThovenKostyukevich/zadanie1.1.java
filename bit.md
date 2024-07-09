<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BIT/hoven</title>
    <style>
        body {
            margin: 0; /* Убирает стандартные отступы */
            position: relative; /* Для корректного позиционирования абсолютных элементов внутри body */
        }

        .red-line {
            width: 100vw; /* Ширина линии на всю видимую ширину окна */
            height: 220px; /* Высота линии (толщина) */
            background-color: rgba(0, 0, 0, 0.767); /* Цвет линии */
            position: absolute; /* Позиционирование абсолютное для полного контроля */
            top: 120px; /* Отступ от верхнего края */
            left: 0; /* Устанавливаем начало линии на левый край экрана */
        }

        .vertical-line {
            width: 220px; /* Ширина вертикальной линии */
            height: 100vh; /* Высота на всю высоту экрана */
            background-color: rgba(0, 0, 0, 0.767); /* Цвет вертикальной линии */
            position: absolute; /* Абсолютное позиционирование */
            top: 0; /* Устанавливаем вертикальную линию от верхнего края */
            left: 190px; /* Отступ от левого края экрана */
        }

        .resume-field {
            width: 600px; /* Ширина поля для текста */
            padding: 20px; /* Отступы внутри поля */
            border: 1px solid #ccc; /* Граница вокруг поля */
            background-color: #f9f9f9; /* Фоновый цвет поля */
            position: absolute; /* Абсолютное позиционирование */
            top: 350px; /* Отступ от верхнего края */
            left: 420px; /* Отступ от левого края */
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Легкая тень для поля */
        }

        .resume-field a {
            color: #007bff; /* Цвет ссылок */
            text-decoration: none; /* Убираем подчеркивание */
        }

        .resume-field a:hover {
            text-decoration: underline; /* Подчеркивание при наведении */
        }

        .profile-image {
            position: absolute; /* Абсолютное позиционирование */
            top: 120px; /* Отступ от верхнего края */
            left: 190px; /* Отступ от левого края */
            width: 200px; /* Ширина изображения */
            height: 220px; /* Высота изображения */
            z-index: 10; /* Устанавливаем z-index для изображения */
        }
    </style>
</head>
<body>
    <img src="bit.png" alt="Profile Image" class="profile-image">
    <div class="red-line"></div>
    <div class="vertical-line"></div>
    <div class="resume-field">
        <h2>BIT/hoven.incompareitet</h2>
        <p>Текст еще не придумал но Глеб зацини всеровно</p>
        <p>Мой <a href="mailto:email@example.com">Mail</a>.</p>
        <p>Мой <a href="https://www.instagram.com/kostyukevich.33/?next=%2F">Instagram</a>.</p>
    </div>
</body>
</html>
