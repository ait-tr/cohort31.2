use("lection_02");
// CREATE
// db.animals.insertMany([
//   {kind: "tiger", weight: 300, name: "Alan", predatory: true},
//   {kind: "penguin", weight: 2, name: "Kovalsky", predatory: true},
//   {kind: "chicken", weight: 1, name: "Cipa", predatory: false},
//   {kind: "shark", weight: 400, name: "Sharp", predatory: false},
//   {kind: "shark", weight: 450, name: "John", predatory: false},
//   {kind: "panda", weight: 200, name: "Po", predatory: false},
// ]);

// UPDATE
// Операторы: $set, $inc, $rename, $push, $pull, $unset

// Изменим свойство predatory у акул - на true
// UPDATE MANY - обновит все документы соответсвующие фильтру
// первый filter - параметр поиска
// второй - сами изменения

// SET оператор
// изменил поле predatory у всех акул на true
// db.animals.updateMany({kind: "shark"}, {$set: {predatory: true}});

// INC - увеличивает значение на указанную величину
// увеличиваем вес всех животных на три
// db.animals.updateMany({}, {$inc: {weight: 3}});

// RENAME - переименовать имя свойства
// переименуем у всех животных weight в kg
// db.animals.updateMany({}, {$rename: {weight: "kg"}})

// UPDATE ONE - изменить одну запись - первый документ
// изменим имя конкретного объекта по ид
// db.animals.updateOne(
//   {_id: ObjectId("65c5e83e0829498ae91d3ebc")},
//   {$set: {name: "Kovalsky 2"}}
// );

// добавили всем хищникам новое поле - еда - массив стрингов
// db.animals.updateMany(
//   { predatory: true },
//   { $set: { foods: ["fish", "squid"] } }
// );

// PUSH - добавить в массив
// добавили "wolf" в массив еды
// db.animals.updateOne(
//   {kind: "tiger"},
//   {$push: {foods: "wolf"}}
// );

// PULL - забрать из массива
// как убрать squid из массива
// db.animals.updateOne(
//   {kind: "tiger"},
//   {$pull: {foods: "squid"}}
// );

// UNSET - убрать само свойство
// db.animals.updateOne(
//   {kind: "chicken"},
//   {$unset: {predatory: ""}}
// );

// DELETE  - deleteOne, deleteMany
// один параметр - фильтр - кого желаем удалить
// удалим акулу по id
// db.animals.deleteOne({_id: ObjectId("65c5e83e0829498ae91d3ebe")});

// добавим динозавра
// db.animals.insertOne({kind: "t-rex", kg: 1500});

// Устроим вымирание динозаврам
// db.animals.deleteMany({kind: "t-rex"});

// AGGREGATION
// pipeline -
// Основные стадии (этапы, stages) обработки - операторы
// $match фильтрация
// $sort сортировка
// -1 по убыванию
// 1 по возрастанию
// $project проекция
// $limit лимитирование
// $skip пропустить (документы)

// $sample получить произвольные документы
// $count возвращает ко-во документов

// получим всех хищных
// db.animals.aggregate([
//   {$match: {predatory: true}}
// ]);

// получим всех хищных и отсортируем по весу - от большего  к меньшему
// db.animals.aggregate([
//   {$match: {predatory: true}},
//   {$sort: {kg: -1}}
// ]);

// как получить самого тяжелого не хищника
// db.animals.aggregate([
//   {$match: {predatory: false}},
//   {$sort: {kg: -1}},
//   {$limit: 1}
// ]);

// третий по тяжести хищник
// db.animals.aggregate([
//   {$match: {predatory: true}},
//   {$sort: {kg: -1}},
//   {$skip: 2},
//   {$limit: 1}
// ]);

// получим втрого и третьего по весу хищников
// db.animals.aggregate([
//   {$match: {predatory: true}},
//   {$sort: {kg: -1}},
//   {$skip: 1},
//   {$limit: 2}
// ]);

// получаем всех животных весом - 3 кг
// project - позволяет указать нужные поля
// db.animals.aggregate([
//   {$match: {kg: 3}},
//   {$project: {name: 1, foods: 1, _id: 0}}
// ]);

// посчитать количество травоядных - мы указали alias -
// псеводним под которым вывести результат
// db.animals.aggregate([
//   {$match: {predatory: false}},
//   {$count: 'number_of_planteaters'}
// ]
// );

// получить случайное животное
// db.animals.aggregate([
//   {$sample: { size: 1, }, },
// ]);

// случайное животное весом больше 100 килограмм
// db.animals.aggregate([
//   { $match: { kg: { $gt: 100 } } },
//   { $sample: { size: 1 } },
// ]);

// сколько тигров? без aggregate
// db.animals.countDocuments({kind: "tiger"});

// LOOKUP - $lookup
// добавили Пост (для примера захардкодили id)
// db.posts.insertOne({
//   _id: ObjectId("65c6096e0451b42a2273e13c"),
//   likes: 10,
//   text: "Hi, I am glad to be on likedin",
// });

// добавили комментарий к этому посту
// db.comments.insertOne([
//   {
//     email: "fish@mail.com",
//     message: "Oh, you are here! Wonderful!",
//     post_id: ObjectId("65c6096e0451b42a2273e13c"),
//   },
//   {
//     email: "eidelman@mail.com",
//     message: "Hey, man!",
//     post_id: ObjectId("65c6096e0451b42a2273e13c"),
//   },
//   {
//     email: "eidelman@mail.com",
//     message: "P.S. love you so!",
//     post_id: ObjectId("65c6096e0451b42a2273e13c"),
//   },
// ]);

// db.comments.aggregate([
//   {$lookup: {
//     from: "posts", // куда будем подсматривать - коллекция
//     localField: "post_id", // как называется в колл. комменте
//     foreignField: "_id",   // как называется в колл. посте
//     as: 'post_info'
//   }}
// ]);

// GROUP

// db.posts.insertMany([
//   {
//     likes: 10,
//     text: "Hi, I am glad to be on likedin",
//     category: "science",
//   },
//   {
//     likes: 2,
//     text: "Hi, I am glad to be on likedin",
//     category: "music",
//   },
//   {
//     likes: 3,
//     text: "Hi, I am glad to be on likedin",
//     category: "music",
//   },
// ]);

// db.posts.aggregate([
//   // {$match: {category: "music"}},
//   {$group: {_id: "$category", likeTotal: {$sum: "$likes"}}}
// ]);

// Другой пример
// db.kids.insertMany([
//   {name: "John", age: 5, gender: "boy"},
//   {name: "Anna", age: 6, gender: "girl"},
//   {name: "Leyla", age: 4, gender: "girl"},
//   {name: "Frieda", age: 3, gender: "boy"},
//   {name: "Bob", age: 5, gender: "boy"},
// ]);

// средний возраст по полу
// db.kids.aggregate([
//   {$group: {_id: "$gender", averageAge: {$avg: "$age"}}}
// ]);

// минимальный возраст по полу
// db.kids.aggregate([
//   {$group: {_id: "$gender", minAge: {$min: "$age"}}}
// ]);

// максимальный возраст
// db.kids.aggregate([
//   {$group: {_id: "$gender", maxAge: {$max: "$age"}}}
// ]);
