import sqlite3
conn=sqlite3.connect(" Test.db");
print("Created successfully");


conn.execute("create table if not exists User(Rollno int, Name varchar(30), age int)");
print("Table created successfully")

##conn.execute("insert into User values(3, 'Malar', 18)")
##conn.commit()
##print("Record inserted successfully")

##conn.execute("update User set Name='Shalu' where Rollno=2")
##conn.commit()
##print("Updated successfully")


conn.execute("delete from User where Name='Roja' ")
conn.commit()
print("Data deleted successfully")
