
# Blog

Clone the code to your repository to get started with your own blog

## Getting Started
Make sure you have database installed. In this clone project, we have used PostgreSQL but in case you need another database try adding dependencies in `pom.xml` file and configure recording to your database server settings in `application.properties`

## Run Unit Test
`mvn test`

## Build the project
`mvn package`

## Run 
`java -jar target/mymodule-0.0.1-SNAPSHOT.jar`

## When server is successfully up with database
- First you have to login. 
-- First add user information in `user_entity` table and then BCrypt your password with 12 round.
-- After saving user information go to `http://domain.com/login` 
- You can now add your blog by hitting `http://domain.com/managment/blog/add`. Once you write your blog click submit button to post the blog.
- Go to `http://domain.com/` to see your added blog


## Please Note
This application is under development and it will be keep updating it self in near future. Furthermore, there are known issues and known improvement for this blog

## Current dev branch is not pulled into master, once the development is completed the dev will be merged!
