db = new Mongo().getDB("gestcanddb");

db.createUser(
{
  user: "admin",
  pwd: "pwd",
  roles: [
    {
      role: "readWrite",
      db: "gestcanddb"
    }
  ]
}
);

db.createCollection('candidatures', {capped: false});


/*
db.users.insert([
    {
        username: 'player1',Ò
        password: 'player1',
        gameIds: ["60c790e71bee2f5f84cc2d3d"]
    }, {
        username: 'player2',
        password: 'player2',
        gameIds: []
    }
]);
*/
