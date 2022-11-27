Endpoints

1. GET - http://localhost:8080/populate
2. POST - http://localhost:8080/createContest - input json body data. Body data example:
   a. {
      "name": "Contest2000",
      "capacity": 200,
      "date": "2023-02-08"
      }
3. GET - http://localhost:8080/getContest?contestId={id}. Example input:
    a. http://localhost:8080/getContest?contestId=1
4. GET - http://localhost:8080/getAllContest
5. POST - http://localhost:8080/updateContest - input json body data. Body data example:
   a. {
   "id": 3,
   "name": "Contest100",
   "capacity": 1000,
   "date": "2023-10-08"
   }
6. DELETE - http://localhost:8080/deleteContest?contestId={id}.  Example input:
   a. http://localhost:8080/deleteContest?contestId=1