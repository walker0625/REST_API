# REST_API

SpringBoot2 + MySQL(myBatis) + Gradle로 만든 REST 방식의 CRUD를 구현한 API입니다.

요청(URL/Method)에 따라 영화 정보를 제공하며, 기본 요청 URL은 "/api/movies"를 따릅니다.

Method는 "get, post, patch, delete"를 사용하며, put보다 patch가 더 안정적이라고 판단하여 대체했습니다.

(참고글 : https://papababo.tistory.com/entry/HTTP-METHOD-PUT-vs-PATCH-%EC%B0%A8%EC%9D%B4%EC%A0%90)

<DB 정보>
  
DB명(Schema) - movie

CREATE TABLE `movie_info` (
  `movie_id` bigint NOT NULL AUTO_INCREMENT,
  `movie_name` varchar(100) NOT NULL,
  `movie_genre` varchar(100) NOT NULL,
  `movie_running_time` bigint NOT NULL,
  `movie_opening_date` date NOT NULL,
  `movie_rating` double DEFAULT NULL,
  `movie_actors` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`movie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


