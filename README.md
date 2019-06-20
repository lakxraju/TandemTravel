# Dependencies:

* Install PostgreSQL - You can get it [here](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads)
* Create and remember the password for **postgres** username (created by default)
* Current version uses **postgres** as database. (created by default)
* Use port number **5432** (default)

# Eclipse Config:

* Nothing specific needed for opening. Just open the project folder as a **maven** application
* Use **clean verify** as goals for maven build

# Changes in application.properties

* Database password for username **postgres**
* Run with **spring.datasource.initialize=true** only for the first time. 
* Change **logging.level.org.springframework=TRACE** for detecting errors.


