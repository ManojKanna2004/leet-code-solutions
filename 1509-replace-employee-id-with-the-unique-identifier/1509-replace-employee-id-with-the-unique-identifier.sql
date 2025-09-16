# Write your MySQL query statement below
select e.unique_id , b.name 
from EmployeeUNI as e
right Join Employees as b 
on  e.id=b.id
