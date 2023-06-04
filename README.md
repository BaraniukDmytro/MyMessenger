# MyMessenger
Мобільний додаток для спілкування з друзями, знайомими, колегами.\
Виконав: Баранюк Д.А. АІ202
## Технології:
- Android;
- Kotlin;
- Firebase.
### Засоби Firebase
- Firebase Authentication - аутентифіцікація за номером телефону;
- Firebase Realtime Database - робота з даними;
- Firebase Storage - зберігання файлів та фотографій.
## Функціонал додатку:
- Авторизація чи створення нового облікового запису за допомогою мобільного телефону(отримання на номер телефону код підтвердження);
- Вибір чатів для спілкування з іншими користувачами;
- Надсилання та отримання повідомлень у чаті;
- Оновлення інформації облікового запису користувача.
### Ролі користувачів
Роль користувача тільки одна - звичайний користувач додатку (User), якому надані права на увесь функціонал який згаданий вище.
### Профіль користувача
- У додаток не можна увійти не авторизувавшись тому профіль не едоступний без авторизації;
- Профіль відображає основну інформацію про користувача, яку він сам заповнює;
- Профіль може редагуватися.
### Чат
- Користувач може надсилати та отримувати повідомлення у чаті;
- Користувач є відправником (sender) повідомлень іншим користувачам;
- Користувач є отримувачем (receiver) повідомлень від інших користувачів;
- Користувач може бачити список розпочатих чатів з користувачами.

